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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeVulConfigResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulConfigResponse.TargetConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulConfigResponseUnmarshaller {

	public static DescribeVulConfigResponse unmarshall(DescribeVulConfigResponse describeVulConfigResponse, UnmarshallerContext _ctx) {
		
		describeVulConfigResponse.setRequestId(_ctx.stringValue("DescribeVulConfigResponse.RequestId"));
		describeVulConfigResponse.setTotalCount(_ctx.integerValue("DescribeVulConfigResponse.TotalCount"));

		List<TargetConfig> targetConfigs = new ArrayList<TargetConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulConfigResponse.TargetConfigs.Length"); i++) {
			TargetConfig targetConfig = new TargetConfig();
			targetConfig.setType(_ctx.stringValue("DescribeVulConfigResponse.TargetConfigs["+ i +"].Type"));
			targetConfig.setOverAllConfig(_ctx.stringValue("DescribeVulConfigResponse.TargetConfigs["+ i +"].OverAllConfig"));
			targetConfig.setConfig(_ctx.stringValue("DescribeVulConfigResponse.TargetConfigs["+ i +"].Config"));

			targetConfigs.add(targetConfig);
		}
		describeVulConfigResponse.setTargetConfigs(targetConfigs);
	 
	 	return describeVulConfigResponse;
	}
}