#pragma checksum "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml" "{8829d00f-11b8-4213-878b-770e8597ac16}" "bcb6b4fad5b94a9167e2f979de7dcbda7f1c7e5afbcba02afd0eb2cb3fe08734"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCoreGeneratedDocument.Views_Home_Index), @"mvc.1.0.view", @"/Views/Home/Index.cshtml")]
namespace AspNetCoreGeneratedDocument
{
    #line default
    using global::System;
    using global::System.Collections.Generic;
    using global::System.Linq;
    using global::System.Threading.Tasks;
    using global::Microsoft.AspNetCore.Mvc;
    using global::Microsoft.AspNetCore.Mvc.Rendering;
    using global::Microsoft.AspNetCore.Mvc.ViewFeatures;
    #line default
    #line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"Sha256", @"bcb6b4fad5b94a9167e2f979de7dcbda7f1c7e5afbcba02afd0eb2cb3fe08734", @"/Views/Home/Index.cshtml")]
    #nullable restore
    internal sealed class Views_Home_Index : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    #nullable disable
    {
        #line hidden
        #pragma warning disable 0649
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperExecutionContext __tagHelperExecutionContext;
        #pragma warning restore 0649
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner __tagHelperRunner = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner();
        #pragma warning disable 0169
        private string __tagHelperStringValueBuffer;
        #pragma warning restore 0169
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __backed__tagHelperScopeManager = null;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __tagHelperScopeManager
        {
            get
            {
                if (__backed__tagHelperScopeManager == null)
                {
                    __backed__tagHelperScopeManager = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager(StartTagHelperWritingScope, EndTagHelperWritingScope);
                }
                return __backed__tagHelperScopeManager;
            }
        }
        private global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.HeadTagHelper __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_HeadTagHelper;
        private global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.BodyTagHelper __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_BodyTagHelper;
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            WriteLiteral("\r\n");
#nullable restore
#line 2 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
  
	Layout = null;

#line default
#line hidden
#nullable disable

            WriteLiteral("\r\n<!DOCTYPE html>\r\n<html>\r\n");
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("head", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "bcb6b4fad5b94a9167e2f979de7dcbda7f1c7e5afbcba02afd0eb2cb3fe087343132", async() => {
                WriteLiteral("\r\n\t<meta name=\"viewport\" content=\"width=device-width\"/>\r\n\t<title>Index</title>\r\n");
            }
            );
            __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_HeadTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.HeadTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_HeadTagHelper);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            WriteLiteral("\r\n");
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("body", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "bcb6b4fad5b94a9167e2f979de7dcbda7f1c7e5afbcba02afd0eb2cb3fe087344210", async() => {
                WriteLiteral("\r\n\t<div style=\"background:green;color:#ffffff;width:100%\">Yusuf<b>Kayaoglu</b></div>\r\n\t<br />\r\n\t<br />\r\n\r\n\t<b>Tarih-Saat:</b>");
                Write(
#nullable restore
#line 17 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
                    DateTime.Now

#line default
#line hidden
#nullable disable
                );
                WriteLiteral("\r\n");
#nullable restore
#line 18 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
  for(int i = 0; i < 10; i++)
	{

#line default
#line hidden
#nullable disable

                WriteLiteral("\t\t<div style=\"background:green;color:#ffffff;width:100%\">\r\n\t\t\t");
                Write(
#nullable restore
#line 21 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
    i

#line default
#line hidden
#nullable disable
                );
                WriteLiteral("\r\n\t\t</div>\r\n");
#nullable restore
#line 23 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
	}

#line default
#line hidden
#nullable disable

                WriteLiteral("\r\n");
#nullable restore
#line 25 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
   
		var list1 = new List<string>() {"Adana","Ankara","Düzce","İstanbul"};
	

#line default
#line hidden
#nullable disable

                WriteLiteral("\t<br />\r\n\t<br />\r\n\t<br />\r\n\t<br />\r\n\t<b>ForEach Döngüsü</b>\r\n\t<table style=\"width:100%\">\r\n");
#nullable restore
#line 34 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
   foreach (var li in list1)
		{

#line default
#line hidden
#nullable disable

                WriteLiteral("\t\t\t<tr style=\"background:red; color:#ffffff; width:100%; border-top:1px solid #ccc\">\r\n\t\t\t\t<td>");
                Write(
#nullable restore
#line 37 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
         li

#line default
#line hidden
#nullable disable
                );
                WriteLiteral("</td>\r\n\t\t\t</tr>\r\n");
#nullable restore
#line 39 "C:\Users\USER\source\repos\Proje1\Proje1\Views\Home\Index.cshtml"
		}

#line default
#line hidden
#nullable disable

                WriteLiteral("\t</table>\r\n\r\n\r\n\t");
            }
            );
            __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_BodyTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.BodyTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_BodyTagHelper);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            WriteLiteral("\r\n</html>");
        }
        #pragma warning restore 1998
        #nullable restore
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; } = default!;
        #nullable disable
        #nullable restore
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; } = default!;
        #nullable disable
        #nullable restore
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; } = default!;
        #nullable disable
        #nullable restore
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; } = default!;
        #nullable disable
        #nullable restore
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<dynamic> Html { get; private set; } = default!;
        #nullable disable
    }
}
#pragma warning restore 1591
