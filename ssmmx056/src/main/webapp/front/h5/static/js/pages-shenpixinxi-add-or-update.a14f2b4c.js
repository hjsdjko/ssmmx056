(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shenpixinxi-add-or-update"],{"953c":function(r,e,i){"use strict";var t=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("a481"),i("c5f6"),i("f559"),i("ac6a"),i("28a5"),i("96cf");var a=t(i("3b8d")),o=t(i("e2b1")),n={data:function(){return{cross:"",ruleForm:{shenpibianhao:this.getUUID(),biaoti:"",tupian:"",shenpizhuangtai:"",shenpishijian:"",jiaoshigonghao:"",jiaoshixingming:"",xueshengzhanghao:"",xueshengxingming:"",crossuserid:"",crossrefid:"",userid:""},shenpizhuangtaiOptions:[],shenpizhuangtaiIndex:0,user:{},ro:{shenpibianhao:!1,biaoti:!1,tupian:!1,shenpizhuangtai:!1,shenpishijian:!1,jiaoshigonghao:!1,jiaoshixingming:!1,xueshengzhanghao:!1,xueshengxingming:!1,crossuserid:!1,crossrefid:!1,userid:!1}}},components:{wPicker:o.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(e){var i,t,a,o;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return this.ruleForm.shenpishijian=this.$utils.getCurDate(),i=uni.getStorageSync("nowTable"),r.next=4,this.$api.session(i);case 4:if(t=r.sent,this.user=t.data,this.ruleForm.jiaoshigonghao=this.user.jiaoshigonghao,this.ro.jiaoshigonghao=!0,this.ruleForm.jiaoshixingming=this.user.jiaoshixingming,this.ro.jiaoshixingming=!0,this.shenpizhuangtaiOptions="有待审批,已请假,已完成,待销假".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!e.id){r.next=19;break}return this.ruleForm.id=e.id,r.next=17,this.$api.info("shenpixinxi",this.ruleForm.id);case 17:t=r.sent,this.ruleForm=t.data;case 19:if(this.cross=e.cross,!e.cross){r.next=75;break}a=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(a);case 23:if((r.t1=r.t0()).done){r.next=75;break}if(o=r.t1.value,"shenpibianhao"!=o){r.next=29;break}return this.ruleForm.shenpibianhao=a[o],this.ro.shenpibianhao=!0,r.abrupt("continue",23);case 29:if("biaoti"!=o){r.next=33;break}return this.ruleForm.biaoti=a[o],this.ro.biaoti=!0,r.abrupt("continue",23);case 33:if("tupian"!=o){r.next=37;break}return this.ruleForm.tupian=a[o],this.ro.tupian=!0,r.abrupt("continue",23);case 37:if("shenpizhuangtai"!=o){r.next=41;break}return this.ruleForm.shenpizhuangtai=a[o],this.ro.shenpizhuangtai=!0,r.abrupt("continue",23);case 41:if("shenpishijian"!=o){r.next=45;break}return this.ruleForm.shenpishijian=a[o],this.ro.shenpishijian=!0,r.abrupt("continue",23);case 45:if("jiaoshigonghao"!=o){r.next=49;break}return this.ruleForm.jiaoshigonghao=a[o],this.ro.jiaoshigonghao=!0,r.abrupt("continue",23);case 49:if("jiaoshixingming"!=o){r.next=53;break}return this.ruleForm.jiaoshixingming=a[o],this.ro.jiaoshixingming=!0,r.abrupt("continue",23);case 53:if("xueshengzhanghao"!=o){r.next=57;break}return this.ruleForm.xueshengzhanghao=a[o],this.ro.xueshengzhanghao=!0,r.abrupt("continue",23);case 57:if("xueshengxingming"!=o){r.next=61;break}return this.ruleForm.xueshengxingming=a[o],this.ro.xueshengxingming=!0,r.abrupt("continue",23);case 61:if("crossuserid"!=o){r.next=65;break}return this.ruleForm.crossuserid=a[o],this.ro.crossuserid=!0,r.abrupt("continue",23);case 65:if("crossrefid"!=o){r.next=69;break}return this.ruleForm.crossrefid=a[o],this.ro.crossrefid=!0,r.abrupt("continue",23);case 69:if("userid"!=o){r.next=73;break}return this.ruleForm.userid=a[o],this.ro.userid=!0,r.abrupt("continue",23);case 73:r.next=23;break;case 75:this.styleChange();case 76:case"end":return r.stop()}}),r,this)})));function e(e){return r.apply(this,arguments)}return e}(),methods:{styleChange:function(){this.$nextTick((function(){}))},shenpishijianChange:function(r){this.ruleForm.shenpishijian=r.target.value,this.$forceUpdate()},shenpizhuangtaiChange:function(r){this.shenpizhuangtaiIndex=r.target.value,this.ruleForm.shenpizhuangtai=this.shenpizhuangtaiOptions[this.shenpizhuangtaiIndex]},tupianTap:function(){var r=this;this.$api.upload((function(e){r.ruleForm.tupian="upload/"+e.file,r.$forceUpdate(),r.$nextTick((function(){r.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(){var e,i,t,a,o,n,s,d,u,c;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!this.cross){r.next=16;break}if(a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){r.next=16;break}if(n=uni.getStorageSync("crossObj"),a.startsWith("[")){r.next=12;break}for(s in n)s==a&&(n[s]=o);return d=uni.getStorageSync("crossTable"),r.next=10,this.$api.update("".concat(d),n);case 10:r.next=16;break;case 12:e=Number(uni.getStorageSync("userid")),i=n["id"],t=uni.getStorageSync("statusColumnName"),t=t.replace(/\[/,"").replace(/\]/,"");case 16:if(!i||!e){r.next=38;break}return this.ruleForm.crossuserid=e,this.ruleForm.crossrefid=i,u={page:1,limit:10,crossuserid:e,crossrefid:i},r.next=22,this.$api.list("shenpixinxi",u);case 22:if(c=r.sent,!(c.data.total>=t)){r.next=28;break}return this.$utils.msg(uni.getStorageSync("tips")),r.abrupt("return",!1);case 28:if(!this.ruleForm.id){r.next=33;break}return r.next=31,this.$api.update("shenpixinxi",this.ruleForm);case 31:r.next=35;break;case 33:return r.next=35,this.$api.add("shenpixinxi",this.ruleForm);case 35:this.$utils.msgBack("提交成功");case 36:r.next=46;break;case 38:if(!this.ruleForm.id){r.next=43;break}return r.next=41,this.$api.update("shenpixinxi",this.ruleForm);case 41:r.next=45;break;case 43:return r.next=45,this.$api.add("shenpixinxi",this.ruleForm);case 45:this.$utils.msgBack("提交成功");case 46:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var e=new Date,i=e.getFullYear(),t=e.getMonth()+1,a=e.getDate();return"start"===r?i-=60:"end"===r&&(i+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(i,"-").concat(t,"-").concat(a)},toggleTab:function(r){this.$refs[r].show()}}};e.default=n},a415:function(r,e,i){"use strict";i.r(e);var t=i("ab9d"),a=i("ec33");for(var o in a)"default"!==o&&function(r){i.d(e,r,(function(){return a[r]}))}(o);i("e169");var n,s=i("f0c5"),d=Object(s["a"])(a["default"],t["b"],t["c"],!1,null,"6e7bf2c4",null,!1,t["a"],n);e["default"]=d.exports},ab9d:function(r,e,i){"use strict";var t,a=function(){var r=this,e=r.$createElement,i=r._self._c||e;return i("v-uni-view",{staticClass:"content"},[i("v-uni-form",{staticClass:"app-update-pv"},[i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("审批编号")]),i("v-uni-view",{staticClass:"right-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(193, 193, 193, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"}},[r._v(r._s(r.ruleForm.shenpibianhao))])],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("标题")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(193, 193, 193, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.biaoti,placeholder:"标题"},model:{value:r.ruleForm.biaoti,callback:function(e){r.$set(r.ruleForm,"biaoti",e)},expression:"ruleForm.biaoti"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(251, 251, 251, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.tupianTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("图片")]),i("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"}},[r.ruleForm.tupian?i("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"12rpx 0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:r.baseUrl+r.ruleForm.tupian,mode:"aspectFill"}}):i("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"12rpx 0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),i("v-uni-view",{staticClass:"cu-form-group select",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(251, 251, 251, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("审批状态")]),i("v-uni-picker",{attrs:{value:r.shenpizhuangtaiIndex,range:r.shenpizhuangtaiOptions},on:{change:function(e){arguments[0]=e=r.$handleEvent(e),r.shenpizhuangtaiChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(193, 193, 193, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.shenpizhuangtai?r.ruleForm.shenpizhuangtai:"请选择审批状态"))])],1)],1),i("v-uni-view",{staticClass:"cu-form-group select",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(251, 251, 251, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("审批时间")]),i("v-uni-picker",{attrs:{mode:"date",value:r.ruleForm.shenpishijian},on:{change:function(e){arguments[0]=e=r.$handleEvent(e),r.shenpishijianChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(193, 193, 193, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.shenpishijian?r.ruleForm.shenpishijian:"请选择审批时间"))])],1)],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("教师工号")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(193, 193, 193, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.jiaoshigonghao,placeholder:"教师工号"},model:{value:r.ruleForm.jiaoshigonghao,callback:function(e){r.$set(r.ruleForm,"jiaoshigonghao",e)},expression:"ruleForm.jiaoshigonghao"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("教师姓名")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(193, 193, 193, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.jiaoshixingming,placeholder:"教师姓名"},model:{value:r.ruleForm.jiaoshixingming,callback:function(e){r.$set(r.ruleForm,"jiaoshixingming",e)},expression:"ruleForm.jiaoshixingming"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("学生账号")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(193, 193, 193, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.xueshengzhanghao,placeholder:"学生账号"},model:{value:r.ruleForm.xueshengzhanghao,callback:function(e){r.$set(r.ruleForm,"xueshengzhanghao",e)},expression:"ruleForm.xueshengzhanghao"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("学生姓名")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(193, 193, 193, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.xueshengxingming,placeholder:"学生姓名"},model:{value:r.ruleForm.xueshengxingming,callback:function(e){r.$set(r.ruleForm,"xueshengxingming",e)},expression:"ruleForm.xueshengxingming"}})],1),i("v-uni-view",{staticClass:"btn"},[i("v-uni-button",{staticClass:"bg-red",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0) inset",margin:"20rpx auto",backgroundColor:"rgba(255, 148, 77, 1)",borderColor:"#409EFF",borderRadius:"88rpx",color:"#fff",borderWidth:"0",width:"60%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1)],1)},o=[];i.d(e,"b",(function(){return a})),i.d(e,"c",(function(){return o})),i.d(e,"a",(function(){return t}))},d3d8:function(r,e,i){var t=i("d89c");"string"===typeof t&&(t=[[r.i,t,""]]),t.locals&&(r.exports=t.locals);var a=i("4f06").default;a("f1883a48",t,!0,{sourceMap:!1,shadowMode:!1})},d89c:function(r,e,i){var t=i("24fb");e=t(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-6e7bf2c4]{padding:%?20?%}.content[data-v-6e7bf2c4]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220228/68c356bbe1634ec39168c0aacd022ed6.png);background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-6e7bf2c4]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-6e7bf2c4]{width:%?180?%}.avator[data-v-6e7bf2c4]{width:%?150?%;height:%?60?%}.right-input[data-v-6e7bf2c4]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-6e7bf2c4]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-6e7bf2c4]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-6e7bf2c4]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-6e7bf2c4]{border:0}.cu-form-group uni-input[data-v-6e7bf2c4]{padding:0 %?30?%}.uni-input[data-v-6e7bf2c4]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-6e7bf2c4]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-6e7bf2c4]::after{line-height:%?80?%}.select .uni-input[data-v-6e7bf2c4]{line-height:%?80?%}.input .right-input[data-v-6e7bf2c4]{line-height:%?60?%}',""]),r.exports=e},e169:function(r,e,i){"use strict";var t=i("d3d8"),a=i.n(t);a.a},ec33:function(r,e,i){"use strict";i.r(e);var t=i("953c"),a=i.n(t);for(var o in t)"default"!==o&&function(r){i.d(e,r,(function(){return t[r]}))}(o);e["default"]=a.a}}]);