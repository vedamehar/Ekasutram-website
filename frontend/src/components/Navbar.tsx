import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <nav style={{ padding: "10px", borderBottom: "1px solid #ccc" }}>
      <Link to="/">Home</Link> |{" "}
      <Link to="/resources">Resources</Link> |{" "}
      <Link to="/events">Events</Link> |{" "}
      <Link to="/about">About</Link> |{" "}
      <Link to="/team">Team</Link> |{" "}
      <Link to="/fun-games">Fun Games</Link> |{" "}
      <Link to="/setcode">SetCode</Link>
    </nav>
  );
};

export default Navbar;
