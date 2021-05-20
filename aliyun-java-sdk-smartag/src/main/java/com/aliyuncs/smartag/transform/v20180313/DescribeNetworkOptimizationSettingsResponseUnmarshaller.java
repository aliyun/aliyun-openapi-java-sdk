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

	public static DescribeNetworkOptimizationSettingsResponse unmarshall(DescribeNetworkOptimizationSettingsResponse describeNetworkOptimizationSettingsResponse, UnmarshallerContext _ctx) {
		
		describeNetworkOptimizationSettingsResponse.setRequestId(_ctx.stringValue("DescribeNetworkOptimizationSettingsResponse.RequestId"));
		describeNetworkOptimizationSettingsResponse.setTotalCount(_ctx.integerValue("DescribeNetworkOptimizationSettingsResponse.TotalCount"));
		describeNetworkOptimizationSettingsResponse.setPageSize(_ctx.integerValue("DescribeNetworkOptimizationSettingsResponse.PageSize"));
		describeNetworkOptimizationSettingsResponse.setPageNumber(_ctx.integerValue("DescribeNetworkOptimizationSettingsResponse.PageNumber"));

		List<Setting> settings = new ArrayList<Setting>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkOptimizationSettingsResponse.Settings.Length"); i++) {
			Setting setting = new Setting();
			setting.setType(_ctx.stringValue("DescribeNetworkOptimizationSettingsResponse.Settings["+ i +"].Type"));
			setting.setDomain(_ctx.stringValue("DescribeNetworkOptimizationSettingsResponse.Settings["+ i +"].Domain"));

			settings.add(setting);
		}
		describeNetworkOptimizationSettingsResponse.setSettings(settings);
	 
	 	return describeNetworkOptimizationSettingsResponse;
	}
}