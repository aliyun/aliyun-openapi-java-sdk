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

import com.aliyuncs.aegis.model.v20161111.DescribeStrategyExecDetailResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeStrategyExecDetailResponse.FailedEcs;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStrategyExecDetailResponseUnmarshaller {

	public static DescribeStrategyExecDetailResponse unmarshall(DescribeStrategyExecDetailResponse describeStrategyExecDetailResponse, UnmarshallerContext context) {
		
		describeStrategyExecDetailResponse.setRequestId(context.stringValue("DescribeStrategyExecDetailResponse.RequestId"));
		describeStrategyExecDetailResponse.setStartTime(context.stringValue("DescribeStrategyExecDetailResponse.StartTime"));
		describeStrategyExecDetailResponse.setEndTime(context.stringValue("DescribeStrategyExecDetailResponse.EndTime"));
		describeStrategyExecDetailResponse.setSource(context.stringValue("DescribeStrategyExecDetailResponse.Source"));
		describeStrategyExecDetailResponse.setPercent(context.stringValue("DescribeStrategyExecDetailResponse.Percent"));
		describeStrategyExecDetailResponse.setSuccessCount(context.integerValue("DescribeStrategyExecDetailResponse.SuccessCount"));
		describeStrategyExecDetailResponse.setFailCount(context.integerValue("DescribeStrategyExecDetailResponse.FailCount"));
		describeStrategyExecDetailResponse.setInProcessCount(context.integerValue("DescribeStrategyExecDetailResponse.InProcessCount"));

		List<FailedEcs> failedEcsList = new ArrayList<FailedEcs>();
		for (int i = 0; i < context.lengthValue("DescribeStrategyExecDetailResponse.FailedEcsList.Length"); i++) {
			FailedEcs failedEcs = new FailedEcs();
			failedEcs.setReason(context.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].Reason"));
			failedEcs.setInstanceName(context.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].InstanceName"));
			failedEcs.setIP(context.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].IP"));
			failedEcs.setIntranetIp(context.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].IntranetIp"));

			failedEcsList.add(failedEcs);
		}
		describeStrategyExecDetailResponse.setFailedEcsList(failedEcsList);
	 
	 	return describeStrategyExecDetailResponse;
	}
}