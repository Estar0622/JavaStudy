<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>자기소개 페이지</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&family=Montserrat:wght@400;700&display=swap" rel="stylesheet">
    <link href="styles.css" rel="stylesheet"> <!-- CSS 파일을 import합니다. -->
    <style>
        @font-face {
            font-family: 'GmarketSansBold';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansBold.woff') format('woff');
            font-weight: normal;
            font-style: normal;
        }

        body {
            font-family: 'San Francisco', -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif; /* 애플 서체 적용 */
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
        }

        h1, h2, h3 {
            font-family: 'GmarketSansBold', sans-serif; /* 제목 서체는 GmarketSansBold */
        }

        p {
            font-family: 'San Francisco', sans-serif; /* 본문 서체는 San Francisco */
        }

        .highlight {
            color: transparent; /* 텍스트 색상 투명 */
            text-shadow: 
                -1px -1px 0 #000,  
                 1px -1px 0 #000,
                -1px  1px 0 #000,
                 1px  1px 0 #000; /* 텍스트 윤곽선 효과 */
            background-color: transparent; /* 배경색 그대로 유지 */
            padding: 2px 4px; /* 텍스트와 윤곽선 사이의 간격 */
            border-radius: 4px; /* 테두리 둥글게 */
        }

        .navbar-menu li {
            color: #4a86ff;
            font-family: 'Roboto', sans-serif; /* 서체는 Roboto */
            font-size: 13pt;
            margin: 0px 5px;
            padding: 7px 10px;
            position: relative;
            text-shadow: 
                -1px -1px 0 #fff,  
                 1px -1px 0 #fff,
                -1px  1px 0 #fff,
                 1px  1px 0 #fff; /* 흰색 윤곽선 효과 */
            transition: color 0.5s, font-family 0.5s, letter-spacing 0.5s;
        }

        .navbar-menu li:after {
            content: "";
            position: absolute;
            left: 50%;
            bottom: 0;
            width: 0%;
            height: 2px;
            background-color: #053768;
            transition: all 0.5s;
        }

        .navbar-menu li:hover:after {
            left: 0;
            width: 100%;
        }

        .navbar-menu li:hover {
            color: #053768;
            font-family: 'Montserrat', sans-serif; /* 서체는 Montserrat */
            letter-spacing: -0.008em;
            transition: color 0.5s, font-family 0.5s, letter-spacing 0.5s;
        }

        .main-content {
            display: flex;
            flex-wrap: wrap;
        }

        .profile-container {
            flex: 1 1 25%; /* 사진을 25%의 너비로 설정 */
            max-width: 25%;
            margin-right: 20px; /* 오른쪽 여백 추가 */
        }

        .profile-container img {
            width: 100%;
            height: auto;
        }

        .text-container {
            flex: 1 1 70%; /* 텍스트 컨테이너를 70%의 너비로 설정 */
        }

        .text-container .row {
            display: flex;
            flex-wrap: wrap;
        }

        .text-container .col-md-6 {
            flex: 1;
            margin-bottom: 20px;
        }

        .text-container .col-md-6.left {
            margin-right: 12px; /* 왼쪽 열에 오른쪽 여백 추가 */
        }

        .text-container .col-md-6.right {
            margin-left: 12px; /* 오른쪽 열에 왼쪽 여백 추가 */
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Our Profile</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="html2.html">다음 페이지</a>
                </li>
            </ul>
        </div>
    </nav>

    <header class="hero text-center text-white">
        <div class="container">
            <h1 class="display-4">반갑습니다!</h1>
            <h2>제 이름은 김동규입니다.</h2>
            <h2>능력있는 개발자가 되고 싶어요!!</h2>
        
            <div class="social-buttons mt-4">
                <a href="https://www.instagram.com/e.star_0622" target="_blank">
                    <img src="insta.png" alt="Instagram">
                </a>
                
                <a href="https://github.com/Estar0622" target="_blank">
                    <img src="github.png" alt="GitHub">
                </a>

                <a href="https://velog.io/@estar0622/posts" target="_blank">
                    <img src="velog.jpg" alt="Velog">
                </a>
            </div>
        </div>
    </header>

    <main class="container mt-5" id="main-content">
        <div class="main-content">
            <div class="profile-container">
                <img src="profile.jpg" class="custom-img" alt="프로필 사진">
            </div>
            <div class="text-container">
                <div class="row">
                    <div class="col-md-6 left">
                        <h2>한 줄 소개</h2>
                        <p>저는 김동규입니다.
                            <br>
                            고려대학교 경영학과를 졸업했고
                            <br> 
                            사회적기업 스타트업에서 대표로 일하다가 
                            <br>
                            지능정보 SW 아카데미를 졸업하고 
                            <br> Java를 배우고 있어요!</p>
                        <br>

                        <h2>취미 / 관심사</h2>
                        <p>스포츠 관람을 즐깁니다! 한화 이글스 팬입니다.
                            <br> 
                            올해 말에 EPL 보러 영국 유럽여행가는게 목표에요.
                            <br>
                            해외여행 가서 이것저것 찍는 것도 즐겨요.   
                            <br>
                            OTT는 넷플릭스, 디즈니플러스, 티빙을 주로 봐요!

                        </p>
                    </div>
                    <div class="col-md-6 right">
                        <h2>MBTI</h2>
                        <p><b>ENTJ!</b>
                            <br> 만수르, 스티브 잡스, 백종원, 현우진과 같음</p>
                        <br>

                        <h2>경력</h2>
                        
                            세종대학교 스타트업 아이디어 경진대회 <b>"대상"</b><br>
                            고려대학교 StartUp Express <b>"입상"</b><br>
                            한양대학교 4th HUBS Young Lion Competition <b>"대상"</b><br>
                            한국경제 주관 SW아카데미 AI 경진대회 <b>"대상"</b><br>
                        
                        <br>

                        <h2>기술</h2>
                        <p>Python, Java, JPA, Ai-Computer Vision, HTML, CSS, Bootstrap, React 등</p>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <footer class="bg-dark text-white text-center py-3">
        <p>&copy; 2024 김동규. All rights reserved.</p>
    </footer>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
