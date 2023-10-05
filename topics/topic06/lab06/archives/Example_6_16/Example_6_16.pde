String message = "    HTTP 404 Not Found Error     ";
int originalLengthOfMsg = message.length();

String trimmedMessage = message.trim();
int trimmedLengthOfMsg = trimmedMessage.length();

println("The original message " + message 
    + " is " + originalLengthOfMsg + " characters long");

println("The trimmed message " + trimmedMessage 
    + " is " + trimmedLengthOfMsg + " characters long");