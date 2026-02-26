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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetConfigurationRecorderResponse;
import com.aliyuncs.config.model.v20200907.GetConfigurationRecorderResponse.ConfigurationRecorder;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigurationRecorderResponseUnmarshaller {

	public static GetConfigurationRecorderResponse unmarshall(GetConfigurationRecorderResponse getConfigurationRecorderResponse, UnmarshallerContext _ctx) {
		
		getConfigurationRecorderResponse.setRequestId(_ctx.stringValue("GetConfigurationRecorderResponse.RequestId"));

		ConfigurationRecorder configurationRecorder = new ConfigurationRecorder();
		configurationRecorder.setConfigurationRecorderStatus(_ctx.stringValue("GetConfigurationRecorderResponse.ConfigurationRecorder.ConfigurationRecorderStatus"));

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("GetConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes["+ i +"]"));
		}
		configurationRecorder.setResourceTypes(resourceTypes);
		getConfigurationRecorderResponse.setConfigurationRecorder(configurationRecorder);
	 
	 	return getConfigurationRecorderResponse;
	}
}