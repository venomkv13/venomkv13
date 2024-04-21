// SPDX-License-Identifier: Mit 
prama solidity ^0.8.10;

contract HelloWorld {
    string public greet = "Hello World!";
}adress public sender;
uint public sender;
uint public amount;

function pay() external payable {
    sender = msg.sender;
    amount = msg.value;
}
function fail() external {
    require (false, FAILED HERE");
    greet = "";

}