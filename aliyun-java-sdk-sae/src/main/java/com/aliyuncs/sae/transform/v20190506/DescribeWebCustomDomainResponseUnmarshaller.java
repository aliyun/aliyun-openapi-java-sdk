/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeWebCustomDomainResponse;
import com.aliyuncs.sae.model.v20190506.DescribeWebCustomDomainResponse.RouteConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebCustomDomainResponse.RouteConfig.RoutesItem;
import com.aliyuncs.sae.model.v20190506.DescribeWebCustomDomainResponse.WebCertConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebCustomDomainResponse.WebTLSConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebCustomDomainResponse.WebWAFConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebCustomDomainResponseUnmarshaller {

	public static DescribeWebCustomDomainResponse unmarshall(DescribeWebCustomDomainResponse describeWebCustomDomainResponse, UnmarshallerContext _ctx) {
		
		describeWebCustomDomainResponse.setAccountId(_ctx.stringValue("DescribeWebCustomDomainResponse.accountId"));
		describeWebCustomDomainResponse.setCreatedTime(_ctx.stringValue("DescribeWebCustomDomainResponse.CreatedTime"));
		describeWebCustomDomainResponse.setDefaultForwardingAppName(_ctx.stringValue("DescribeWebCustomDomainResponse.DefaultForwardingAppName"));
		describeWebCustomDomainResponse.setDomainName(_ctx.stringValue("DescribeWebCustomDomainResponse.DomainName"));
		describeWebCustomDomainResponse.setLastModifiedTime(_ctx.stringValue("DescribeWebCustomDomainResponse.LastModifiedTime"));
		describeWebCustomDomainResponse.setNamespaceId(_ctx.stringValue("DescribeWebCustomDomainResponse.NamespaceId"));
		describeWebCustomDomainResponse.setBizProtocol(_ctx.stringValue("DescribeWebCustomDomainResponse.Protocol"));

		WebCertConfig webCertConfig = new WebCertConfig();
		webCertConfig.setCertName(_ctx.stringValue("DescribeWebCustomDomainResponse.WebCertConfig.CertName"));
		webCertConfig.setCertificate(_ctx.stringValue("DescribeWebCustomDomainResponse.WebCertConfig.Certificate"));
		webCertConfig.setPrivateKey(_ctx.stringValue("DescribeWebCustomDomainResponse.WebCertConfig.PrivateKey"));
		describeWebCustomDomainResponse.setWebCertConfig(webCertConfig);

		WebTLSConfig webTLSConfig = new WebTLSConfig();
		webTLSConfig.setMaxVersion(_ctx.stringValue("DescribeWebCustomDomainResponse.WebTLSConfig.MaxVersion"));
		webTLSConfig.setMinVersion(_ctx.stringValue("DescribeWebCustomDomainResponse.WebTLSConfig.MinVersion"));

		List<String> cipherSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebCustomDomainResponse.WebTLSConfig.CipherSuites.Length"); i++) {
			cipherSuites.add(_ctx.stringValue("DescribeWebCustomDomainResponse.WebTLSConfig.CipherSuites["+ i +"]"));
		}
		webTLSConfig.setCipherSuites(cipherSuites);
		describeWebCustomDomainResponse.setWebTLSConfig(webTLSConfig);

		WebWAFConfig webWAFConfig = new WebWAFConfig();
		webWAFConfig.setEnableWAF(_ctx.booleanValue("DescribeWebCustomDomainResponse.WebWAFConfig.EnableWAF"));
		describeWebCustomDomainResponse.setWebWAFConfig(webWAFConfig);

		RouteConfig routeConfig = new RouteConfig();

		List<RoutesItem> routes = new ArrayList<RoutesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebCustomDomainResponse.RouteConfig.routes.Length"); i++) {
			RoutesItem routesItem = new RoutesItem();
			routesItem.setPath(_ctx.stringValue("DescribeWebCustomDomainResponse.RouteConfig.routes["+ i +"].path"));
			routesItem.setApplicationName(_ctx.stringValue("DescribeWebCustomDomainResponse.RouteConfig.routes["+ i +"].applicationName"));

			routes.add(routesItem);
		}
		routeConfig.setRoutes(routes);
		describeWebCustomDomainResponse.setRouteConfig(routeConfig);
	 
	 	return describeWebCustomDomainResponse;
	}
}