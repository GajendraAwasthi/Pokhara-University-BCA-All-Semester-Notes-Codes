const validate = {
    name: "",
    pass: "",
    email: "",
    nameValidate: function(name){
        this.name = name;
        if(this.name == "" || this.name.length < 4){
            alert("Name field is required and must be grater than 4 character");
            return false;
        }
    },
    emailValidate: function(email){
        this.email = email;
        let atindex = this.email.indexOf("@");
        let dotindex = this.email.indexOf(".");

        if(this.email == "" || atindex <3 || (this.email.length - dotindex != 4)){
            alert("email field is required, and valid email");
            return false;
        }
    },
    passValidate: function(password){
        this.password = password;
        if(this.password == "" || this.password.length < 8){
            alert("password field is and grater than 8 character");
            return false;
        }
    }
}