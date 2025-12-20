# RFC / OAuth 정리 안내

이 디렉토리는 OAuth 2.0을 RFC 문서를 기반으로 학습 및 번역하기 위한 공간입니다. 
이 저장소에서 정리한 내용을 기반으로 OAuth 2.0을 RFC 구조에 맞춰 블로그 시리즈로 정리하고 있습니다.

👉 [RFC 기반 OAuth 2.0 정리 보러가기](https://wo-dbs.tistory.com/category/RFC/OAuth%202.0)


## 번역 진행 현황
## 📖 번역 진행 현황
| 섹션                                                                               | 원문 (RFC 6749)                                                         | 번역본                                                               |
|----------------------------------------------------------------------------------|-----------------------------------------------------------------------|-------------------------------------------------------------------|
| **1. Introduction**                                                              | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1)      | [🔗 번역본] (./OAuth_ko.md#1-소개)                 |
| **1.1. Roles**                                                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.1)    | [🔗 번역본]                          |
| **1.2. Protocol Flow**                                                           | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.2)    | [🔗 번역본]                     |
| **1.3. Authorization Grant**                                                     | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.3)    | [🔗 번역본]                         |
| **1.3.1. Authorization Code**                                                    | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.3.1)  | [🔗 번역본]                      |
| **1.3.2. Implicit**                                                              | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.3.2)  | [🔗 번역본]                         |
| **1.3.3. Resource Owner Password Credentials**                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.3.3)  | [🔗 번역본]            |
| **1.3.4. Client Credentials**                                                    | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.3.4)  | [🔗 번역본]                    |
| **1.4. Access Token**                                                            | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.4)    | [🔗 번역본]                        |
| **1.5. Refresh Token**                                                           | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.5)    | [🔗 번역본]                         |
| **1.6. TLS Version**                                                             | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.6)    | [🔗 번역본]                    |
| **1.7. HTTP Redirections**                                                       | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.7)    | [🔗 번역본]                    |
| **1.8. Interoperability**                                                        | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.8)    | [🔗 번역본]                            |
| **1.9. Notational Conventions**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-1.9)    | [🔗 번역본]                             |
| **2. Client Registration**                                                       | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-2)      | [🔗 번역본]                          |
| **2.1. Client Types**                                                            | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-2.1)    | [🔗 번역본]                          |
| **2.2. Client Identifier**                                                       | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-2.2)    | [🔗 번역본]                         |
| **2.3. Client Authentication**                                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-2.3)    | [🔗 번역본]                          |
| **2.3.1. Client Password**                                                       | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-2.3.1)  | [🔗 번역본]                    |
| **2.3.2. Other Authentication Methods**                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-2.3.2)  | [🔗 번역본]            |
| **2.4. Unregistered Clients**                                                    | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-2.4)    | [🔗 번역본]            |
| **3. Protocol Endpoints**                                                        | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-3)      | [🔗 번역본]            |
| **3.1. Authorization Endpoint**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-3.1)    | [🔗 번역본]            |
| **3.1.1. Response Type**                                                         | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-3.1.1)  | [🔗 번역본]            |
| **3.1.2. Redirection Endpoint**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-3.1.2)  | [🔗 번역본]            |
| **3.2. Token Endpoint**                                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-3.2)    | [🔗 번역본]            |
| **3.2.1. Client Authentication**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-3.2.1)  | [🔗 번역본]            |
| **3.3. Access Token Scope**                                                      | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-3.3)    | [🔗 번역본]            |
| **4. Obtaining Authorization**                                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4)      | [🔗 번역본]            |
| **4.1. Authorization Code Grant**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.1)    | [🔗 번역본]            |
| **4.1.1. Authorization Request**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.1.1)  | [🔗 번역본]            |
| **4.1.2. Authorization Response**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.1.2)  | [🔗 번역본]            |
| **4.1.3. Access Token Request**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.1.3)  | [🔗 번역본]            |
| **4.1.4. Access Token Response**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.1.4)  | [🔗 번역본]            |
| **4.2. Implicit Grant**                                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.2)    | [🔗 번역본]            |
| **4.2.1. Authorization Request**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.2.1)  | [🔗 번역본]            |
| **4.2.2. Access Token Response**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.2.2)  | [🔗 번역본]            |
| **4.3. Resource Owner Password Credentials Grant**                               | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.3)    | [🔗 번역본]            |
| **4.3.1. Authorization Request and Response**                                    | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.3.1)  | [🔗 번역본]            |
| **4.3.2. Access Token Request**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.3.2)  | [🔗 번역본]            |
| **4.3.3. Access Token Response**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.3.3)  | [🔗 번역본]            |
| **4.4. Client Credentials Grant**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.4)    | [🔗 번역본]            |
| **4.4.1. Authorization Request and Response**                                    | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.4.1)  | [🔗 번역본]            |
| **4.4.2. Access Token Request**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.4.2)  | [🔗 번역본]            |
| **4.4.3. Access Token Response**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.4.3)  | [🔗 번역본]            |
| **4.5. Extension Grants**                                                        | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-4.5)    | [🔗 번역본]            |
| **5. Issuing an Access Token**                                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-5)      | [🔗 번역본]            |
| **5.1. Successful Response**                                                     | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-5.1)    | [🔗 번역본]            |
| **5.2. Error Response**                                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2)    | [🔗 번역본]            |
| **6. Refreshing an Access Token**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-6)      | [🔗 번역본]            |
| **7. Accessing Protected Resources**                                             | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-7)      | [🔗 번역본]            |
| **7.1. Access Token Types**                                                      | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-7.1)    | [🔗 번역본]            |
| **7.2. Error Response**                                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-7.2)    | [🔗 번역본]            |
| **8. Extensibility**                                                             | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-8)      | [🔗 번역본]            |
| **8.1. Defining Access Token Types**                                             | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-8.1)    | [🔗 번역본]            |
| **8.2. Defining New Endpoint Parameters**                                        | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-8.2)    | [🔗 번역본]            |
| **8.3. Defining New Authorization Grant Types**                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-8.3)    | [🔗 번역본]            |
| **8.4. Defining New Authorization Endpoint Response Types**                      | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-8.4)    | [🔗 번역본]            |
| **8.5. Defining Additional Error Codes**                                         | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-8.5)    | [🔗 번역본]            |
| **9. Native Applications**                                                       | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-9)      | [🔗 번역본]            |
| **10. Security Considerations**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10)     | [🔗 번역본]            |
| **10.1. Client Authentication**                                                  | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.1)   | [🔗 번역본]            |
| **10.2. Client Impersonation**                                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.2)   | [🔗 번역본]            |
| **10.3. Access Tokens**                                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.3)   | [🔗 번역본]            |
| **10.4. Refresh Tokens**                                                         | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.4)   | [🔗 번역본]            |
| **10.5. Authorization Codes**                                                    | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.5)   | [🔗 번역본]            |
| **10.6. Authorization Code Redirection URI Manipulation**                        | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.6)   | [🔗 번역본]            |
| **10.7. Resource Owner Password Credentials**                                    | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.7)   | [🔗 번역본]            |
| **10.8. Request Confidentiality**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.8)   | [🔗 번역본]            |
| **10.9. Ensuring Endpoint Authenticity**                                         | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.9)   | [🔗 번역본]            |
| **10.10. Credentials-Guessing Attacks**                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.10)  | [🔗 번역본]            |
| **10.11. Phishing Attacks**                                                      | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.11)  | [🔗 번역본]            |
| **10.12. Cross-Site Request Forgery**                                            | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.12)  | [🔗 번역본]            |
| **10.13. Clickjacking**                                                          | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.13)  | [🔗 번역본]            |
| **10.14. Code Injection and Input Validation**                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.14)  | [🔗 번역본]            |
| **10.15. Open Redirectors**                                                      | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.15)  | [🔗 번역본]            |
| **10.16. Misuse of Access Token to Impersonate Resource Owner in Implicit Flow** | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-10.16)  | [🔗 번역본]           |
| **11. IANA Considerations**                                                      | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11) | [🔗 번역본]    |
| **11.1. OAuth Access Token Types Registry**                                      | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.1)   | [🔗 번역본]               |
| **11.1.1. Registration Template**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.1.1) | [🔗 번역본]            |
| **11.2. OAuth Parameters Registry**                                              | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.2)   | [🔗 번역본]            |
| **11.2.1. Registration Template**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.2.1) | [🔗 번역본]            |
| **11.2.2. Initial Registry Contents**                                            | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.2.2) | [🔗 번역본]            |
| **11.3. OAuth Authorization Endpoint Response Types Registry**                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.3)   | [🔗 번역본]          |
| **11.3.1. Registration Template**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.3.1) | [🔗 번역본]            |
| **11.3.2. Initial Registry Contents**                                            | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.3.2) | [🔗 번역본]            |
| **11.4. OAuth Extensions Error Registry**                                        | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.4)   | [🔗 번역본]            |
| **11.4.1. Registration Template**                                                | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-11.4.1) | [🔗 번역본]            |               
| **12. References**                                                               | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-12)     | [🔗 번역본]             |
| **12.1. Normative References**                                                   | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-12.1)   | [🔗 번역본]                                                            |
| **12.2. Informative References**                                                 | [🔗 원문](https://datatracker.ietf.org/doc/html/rfc6749#section-12.2)   | [🔗 번역본]                                                  |
