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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeRoleZoneInfoResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeRoleZoneInfoResponse.NodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRoleZoneInfoResponseUnmarshaller {

	public static DescribeRoleZoneInfoResponse unmarshall(DescribeRoleZoneInfoResponse describeRoleZoneInfoResponse, UnmarshallerContext _ctx) {
		
		describeRoleZoneInfoResponse.setRequestId(_ctx.stringValue("DescribeRoleZoneInfoResponse.RequestId"));
		describeRoleZoneInfoResponse.setPageNumber(_ctx.integerValue("DescribeRoleZoneInfoResponse.PageNumber"));
		describeRoleZoneInfoResponse.setPageSize(_ctx.integerValue("DescribeRoleZoneInfoResponse.PageSize"));
		describeRoleZoneInfoResponse.setTotalCount(_ctx.integerValue("DescribeRoleZoneInfoResponse.TotalCount"));

		List<NodeInfo> node = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRoleZoneInfoResponse.Node.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setNodeId(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].NodeId"));
			nodeInfo.setNodeType(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].NodeType"));
			nodeInfo.setRole(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].Role"));
			nodeInfo.setZoneId(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].ZoneId"));
			nodeInfo.setCPUUsage(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].CPUUsage"));
			nodeInfo.setConnection(_ctx.floatValue("DescribeRoleZoneInfoResponse.Node["+ i +"].Connection"));
			nodeInfo.setAvgRt(_ctx.floatValue("DescribeRoleZoneInfoResponse.Node["+ i +"].AvgRt"));
			nodeInfo.setIntranetIn(_ctx.floatValue("DescribeRoleZoneInfoResponse.Node["+ i +"].IntranetIn"));
			nodeInfo.setIntranetOut(_ctx.floatValue("DescribeRoleZoneInfoResponse.Node["+ i +"].IntranetOut"));
			nodeInfo.setCustinsId(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].CustinsId"));
			nodeInfo.setInsType(_ctx.integerValue("DescribeRoleZoneInfoResponse.Node["+ i +"].InsType"));
			nodeInfo.setInsName(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].InsName"));
			nodeInfo.setIsLatestVersion(_ctx.integerValue("DescribeRoleZoneInfoResponse.Node["+ i +"].IsLatestVersion"));
			nodeInfo.setCurrentMinorVersion(_ctx.stringValue("DescribeRoleZoneInfoResponse.Node["+ i +"].CurrentMinorVersion"));
			nodeInfo.setCurrentBandWidth(_ctx.longValue("DescribeRoleZoneInfoResponse.Node["+ i +"].CurrentBandWidth"));
			nodeInfo.setDefaultBandWidth(_ctx.longValue("DescribeRoleZoneInfoResponse.Node["+ i +"].DefaultBandWidth"));
			nodeInfo.setIsOpenBandWidthService(_ctx.booleanValue("DescribeRoleZoneInfoResponse.Node["+ i +"].IsOpenBandWidthService"));

			node.add(nodeInfo);
		}
		describeRoleZoneInfoResponse.setNode(node);
	 
	 	return describeRoleZoneInfoResponse;
	}
}