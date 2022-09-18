


function getData()
{
    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "/jokes",
        dataType: 'json',
        success: function (data) {
            $("#joke").append(data);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4>&lt;pre&gt;"
                + e.responseText + "&lt;/pre&gt;";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    })
}