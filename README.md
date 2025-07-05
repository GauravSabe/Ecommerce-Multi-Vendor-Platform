# 🛒 Ecommerce Multi-Vendor Platform

A scalable full-stack ecommerce platform supporting multiple vendors, secure authentication, real-time analytics, and robust admin & seller dashboards. Built with modern tech to ensure performance, security, and a seamless shopping experience.

---

## 🛠️ Tools Used

- IntelliJ IDEA  
- VS Code  
- Node.js  
- MySQL  

---

## 💻 Technologies

### 🔧 Backend:
- Spring Boot  
- MySQL  
- Spring Security  
- Java Mail Sender  
- JWT (JSON Web Token)  
- Payment Gateway:
  - Razorpay (for Indian users 🇮🇳)
  - Stripe (for International users 🌍)

### 🎨 Frontend:
- React  
- TypeScript  
- Redux Toolkit  
- Material UI (MUI)  
- Tailwind CSS  
- React ChartJS  
- Formik + Yup  
- React Router DOM  
- Axios  

---

## 🔥 Key Features

### 👤 **Customer Panel**
- 💬 AI Chatbot for:
  - Order queries  
  - Cart inquiries  
  - Product details  
- 🛍️ Product listing with filter, sort & pagination  
- 🛒 Cart management (add/update/remove items)  
- 💳 Checkout with coupon, address, and payment gateway  
- 📦 Order history & cancellation  
- ⭐ Product reviews & ratings  
- ❤️ Wishlist management  

---

### 🛒 **Seller Panel**
- 📊 Dashboard with sales/earnings graph (Today, 7 Days, 12 Months)  
- 🧾 Reports on total sales, earnings, refunds & cancellations  
- 📦 Product creation & order management  
- 💰 Payment tracking & transaction history  
- 👤 Seller profile management  

---

### 🛡️ **Admin Panel**
- 📋 Seller management (approval/suspension)  
- 🎟️ Coupon management (create/edit/delete)  
- 🏠 Home page customization  
- 🎯 Deal & promotion management  

---

## 📚 Entity Relationships

- **User**: has Addresses, Cart, Orders, Reviews, Transactions, Wishlist  
- **Cart**: contains multiple CartItems → linked to Products  
- **Order**: contains multiple OrderItems → linked to Products  
- **Seller**: has Products, Transactions, SellerReport, Address  
- **Coupon**: many-to-many with Users  
- **Review**: connected to both Product & User  
- **Wishlist**: many-to-many with Products  
- **Transaction**: linked to User, Seller, Order  
- **PaymentOrder**: includes multiple Orders  

---

## 🔄 Frontend–Backend Flow

1. React component sends request to backend API  
2. Backend processes the request and queries DB  
3. Sends response back to React  
4. React stores response in local state or Redux  
5. Component updates UI dynamically  

---

## 🚀 Development Steps

- ✅ Set up MySQL Database  
- ✅ Create Entity Models  
- ✅ Build first API  
- ✅ Setup Spring Security (Login/Signup with JWT)  
- ✅ Create Services & Implementations  
- ✅ Define Controllers  
- ✅ Test all API endpoints thoroughly  

---

## 🎥 Project Demo  
Watch the complete project walkthrough video here: [Click to watch the demo](https://your-demo-video-link.com)

---

## ℹ️ For More Information  
For detailed information regarding the project, setup, and usage:  
👉 [Click here](https://charmed-meeting-8fe.notion.site/Ecommerce-Multi-Vendor-227bd756bbcb808ea72bfb1182d51b3c?pvs=143)

---

> 🎯 **Complete Multi-Vendor Ecommerce System** with secure authentication, dynamic dashboard, real-time graphs, chatbot, coupon engine, and dual payment gateways – production-ready and feature-rich!
