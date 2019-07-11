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

import com.aliyuncs.edas.model.v20170801.GetContainerConfigurationResponse;
import com.aliyuncs.edas.model.v20170801.GetContainerConfigurationResponse.ContainerConfiguration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContainerConfigurationResponseUnmarshaller {

	public static GetContainerConfigurationResponse unmarshall(GetContainerConfigurationResponse getContainerConfigurationResponse, UnmarshallerContext _ctx) {
		
		getContainerConfigurationResponse.setRequestId(_ctx.stringValue("GetContainerConfigurationResponse.RequestId"));
		getContainerConfigurationResponse.setCode(_ctx.integerValue("GetContainerConfigurationResponse.Code"));
		getContainerConfigurationResponse.setMessage(_ctx.stringValue("GetContainerConfigurationResponse.Message"));

		ContainerConfiguration containerConfiguration = new ContainerConfiguration();
		containerConfiguration.setContextPath(_ctx.stringValue("GetContainerConfigurationResponse.ContainerConfiguration.ContextPath"));
		containerConfiguration.setHttpPort(_ctx.integerValue("GetContainerConfigurationResponse.ContainerConfiguration.HttpPort"));
		containerConfiguration.setMaxThreads(_ctx.integerValue("GetContainerConfigurationResponse.ContainerConfiguration.MaxThreads"));
		containerConfiguration.setURIEncoding(_ctx.stringValue("GetContainerConfigurationResponse.ContainerConfiguration.URIEncoding"));
		containerConfiguration.setUseBodyEncoding(_ctx.booleanValue("GetContainerConfigurationResponse.ContainerConfiguration.UseBodyEncoding"));
		getContainerConfigurationResponse.setContainerConfiguration(containerConfiguration);
	 
	 	return getContainerConfigurationResponse;
	}
}