
document.getElementById("projectForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const project = {
        name: document.getElementById("name").value,
        description: document.getElementById("description").value,
        startDate: document.getElementById("startDate").value,
        endDate: document.getElementById("endDate").value,
        status: document.getElementById("status").value,
    };

    fetch("http://localhost:8080/api/products", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(project),
    })
        .then((response) => response.json())
        .then((data) => {
            // Handle the response, e.g., show a success message
            console.log(data);
        })
        .catch((error) => {
            // Handle errors
            console.error(error);
        });
});