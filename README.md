# Used Public Website – Sweet Shop Website

## 📌 Project Overview
This project is a **Selenium WebDriver automation testing project** developed using **Java** to validate and identify bugs in the Sweet Shop demo website.

---

## 🌐 Application Under Test (AUT)
**Website:** https://sweetshop.vivrichards.co.uk/  
**Application Type:** E-commerce (Demo Website)

---

## 🐞 Bugs Identified
During manual testing, the issues identified:
1. Login icon remains visible even after successful login  
2. On the payemtn page the Card Holder Name accepted Numeric Values as well as the Card Number accepted Alphabetic Input.
3. On the payment page; after clicking empty cart option when I tried clicking the About link on the navigation bar, it showed error message.

## AI Generated Bug Report - added an excel file as well

## 🧾 Test Case Report

| Test Case ID | Test Case Title | Precondition | Test Steps | Expected Result | Actual Result | Status | Severity | Priority |
|-------------|----------------|--------------|------------|----------------|---------------|--------|----------|----------|
| TC_001 | Login icon remains visible after successful login | User is registered and logged out | Open website → Click Login → Enter valid credentials → Click Login | Login icon should change to Logout or User Profile | Login icon still visible after successful login | Fail | Medium | Medium |
| TC_002 | Payment form accepts invalid card details | User is logged in and cart contains items | Login → Add items to cart → Proceed to payment → Enter numbers in card name → Enter alphabets in card number | Card name should accept alphabets only and card number digits only | Invalid inputs are accepted | Fail | High | High |
| TC_003 | Error shown when navigating after emptying cart | User is on payment page with items in cart | Go to payment page → Click Empty Cart → Click About link | About page should open without any error | Error message is displayed | Fail | High | Medium |



## 🧪 Test Scenarios Covered
- Verify login behavior

## 🛠 Tech Stack
- **Language:** Java  
- **Automation Tool:** Selenium WebDriver   
- **Build Tool:** Maven  
- **IDE:** IntelliJ IDEA 
- **Browser:** Google Chrome  

## Automation Script
<img width="1366" height="768" alt="Screenshot (195)" src="https://github.com/user-attachments/assets/166deaec-9ec5-4d87-9adc-b4770fdf586b" />

