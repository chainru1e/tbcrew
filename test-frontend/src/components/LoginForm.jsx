// src/components/LoginForm.jsx
import { useState } from "react";

function LoginForm({ onLogin }) {
    const [username, setUsername] = useState("");
    const [pw, setPw] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault(); // 새로고침 방지
        onLogin({ username, pw });
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <input
                    type="text"
                    placeholder="아이디"
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                />
            </div>

            <div>
                <input
                    type="password"
                    placeholder="비밀번호"
                    value={pw}
                    onChange={(e) => setPw(e.target.value)}
                />
            </div>

            <button type="submit">로그인</button>
        </form>
    );
}

export default LoginForm;
