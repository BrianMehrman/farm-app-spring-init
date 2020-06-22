<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="UTF-8">
        <title>${ projName }</title>
    </head>
    <body>
        <h2>Search Harvest</h2>
        <form action="/farm/search" method="POST">
            <label>Search: </label>
            <input type="text" name="keyword" />
            <button type="submit">Submit</button>
        </form>
    </body>
</html>