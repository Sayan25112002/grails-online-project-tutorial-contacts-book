package contact.book

class UrlMappings {

    static mappings = {
        "/"(controller: 'authentication', action: 'login')  // 👈 add this line
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
