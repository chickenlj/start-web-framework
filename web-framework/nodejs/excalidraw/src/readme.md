
> 注：当前项目为 Serverless Devs 应用，由于应用中会存在需要初始化才可运行的变量（例如应用部署地区、函数名等等），所以**不推荐**直接 Clone 本仓库到本地进行部署或直接复制 s.yaml 使用，**强烈推荐**通过 `s init ${模版名称}` 的方法或应用中心进行初始化，详情可参考[部署 & 体验](#部署--体验) 。

# website-excalidraw-cap 帮助文档

<description>

本案例将 Excalidraw ，这一功能强大、易于使用的绘图工具，快速创建并部署到阿里云函数计算 FC 。

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
   
- :fire: 通过 [云原生应用开发平台 CAP](https://devs.console.aliyun.com/applications/create?template=website-excalidraw-cap) ，
  [![Deploy with Severless Devs](https://img.alicdn.com/imgextra/i1/O1CN01w5RFbX1v45s8TIXPz_!!6000000006118-55-tps-95-28.svg)](https://devs.console.aliyun.com/applications/create?template=website-excalidraw-cap) 该应用。
   
</appcenter>


## 案例介绍

<appdetail id="flushContent">

本案例将 Excalidraw ，这一功能强大、易于使用的绘图工具，快速创建并部署到阿里云函数计算 FC 。

Excalidraw 是一个开源的手绘风格虚拟白板应用，它通过提供一个简单直观的在线界面，让用户能够轻松地创建和共享图表和草图。这个工具独特的地方在于它模拟了手绘效果，使得创建出的图表既有个性又富有表现力。用户可以在没有绘画技巧的情况下，快速绘制出看上去自然而有趣的设计图。

在 GitHub 上，Excalidraw 由于其易用性和有趣的绘图体验，获得了大量的 stars 和社区支持。它被广大设计师、产品经理、教师、学生和软件开发者所喜爱，用于各种场景，如在线会议、教育、软件设计等。

Excalidraw 的功能包括但不限于基本的图形绘制、文本输入、颜色填充、图层管理、拖放元素以及导出图形为图片或SVG等格式。它还提供了协作功能，使得多名用户可以实时同步地在同一画板上工作，这对于远程团队协作是极其有用的。

通过云原生应用开发平台 CAP，您只需要几步，就可以体验 Excalidraw ，并享受 Serverless 架构带来的降本提效的技术红利。

</appdetail>

## 使用流程

<usedetail id="flushContent">

### 查看部署的应用
本项目案例是 excalidraw 部署到阿里云 Serverless 平台（函数计算 FC），部署完成之后，您可以看到系统返回给您的案例地址，例如：

![图片alt](https://img.alicdn.com/imgextra/i1/O1CN01dTugc51z7575bUTWP_!!6000000006666-0-tps-1152-332.jpg)

此时，打开案例地址，就可以进入 excalidraw 默认的首页：

![图片alt](https://img.alicdn.com/imgextra/i4/O1CN01moxj2N1iNFbmXsyaz_!!6000000004400-0-tps-2882-1678.jpg)

### 二次开发
您可以通过页面上的云端开发功能，在线进行二次开发。如您之前是在本地创建项目，也可以在本地的项目目录`website-excalidraw-cap`下，对项目进行二次开发。在完成开发后，您可以通过`s deploy`命令重新部署该项目并进行查看。

</usedetail>

## 注意事项

<matters id="flushContent">
</matters>

