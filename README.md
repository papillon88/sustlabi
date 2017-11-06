
This is web app created to intercept incoming messages from [tesseract ocr](https://github.com/tesseract-ocr/tesseract) installed on a local raspberry pi system. The raspberry pi has a raspbian camera attached to it. The web app is created using Spring,html,css,JS,MySQL and JDBC.

On local raspberry pi do this :  
    - install curl : sudo apt install curl  
    - run curl -> curl -X POST -d "message=????" http://ec2-184-72-182-223.compute-1.amazonaws.com:8080/sustlabi/create  
    - substitute ???? in the above command with the actual output from tesseract  
    - see posted messages : http://ec2-184-72-182-223.compute-1.amazonaws.com:8080/sustlabi/messages
    
On webserver :  
    - download the code and build it using gradle.  
    - then run the artifact on web server to activate end point.  
