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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.DescribeTraceLocationResponse;
import com.aliyuncs.arms.model.v20190808.DescribeTraceLocationResponse.RegionConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTraceLocationResponseUnmarshaller {

	public static DescribeTraceLocationResponse unmarshall(DescribeTraceLocationResponse describeTraceLocationResponse, UnmarshallerContext _ctx) {
		
		describeTraceLocationResponse.setRequestId(_ctx.stringValue("DescribeTraceLocationResponse.RequestId"));

		List<RegionConfig> regionConfigs = new ArrayList<RegionConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTraceLocationResponse.RegionConfigs.Length"); i++) {
			RegionConfig regionConfig = new RegionConfig();
			regionConfig.setRegionNo(_ctx.stringValue("DescribeTraceLocationResponse.RegionConfigs["+ i +"].RegionNo"));
			regionConfig.setUrl(_ctx.stringValue("DescribeTraceLocationResponse.RegionConfigs["+ i +"].Url"));

			regionConfigs.add(regionConfig);
		}
		describeTraceLocationResponse.setRegionConfigs(regionConfigs);
	 
	 	return describeTraceLocationResponse;
	}
}