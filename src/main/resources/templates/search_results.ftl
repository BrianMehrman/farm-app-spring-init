<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="UTF-8">
        <title>${ projName }</title>
    </head>
    <body>
        <h2>Search Harvest</h2>
        <table>
            <#list harvest as prod>
                <tr>
                    <td>${ prod }</td>
                </tr>
            </#list>
        </table>
    </body>
</html>