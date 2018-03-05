# grizzly-hello

Simple hello world done using grizzly, gradle

## Usage
http://localhost:9998/helloworld

## Notes
* raw data post example: curl -X POST -H "Content-Type: text/plain" -d $'this is raw data\n' http://127.0.0.1:9998/echopost
* and a get: curl -i -G  http://localhost:9998/echo --data-urlencode $'message=Simple GET with encoding and newline \n\n'


