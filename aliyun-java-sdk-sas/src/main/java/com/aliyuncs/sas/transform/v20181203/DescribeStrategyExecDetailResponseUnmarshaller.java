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

import com.aliyuncs.sas.model.v20181203.DescribeStrategyExecDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyExecDetailResponse.FailedEcs;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStrategyExecDetailResponseUnmarshaller {

	public static DescribeStrategyExecDetailResponse unmarshall(DescribeStrategyExecDetailResponse describeStrategyExecDetailResponse, UnmarshallerContext _ctx) {
		
		describeStrategyExecDetailResponse.setRequestId(_ctx.stringValue("DescribeStrategyExecDetailResponse.RequestId"));
		describeStrategyExecDetailResponse.setStartTime(_ctx.stringValue("DescribeStrategyExecDetailResponse.StartTime"));
		describeStrategyExecDetailResponse.setEndTime(_ctx.stringValue("DescribeStrategyExecDetailResponse.EndTime"));
		describeStrategyExecDetailResponse.setSource(_ctx.stringValue("DescribeStrategyExecDetailResponse.Source"));
		describeStrategyExecDetailResponse.setPercent(_ctx.stringValue("DescribeStrategyExecDetailResponse.Percent"));
		describeStrategyExecDetailResponse.setSuccessCount(_ctx.integerValue("DescribeStrategyExecDetailResponse.SuccessCount"));
		describeStrategyExecDetailResponse.setFailCount(_ctx.integerValue("DescribeStrategyExecDetailResponse.FailCount"));
		describeStrategyExecDetailResponse.setInProcessCount(_ctx.integerValue("DescribeStrategyExecDetailResponse.InProcessCount"));

		List<FailedEcs> failedEcsList = new ArrayList<FailedEcs>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStrategyExecDetailResponse.FailedEcsList.Length"); i++) {
			FailedEcs failedEcs = new FailedEcs();
			failedEcs.setReason(_ctx.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].Reason"));
			failedEcs.setInstanceName(_ctx.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].InstanceName"));
			failedEcs.setIP(_ctx.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].IP"));
			failedEcs.setIntranetIp(_ctx.stringValue("DescribeStrategyExecDetailResponse.FailedEcsList["+ i +"].IntranetIp"));

			failedEcsList.add(failedEcs);
		}
		describeStrategyExecDetailResponse.setFailedEcsList(failedEcsList);
	 
	 	return describeStrategyExecDetailResponse;
	}
}