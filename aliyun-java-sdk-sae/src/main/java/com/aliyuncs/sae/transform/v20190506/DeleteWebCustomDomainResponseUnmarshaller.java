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

import com.aliyuncs.sae.model.v20190506.DeleteWebCustomDomainResponse;
import com.aliyuncs.sae.model.v20190506.DeleteWebCustomDomainResponse.Data;
import com.aliyuncs.sae.model.v20190506.DeleteWebCustomDomainResponse.Data.RouteConfig;
import com.aliyuncs.sae.model.v20190506.DeleteWebCustomDomainResponse.Data.RouteConfig.RoutesItem;
import com.aliyuncs.sae.model.v20190506.DeleteWebCustomDomainResponse.Data.WebCertConfig;
import com.aliyuncs.sae.model.v20190506.DeleteWebCustomDomainResponse.Data.WebTLSConfig;
import com.aliyuncs.sae.model.v20190506.DeleteWebCustomDomainResponse.Data.WebWAFConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteWebCustomDomainResponseUnmarshaller {

	public static DeleteWebCustomDomainResponse unmarshall(DeleteWebCustomDomainResponse deleteWebCustomDomainResponse, UnmarshallerContext _ctx) {
		
		deleteWebCustomDomainResponse.setRequestId(_ctx.stringValue("DeleteWebCustomDomainResponse.RequestId"));
		deleteWebCustomDomainResponse.setCode(_ctx.integerValue("DeleteWebCustomDomainResponse.Code"));
		deleteWebCustomDomainResponse.setMessage(_ctx.stringValue("DeleteWebCustomDomainResponse.Message"));
		deleteWebCustomDomainResponse.setSuccess(_ctx.booleanValue("DeleteWebCustomDomainResponse.Success"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.accountId"));
		data.setCreatedTime(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.CreatedTime"));
		data.setDefaultForwardingAppName(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.DefaultForwardingAppName"));
		data.setDomainName(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.DomainName"));
		data.setLastModifiedTime(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.LastModifiedTime"));
		data.setNamespaceId(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.NamespaceId"));
		data.setBizProtocol(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.Protocol"));

		WebCertConfig webCertConfig = new WebCertConfig();
		webCertConfig.setCertName(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.WebCertConfig.CertName"));
		webCertConfig.setCertificate(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.WebCertConfig.Certificate"));
		webCertConfig.setPrivateKey(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.WebCertConfig.PrivateKey"));
		data.setWebCertConfig(webCertConfig);

		WebTLSConfig webTLSConfig = new WebTLSConfig();
		webTLSConfig.setMaxVersion(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.WebTLSConfig.MaxVersion"));
		webTLSConfig.setMinVersion(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.WebTLSConfig.MinVersion"));

		List<String> cipherSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteWebCustomDomainResponse.Data.WebTLSConfig.CipherSuites.Length"); i++) {
			cipherSuites.add(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.WebTLSConfig.CipherSuites["+ i +"]"));
		}
		webTLSConfig.setCipherSuites(cipherSuites);
		data.setWebTLSConfig(webTLSConfig);

		WebWAFConfig webWAFConfig = new WebWAFConfig();
		webWAFConfig.setEnableWAF(_ctx.booleanValue("DeleteWebCustomDomainResponse.Data.WebWAFConfig.EnableWAF"));
		data.setWebWAFConfig(webWAFConfig);

		RouteConfig routeConfig = new RouteConfig();

		List<RoutesItem> routes = new ArrayList<RoutesItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteWebCustomDomainResponse.Data.RouteConfig.routes.Length"); i++) {
			RoutesItem routesItem = new RoutesItem();
			routesItem.setPath(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.RouteConfig.routes["+ i +"].path"));
			routesItem.setApplicationName(_ctx.stringValue("DeleteWebCustomDomainResponse.Data.RouteConfig.routes["+ i +"].applicationName"));

			routes.add(routesItem);
		}
		routeConfig.setRoutes(routes);
		data.setRouteConfig(routeConfig);
		deleteWebCustomDomainResponse.setData(data);
	 
	 	return deleteWebCustomDomainResponse;
	}
}