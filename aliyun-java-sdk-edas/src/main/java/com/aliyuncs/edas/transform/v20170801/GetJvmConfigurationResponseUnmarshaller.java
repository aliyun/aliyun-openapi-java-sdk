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

import com.aliyuncs.edas.model.v20170801.GetJvmConfigurationResponse;
import com.aliyuncs.edas.model.v20170801.GetJvmConfigurationResponse.JvmConfiguration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJvmConfigurationResponseUnmarshaller {

	public static GetJvmConfigurationResponse unmarshall(GetJvmConfigurationResponse getJvmConfigurationResponse, UnmarshallerContext _ctx) {
		
		getJvmConfigurationResponse.setRequestId(_ctx.stringValue("GetJvmConfigurationResponse.RequestId"));
		getJvmConfigurationResponse.setCode(_ctx.integerValue("GetJvmConfigurationResponse.Code"));
		getJvmConfigurationResponse.setMessage(_ctx.stringValue("GetJvmConfigurationResponse.Message"));

		JvmConfiguration jvmConfiguration = new JvmConfiguration();
		jvmConfiguration.setOptions(_ctx.stringValue("GetJvmConfigurationResponse.JvmConfiguration.Options"));
		jvmConfiguration.setMinHeapSize(_ctx.integerValue("GetJvmConfigurationResponse.JvmConfiguration.MinHeapSize"));
		jvmConfiguration.setMaxPermSize(_ctx.integerValue("GetJvmConfigurationResponse.JvmConfiguration.MaxPermSize"));
		jvmConfiguration.setMaxHeapSize(_ctx.integerValue("GetJvmConfigurationResponse.JvmConfiguration.MaxHeapSize"));
		getJvmConfigurationResponse.setJvmConfiguration(jvmConfiguration);
	 
	 	return getJvmConfigurationResponse;
	}
}