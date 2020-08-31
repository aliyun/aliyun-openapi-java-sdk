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

package com.aliyuncs.config.transform.v20190108;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20190108.PutConfigurationRecorderResponse;
import com.aliyuncs.config.model.v20190108.PutConfigurationRecorderResponse.ConfigurationRecorder;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutConfigurationRecorderResponseUnmarshaller {

	public static PutConfigurationRecorderResponse unmarshall(PutConfigurationRecorderResponse putConfigurationRecorderResponse, UnmarshallerContext _ctx) {
		
		putConfigurationRecorderResponse.setRequestId(_ctx.stringValue("PutConfigurationRecorderResponse.RequestId"));

		ConfigurationRecorder configurationRecorder = new ConfigurationRecorder();
		configurationRecorder.setAccountId(_ctx.longValue("PutConfigurationRecorderResponse.ConfigurationRecorder.AccountId"));
		configurationRecorder.setConfigurationRecorderStatus(_ctx.stringValue("PutConfigurationRecorderResponse.ConfigurationRecorder.ConfigurationRecorderStatus"));
		configurationRecorder.setOrganizationMasterId(_ctx.longValue("PutConfigurationRecorderResponse.ConfigurationRecorder.OrganizationMasterId"));
		configurationRecorder.setOrganizationEnableStatus(_ctx.stringValue("PutConfigurationRecorderResponse.ConfigurationRecorder.OrganizationEnableStatus"));

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PutConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("PutConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes["+ i +"]"));
		}
		configurationRecorder.setResourceTypes(resourceTypes);
		putConfigurationRecorderResponse.setConfigurationRecorder(configurationRecorder);
	 
	 	return putConfigurationRecorderResponse;
	}
}