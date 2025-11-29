[#ftl]
[@c.page title="${post.title}"]
    <div class="container">
        <h1>${post.title}</h1>
        <div class="author">${post.author}</div>
        <div class="published">[#if post.published??]${post.published?date}[/#if]</div>
        <div class="perex">${post.perex?no_esc}</div>
        <div class="delimiter"></div>
        <div class="postbody">${post.body?no_esc}</div>
    </div>
    <nav>
        <a href="/">◂ Back to Homepage</a>
    </nav>
[/@c.page]
