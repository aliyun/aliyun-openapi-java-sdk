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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeFlowlogsResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeFlowlogsResponse.FlowLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowlogsResponseUnmarshaller {

	public static DescribeFlowlogsResponse unmarshall(DescribeFlowlogsResponse describeFlowlogsResponse, UnmarshallerContext _ctx) {
		
		describeFlowlogsResponse.setRequestId(_ctx.stringValue("DescribeFlowlogsResponse.RequestId"));
		describeFlowlogsResponse.setSuccess(_ctx.stringValue("DescribeFlowlogsResponse.Success"));
		describeFlowlogsResponse.setTotalCount(_ctx.stringValue("DescribeFlowlogsResponse.TotalCount"));
		describeFlowlogsResponse.setPageNumber(_ctx.stringValue("DescribeFlowlogsResponse.PageNumber"));
		describeFlowlogsResponse.setPageSize(_ctx.stringValue("DescribeFlowlogsResponse.PageSize"));

		List<FlowLog> flowLogs = new ArrayList<FlowLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowlogsResponse.FlowLogs.Length"); i++) {
			FlowLog flowLog = new FlowLog();
			flowLog.setFlowLogId(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].FlowLogId"));
			flowLog.setFlowLogName(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].FlowLogName"));
			flowLog.setDescription(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].Description"));
			flowLog.setCreationTime(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].CreationTime"));
			flowLog.setCenId(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].CenId"));
			flowLog.setProjectName(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].ProjectName"));
			flowLog.setLogStoreName(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].LogStoreName"));
			flowLog.setStatus(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].Status"));
			flowLog.setRegionId(_ctx.stringValue("DescribeFlowlogsResponse.FlowLogs["+ i +"].RegionId"));

			flowLogs.add(flowLog);
		}
		describeFlowlogsResponse.setFlowLogs(flowLogs);
	 
	 	return describeFlowlogsResponse;
	}
}