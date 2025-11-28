[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Můj blog</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
    <h1>My blog</h1>
    [#list postList]
        <div class="list">
            [#items as post]
            <a href="/${post.slug}">
                <div class="post">
                    <div class="author">${post.author}</div>
                    <div class="title">${post.title}</div>
                    <div class="perex">${post.perex?no_esc}</div>
                    <div class="published">
                        [#if post.published??]${post.published?date}[#else]Unknown published date[/#if]
                    </div>
                </div>
            </a>
            [/#items]
        </div>
    [#else]
        <div class="empty">There are no posts.</div>
    [/#list]
</body>
</html>
