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

package com.aliyuncs.uis.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uis.model.v20180821.DescribeUisNodesResponse;
import com.aliyuncs.uis.model.v20180821.DescribeUisNodesResponse.UisNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUisNodesResponseUnmarshaller {

	public static DescribeUisNodesResponse unmarshall(DescribeUisNodesResponse describeUisNodesResponse, UnmarshallerContext context) {
		
		describeUisNodesResponse.setRequestId(context.stringValue("DescribeUisNodesResponse.RequestId"));
		describeUisNodesResponse.setTotalCount(context.integerValue("DescribeUisNodesResponse.TotalCount"));
		describeUisNodesResponse.setPageNumber(context.integerValue("DescribeUisNodesResponse.PageNumber"));
		describeUisNodesResponse.setPageSize(context.integerValue("DescribeUisNodesResponse.PageSize"));

		List<UisNode> uisNodeList = new ArrayList<UisNode>();
		for (int i = 0; i < context.lengthValue("DescribeUisNodesResponse.UisNodeList.Length"); i++) {
			UisNode uisNode = new UisNode();
			uisNode.setUisId(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].UisId"));
			uisNode.setUisNodeId(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].UisNodeId"));
			uisNode.setUisNodeBandwidth(context.integerValue("DescribeUisNodesResponse.UisNodeList["+ i +"].UisNodeBandwidth"));
			uisNode.setUisNodeAreaId(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].UisNodeAreaId"));
			uisNode.setDescription(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].Description"));
			uisNode.setName(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].Name"));
			uisNode.setStatus(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].Status"));
			uisNode.setIpAddrsNum(context.integerValue("DescribeUisNodesResponse.UisNodeList["+ i +"].IpAddrsNum"));
			uisNode.setUisNodeIps(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].UisNodeIps"));
			uisNode.setUisNodeActiveIp(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].UisNodeActiveIp"));
			uisNode.setCreateTime(context.longValue("DescribeUisNodesResponse.UisNodeList["+ i +"].CreateTime"));
			uisNode.setUisEniIps(context.stringValue("DescribeUisNodesResponse.UisNodeList["+ i +"].UisEniIps"));

			uisNodeList.add(uisNode);
		}
		describeUisNodesResponse.setUisNodeList(uisNodeList);
	 
	 	return describeUisNodesResponse;
	}
}