```
Internet Engineering Task Force (IETF)                     D. Hardt, Ed.
Request for Comments: 6749                                     Microsoft
Obsoletes:5849                                             October 2012
Category: Standards Track
ISSN: 2070-1721
```
인터넷 표준을 제정 / 관리하는 국제 표준화 기구--편집자는 D.Hardt
RFC 문서 번호 6749--소속기관: 마이크로소프트
이 문서는 RFC 5849를 폐기하고 대체함 즉, 6749가 최신 표준이고 5849는 더 이상 사용 권장되지 않음--문서발표일 2012년 10월
인터넷 공식 표준으로 채택되는 과정에 있는 문서
RFC 시리즈 전체에 부여된 국제 표준 연속간행물번호

```
     The OAuth 2.0 Authorization Framework

Abstract

   The OAuth 2.0 authorization framework enables a third-party
   application to obtain limited access to an HTTP service, either on
   behalf of a resource owner by orchestrating an approval interaction
   between the resource owner and the HTTP service, or by allowing the
   third-party application to obtain access on its own behalf.  This
   specification replaces and obsoletes the OAuth 1.0 protocol described
   in RFC 5849.

Status of This Memo

   This is an Internet Standards Track document.

   This document is a product of the Internet Engineering Task Force
   (IETF).  It represents the consensus of the IETF community.  It has
   received public review and has been approved for publication by the
   Internet Engineering Steering Group (IESG).  Further information on
   Internet Standards is available in Section 2 of RFC 5741.

   Information about the current status of this document, any errata,
   and how to provide feedback on it may be obtained at
   http://www.rfc-editor.org/info/rfc6749.

Copyright Notice

   Copyright (c) 2012 IETF Trust and the persons identified as the
   document authors.  All rights reserved.

   This document is subject to BCP 78 and the IETF Trust's Legal
   Provisions Relating to IETF Documents
   (http://trustee.ietf.org/license-info) in effect on the date of
   publication of this document.  Please review these documents
   carefully, as they describe your rights and restrictions with respect
   to this document.  Code Components extracted from this document must
   include Simplified BSD License text as described in Section 4.e of
   the Trust Legal Provisions and are provided without warranty as
   described in the Simplified BSD License.
```

The OAuth 2.0 Authorization Framework
- OAuth 2.0 권한 부여 프레임워크

## Abstract
- 개요

The OAuth 2.0 authorization framework enables a third-party application to obtain limited access to an HTTP service, either on behalf of a resource owner by orchestrating an approval interaction between the resource owner and the HTTP service, or by allowing the third-party application to obtain access on its own behalf.  This specification replaces and obsoletes the OAuth 1.0 protocol described in RFC 5849.

> OAuth 2.0 권한 부여 프레임워크를 사용하면 타사 애플리케이션이 HTTP 서비스에 대한 제한된 액세스 권한을 얻을 수 있습니다. 이는 리소스 소유자와 HTTP 서비스 간의 승인 상호 작용을 조정하여 리소스 소유자를 대신해 액세스 권한을 얻거나, 타사 애플리케이션이 직접 액세스 권한을 얻도록 허용하는 방식으로 이루어질 수 있습니다. 이 사양은 RFC 5849에 설명된 OAuth 1.0 프로토콜을 대체하고 더 이상 사용하지 않도록 합니다.


- The OAuth 2.0 authorization framework enables a third-party application to obtain limited access to an HTTP service
  
→ OAuth 2.0은 내가 쓰는 서비스(카카오, 구글 같은)에 대해 다른 앱이 ‘일부 권한만’ 가져갈 수 있게 해주는 규칙이다.  

</br>

- either on behalf of a resource owner by orchestrating an approval interaction between the resource owner and the HTTP service

→ 사용자(리소스 소유자)를 대신해서 접근하는 경우 즉, 이 앱이 내 카카오 프로필 좀 써도 되나요?” 사용자가 동의 버튼을 누르는 것을 말한다. 

</br>

- or by allowing the third-party application to obtain access on its own behalf.

→ 사용자 없이, 앱 혼자 권한을 얻는 경우도 있다. 
예를 들어 서버 ↔ 서버 통신, 백엔드 배치 작업, 관리자 API 호출 이건 Client Credentials Grant 같은 케이스

>👨‍💻
> Client Credentials Grant는 Oauth 2.0에서 사람(사용자) 없이, 앱(서버) 혼자 권한을 받는 방식임. 즉, 우리가 흔히 쓰는 Oauth는 카카오 로그인 버튼을 클릭해서 동의 화면이 있는데 이건 이 과정이 없음. 앱에서 이 서비스랑 계약된 공식 서버다 → 서버는 확인 완료, 이 토큰으로 정해진 API만 써라라는 느낌 ex) client_id, client_secret


</br>

- This specification replaces and obsoletes the OAuth 1.0 protocol described in RFC 5849.

→ 이 문서는 OAuth 1.0을 버리고, OAuth 2.0을 공식 표준으로 만든다