<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="createingredient" method="POST">
			
          <div class="field">
          	<label for="name">Ingredient Name</label>
            <input id="name" name="name" type="text" placeholder="Ingredient Name" />
          </div>
          <div class="field">
            <label for="serving">Serving Size</label>
            <input id="serving" name="serving" type="number" placeholder="Serving Size" />
            <label>Count</label>
            <input type="radio"  name="measurement" value="count">
            <label>Grams</label>
            <input type="radio" name="measurement" value="grams">
            <label>Tsp</label>
            <input type="radio"  name="measurement" value="tsp">
            <label>Tbsp</label>
            <input type="radio"  name="measurement" value="Tbsp">
            <label>Cups</label>
            <input type="radio"  name="measurement" value="cups">
            <label>Other</label>
            <input type="radio" name="measurement" value="other">
          </div>
          <div class="field">
            <label for="calories">Calories Per Serving</label>
            <input id="calories" name="calories" type="number" placeholder="Serving Size" />
          </div>
          <hr>
          <div class="field">
          	<label for="total_fat">Total Fat (g)</label>
            <input id="total_fat" name="total_fat" type="number" placeholder="Total Fat" />
          </div>
          <div class="field">
          	<label for="saturated_fat">Saturated Fat (g)</label>
            <input id="saturated_fat" name="saturated_fat" type="number" placeholder="Saturated Fat" />
          </div>
          <div class="field">
          	<label for="trans_fat">Trans Fat</label>
            <input id="trans_fat" name="trans_fat" type="number" placeholder="Trans Fat" />
          </div>
          
          <div class="field">
          	<label for="cholesterol">Cholesterol (mg)</label>
            <input id="cholesterol" name="cholesterol" type="number" placeholder="Cholesterol" />
          </div>
          
          <div class="field">
          	<label for="sodium">Sodium (mg)</label>
            <input id="sodium" name="sodium" type="number" placeholder="Sodium" />
          </div>
          
          <div class="field">
          	<label for="total_carbs">Total Carbohydrates (g)</label>
            <input id="total_carbs" name="total_carbs" type="number" placeholder="Total Carbs" />
          </div>
          <div class="field">
          	<label for="fiber">Dietary Fiber (g)</label>
            <input id="fiber" name="fiber" type="number" placeholder="Dietary Fiber" />
          </div>
          <div class="field">
          	<label for="sugar">Total Sugars (g)</label>
            <input id="sugar" name="sugar" type="number" placeholder="Total Sugars" />
          </div>
          <div class="field">
          	<label for="protein">Protein (g)</label>
            <input id="protein" name="protein" type="number" placeholder="Protein" />
          </div>
           <div class="btn">
            <input id="sub" name="submit" type="submit" value="Submit Name" />
           </div>
        </form>
</body>
</html>