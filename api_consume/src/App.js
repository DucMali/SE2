import logo from './logo.svg';
import './App.css';
import {useState} from "react";
import StudentAdd from "./components/StudentAdd";
import StudentList from "./components/StudentList";

function App() {

  const[reloadList,setReloadList] = useState(false);

  const handleReloadList=()=>{
    setReloadList(!reloadList);
  };
  return (
    <div className="container text-center card mt-3">
      <div className="row">
        <div className="col">
          <StudentAdd reloadStudentList={handleReloadList}/>
        </div>
        <div className="col">
          <StudentList reloadList = {reloadList}/>
        </div>
      </div>
    </div>
  );
}

export default App;
