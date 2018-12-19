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

import com.aliyuncs.edas.model.v20170801.UpdateJvmConfigurationResponse;
import com.aliyuncs.edas.model.v20170801.UpdateJvmConfigurationResponse.JvmConfiguration;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateJvmConfigurationResponseUnmarshaller {

	public static UpdateJvmConfigurationResponse unmarshall(UpdateJvmConfigurationResponse updateJvmConfigurationResponse, UnmarshallerContext context) {
		
		updateJvmConfigurationResponse.setRequestId(context.stringValue("UpdateJvmConfigurationResponse.RequestId"));
		updateJvmConfigurationResponse.setCode(context.integerValue("UpdateJvmConfigurationResponse.Code"));
		updateJvmConfigurationResponse.setMessage(context.stringValue("UpdateJvmConfigurationResponse.Message"));

		JvmConfiguration jvmConfiguration = new JvmConfiguration();
		jvmConfiguration.setOptions(context.stringValue("UpdateJvmConfigurationResponse.JvmConfiguration.Options"));
		jvmConfiguration.setMinHeapSize(context.integerValue("UpdateJvmConfigurationResponse.JvmConfiguration.MinHeapSize"));
		jvmConfiguration.setMaxPermSize(context.integerValue("UpdateJvmConfigurationResponse.JvmConfiguration.MaxPermSize"));
		jvmConfiguration.setMaxHeapSize(context.integerValue("UpdateJvmConfigurationResponse.JvmConfiguration.MaxHeapSize"));
		updateJvmConfigurationResponse.setJvmConfiguration(jvmConfiguration);
	 
	 	return updateJvmConfigurationResponse;
	}
}