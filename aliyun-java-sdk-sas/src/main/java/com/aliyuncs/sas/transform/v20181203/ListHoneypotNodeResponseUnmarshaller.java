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

import com.aliyuncs.sas.model.v20181203.ListHoneypotNodeResponse;
import com.aliyuncs.sas.model.v20181203.ListHoneypotNodeResponse.HoneypotNode;
import com.aliyuncs.sas.model.v20181203.ListHoneypotNodeResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHoneypotNodeResponseUnmarshaller {

	public static ListHoneypotNodeResponse unmarshall(ListHoneypotNodeResponse listHoneypotNodeResponse, UnmarshallerContext _ctx) {
		
		listHoneypotNodeResponse.setRequestId(_ctx.stringValue("ListHoneypotNodeResponse.RequestId"));
		listHoneypotNodeResponse.setSuccess(_ctx.booleanValue("ListHoneypotNodeResponse.Success"));
		listHoneypotNodeResponse.setCode(_ctx.stringValue("ListHoneypotNodeResponse.Code"));
		listHoneypotNodeResponse.setMessage(_ctx.stringValue("ListHoneypotNodeResponse.Message"));
		listHoneypotNodeResponse.setHttpStatusCode(_ctx.integerValue("ListHoneypotNodeResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListHoneypotNodeResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListHoneypotNodeResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListHoneypotNodeResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListHoneypotNodeResponse.PageInfo.Count"));
		pageInfo.setLastRowKey(_ctx.stringValue("ListHoneypotNodeResponse.PageInfo.LastRowKey"));
		listHoneypotNodeResponse.setPageInfo(pageInfo);

		List<HoneypotNode> honeypotNodeList = new ArrayList<HoneypotNode>();
		for (int i = 0; i < _ctx.lengthValue("ListHoneypotNodeResponse.HoneypotNodeList.Length"); i++) {
			HoneypotNode honeypotNode = new HoneypotNode();
			honeypotNode.setNodeId(_ctx.stringValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].NodeId"));
			honeypotNode.setNodeName(_ctx.stringValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].NodeName"));
			honeypotNode.setNodeVersion(_ctx.stringValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].NodeVersion"));
			honeypotNode.setHoneypotTotalCount(_ctx.integerValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].HoneypotTotalCount"));
			honeypotNode.setHoneypotUsedCount(_ctx.integerValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].HoneypotUsedCount"));
			honeypotNode.setProbeTotalCount(_ctx.integerValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].ProbeTotalCount"));
			honeypotNode.setProbeUsedCount(_ctx.integerValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].ProbeUsedCount"));
			honeypotNode.setTotalStatus(_ctx.integerValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].TotalStatus"));
			honeypotNode.setEcsInstanceId(_ctx.stringValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].EcsInstanceId"));
			honeypotNode.setCreateTime(_ctx.stringValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].CreateTime"));
			honeypotNode.setAllowHoneypotAccessInternet(_ctx.booleanValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].AllowHoneypotAccessInternet"));
			honeypotNode.setDefaultNode(_ctx.booleanValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].DefaultNode"));
			honeypotNode.setNodeIp(_ctx.stringValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].NodeIp"));
			honeypotNode.setUpgradeAvailable(_ctx.booleanValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].UpgradeAvailable"));

			List<String> securityGroupProbeIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].SecurityGroupProbeIpList.Length"); j++) {
				securityGroupProbeIpList.add(_ctx.stringValue("ListHoneypotNodeResponse.HoneypotNodeList["+ i +"].SecurityGroupProbeIpList["+ j +"]"));
			}
			honeypotNode.setSecurityGroupProbeIpList(securityGroupProbeIpList);

			honeypotNodeList.add(honeypotNode);
		}
		listHoneypotNodeResponse.setHoneypotNodeList(honeypotNodeList);
	 
	 	return listHoneypotNodeResponse;
	}
}