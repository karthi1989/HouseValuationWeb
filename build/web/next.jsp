<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Enter Your House Information</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="http://v4-alpha.getbootstrap.com/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container p-t-3">

    <h1>House Information Form</h1>
    <h3>Enter your house information here</h3>

    <div class="card p-a-3">

        <form name="form1" id="form1" method="POST" ACTION="Evaluation" onsubmit="ShowLoading()" showvalid>

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
                <label for="hsize">Living Space</label>
                <select name="hsize" id="hsize" class="c-select form-control" required>
                        <option value="" selected>Select whether your house is built full/ quarter/ half on the land</option>
                        <option value=1>Full built</option>
                        <option value=0>Quarter built</option>
                        <option value=0>Half built</option>
                </select>
            </div>          
            
            <div class="form-group">
                <label for="stories">No of Stories</label>
                <input type=number name="stories" id="stories" class="form-control" placeholder="Enter your house's no of stories here" required minlength="1" maxlength="1">
                <label>
            </div>
            
            <div class="form-group">
                <label for="bed">No of Bedrooms</label>
                <input type=number name="bed" id="bed" class="form-control" placeholder="Enter your house's no of bedrooms here" required minlength="1" maxlength="1">
                <label>
            </div>
            
            <div class="form-group">
                <label for="bath">No of Bathrooms</label>
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
                <label for="reno">Previous Renovation <font color="red" >--- NOTE: In the case of the house is built within ten years of time, the client has to select 'Yes' </font></label>
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
                <label for="ac">Availability of Air-conditioner</label>
                <select name="ac" id="ac" class="c-select form-control" required>
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
                <label for="citypoint">Nearest City-Points <font color="red" >--- City-points: Crow Island Beach/ Harbour Gate/ Hettiyawatha/ Kotahena/ Armour Street/ Wattala Main Road  </font></label>
                <select name="citypoint" id="citypoint" class="c-select form-control" required>
                        <option value="" selected>Select whether your house is situated within 3km distance to/ from any of above mentioned popular city-point</option>
                        <option value=1>Yes, My house is situated within 5km to main city-points in Colombo</option>
                        <option value=0>No, My house is not situated within 5km to main city-points in Colombo</option>
                </select>
            </div>

             <div class="form-group">
                <label for="frontal">Frontal Feature</label>
                <jsp:useBean id="s" scope="request" class="java.lang.String"></jsp:useBean>
                <input type=number name="frontal" id="frontal" class="form-control" placeholder=<%=s %> value=<%=s %> readonly >
                <label>
            </div>
            
             <div class="form-group">
                <label for="bedroom">Bedroom Feature</label>
                <jsp:useBean id="s2" scope="request" class="java.lang.String"></jsp:useBean>
                <input type=bedroom name="bedroom" id="bedroom" class="form-control" placeholder=<%=s2 %> value=<%=s2 %> readonly >
                <label>
            </div>
            
             <div class="form-group">
                <label for="bathroom">Bathroom Feature</label>
                <jsp:useBean id="s3" scope="request" class="java.lang.String"></jsp:useBean>
                <input type=bathroom name="bathroom" id="bathroom" class="form-control" placeholder=<%=s3 %> value=<%=s3 %> readonly >
                <label>
            </div>
            
             <div class="form-group">
                <label for="kitchen">Kitchen Feature</label>
                <jsp:useBean id="s4" scope="request" class="java.lang.String"></jsp:useBean>
                <input type=kitchen name="kitchen" id="kitchen" class="form-control" placeholder=<%=s4 %> value=<%=s4 %> readonly >
                <label>
            </div>

  
            <input type="submit" name="form1_submit" id="form1_submit" class="btn btn-primary" value="Submit">


    <script type="text/javascript">
function calculate() {

var lsize = document.form1.lsize.value;
var CALC1 = lsize;
var CALC2 = CALC1*20;
document.form1.lvalue.value = CALC2;

}
</script>

<script type="text/javascript">
    function ShowLoading(e) {
        var div = document.createElement('div');
        var img = document.createElement('img');
        img.src = 'images/ajax-loader.gif';
        div.innerHTML = "It may take a few minutes, Please wait!<br />";
        div.style.cssText = 'position: fixed; top: 5%; left: 40%; z-index: 5000; width: 422px; text-align: center; background: #EDDBB0; border: 1px solid #000';
        div.appendChild(img);
        document.body.appendChild(div);
        return true;
    }
</script>

<script src="dist/index.js"></script>
</body>
</html>
