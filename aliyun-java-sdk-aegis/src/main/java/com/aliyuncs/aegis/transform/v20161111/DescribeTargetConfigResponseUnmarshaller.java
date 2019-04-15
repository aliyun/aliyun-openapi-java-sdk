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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeTargetConfigResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeTargetConfigResponse.TargetConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTargetConfigResponseUnmarshaller {

	public static DescribeTargetConfigResponse unmarshall(DescribeTargetConfigResponse describeTargetConfigResponse, UnmarshallerContext context) {
		
		describeTargetConfigResponse.setRequestId(context.stringValue("DescribeTargetConfigResponse.RequestId"));
		describeTargetConfigResponse.setTotalCount(context.integerValue("DescribeTargetConfigResponse.TotalCount"));

		List<TargetConfig> targetConfigs = new ArrayList<TargetConfig>();
		for (int i = 0; i < context.lengthValue("DescribeTargetConfigResponse.TargetConfigs.Length"); i++) {
			TargetConfig targetConfig = new TargetConfig();
			targetConfig.setType(context.stringValue("DescribeTargetConfigResponse.TargetConfigs["+ i +"].Type"));
			targetConfig.setConfig(context.stringValue("DescribeTargetConfigResponse.TargetConfigs["+ i +"].Config"));
			targetConfig.setOverAllConfig(context.stringValue("DescribeTargetConfigResponse.TargetConfigs["+ i +"].OverAllConfig"));

			targetConfigs.add(targetConfig);
		}
		describeTargetConfigResponse.setTargetConfigs(targetConfigs);
	 
	 	return describeTargetConfigResponse;
	}
}