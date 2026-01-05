// src/pages/LoginPage.jsx
import LoginForm from "../components/LoginForm";
import { login } from "../api/userApi";

function LoginPage() {
    const handleLogin = async (data) => {
        try {
            const result = await login(data);
            alert("로그인 성공: " + JSON.stringify(result));
        } catch (error) {
            alert("로그인 실패");
        }
    };

    return (
        <div>
            <h2>로그인</h2>
            <LoginForm onLogin={handleLogin} />
        </div>
    );
}

export default LoginPage;
