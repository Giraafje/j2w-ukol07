[#ftl]
[@c.page title="Můj blog"]
    <h1>Blog</h1>
    [#list posts.content]
        <div class="list">
            [#items as post]
            <a href="/post/${post.slug}">
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

    <div class="pagination">
        [#if posts.hasPrevious()]
            <a href="${createURL({"page": posts.number -1})}"><span class="arrow">←</span></a>
        [/#if]

        [#if posts.hasPrevious() && posts.hasNext()]
            &nbsp;|&nbsp;
        [/#if]

        [#if posts.hasNext()]
            <a href="${createURL({"page": posts.number + 1})}"><span class="arrow">→</span></a>
        [/#if]
    </div>
[/@c.page]

