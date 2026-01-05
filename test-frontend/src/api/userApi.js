export async function login({username,pw}){
    const response = await fetch("http://localhost:8080/users/login",{
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({username, pw}),
    });

    if(!response.ok){
        throw new Error("로그인 실패");
    }

    return response.json();
}