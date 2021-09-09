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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetWebContainerConfigResponse;
import com.aliyuncs.edas.model.v20170801.GetWebContainerConfigResponse.WebContainerConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWebContainerConfigResponseUnmarshaller {

	public static GetWebContainerConfigResponse unmarshall(GetWebContainerConfigResponse getWebContainerConfigResponse, UnmarshallerContext _ctx) {
		
		getWebContainerConfigResponse.setRequestId(_ctx.stringValue("GetWebContainerConfigResponse.RequestId"));
		getWebContainerConfigResponse.setMessage(_ctx.stringValue("GetWebContainerConfigResponse.Message"));
		getWebContainerConfigResponse.setCode(_ctx.integerValue("GetWebContainerConfigResponse.Code"));

		WebContainerConfig webContainerConfig = new WebContainerConfig();
		webContainerConfig.setContextInputType(_ctx.stringValue("GetWebContainerConfigResponse.WebContainerConfig.ContextInputType"));
		webContainerConfig.setContextPath(_ctx.stringValue("GetWebContainerConfigResponse.WebContainerConfig.ContextPath"));
		webContainerConfig.setHttpPort(_ctx.integerValue("GetWebContainerConfigResponse.WebContainerConfig.HttpPort"));
		webContainerConfig.setMaxThreads(_ctx.integerValue("GetWebContainerConfigResponse.WebContainerConfig.MaxThreads"));
		webContainerConfig.setServerXml(_ctx.stringValue("GetWebContainerConfigResponse.WebContainerConfig.ServerXml"));
		webContainerConfig.setUriEncoding(_ctx.stringValue("GetWebContainerConfigResponse.WebContainerConfig.UriEncoding"));
		webContainerConfig.setUseAdvancedServerXml(_ctx.booleanValue("GetWebContainerConfigResponse.WebContainerConfig.UseAdvancedServerXml"));
		webContainerConfig.setUseBodyEncoding(_ctx.booleanValue("GetWebContainerConfigResponse.WebContainerConfig.UseBodyEncoding"));
		webContainerConfig.setUseDefaultConfig(_ctx.booleanValue("GetWebContainerConfigResponse.WebContainerConfig.UseDefaultConfig"));
		getWebContainerConfigResponse.setWebContainerConfig(webContainerConfig);
	 
	 	return getWebContainerConfigResponse;
	}
}