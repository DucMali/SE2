import React from "react";
import axios from "axios";

export default class StudentList extends React.Component{
    state = {
        students: []
    }
    url ="http://localhost:8080"
    componentDidMount() {
        this.fetchStudentList()
    }

    componentDidUpdate(prevProps, prevState,snapshot){
        if(this.props.reloadList !== prevProps.reloadList){
            this.fetchStudentList();
        }
    }

    fetchStudentList = () => {
        axios.get(this.url).then((res)=>{
            const students = res.data;
            this.setState({students});
        });
    };

    render() {
        return(
            <div className="container text-center mt-3">
                <table className="table table-primary">
                    <thead>
                        <tr>
                            <th colSpan ="4" className="h3 text text-danger bg-warning">STUDENT LIST</th>
                        </tr>
                        <tr className="h5 text text-success">
                            <th>Student ID</th>
                            <th>Student Name</th>
                            <th>Student Age</th>

                        </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.students
                            .map(student =>
                                <tr key ={student.id}>
                                    <td>{student.id}</td>
                                    <td>{student.name}</td>
                                    <td>{student.age}</td>
                                </tr>
                            )
                    }
                    </tbody>
                </table>
            </div>
        )
    }
}
