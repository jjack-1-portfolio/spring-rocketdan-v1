# 구인 구직 플랫폼

<h2>RocketDan</h2>
> 구인구직 플랫폼 ‘로켓펀치’를 모티브로 제작한 개인/기업 대상 이력관리 및 채용공고 관리 플랫폼 입니다.

<br/>

## 프로젝트 시연 영상

<video src="https://github.com/user-attachments/assets/ca07f9b6-24f2-4ab2-bdc5-d84a3115be35" controls width="600"></video>

## 목차

1. [🗓️ 개발 기간 및 참여 인원](#개발기간및참여인원)
2. [🔚 회고](#회고)
3. [🗂️ ERD](#erd)
4. [💡 주요 기능](#주요기능)
5. [✍️ 개인 기여도 및 역할](#개인기여도및역할)
6. [👥 팀원](#팀원)
7. [🛠️ 기술 스택](#기술스택)
8. [🧩 문제 해결 경험](#문제해결경험)

<a id="개발기간및참여인원"></a>

## 🗓️ 개발 기간 및 참여 인원

- 기간: 2025.04.11 ~ 2025.04.30
- 인원: 5인 팀 프로젝트

<a id="회고"></a>

## 🔚 회고

### **1️⃣ 협업의 어려움을 느끼다**

**1-1 화면 설계**

모티브를 할 사이트의 이미지를 가져와서 이미지 설계를 하는데 정해진 컨벤션이 없어서 각각의 팀원마다 이미지를 다르게 가져왔다.

[풀사이즈]
![회고1-1](docs/images/회고1-1.png)

[핏사이즈]
![회고1-2](docs/images/회고1-2.png)
가져온 이미지가 한명은 브라우저 풀사이즈로 이미지를 만들어 왔고 다른 한명은 화면에 보여지는 부분만 잘라서 이미지를 만들어 왔다.

나는 만들어진 이미지의 비율이 다르더라도 알아서 잘 만들 수 있을거라고 생각했다. 나중에 선생님에게 피드백을 받을 때 "설계된 이미지가 재각각이면 팀원들이 혼란스러울 수 있다. 통일되게 맞춰라" 라고 하여서 이후
모든 이미지를 풀사이즈로 통일 하였다.

[풀사이즈]
![회고1-2](docs/images/회고1-3.png)

하지만 이 풀사이즈에도 함정이 있었는데 개발에 사용하는 모니터의 비율이 다르면 같은 풀사이즈라도 차이가 있었다. 그래서 팀원들에게 이미지 설계는 동일한 모니터를 사용하는 학원에서 끝내달라고 요청하였다.

**1-2 화면 제작**

화면에서 공통부분으로 사용할 프레임을 만들고 내부의 요소에 각자 만든 html을 넣어달라고 부탁하였다.

[부탁한 내용]

```html
<!-- 헤더 끝 -->

<!-- 껍데기 박스 이 안에 넣어서 코드 작성해 주세요
            삭제하지 말아주세요 -->
<div class="bg-light py-5"></div>

<!-- 푸터 시작 -->
```

[돌아온 결과]

```html
<!-- 헤더 끝 -->

<!-- 껍데기 박스 이 안에 넣어서 코드 작성해 주세요
            삭제하지 말아주세요 -->
<div class="bg-light py-5">
    <html></html>
</div>

<!-- 푸터 시작 -->
---------------------------------------------------------------------------

<!-- 헤더 끝 -->

<!-- 껍데기 박스 이 안에 넣어서 코드 작성해 주세요
            삭제하지 말아주세요 -->
<div class="bg-light py-5">
    <style></style>
    <div></div>
</div>

<!-- 푸터 시작 -->
```

**2️⃣ 아쉬움을 다음 도전의 동력으로**

이번 프로젝트에서는 시간의 제약으로 인해 비동기 알림(Firebase 등)과 같은 **고급 기능을 직접 적용하진 못했지만**, 이를 계기로 부족한 부분을 명확히 인식했고, **차후 개인 프로젝트를 통해 보완할 계획
**입니다.
완성도뿐 아니라 **범용성 있는 기능까지 고려하는 시야**를 기르게 된 점이 큰 수확이었습니다.

- 자바와 스프링부트, HTML/CSS를 활용한 웹 서버 제작 프로젝트입니다.
- 전체 개발 기간 : 2025. 04. 11 ~ 2025. 04. 30

<br/>

![Main 화면](docs/images/main.png)

# 👥 팀 멤버

| 이름  | 역할 | GitHub                                       |
|-----|----|----------------------------------------------|
| 최재원 | 팀장 | [@jjack-1](https://github.com/jjack-1)       |
| 김건우 | 팀원 | [@GUNWO0](https://github.com/GUNWO0)         |
| 김세리 | 팀원 | [@roni243](https://github.com/roni243)       |
| 이연호 | 팀원 | [@yh88888888](https://github.com/yh88888888) |
| 조하은 | 팀원 | [@TaengGyul](https://github.com/TaengGyul)   |

# ⚙️ 기술 스택

## 🛠️ 사용 기술

<table>
    <tr>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" width="50"/><br/>HTML</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg" width="50"/><br/>CSS</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" width="50"/><br/>JavaScript</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original.svg" width="50"/><br/>Bootstrap</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/handlebars/handlebars-original.svg" width="50"/><br/>Mustache</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="50"/><br/>Java</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="50"/><br/>Spring Boot</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/sqlite/sqlite-original.svg" width="50"/><br/>H2</td>
    </tr>
</table>

## 🧰 개발 환경

<table>
    <tr>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" width="50"/><br/>IntelliJ</td>
    </tr>
</table>

## 🤝 협업 도구

<table>
    <tr>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" width="50"/><br/>Git</td>
        <td align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" width="50"/><br/>GitHub</td>
        <td align="center"><img src="https://upload.wikimedia.org/wikipedia/commons/4/45/Notion_app_logo.png" width="50"/><br/>Notion</td>
        <td align="center"><img src="https://upload.wikimedia.org/wikipedia/commons/7/76/Slack_Icon.png" width="50"/><br/>Slack</td>
    </tr>
</table>

# 📋 프로젝트 업무 분담

<table style="width: 100%; text-align: start; font-size: 16px; border-collapse: collapse;">
    <thead style="background-color: #f2f2f2;">
        <tr>
            <th style="padding: 10px; border: 1px solid #ddd;">담당자</th>
            <th style="padding: 10px; border: 1px solid #ddd;">프로젝트 업무 분담</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="padding: 10px; border: 1px solid #ddd;">최재원</td>
            <td style="padding: 10px; border: 1px solid #ddd;">
                <ul>
                    <li>프로젝트 계획 및 관리</li>
                    <li>팀 리딩 및 커뮤니케이션</li>
                    <li>헤더 및 네비게이션 개발</li>
                    <li>이력서 관련 페이지 및 기능 개발</li>
                    <li>채용공고 관련 페이지 및 기능 개발</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td style="padding: 10px; border: 1px solid #ddd;">김건우</td>
            <td style="padding: 10px; border: 1px solid #ddd;">
                <ul>
                    <li>기업 관련 페이지 및 기능 개발</li>
                    <li>채용공고 관련 페이지 및 기능 개발</li>
                    <li>유저의 공고 북마크 기능 개발</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td style="padding: 10px; border: 1px solid #ddd;">김세리</td>
            <td style="padding: 10px; border: 1px solid #ddd;">
                <ul>
                    <li>채용공고 관련 페이지 및 기능 개발</li>
                    <li>게시판 관련 페이지 및 기능 개발</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td style="padding: 10px; border: 1px solid #ddd;">이연호</td>
            <td style="padding: 10px; border: 1px solid #ddd;">
                <ul>
                    <li>로그인 관련 페이지 및 기능 개발</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td style="padding: 10px; border: 1px solid #ddd;">조하은</td>
            <td style="padding: 10px; border: 1px solid #ddd;">
                <ul>
                    <li>이력서 관련 페이지 및 기능 개발</li>
                    <li>더미 데이터 이미지 등록</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

# 주요 기능

### 공통

- 회원가입, 로그인
- 게시판 - 등록, 수정, 삭제
- 게시판 목록 보기
- 유효성 검사
- 인증 체크

### 유저

- 이력서 - 등록, 수정, 삭제
- 이력서 목록 보기
- 이력서 상세 보기
- 이력서 지원 하기
- 이력서 지원 내역
- 공고 북마크

### 기업

- 기업 - 등록, 수정, 삭제
- 기업 목록 보기
- 기업 상세 보기
- 채용공고 - 등록, 수정, 삭제
- 채용공고 목록 보기
- 채용공고 상세 보기
- 이력서 지원 받기
- 이력서 지원 응답

# 테이블 구조

![table](docs/images/table.png)

# 보완할 점

### 알림

- 기업 - 유저가 지원할 경우 기업에게 알림 기능
- 유저 - 기업이 지원상태를 변경할 경우 유저에게 알림 기능

### 페이징

- 다수의 데이터를 페이지 별로 깔끔하게 만들어 주는 기능

### 검색

- 기업, 공고, 유저를 각각 따로 검색하는 기능
- 기술스택, 주소, 연봉에 따라 검색하는 기능
- 통합 검색 기능

# 느낀점

- 개발 시작할 때 팀원들과 함께 전반적인 프로젝트의 전체적인 진행 방향을 같이 확인해서 협업이 좀더 잘 이루어지게 하고 싶다
- 임무 배정시 좀더 세밀한 임무목록을 작성해서 팀원들이 좀더 신속하게 개발을 할 수 있도록 만들고 싶다
- 회의를 할때 코드리뷰를 같이 하면서 팀원들이 좀더 코드를 잘 만들어서 수정 보완이 잘 될 수 있도록 만들고 싶다
- 프로젝트의 진행에 대한 설계를 좀 더 잘하고 싶다. 설계를 더 잘하면 프로젝트의 진행 속도가 좀 더 나아질 것 같다
