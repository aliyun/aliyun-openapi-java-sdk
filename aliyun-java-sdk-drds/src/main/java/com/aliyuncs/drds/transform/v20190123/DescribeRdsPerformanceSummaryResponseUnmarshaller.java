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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeRdsPerformanceSummaryResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsPerformanceSummaryResponseUnmarshaller {

	public static DescribeRdsPerformanceSummaryResponse unmarshall(DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummaryResponse, UnmarshallerContext context) {
		
		describeRdsPerformanceSummaryResponse.setRequestId(context.stringValue("DescribeRdsPerformanceSummaryResponse.RequestId"));
		describeRdsPerformanceSummaryResponse.setSuccess(context.booleanValue("DescribeRdsPerformanceSummaryResponse.Success"));

		List<RdsPerformanceInfo> rdsPerformanceInfos = new ArrayList<RdsPerformanceInfo>();
		for (int i = 0; i < context.lengthValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos.Length"); i++) {
			RdsPerformanceInfo rdsPerformanceInfo = new RdsPerformanceInfo();
			rdsPerformanceInfo.setRdsId(context.stringValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].RdsId"));
			rdsPerformanceInfo.setCpu(context.floatValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].Cpu"));
			rdsPerformanceInfo.setIops(context.floatValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].Iops"));
			rdsPerformanceInfo.setActiveSessions(context.integerValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].ActiveSessions"));
			rdsPerformanceInfo.setTotalSessions(context.integerValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].TotalSessions"));

			rdsPerformanceInfos.add(rdsPerformanceInfo);
		}
		describeRdsPerformanceSummaryResponse.setRdsPerformanceInfos(rdsPerformanceInfos);
	 
	 	return describeRdsPerformanceSummaryResponse;
	}
}