const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmmx056/",
            name: "ssmmx056",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmmx056/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的学生签到系统"
        } 
    }
}
export default base
