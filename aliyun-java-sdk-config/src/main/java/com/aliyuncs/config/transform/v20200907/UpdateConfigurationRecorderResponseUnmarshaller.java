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

import com.aliyuncs.config.model.v20200907.UpdateConfigurationRecorderResponse;
import com.aliyuncs.config.model.v20200907.UpdateConfigurationRecorderResponse.ConfigurationRecorder;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateConfigurationRecorderResponseUnmarshaller {

	public static UpdateConfigurationRecorderResponse unmarshall(UpdateConfigurationRecorderResponse updateConfigurationRecorderResponse, UnmarshallerContext _ctx) {
		
		updateConfigurationRecorderResponse.setRequestId(_ctx.stringValue("UpdateConfigurationRecorderResponse.RequestId"));

		ConfigurationRecorder configurationRecorder = new ConfigurationRecorder();
		configurationRecorder.setConfigurationRecorderStatus(_ctx.stringValue("UpdateConfigurationRecorderResponse.ConfigurationRecorder.ConfigurationRecorderStatus"));

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("UpdateConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes["+ i +"]"));
		}
		configurationRecorder.setResourceTypes(resourceTypes);
		updateConfigurationRecorderResponse.setConfigurationRecorder(configurationRecorder);
	 
	 	return updateConfigurationRecorderResponse;
	}
}