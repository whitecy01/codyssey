package com.springboot.security.controller;


import com.springboot.security.data.dto.ChangeProductNameDto;
import com.springboot.security.data.dto.ProductDto;
import com.springboot.security.data.dto.ProductResponseDto;
import com.springboot.security.service.ProductService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<ProductResponseDto> getProduct(Long number) {
        long currentTime = System.currentTimeMillis();
        LOGGER.info("[getProduct] request Data :: productId : {}", number);
        ProductResponseDto productResponseDto = productService.getProduct(number);

        LOGGER.info(
            "[getProduct] response Data :: productId : {}, productName : {}, productPrice : {}, productStock : {}",
            productResponseDto.getNumber(), productResponseDto.getName(),
            productResponseDto.getPrice(), productResponseDto.getStock());
        LOGGER.info("[getProduct] Response Time : {}ms", System.currentTimeMillis() - currentTime);
        return ResponseEntity.status(HttpStatus.OK).body(productResponseDto);
    }

    @Parameters({
            @Parameter(name = "X-AUTH-TOKEN", description = "로그인 성공 후 발급 받은 access_token", required = true, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER)
    })
    @PostMapping()
    public ResponseEntity<ProductResponseDto> createProduct(@RequestBody ProductDto productDto) {
        long currentTime = System.currentTimeMillis();
        ProductResponseDto productResponseDto = productService.saveProduct(productDto);

        LOGGER.info("[createProduct] Response Time : {}ms", System.currentTimeMillis() - currentTime);
        return ResponseEntity.status(HttpStatus.OK).body(productResponseDto);
    }

    @Parameters({
            @Parameter(name = "X-AUTH-TOKEN", description = "로그인 성공 후 발급 받은 access_token", required = true, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER)
    })
    @PutMapping()
    public ResponseEntity<ProductResponseDto> changeProductName(
        @RequestBody ChangeProductNameDto changeProductNameDto) throws Exception {
        long currentTime = System.currentTimeMillis();
        LOGGER.info("[changeProductName] request Data :: productNumber : {}, productName : {}",
            changeProductNameDto.getNumber(), changeProductNameDto.getName());

        ProductResponseDto productResponseDto = productService.changeProductName(
            changeProductNameDto.getNumber(),
            changeProductNameDto.getName());

        LOGGER.info(
            "[changeProductName] response Data :: productNumber : {}, productName : {}, productPrice : {}, productStock : {}",
            productResponseDto.getNumber(), productResponseDto.getName(),
            productResponseDto.getPrice(), productResponseDto.getStock());
        LOGGER.info("[changeProductName] response Time : {}ms",
            System.currentTimeMillis() - currentTime);
        return ResponseEntity.status(HttpStatus.OK).body(productResponseDto);
    }

    @Parameters({
            @Parameter(name = "X-AUTH-TOKEN", description = "로그인 성공 후 발급 받은 access_token", required = true, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER)
    })
    @DeleteMapping()
    public ResponseEntity<String> deleteProduct(Long number) throws Exception {
        long currentTime = System.currentTimeMillis();
        LOGGER.info("[deleteProduct] request Data :: productNumber : {}", number);

        productService.deleteProduct(number);

        LOGGER.info("[deleteProduct] response Time : {}ms",
            System.currentTimeMillis() - currentTime);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }

}
