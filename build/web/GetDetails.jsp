<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BunnyJS Validation example</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="http://v4-alpha.getbootstrap.com/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container p-t-3">

    <h1>House Information Form</h1>

    <div class="card p-a-3">

        <form name="form1" id="form1" method="POST" showvalid>

            <div class="form-group">
                <label for="area">Area</label>
                <input type=number name="area" id="area" class="form-control" placeholder="Colombo 15" value=15 readonly>
                <label>
            </div>
            
            <div class="form-group">
                <label for="lsize">Land Size</label>
                <input type=number name="lsize" id="lsize" class="form-control" placeholder="Enter your land size here in perches" required minlength="1" maxlength="3" onchange="calculate()">
                <label>
            </div>
            
            <div class="form-group">
                <label for="lvalue">Land Value</label>
                <input type=number name="lvalue" id="lvalue" class="form-control" readonly>
                <label>
            </div>
            
            <div class="form-group">
                <label for="lsize">Living Space</label>
                <input type=number name="hsize" id="hsize" class="form-control" placeholder="Enter your living space size here" required minlength="1" maxlength="1">
                <label>
            </div>
            
            <div class="form-group">
                <label for="lsize">No of Stories</label>
                <input type=number name="stories" id="stories" class="form-control" placeholder="Enter your house's no of stories here" required minlength="1" maxlength="1">
                <label>
            </div>
            
            <div class="form-group">
                <label for="lsize">No of Bedrooms</label>
                <input type=number name="bed" id="bed" class="form-control" placeholder="Enter your house's no of bedrooms here" required minlength="1" maxlength="1">
                <label>
            </div>
            
            <div class="form-group">
                <label for="lsize">No of Bedrooms</label>
                <input type=number name="bed" id="bed" class="form-control" placeholder="Enter your house's no of bedrooms here" required minlength="1" maxlength="1">
                <label>
            </div>
            
            <div class="form-group">
                <label for="lsize">No of Bathrooms</label>
                <input type=number name="bath" id="bath" class="form-control" placeholder="Enter your house's no of bathrooms here" required minlength="1" maxlength="1">
                <label>
            </div>
            
            <div class="form-group">
                <label for="year">Built Year</label>
                <select name="year" id="year" class="c-select form-control" required>
                        <option value="" selected>Select the year your house was built</option>
                        <option value=9>2015 - 2017</option>
                        <option value=8>2010 - 2014</option>
                        <option value=7>2005 - 2009</option>
                        <option value=6>2000 - 2004</option>
                        <option value=5>1995 - 1999</option>
                        <option value=4>1990 - 1994</option>
                        <option value=3>1980 - 1989</option>
                        <option value=2>1970 - 1979</option>
                        <option value=1>Before 1970</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="reno">Previous Renovation</label>
                <select name="reno" id="reno" class="c-select form-control" required>
                        <option value="" selected>Does your house got renovated within 10 years?</option>
                        <option value=1>Yes</option>
                        <option value=0>No</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="highway">Highway Within 1 KM</label>
                <select name="highway" id="highway" class="c-select form-control" required>
                        <option value="" selected>Select whether a highway is available within 1km</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="mainrd">Main Road Within 1 KM</label>
                <select name="mainrd" id="mainrd" class="c-select form-control" required>
                        <option value="" selected>Select whether a main road is available within 1km</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="hos">Hospital Within 1 KM</label>
                <select name="hos" id="hos" class="c-select form-control" required>
                        <option value="" selected>Select whether a hospital is available within 1km</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="col">College Within 1 KM</label>
                <select name="col" id="col" class="c-select form-control" required>
                        <option value="" selected>Select whether a college is available within 1km</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
             <div class="form-group">
                <label for="supermarket">Supermarket Within 1 KM</label>
                <select name="supermarket" id="supermarket" class="c-select form-control" required>
                        <option value="" selected>Select whether a supermarket is available within 1km</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="scl">School Within 1 KM</label>
                <select name="scl" id="scl" class="c-select form-control" required>
                        <option value="" selected>Select whether a school is available within 1km</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="bus">Bus Station Within 1 KM</label>
                <select name="bus" id="bus" class="c-select form-control" required>
                        <option value="" selected>Select whether a bus station is available within 1km</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
             <div class="form-group">
                <label for="wne">Availability of Water & Electricity Facilities</label>
                <select name="wne" id="wne" class="c-select form-control" required>
                        <option value="" selected>Select whether both the water & Electricity available</option>
                        <option value=1>Yes, Both Available</option>
                        <option value=0>No, Not Both Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="gar">Availability of Private Garden</label>
                <select name="gar" id="gar" class="c-select form-control" required>
                        <option value="" selected>Select whether a private garden is available at your house</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="cashcr">No of Cash-Crops Available in The Garden</label>
                <input type=number name="cashcr" id="cashcr" class="form-control" placeholder="Enter the no of cashcrops in your garden" required minlength="1" maxlength="2">
                <label>
            </div>
            
            <div class="form-group">
                <label for="sec">Implementation of Home-Security-System</label>
                <select name="sec" id="sec" class="c-select form-control" required>
                        <option value="" selected>Select whether a home security system is implemented</option>
                        <option value=1>Yes, Implemented</option>
                        <option value=0>No, Not Implemented</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="garage">Availability of Garage</label>
                <select name="garage" id="garage" class="c-select form-control" required>
                        <option value="" selected>Select whether a private garage is available at your house</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="garage">Availability of Air-conditioner</label>
                <select name="garage" id="garage" class="c-select form-control" required>
                        <option value="" selected>Select whether a Air-conditioner is fixed at your house</option>
                        <option value=1>Yes, Available</option>
                        <option value=0>No, Not Available</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="tiled">Fully Tiled</label>
                <select name="tiled" id="tiled" class="c-select form-control" required>
                        <option value="" selected>Select whether your house is fully tiled</option>
                        <option value=1>Yes, Fully Tiled</option>
                        <option value=0>No, Not Fully Tiled</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="citypoint">Nearest City-Points</label>
                <select name="citypoint" id="citypoint" class="c-select form-control" required>
                        <option value="" selected>Select whether your house is situated within 5km to main city-points in Colombo?</option>
                        <option value=1>Yes, My house is situated within 5km to main city-points in Colombo</option>
                        <option value=0>No, My house is not situated within 5km to main city-points in Colombo</option>
                </select>
            </div>

            <div class="form-group">
                <label for="frontal">Frontal Feature</label>
                <input type="file" name="frontal" accept="image/jpeg, image/png" id="frontal" class="form-control" placeholder="Frontal Photo" required maxfilesize="8" mindimensions="3840�2160">
                <small><ul>
                    <li>Image < 3840�2160px will be invalid</li>
                    <li>image larger then 8MB will not be accepted</li>
                </ul></small>
            </div>
            
            <div class="form-group">
                <label for="bedroom">Bedroom Feature</label>
                <input type="file" name="bedroom" accept="image/jpeg, image/png" id="bedroom" class="form-control" placeholder="Bedroom Photo" required maxfilesize="8" mindimensions="3840�2160">
                <small><ul>
                    <li>Image < 3840�2160px will be invalid</li>
                    <li>image larger then 8MB will not be accepted</li>
                </ul></small>
            </div>
            
            <div class="form-group">
                <label for="bathroom">Bathroom Feature</label>
                <input type="file" name="bathroom" accept="image/jpeg, image/png" id="bathroom" class="form-control" placeholder="Bathroom Photo" required maxfilesize="8" mindimensions="3840�2160">
                <small><ul>
                    <li>Image < 3840�2160px will be invalid</li>
                    <li>image larger then 8MB will not be accepted</li>
                </ul></small>
            </div>
            
            <div class="form-group">
                <label for="kitchen">Kitchen Feature</label>
                <input type="file" name="kitchen" accept="image/jpeg, image/png" id="kitchen" class="form-control" placeholder="Kitchen Photo" required maxfilesize="8" mindimensions="3840�2160">
                <small><ul>
                    <li>Image < 3840�2160px will be invalid</li>
                    <li>image larger then 8MB will not be accepted</li>
                </ul></small>
            </div>

  
            <input type="submit" name="form1_submit" id="form1_submit" class="btn btn-primary" value="Submit">


    <script type="text/javascript">
function calculate() {

var lsize = document.form1.lsize.value;
var CALC1 = lsize;
var CALC2 = CALC1*23;
document.form1.lvalue.value = CALC2;

}

</script>
<script src="dist2/index.js"></script>
</body>
</html>
