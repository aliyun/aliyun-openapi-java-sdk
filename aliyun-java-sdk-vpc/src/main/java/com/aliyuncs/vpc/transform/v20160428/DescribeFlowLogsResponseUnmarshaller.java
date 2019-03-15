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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeFlowLogsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeFlowLogsResponse.FlowLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowLogsResponseUnmarshaller {

	public static DescribeFlowLogsResponse unmarshall(DescribeFlowLogsResponse describeFlowLogsResponse, UnmarshallerContext context) {
		
		describeFlowLogsResponse.setRequestId(context.stringValue("DescribeFlowLogsResponse.RequestId"));
		describeFlowLogsResponse.setSuccess(context.stringValue("DescribeFlowLogsResponse.Success"));
		describeFlowLogsResponse.setTotalCount(context.stringValue("DescribeFlowLogsResponse.TotalCount"));
		describeFlowLogsResponse.setPageNumber(context.stringValue("DescribeFlowLogsResponse.PageNumber"));
		describeFlowLogsResponse.setPageSize(context.stringValue("DescribeFlowLogsResponse.PageSize"));

		List<FlowLog> flowLogs = new ArrayList<FlowLog>();
		for (int i = 0; i < context.lengthValue("DescribeFlowLogsResponse.FlowLogs.Length"); i++) {
			FlowLog flowLog = new FlowLog();
			flowLog.setFlowLogId(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].FlowLogId"));
			flowLog.setFlowLogName(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].FlowLogName"));
			flowLog.setDescription(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Description"));
			flowLog.setCreationTime(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].CreationTime"));
			flowLog.setResourceType(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ResourceType"));
			flowLog.setResourceId(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ResourceId"));
			flowLog.setProjectName(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ProjectName"));
			flowLog.setLogStoreName(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].LogStoreName"));
			flowLog.setStatus(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Status"));
			flowLog.setTrafficType(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].TrafficType"));
			flowLog.setRegionId(context.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].RegionId"));

			flowLogs.add(flowLog);
		}
		describeFlowLogsResponse.setFlowLogs(flowLogs);
	 
	 	return describeFlowLogsResponse;
	}
}