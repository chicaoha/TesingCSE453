<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Commissiont testcase generator</title>
        <style>
            .line{
                margin: auto;
                padding: auto;
                padding-top: 15px;
                width: 100%;
                min-height: 60px;
                background-color: antiquewhite;
                display: flex;
                justify-content: space-evenly;
            }
            .button{
                color: white;
                text-align: center;
                height: 40px;
                border-radius: 5px;
                padding-left: 20px;
                padding-right: 20px;
                background-color: rgba(6, 81, 255, 0.881);
            }
            textarea {
                width: 100%;
                height: 150px;
                padding: 12px 20px;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                background-color: #f8f8f8;
                font-size: 16px;
                resize: none;
              }
        </style>
    </head>
    <body>
        <center><h1>COMMISSION</h1></center>
        <form action = "commissionfucntion" method = "GET">
        
        <div>
            <p>Please input the ranges of Lock (1~60), Stock (1~70), and Barrel
                (1~80)</p>
            <div class="line">
                <div>
                    <label for="Lock">Lock: </label>
                    <input type="number" name="Lock" id="inputLock">
                </div>
                <div>
                    <label for="Stock">Stock: </label>
                    <input type="number" name="Stock" id="inputStock">
                </div>
                <div>
                    <label for="Barrel">Barrel: </label>
                    <input type="number" name="Barrel" id="inputBarrel">
                </div>
            </div>
        </div>

        <div>
            <p>Please choose the testing method:</p>
            <div class="line">
                <div>
                    <input type="submit" value="Use boundary value analysis" id="BVAButton" class="button">
                </div>
                <div>
                    <input type="submit" value="Use Robustness boundary value analysis" id="RBVAButton" class="button">
                </div>
            </div>
        </div>
		</form>
        <div>
            <h2><strong>TESTCASES: </strong></h2>
            <textarea name="resultTextarea" id="testcaseReview" cols="30" rows="10"></textarea>
        
        </div>
    </body>
</html>