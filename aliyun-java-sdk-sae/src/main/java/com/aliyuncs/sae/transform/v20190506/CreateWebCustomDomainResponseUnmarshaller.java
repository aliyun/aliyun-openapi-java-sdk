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

import com.aliyuncs.sae.model.v20190506.CreateWebCustomDomainResponse;
import com.aliyuncs.sae.model.v20190506.CreateWebCustomDomainResponse.Data;
import com.aliyuncs.sae.model.v20190506.CreateWebCustomDomainResponse.Data.RouteConfig;
import com.aliyuncs.sae.model.v20190506.CreateWebCustomDomainResponse.Data.RouteConfig.RoutesItem;
import com.aliyuncs.sae.model.v20190506.CreateWebCustomDomainResponse.Data.WebCertConfig;
import com.aliyuncs.sae.model.v20190506.CreateWebCustomDomainResponse.Data.WebTLSConfig;
import com.aliyuncs.sae.model.v20190506.CreateWebCustomDomainResponse.Data.WebWAFConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWebCustomDomainResponseUnmarshaller {

	public static CreateWebCustomDomainResponse unmarshall(CreateWebCustomDomainResponse createWebCustomDomainResponse, UnmarshallerContext _ctx) {
		
		createWebCustomDomainResponse.setRequestId(_ctx.stringValue("CreateWebCustomDomainResponse.RequestId"));
		createWebCustomDomainResponse.setCode(_ctx.integerValue("CreateWebCustomDomainResponse.Code"));
		createWebCustomDomainResponse.setMessage(_ctx.stringValue("CreateWebCustomDomainResponse.Message"));
		createWebCustomDomainResponse.setSuccess(_ctx.booleanValue("CreateWebCustomDomainResponse.Success"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("CreateWebCustomDomainResponse.Data.accountId"));
		data.setCreatedTime(_ctx.stringValue("CreateWebCustomDomainResponse.Data.CreatedTime"));
		data.setDefaultForwardingAppName(_ctx.stringValue("CreateWebCustomDomainResponse.Data.DefaultForwardingAppName"));
		data.setDomainName(_ctx.stringValue("CreateWebCustomDomainResponse.Data.DomainName"));
		data.setLastModifiedTime(_ctx.stringValue("CreateWebCustomDomainResponse.Data.LastModifiedTime"));
		data.setNamespaceId(_ctx.stringValue("CreateWebCustomDomainResponse.Data.NamespaceId"));
		data.setBizProtocol(_ctx.stringValue("CreateWebCustomDomainResponse.Data.Protocol"));

		WebCertConfig webCertConfig = new WebCertConfig();
		webCertConfig.setCertName(_ctx.stringValue("CreateWebCustomDomainResponse.Data.WebCertConfig.CertName"));
		webCertConfig.setCertificate(_ctx.stringValue("CreateWebCustomDomainResponse.Data.WebCertConfig.Certificate"));
		webCertConfig.setPrivateKey(_ctx.stringValue("CreateWebCustomDomainResponse.Data.WebCertConfig.PrivateKey"));
		data.setWebCertConfig(webCertConfig);

		WebTLSConfig webTLSConfig = new WebTLSConfig();
		webTLSConfig.setMaxVersion(_ctx.stringValue("CreateWebCustomDomainResponse.Data.WebTLSConfig.MaxVersion"));
		webTLSConfig.setMinVersion(_ctx.stringValue("CreateWebCustomDomainResponse.Data.WebTLSConfig.MinVersion"));

		List<String> cipherSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateWebCustomDomainResponse.Data.WebTLSConfig.CipherSuites.Length"); i++) {
			cipherSuites.add(_ctx.stringValue("CreateWebCustomDomainResponse.Data.WebTLSConfig.CipherSuites["+ i +"]"));
		}
		webTLSConfig.setCipherSuites(cipherSuites);
		data.setWebTLSConfig(webTLSConfig);

		WebWAFConfig webWAFConfig = new WebWAFConfig();
		webWAFConfig.setEnableWAF(_ctx.booleanValue("CreateWebCustomDomainResponse.Data.WebWAFConfig.EnableWAF"));
		data.setWebWAFConfig(webWAFConfig);

		RouteConfig routeConfig = new RouteConfig();

		List<RoutesItem> routes = new ArrayList<RoutesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateWebCustomDomainResponse.Data.RouteConfig.routes.Length"); i++) {
			RoutesItem routesItem = new RoutesItem();
			routesItem.setPath(_ctx.stringValue("CreateWebCustomDomainResponse.Data.RouteConfig.routes["+ i +"].path"));
			routesItem.setApplicationName(_ctx.stringValue("CreateWebCustomDomainResponse.Data.RouteConfig.routes["+ i +"].applicationName"));

			routes.add(routesItem);
		}
		routeConfig.setRoutes(routes);
		data.setRouteConfig(routeConfig);
		createWebCustomDomainResponse.setData(data);
	 
	 	return createWebCustomDomainResponse;
	}
}