  <nav class='navbar navbar-expand-lg bg-dark d-flex justify-content-end'>
    <div class='d-flex flex-row justify-content-evenly'>
      <form class="d-flex h-100">
        <!-- HTML INPUT REGEX only lets you search for lower case characters between 5 and 10 characters long-->
        <input class="form-control me-2 h-auto" id='search' type="search" pattern="[a-z]{5,10}" placeholder="Search" aria-label="Search">
        <button class="btn" id='search-button' type="submit"><i class="fas fa-search text-white"></i></button>
      </form>
      <ul class='navbar-nav me-auto mb-2 mb-lg-0 bg-transparent '>
        
        <li class="nav-item"><a class="nav-link link-light fs-5" href="home">Home</a></li>
        <li class="nav-item"><a class="nav-link link-light fs-5" href="login">Login</a></li>
        <li class="nav-item"><a class="nav-link link-light fs-5" href="register">Register</a></li>
      </ul>  
    </div>
  </nav>
  <div class='d-flex secondary-nav'>
    <div class="dropdown">
      <button class="dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false"
      style="background-color: transparent; border: none;">Recipes & Ingredients</button>
      <ul class="dropdown-menu bg-light vh-100 p-5" aria-labelledby="dropdownMenuButton1">
        <p>All of these send you to the same spot for now: the show all recipes page. I wanted a BIG opening menu like this because it mimics KhanAcademy's dropdown. Hopefully I will have enough content to add into it  </p>
        <li class='row '>
          <div class='col-md-3'>
            <h6>Recipes</h6>
            <ul class='list-unstyled'>
              <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Browse</a></li>
              <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Search</a></li>
            </ul>
          </div>
          <div class='col-md-3'>
            <h6>Ingredients</h6>
            <ul class='col-md-3 list-unstyled'>

              <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Browse</a></li>
              <li ><a href="viewTable.html" class='link-secondary text-decoration-none'>Search</a></li>
            </ul>
          </div>
            
        </li>
        </ul> 
    </div>
  </div>