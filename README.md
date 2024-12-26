# AutoGenerator-Plus：基于 MyBatis-Plus 的增强型代码生成器

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

AutoGenerator-Plus 是一个基于 MyBatis-Plus 强大的代码生成器 AutoGenerator 基础上进行增强的工具，旨在帮助开发者快速生成实体类（Entity）、Mapper 接口、Service 接口和实现类、Controller 控制器等常用代码，极大地提高开发效率。

## 项目特性

*   **基于 MyBatis-Plus AutoGenerator：** 继承了 MyBatis-Plus AutoGenerator 的所有优点，并进行了扩展。
*   **高度可配置化：** 提供丰富的配置选项，包括数据库连接信息、生成策略、模板引擎选择（Velocity、Freemarker、Beetl）、输出目录等，满足各种项目需求。
*   **支持多种数据库：** 支持 MySQL、Oracle、SQL Server、PostgreSQL 等主流数据库。
*   **模板定制：** 允许用户自定义模板，灵活控制生成的代码风格和内容。
*   **代码规范：** 生成的代码遵循良好的代码规范，易于维护和扩展。
*   **持久化配置：** 支持将配置信息持久化到 JSON 文件，方便下次使用，避免重复配置。
*   **易于集成：** 可以方便地集成到 Spring Boot 等项目中。

## 技术栈

*   **MyBatis-Plus:** 强大的 MyBatis 增强工具。
*   **AutoGenerator:** MyBatis-Plus 自带的代码生成器。
*   **Velocity / Freemarker / Beetl:** 模板引擎（可配置）。
*   **JSON:** 用于配置文件的存储。
*   **Spring Boot (可选):** 用于快速构建项目。

## 快速开始

1.  **克隆项目：**

    ```bash
    git clone 
    ```

2.  **配置数据库连接信息：**

    在 `src/main/resources` 目录下找到配置文件（例如 `application.properties` 或 `application.yml`），配置数据库连接信息。或者通过代码方式进行配置。

3.  **运行代码生成器：**

    运行项目中的生成器代码，根据配置生成相应的代码。

4.  **将生成的代码集成到项目中：**

    将生成的代码复制到你的项目中，并进行必要的调整。

## 使用示例

（提供一些代码示例，展示如何使用 AutoGenerator-Plus 生成代码，例如如何配置生成策略、如何使用自定义模板等。）

## 项目进度

*   [x] 框架搭建
*   [x] MyBatis-Plus 代码生成测试
*   [ ] 前端界面开发
*   [ ] 后台接口开发
*   [ ] 持久化每次的设置，利用文件存储 JSON

## 贡献

欢迎任何形式的贡献，包括但不限于：

*   提交 Bug 报告
*   提交 Pull Request
*   提供改进建议
*   编写文档

## 许可证

本项目使用 Apache License 2.0 许可证。
