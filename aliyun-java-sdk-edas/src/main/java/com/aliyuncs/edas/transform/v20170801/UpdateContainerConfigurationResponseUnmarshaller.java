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

import com.aliyuncs.edas.model.v20170801.UpdateContainerConfigurationResponse;
import com.aliyuncs.edas.model.v20170801.UpdateContainerConfigurationResponse.ContainerConfiguration;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateContainerConfigurationResponseUnmarshaller {

	public static UpdateContainerConfigurationResponse unmarshall(UpdateContainerConfigurationResponse updateContainerConfigurationResponse, UnmarshallerContext _ctx) {
		
		updateContainerConfigurationResponse.setRequestId(_ctx.stringValue("UpdateContainerConfigurationResponse.RequestId"));
		updateContainerConfigurationResponse.setCode(_ctx.integerValue("UpdateContainerConfigurationResponse.Code"));
		updateContainerConfigurationResponse.setMessage(_ctx.stringValue("UpdateContainerConfigurationResponse.Message"));

		ContainerConfiguration containerConfiguration = new ContainerConfiguration();
		containerConfiguration.setContextPath(_ctx.stringValue("UpdateContainerConfigurationResponse.ContainerConfiguration.ContextPath"));
		containerConfiguration.setHttpPort(_ctx.integerValue("UpdateContainerConfigurationResponse.ContainerConfiguration.HttpPort"));
		containerConfiguration.setMaxThreads(_ctx.integerValue("UpdateContainerConfigurationResponse.ContainerConfiguration.MaxThreads"));
		containerConfiguration.setURIEncoding(_ctx.stringValue("UpdateContainerConfigurationResponse.ContainerConfiguration.URIEncoding"));
		containerConfiguration.setUseBodyEncoding(_ctx.booleanValue("UpdateContainerConfigurationResponse.ContainerConfiguration.UseBodyEncoding"));
		updateContainerConfigurationResponse.setContainerConfiguration(containerConfiguration);
	 
	 	return updateContainerConfigurationResponse;
	}
}