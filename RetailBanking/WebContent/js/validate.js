$(document).ready(function () {


    $.validator.addMethod('mypassword', function(value, element) {
        return this.optional(element) || (value.match(/[a-zA-Z]/) && value.match(/[0-9]/));
    },
    'Password must contain at least one numeric and one alphabetic character.');


    $('#login-form').validate({ // initialize the plugin
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