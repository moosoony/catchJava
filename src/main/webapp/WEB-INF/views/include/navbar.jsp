<nav class="navbar navbar-expand-lg bg-light shadow-lg">
  <div class="container">
    <a class="navbar-brand" href="${contextPath}/">
      <img src="/resources/images/logo.png" class="logo img-fluid" alt="Kind Heart Charity">
      <span>
                    Catch Java
                    <small>Non-profit Organization</small>
                </span>
    </a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item">
          <a class="nav-link click-scroll" href="${contextPath}/">Home</a>
        </li>

        <li class="nav-item">
          <a class="nav-link click-scroll" href="${contextPath}/study/list">Study Room</a>
        </li>

        <li class="nav-item dropdown">
          <a class="nav-link click-scroll dropdown-toggle" href="#section_5"
             id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown"
             aria-expanded="false">My Study Room</a>

          <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
            <li><a class="dropdown-item" href="news.html">News Listing</a></li>

            <li><a class="dropdown-item" href="news-detail.html">News Detail</a></li>
          </ul>
        </li>

<%--        <li class="nav-item">--%>
<%--          <a class="nav-link click-scroll" href="#section_3">Causes</a>--%>
<%--        </li>--%>

        <li class="nav-item">
          <a class="nav-link click-scroll" href="#section_4">Q&A</a>
        </li>



        <li class="nav-item">
          <a class="nav-link click-scroll" href="#section_6">Admin</a>
        </li>

        <li class="nav-item ms-3">
          <a class="nav-link custom-btn custom-border-btn btn" href="${contextPath}/user/signin">Sign In</a>
        </li>
      </ul>
    </div>
  </div>
</nav>