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

import com.aliyuncs.sas.model.v20181203.DescribeCommonOverallConfigListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCommonOverallConfigListResponse.OverallConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommonOverallConfigListResponseUnmarshaller {

	public static DescribeCommonOverallConfigListResponse unmarshall(DescribeCommonOverallConfigListResponse describeCommonOverallConfigListResponse, UnmarshallerContext _ctx) {
		
		describeCommonOverallConfigListResponse.setRequestId(_ctx.stringValue("DescribeCommonOverallConfigListResponse.RequestId"));

		List<OverallConfig> overallList = new ArrayList<OverallConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommonOverallConfigListResponse.OverallList.Length"); i++) {
			OverallConfig overallConfig = new OverallConfig();
			overallConfig.setType(_ctx.stringValue("DescribeCommonOverallConfigListResponse.OverallList["+ i +"].Type"));
			overallConfig.setTotalCount(_ctx.integerValue("DescribeCommonOverallConfigListResponse.OverallList["+ i +"].TotalCount"));
			overallConfig.setConfig(_ctx.stringValue("DescribeCommonOverallConfigListResponse.OverallList["+ i +"].Config"));

			overallList.add(overallConfig);
		}
		describeCommonOverallConfigListResponse.setOverallList(overallList);
	 
	 	return describeCommonOverallConfigListResponse;
	}
}