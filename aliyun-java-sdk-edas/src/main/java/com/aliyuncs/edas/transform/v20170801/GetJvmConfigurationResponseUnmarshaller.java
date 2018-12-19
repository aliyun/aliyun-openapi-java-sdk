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

	public static GetJvmConfigurationResponse unmarshall(GetJvmConfigurationResponse getJvmConfigurationResponse, UnmarshallerContext context) {
		
		getJvmConfigurationResponse.setRequestId(context.stringValue("GetJvmConfigurationResponse.RequestId"));
		getJvmConfigurationResponse.setCode(context.integerValue("GetJvmConfigurationResponse.Code"));
		getJvmConfigurationResponse.setMessage(context.stringValue("GetJvmConfigurationResponse.Message"));

		JvmConfiguration jvmConfiguration = new JvmConfiguration();
		jvmConfiguration.setOptions(context.stringValue("GetJvmConfigurationResponse.JvmConfiguration.Options"));
		jvmConfiguration.setMinHeapSize(context.integerValue("GetJvmConfigurationResponse.JvmConfiguration.MinHeapSize"));
		jvmConfiguration.setMaxPermSize(context.integerValue("GetJvmConfigurationResponse.JvmConfiguration.MaxPermSize"));
		jvmConfiguration.setMaxHeapSize(context.integerValue("GetJvmConfigurationResponse.JvmConfiguration.MaxHeapSize"));
		getJvmConfigurationResponse.setJvmConfiguration(jvmConfiguration);
	 
	 	return getJvmConfigurationResponse;
	}
}