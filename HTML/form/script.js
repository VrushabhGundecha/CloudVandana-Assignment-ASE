function submitForm() {
    
    if (validateForm()) {
       
        var firstName = document.getElementById('firstName').value;
        var lastName = document.getElementById('lastName').value;
        var dob = document.getElementById('dob').value;
        var country = document.getElementById('country').value;

        var genders = document.querySelectorAll('input[name="gender"]:checked');
        var genderValues = Array.from(genders).map(gender => gender.value);

        var profession = document.getElementById('profession').value;
        var email = document.getElementById('email').value;
        var mobileNumber = document.getElementById('mobileNumber').value;

        // Display values in popup
        var popupContent = `
            <p><strong>First Name:</strong> ${firstName}</p>
            <p><strong>Last Name:</strong> ${lastName}</p>
            <p><strong>Date of Birth:</strong> ${dob}</p>
            <p><strong>Country:</strong> ${country}</p>
            <p><strong>Gender:</strong> ${genderValues.join(', ')}</p>
            <p><strong>Profession:</strong> ${profession}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile Number:</strong> ${mobileNumber}</p>
        `;

        // Display popup
        document.getElementById('popup').innerHTML = popupContent;
        document.getElementById('popup').style.display = 'block';

        
        resetForm();
    }
}

function validateForm() {
    var form = document.getElementById('surveyForm');
    return form.checkValidity();
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}

// Close the popup when clicking outside of it
window.onclick = function(event) {
    if (event.target == document.getElementById('popup')) {
        document.getElementById('popup').style.display = 'none';
    }
};