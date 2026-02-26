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

import com.aliyuncs.sas.model.v20181203.GetHoneypotNodeResponse;
import com.aliyuncs.sas.model.v20181203.GetHoneypotNodeResponse.HoneypotNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHoneypotNodeResponseUnmarshaller {

	public static GetHoneypotNodeResponse unmarshall(GetHoneypotNodeResponse getHoneypotNodeResponse, UnmarshallerContext _ctx) {
		
		getHoneypotNodeResponse.setRequestId(_ctx.stringValue("GetHoneypotNodeResponse.RequestId"));
		getHoneypotNodeResponse.setSuccess(_ctx.booleanValue("GetHoneypotNodeResponse.Success"));
		getHoneypotNodeResponse.setCode(_ctx.stringValue("GetHoneypotNodeResponse.Code"));
		getHoneypotNodeResponse.setMessage(_ctx.stringValue("GetHoneypotNodeResponse.Message"));
		getHoneypotNodeResponse.setHttpStatusCode(_ctx.integerValue("GetHoneypotNodeResponse.HttpStatusCode"));

		HoneypotNode honeypotNode = new HoneypotNode();
		honeypotNode.setNodeId(_ctx.stringValue("GetHoneypotNodeResponse.HoneypotNode.NodeId"));
		honeypotNode.setNodeName(_ctx.stringValue("GetHoneypotNodeResponse.HoneypotNode.NodeName"));
		honeypotNode.setHoneypotTotalCount(_ctx.integerValue("GetHoneypotNodeResponse.HoneypotNode.HoneypotTotalCount"));
		honeypotNode.setHoneypotUsedCount(_ctx.integerValue("GetHoneypotNodeResponse.HoneypotNode.HoneypotUsedCount"));
		honeypotNode.setProbeTotalCount(_ctx.integerValue("GetHoneypotNodeResponse.HoneypotNode.ProbeTotalCount"));
		honeypotNode.setProbeUsedCount(_ctx.integerValue("GetHoneypotNodeResponse.HoneypotNode.ProbeUsedCount"));
		honeypotNode.setTotalStatus(_ctx.integerValue("GetHoneypotNodeResponse.HoneypotNode.TotalStatus"));
		honeypotNode.setEcsInstanceId(_ctx.stringValue("GetHoneypotNodeResponse.HoneypotNode.EcsInstanceId"));
		honeypotNode.setCreateTime(_ctx.stringValue("GetHoneypotNodeResponse.HoneypotNode.CreateTime"));
		honeypotNode.setAllowHoneypotAccessInternet(_ctx.booleanValue("GetHoneypotNodeResponse.HoneypotNode.AllowHoneypotAccessInternet"));
		honeypotNode.setNodeIp(_ctx.stringValue("GetHoneypotNodeResponse.HoneypotNode.NodeIp"));
		honeypotNode.setUpgradeAvailable(_ctx.booleanValue("GetHoneypotNodeResponse.HoneypotNode.UpgradeAvailable"));

		List<String> securityGroupProbeIpList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetHoneypotNodeResponse.HoneypotNode.SecurityGroupProbeIpList.Length"); i++) {
			securityGroupProbeIpList.add(_ctx.stringValue("GetHoneypotNodeResponse.HoneypotNode.SecurityGroupProbeIpList["+ i +"]"));
		}
		honeypotNode.setSecurityGroupProbeIpList(securityGroupProbeIpList);
		getHoneypotNodeResponse.setHoneypotNode(honeypotNode);
	 
	 	return getHoneypotNodeResponse;
	}
}