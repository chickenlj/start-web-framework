
> 注：当前项目为 Serverless Devs 应用，由于应用中会存在需要初始化才可运行的变量（例如应用部署地区、函数名等等），所以**不推荐**直接 Clone 本仓库到本地进行部署或直接复制 s.yaml 使用，**强烈推荐**通过 `s init ${模版名称}` 的方法或应用中心进行初始化，详情可参考[部署 & 体验](#部署--体验) 。

# nginx-reverse-proxy 帮助文档

<description>

本案例快速部署一个 Nginx 反向代理项目到阿里云函数计算 FC。

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
   
- :fire: 通过 [云原生应用开发平台 CAP](https://devs.console.aliyun.com/applications/create?template=nginx-reverse-proxy) ，
  [![Deploy with Severless Devs](https://img.alicdn.com/imgextra/i1/O1CN01w5RFbX1v45s8TIXPz_!!6000000006118-55-tps-95-28.svg)](https://devs.console.aliyun.com/applications/create?template=nginx-reverse-proxy) 该应用。
   
</appcenter>


## 案例介绍

<appdetail id="flushContent">

本案例快速部署一个 Nginx 项目到阿里云函数计算 FC。

Nginx的流行程度非常高，是全球范围内广泛使用的Web服务器和反向代理服务器。它的高性能、稳定性、丰富的功能、易用性，使得它在Web开发领域得到了广泛的应用，无论是大型网站还是小型应用，都可以看到Nginx的身影。此外，Nginx还在CDN、API网关、实时通信等领域发挥着重要作用。

Nginx 是一个高性能的HTTP和反向代理服务器，也是一个IMAP/POP3/SMTP代理服务器。最初由俄罗斯人Igor Sysoev开发并公开源代码，供广大用户使用。其特点是占有内存少，并发能力强，事实上nginx的并发能力确实在同类型的网页服务器中表现较好。

通过云原生应用开发平台 CAP，您只需要几步，就可以体验 Nginx，并享受 Serverless 架构带来的降本提效的技术红利。

</appdetail>

## 使用流程

<usedetail id="flushContent">

### 查看部署的案例

部署完成之后，您可以看到系统返回给您的案例地址。

### 二次开发

您可以通过云端控制台的开发功能进行二次开发。如果您之前是在本地创建的项目案例，也可以在本地项目目录`nginx-reverse-proxy`文件夹下，对项目进行二次开发。开发完成后，可以通过`s deploy`进行快速部署。

</usedetail>

## 注意事项

<matters id="flushContent">
</matters>

