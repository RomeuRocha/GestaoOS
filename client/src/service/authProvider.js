const authProvider = {
    login: ({ username, password }) =>  {
        const request = new Request('http://localhost:8081/api/auth/signin', {
            method: 'POST',
            body: JSON.stringify({ username, password }),
            headers: new Headers({ 'Content-Type': 'application/json' }),
        });
        return fetch(request)
            .then(response => {
                if (response.status < 200 || response.status >= 300) {
                    throw new Error(response.statusText);
                }
                return response.json();
            })
            .then(auth => {
                localStorage.setItem('auth', JSON.stringify(auth));
            })
            .catch(() => {
                throw new Error('Network error')
            });
    },
    checkError: (error) => {
        const status = error.status;
        if (status === 401 || status === 403) {
            localStorage.removeItem('auth');
            return Promise.reject();
        }
        // other error code (404, 500, etc): no need to log out
        return Promise.resolve();
    },
    checkAuth: () => {
        // Required for the authentication to work
        if(localStorage.getItem('auth')) {
            return Promise.resolve();
        }
        return Promise.reject();
    },
    getPermissions: () => {
        // Required for the authentication to work
        return Promise.resolve();
    },
    logout: () => {
        return Promise.resolve().then(e=> localStorage.removeItem('auth')); 
    },
    // ...
};

export default authProvider;