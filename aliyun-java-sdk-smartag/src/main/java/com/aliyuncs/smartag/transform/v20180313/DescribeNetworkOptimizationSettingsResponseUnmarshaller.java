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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeNetworkOptimizationSettingsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeNetworkOptimizationSettingsResponse.Setting;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkOptimizationSettingsResponseUnmarshaller {

	public static DescribeNetworkOptimizationSettingsResponse unmarshall(DescribeNetworkOptimizationSettingsResponse describeNetworkOptimizationSettingsResponse, UnmarshallerContext context) {
		
		describeNetworkOptimizationSettingsResponse.setRequestId(context.stringValue("DescribeNetworkOptimizationSettingsResponse.RequestId"));
		describeNetworkOptimizationSettingsResponse.setTotalCount(context.integerValue("DescribeNetworkOptimizationSettingsResponse.TotalCount"));
		describeNetworkOptimizationSettingsResponse.setPageNo(context.integerValue("DescribeNetworkOptimizationSettingsResponse.PageNo"));
		describeNetworkOptimizationSettingsResponse.setPageSize(context.integerValue("DescribeNetworkOptimizationSettingsResponse.PageSize"));

		List<Setting> settings = new ArrayList<Setting>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkOptimizationSettingsResponse.Settings.Length"); i++) {
			Setting setting = new Setting();
			setting.setDomain(context.stringValue("DescribeNetworkOptimizationSettingsResponse.Settings["+ i +"].Domain"));
			setting.setType(context.stringValue("DescribeNetworkOptimizationSettingsResponse.Settings["+ i +"].Type"));

			settings.add(setting);
		}
		describeNetworkOptimizationSettingsResponse.setSettings(settings);
	 
	 	return describeNetworkOptimizationSettingsResponse;
	}
}