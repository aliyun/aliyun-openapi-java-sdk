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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeHanaNodesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaNodesResponse.HanaNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaNodesResponseUnmarshaller {

	public static DescribeHanaNodesResponse unmarshall(DescribeHanaNodesResponse describeHanaNodesResponse, UnmarshallerContext _ctx) {
		
		describeHanaNodesResponse.setRequestId(_ctx.stringValue("DescribeHanaNodesResponse.RequestId"));
		describeHanaNodesResponse.setSuccess(_ctx.booleanValue("DescribeHanaNodesResponse.Success"));
		describeHanaNodesResponse.setCode(_ctx.stringValue("DescribeHanaNodesResponse.Code"));
		describeHanaNodesResponse.setMessage(_ctx.stringValue("DescribeHanaNodesResponse.Message"));
		describeHanaNodesResponse.setTotalCount(_ctx.integerValue("DescribeHanaNodesResponse.TotalCount"));
		describeHanaNodesResponse.setPageSize(_ctx.integerValue("DescribeHanaNodesResponse.PageSize"));
		describeHanaNodesResponse.setPageNumber(_ctx.integerValue("DescribeHanaNodesResponse.PageNumber"));

		List<HanaNode> hanaNodes = new ArrayList<HanaNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaNodesResponse.HanaNodes.Length"); i++) {
			HanaNode hanaNode = new HanaNode();
			hanaNode.setHanaNodeId(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].HanaNodeId"));
			hanaNode.setClusterId(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].ClusterId"));
			hanaNode.setVaultId(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].VaultId"));
			hanaNode.setInstanceId(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].InstanceId"));
			hanaNode.setClientId(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].ClientId"));
			hanaNode.setStatus(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].Status"));
			hanaNode.setStatusMessage(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].StatusMessage"));
			hanaNode.setInstanceName(_ctx.stringValue("DescribeHanaNodesResponse.HanaNodes["+ i +"].InstanceName"));

			hanaNodes.add(hanaNode);
		}
		describeHanaNodesResponse.setHanaNodes(hanaNodes);
	 
	 	return describeHanaNodesResponse;
	}
}