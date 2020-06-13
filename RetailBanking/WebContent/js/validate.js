$(document).ready(function () {


    $.validator.addMethod('mypassword', function(value, element) {
        return this.optional(element) || (value.match(/[a-z]/) && value.match(/[0-9]/) && value.match(/[A-Z]/)
        
        && value.match(/[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/)
        );
    }, 'Password should contain 10 characters including one special character, one upper case, one numeric.');

    $('#login-form').validate({ 
        errorClass: "my-error-class",
        validClass:"my-success-class",

        rules: {
            username: {
                required: true,
                minlength: 8,
                alphanumeric:true
            },
            password: {
                required: true,
                minlength: 10,
                mypassword:true
                
                
            }
        },
        messages :{
            username:{
                required:'Please Enter Valid Username'
            },
            password:{
                required:'Please Enter Valid Password'
            }

        }
    });

});