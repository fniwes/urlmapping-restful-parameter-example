class UrlMappings {
		static mappings = {
		"/foo/admission"(controller: 'foo', action: 'save', method: 'post') {
			admissionDate = { new Date().format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") }
		}

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
