
> 注：当前项目为 Serverless Devs 应用，由于应用中会存在需要初始化才可运行的变量（例如应用部署地区、函数名等等），所以**不推荐**直接 Clone 本仓库到本地进行部署或直接复制 s.yaml 使用，**强烈推荐**通过 `s init ${模版名称}` 的方法或应用中心进行初始化，详情可参考[部署 & 体验](#部署--体验) 。

# start-nuxt-cap 帮助文档

<description>

nuxt.js简单的说是Vue.js的通用框架，最常用的就是用来作SSR（服务器端渲染）

</description>




## 前期准备

使用该项目，您需要有开通以下服务并拥有对应权限：

<service>



| 服务/业务 |  权限  | 相关文档 |
| --- |  --- | --- |
| 函数计算 |  AliyunFCFullAccess | [帮助文档](https://help.aliyun.com/product/2508973.html) [计费文档](https://help.aliyun.com/document_detail/2512928.html) |

</service>

<remark>



</remark>

<disclaimers>



</disclaimers>

## 部署 & 体验

<appcenter>
   
- :fire: 通过 [云原生应用开发平台 CAP](https://devs.console.aliyun.com/applications/create?template=start-nuxt-cap) ，
  [![Deploy with Severless Devs](https://img.alicdn.com/imgextra/i1/O1CN01w5RFbX1v45s8TIXPz_!!6000000006118-55-tps-95-28.svg)](https://devs.console.aliyun.com/applications/create?template=start-nuxt-cap) 该应用。
   
</appcenter>


## 案例介绍

<appdetail id="flushContent">

本案例将 Nuxt.js ，这一在前端开发者社区中非常流行的web框架，快速创建并部署到阿里云函数计算 FC 。

Nuxt.js 是一个为 Vue.js 生态圈带来的创新框架，它通过提供自动化的流程和强大的默认设置，使得构建快速和优化的 web 应用程序成为一种简单的体验。Nuxt.js 的核心特性包括通过文件系统自动生成路由、服务器端渲染支持以提升SEO友好度和首屏加载性能、以及自动的代码分割以实现更快的页面加载时间。

在GitHub上，Nuxt.js 凭借其开发者友好的特性和便捷的构建过程，拥有大量的 stars 和一个活跌的社区支持。从个人开发者到大型企业都在利用 Nuxt.js 来构建各种规模的项目，这证明了其在实际应用中的灵活性和可靠性。

Nuxt.js 还提供了一套强大的模块系统，允许开发者通过安装插件来扩展应用程序的功能，例如添加 PWA 支持、集成 Google Analytics 或生成站点地图等。它的模块化架构保证了大型应用的可维护性和可扩展性，使得管理和升级变得更加容易。

与云原生应用开发平台 CAP相结合，Nuxt.js 可以为开发者提供无需管理服务器和后端配置的部署选项。这种模式不仅可以减少开发和运维成本，还能使应用根据实际流量进行自动扩展。Nuxt.js 的静态站点生成功能尤其适合与云原生应用开发平台 CAP静态托管服务搭配使用，能够快速部署并实现全球分发。

</appdetail>

## 使用流程

<usedetail id="flushContent">

### 查看部署的应用
本项目案例是 nuxt 部署到阿里云 Serverless 平台（函数计算 FC），部署完成之后，您可以看到系统返回给您的案例地址，例如：

![图片alt](https://img.alicdn.com/imgextra/i1/O1CN01rBUqnl1UK8JKS7opn_!!6000000002498-0-tps-1102-336.jpg)

此时，打开案例地址，就可以进入 nuxt 默认的首页：

![图片alt](https://img.alicdn.com/imgextra/i3/O1CN01ygZ6b01ihrQwrtS76_!!6000000004445-0-tps-2014-926.jpg)

### 二次开发
您可以通过页面上的云端开发功能，在线进行二次开发。如您之前是在本地创建项目，也可以在本地的项目目录`start-nuxt-cap`下，对项目进行二次开发。在完成开发后，您可以通过`s deploy`命令重新部署该项目并进行查看。

</usedetail>

## 注意事项

<matters id="flushContent">
</matters>
