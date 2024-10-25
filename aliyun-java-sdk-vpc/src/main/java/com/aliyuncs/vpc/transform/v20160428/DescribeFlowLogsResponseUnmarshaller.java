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
import com.aliyuncs.vpc.model.v20160428.DescribeFlowLogsResponse.FlowLog.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowLogsResponseUnmarshaller {

	public static DescribeFlowLogsResponse unmarshall(DescribeFlowLogsResponse describeFlowLogsResponse, UnmarshallerContext _ctx) {
		
		describeFlowLogsResponse.setRequestId(_ctx.stringValue("DescribeFlowLogsResponse.RequestId"));
		describeFlowLogsResponse.setPageSize(_ctx.stringValue("DescribeFlowLogsResponse.PageSize"));
		describeFlowLogsResponse.setPageNumber(_ctx.stringValue("DescribeFlowLogsResponse.PageNumber"));
		describeFlowLogsResponse.setTotalCount(_ctx.stringValue("DescribeFlowLogsResponse.TotalCount"));
		describeFlowLogsResponse.setSuccess(_ctx.stringValue("DescribeFlowLogsResponse.Success"));

		List<FlowLog> flowLogs = new ArrayList<FlowLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowLogsResponse.FlowLogs.Length"); i++) {
			FlowLog flowLog = new FlowLog();
			flowLog.setStatus(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Status"));
			flowLog.setCreationTime(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].CreationTime"));
			flowLog.setFlowLogName(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].FlowLogName"));
			flowLog.setTrafficType(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].TrafficType"));
			flowLog.setResourceType(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ResourceType"));
			flowLog.setDescription(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Description"));
			flowLog.setProjectName(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ProjectName"));
			flowLog.setLogStoreName(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].LogStoreName"));
			flowLog.setResourceId(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ResourceId"));
			flowLog.setRegionId(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].RegionId"));
			flowLog.setFlowLogId(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].FlowLogId"));
			flowLog.setBusinessStatus(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].BusinessStatus"));
			flowLog.setAggregationInterval(_ctx.integerValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].AggregationInterval"));
			flowLog.setServiceType(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ServiceType"));
			flowLog.setResourceGroupId(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ResourceGroupId"));
			flowLog.setFlowLogDeliverStatus(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].FlowLogDeliverStatus"));
			flowLog.setFlowLogDeliverErrorMessage(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].FlowLogDeliverErrorMessage"));
			flowLog.setIpVersion(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].IpVersion"));

			List<String> trafficPath = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].TrafficPath.Length"); j++) {
				trafficPath.add(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].TrafficPath["+ j +"]"));
			}
			flowLog.setTrafficPath(trafficPath);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			flowLog.setTags(tags);

			flowLogs.add(flowLog);
		}
		describeFlowLogsResponse.setFlowLogs(flowLogs);
	 
	 	return describeFlowLogsResponse;
	}
}