<h1 align="center"> Currency Converter </h1>
<p align="center">
  <img src="assets/logo.png" alt="Currency Converter Logo" width="200">
</p>
<div>
<p>This first Java project aims to showcase my initial progress in backend programming.
It applies concepts such as consuming the ExchangeRate API, building records to handle immutable data, and using Gson to parse JSON responses. 
The application enables simple and efficient currency conversions, while environment variables are used to protect sensitive information such as API keys.
</p>
</div>

### Index:
- *Project status*
- *Technologies Used*
-  *Execution*
- *Use of the program*
- *Author*
- *License*
### Project Status: *Completed*
### Technologies Used:
1. **Java**
2. **Gson**
3. **ExchangeRate API**

## Execution
### Prerequisites:
1. **Java JDK 17+**
2. **Internet connection (for API requests)**
3. **Download the library Gson**
### Steps:
1. *Configure the environment variable*
- The user must have an API Key from the ExchangeRate API (or the one you use).
- Save this key as an environment variable, for example:
- On Windows:  
  Go to *Control Panel → System → Advanced system settings → Environment Variables*
  *and create a new variable API-KEY with your API key*
- On Linux/Mac:  
  Add the following line to your shell configuration file (`~/.bashrc` or `~/.zshrc`):
 ``` 
  export API-KEY=your_api_key_here
   ```
Then reload the configuration with:
 ```
  source ~/.bashrc
   ``` 
or
   ```
  source ~/.zshrc
  ```
2. *Clone the repository*
- git clone https://github.com/Diegopdev23/Currency-Converter-Challenge.git
3. *Compile the project*
  ```
javac -cp gson.jar src/Main.java -d out
 ```
4. *Execute the project*
 ```
java -cp "out;gson.jar" Main
```



### ⚙️Use of the program:
- The program will request:
- Source currency (e.g., USD).
- Target currency (e.g., EUR).
- Amount to convert.
- Then it will display the result using the current exchange rate from the API.

### Author: [@Diegopdev23](https://github.com/Diegopdev23)
### License:*This project is licensed under the MIT License*
Consult the file [LICENSE](LICENSE) for more details.
