
> 注：当前项目为 Serverless Devs 应用，由于应用中会存在需要初始化才可运行的变量（例如应用部署地区、函数名等等），所以**不推荐**直接 Clone 本仓库到本地进行部署或直接复制 s.yaml 使用，**强烈推荐**通过 `s init ${模版名称}` 的方法或应用中心进行初始化，详情可参考[部署 & 体验](#部署--体验) 。

# start-fastify-cap 帮助文档

<description>

本案例是将 Fastify 框架，这一基于 Node.js 平台的极简且灵活的 web 应用开发框架，快速创建并部署到阿里云函数计算 FC 。

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
   
- :fire: 通过 [云原生应用开发平台 CAP](https://devs.console.aliyun.com/applications/create?template=start-fastify-cap) ，
  [![Deploy with Severless Devs](https://img.alicdn.com/imgextra/i1/O1CN01w5RFbX1v45s8TIXPz_!!6000000006118-55-tps-95-28.svg)](https://devs.console.aliyun.com/applications/create?template=start-fastify-cap) 该应用。
   
</appcenter>

## 案例介绍

<appdetail id="flushContent">

本案例是将 Fastify 框架，这一基于 Node.js 平台的极简且灵活的 web 应用开发框架，快速创建并部署到阿里云函数计算 FC 。

高效的服务器意味着更低的基础设施成本、更好的负载响应能力和用户满意度。 在不牺牲安全验证和便捷开发的前提下，如何知道服务器正在处理尽可能多的请求，又如何有效地处理服务器资源？

用 Fastify 吧。Fastify 是一个 web 开发框架，其设计灵感来自 Hapi 和 Express，致力于以最少的开销和强大的插件结构提供最佳的开发体验。据我们所知，它是这个领域里速度最快的 web 框架之一。

</appdetail>

## 使用流程

<usedetail id="flushContent">


### 二次开发

您可以通过云端控制台的开发功能进行二次开发。如果您之前是在本地创建的项目案例，也可以在本地项目目录`start-fastify-cap`文件夹下，对项目进行二次开发。开发完成后，可以通过`s deploy`进行快速部署。

</usedetail>

## 注意事项

<matters id="flushContent">
</matters>

