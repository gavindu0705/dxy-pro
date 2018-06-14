<h1>hello ${name!}!!!</h1>
<table border="1">
<#list products as pro>
    <tr>
        <td>${pro.id!}</td>
        <td>${pro.name!}</td>
        <td>${pro.description!}</td>
        <td>${pro.status!}</td>
    </tr>
</#list>
</table>