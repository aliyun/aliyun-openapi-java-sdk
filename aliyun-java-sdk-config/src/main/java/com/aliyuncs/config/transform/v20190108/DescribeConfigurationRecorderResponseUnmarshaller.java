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

import com.aliyuncs.config.model.v20190108.DescribeConfigurationRecorderResponse;
import com.aliyuncs.config.model.v20190108.DescribeConfigurationRecorderResponse.ConfigurationRecorder;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigurationRecorderResponseUnmarshaller {

	public static DescribeConfigurationRecorderResponse unmarshall(DescribeConfigurationRecorderResponse describeConfigurationRecorderResponse, UnmarshallerContext _ctx) {
		
		describeConfigurationRecorderResponse.setRequestId(_ctx.stringValue("DescribeConfigurationRecorderResponse.RequestId"));

		ConfigurationRecorder configurationRecorder = new ConfigurationRecorder();
		configurationRecorder.setAccountId(_ctx.longValue("DescribeConfigurationRecorderResponse.ConfigurationRecorder.AccountId"));
		configurationRecorder.setConfigurationRecorderStatus(_ctx.stringValue("DescribeConfigurationRecorderResponse.ConfigurationRecorder.ConfigurationRecorderStatus"));
		configurationRecorder.setOrganizationMasterId(_ctx.longValue("DescribeConfigurationRecorderResponse.ConfigurationRecorder.OrganizationMasterId"));
		configurationRecorder.setOrganizationEnableStatus(_ctx.stringValue("DescribeConfigurationRecorderResponse.ConfigurationRecorder.OrganizationEnableStatus"));

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("DescribeConfigurationRecorderResponse.ConfigurationRecorder.ResourceTypes["+ i +"]"));
		}
		configurationRecorder.setResourceTypes(resourceTypes);
		describeConfigurationRecorderResponse.setConfigurationRecorder(configurationRecorder);
	 
	 	return describeConfigurationRecorderResponse;
	}
}