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

import com.aliyuncs.sae.model.v20190506.UpdateWebCustomDomainResponse;
import com.aliyuncs.sae.model.v20190506.UpdateWebCustomDomainResponse.Data;
import com.aliyuncs.sae.model.v20190506.UpdateWebCustomDomainResponse.Data.RouteConfig;
import com.aliyuncs.sae.model.v20190506.UpdateWebCustomDomainResponse.Data.RouteConfig.RoutesItem;
import com.aliyuncs.sae.model.v20190506.UpdateWebCustomDomainResponse.Data.WebCertConfig;
import com.aliyuncs.sae.model.v20190506.UpdateWebCustomDomainResponse.Data.WebTLSConfig;
import com.aliyuncs.sae.model.v20190506.UpdateWebCustomDomainResponse.Data.WebWAFConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWebCustomDomainResponseUnmarshaller {

	public static UpdateWebCustomDomainResponse unmarshall(UpdateWebCustomDomainResponse updateWebCustomDomainResponse, UnmarshallerContext _ctx) {
		
		updateWebCustomDomainResponse.setRequestId(_ctx.stringValue("UpdateWebCustomDomainResponse.RequestId"));
		updateWebCustomDomainResponse.setCode(_ctx.integerValue("UpdateWebCustomDomainResponse.Code"));
		updateWebCustomDomainResponse.setMessage(_ctx.stringValue("UpdateWebCustomDomainResponse.Message"));
		updateWebCustomDomainResponse.setSuccess(_ctx.booleanValue("UpdateWebCustomDomainResponse.Success"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.accountId"));
		data.setCreatedTime(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.CreatedTime"));
		data.setDefaultForwardingAppName(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.DefaultForwardingAppName"));
		data.setDomainName(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.DomainName"));
		data.setLastModifiedTime(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.LastModifiedTime"));
		data.setNamespaceId(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.NamespaceId"));
		data.setBizProtocol(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.Protocol"));

		WebCertConfig webCertConfig = new WebCertConfig();
		webCertConfig.setCertName(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.WebCertConfig.CertName"));
		webCertConfig.setCertificate(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.WebCertConfig.Certificate"));
		webCertConfig.setPrivateKey(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.WebCertConfig.PrivateKey"));
		data.setWebCertConfig(webCertConfig);

		WebTLSConfig webTLSConfig = new WebTLSConfig();
		webTLSConfig.setMaxVersion(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.WebTLSConfig.MaxVersion"));
		webTLSConfig.setMinVersion(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.WebTLSConfig.MinVersion"));

		List<String> cipherSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateWebCustomDomainResponse.Data.WebTLSConfig.CipherSuites.Length"); i++) {
			cipherSuites.add(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.WebTLSConfig.CipherSuites["+ i +"]"));
		}
		webTLSConfig.setCipherSuites(cipherSuites);
		data.setWebTLSConfig(webTLSConfig);

		WebWAFConfig webWAFConfig = new WebWAFConfig();
		webWAFConfig.setEnableWAF(_ctx.booleanValue("UpdateWebCustomDomainResponse.Data.WebWAFConfig.EnableWAF"));
		data.setWebWAFConfig(webWAFConfig);

		RouteConfig routeConfig = new RouteConfig();

		List<RoutesItem> routes = new ArrayList<RoutesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateWebCustomDomainResponse.Data.RouteConfig.routes.Length"); i++) {
			RoutesItem routesItem = new RoutesItem();
			routesItem.setPath(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.RouteConfig.routes["+ i +"].path"));
			routesItem.setApplicationName(_ctx.stringValue("UpdateWebCustomDomainResponse.Data.RouteConfig.routes["+ i +"].applicationName"));

			routes.add(routesItem);
		}
		routeConfig.setRoutes(routes);
		data.setRouteConfig(routeConfig);
		updateWebCustomDomainResponse.setData(data);
	 
	 	return updateWebCustomDomainResponse;
	}
}