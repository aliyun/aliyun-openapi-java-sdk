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

import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse;
import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse.Data.WebCustomDomainsItem;
import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse.Data.WebCustomDomainsItem.RouteConfig;
import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse.Data.WebCustomDomainsItem.RouteConfig.RoutesItem;
import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse.Data.WebCustomDomainsItem.WebCertConfig;
import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse.Data.WebCustomDomainsItem.WebTLSConfig;
import com.aliyuncs.sae.model.v20190506.ListWebCustomDomainsResponse.Data.WebCustomDomainsItem.WebWAFConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWebCustomDomainsResponseUnmarshaller {

	public static ListWebCustomDomainsResponse unmarshall(ListWebCustomDomainsResponse listWebCustomDomainsResponse, UnmarshallerContext _ctx) {
		
		listWebCustomDomainsResponse.setRequestId(_ctx.stringValue("ListWebCustomDomainsResponse.RequestId"));
		listWebCustomDomainsResponse.setCode(_ctx.integerValue("ListWebCustomDomainsResponse.Code"));
		listWebCustomDomainsResponse.setMessage(_ctx.stringValue("ListWebCustomDomainsResponse.Message"));
		listWebCustomDomainsResponse.setSuccess(_ctx.booleanValue("ListWebCustomDomainsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListWebCustomDomainsResponse.Data.NextToken"));

		List<WebCustomDomainsItem> webCustomDomains = new ArrayList<WebCustomDomainsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWebCustomDomainsResponse.Data.WebCustomDomains.Length"); i++) {
			WebCustomDomainsItem webCustomDomainsItem = new WebCustomDomainsItem();
			webCustomDomainsItem.setAccountId(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].accountId"));
			webCustomDomainsItem.setCreatedTime(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].CreatedTime"));
			webCustomDomainsItem.setDefaultForwardingAppName(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].DefaultForwardingAppName"));
			webCustomDomainsItem.setDomainName(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].DomainName"));
			webCustomDomainsItem.setLastModifiedTime(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].LastModifiedTime"));
			webCustomDomainsItem.setNamespaceId(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].NamespaceId"));
			webCustomDomainsItem.setBizProtocol(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].Protocol"));

			WebCertConfig webCertConfig = new WebCertConfig();
			webCertConfig.setCertName(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebCertConfig.CertName"));
			webCertConfig.setCertificate(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebCertConfig.Certificate"));
			webCertConfig.setPrivateKey(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebCertConfig.PrivateKey"));
			webCustomDomainsItem.setWebCertConfig(webCertConfig);

			WebTLSConfig webTLSConfig = new WebTLSConfig();
			webTLSConfig.setMaxVersion(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebTLSConfig.MaxVersion"));
			webTLSConfig.setMinVersion(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebTLSConfig.MinVersion"));

			List<String> cipherSuites = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebTLSConfig.CipherSuites.Length"); j++) {
				cipherSuites.add(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebTLSConfig.CipherSuites["+ j +"]"));
			}
			webTLSConfig.setCipherSuites(cipherSuites);
			webCustomDomainsItem.setWebTLSConfig(webTLSConfig);

			WebWAFConfig webWAFConfig = new WebWAFConfig();
			webWAFConfig.setEnableWAF(_ctx.booleanValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].WebWAFConfig.EnableWAF"));
			webCustomDomainsItem.setWebWAFConfig(webWAFConfig);

			RouteConfig routeConfig = new RouteConfig();

			List<RoutesItem> routes = new ArrayList<RoutesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].RouteConfig.routes.Length"); j++) {
				RoutesItem routesItem = new RoutesItem();
				routesItem.setPath(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].RouteConfig.routes["+ j +"].path"));
				routesItem.setApplicationName(_ctx.stringValue("ListWebCustomDomainsResponse.Data.WebCustomDomains["+ i +"].RouteConfig.routes["+ j +"].applicationName"));

				routes.add(routesItem);
			}
			routeConfig.setRoutes(routes);
			webCustomDomainsItem.setRouteConfig(routeConfig);

			webCustomDomains.add(webCustomDomainsItem);
		}
		data.setWebCustomDomains(webCustomDomains);
		listWebCustomDomainsResponse.setData(data);
	 
	 	return listWebCustomDomainsResponse;
	}
}