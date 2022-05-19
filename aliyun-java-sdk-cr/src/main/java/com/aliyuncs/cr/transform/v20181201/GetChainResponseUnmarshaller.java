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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.GetChainResponse;
import com.aliyuncs.cr.model.v20181201.GetChainResponse.ChainConfig;
import com.aliyuncs.cr.model.v20181201.GetChainResponse.ChainConfig.NodesItem;
import com.aliyuncs.cr.model.v20181201.GetChainResponse.ChainConfig.NodesItem.NodeConfig;
import com.aliyuncs.cr.model.v20181201.GetChainResponse.ChainConfig.NodesItem.NodeConfig.DenyPolicy;
import com.aliyuncs.cr.model.v20181201.GetChainResponse.ChainConfig.RoutersItem;
import com.aliyuncs.cr.model.v20181201.GetChainResponse.ChainConfig.RoutersItem.From;
import com.aliyuncs.cr.model.v20181201.GetChainResponse.ChainConfig.RoutersItem.To;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChainResponseUnmarshaller {

	public static GetChainResponse unmarshall(GetChainResponse getChainResponse, UnmarshallerContext _ctx) {
		
		getChainResponse.setRequestId(_ctx.stringValue("GetChainResponse.RequestId"));
		getChainResponse.setModifiedTime(_ctx.longValue("GetChainResponse.ModifiedTime"));
		getChainResponse.setScopeId(_ctx.stringValue("GetChainResponse.ScopeId"));
		getChainResponse.setDescription(_ctx.stringValue("GetChainResponse.Description"));
		getChainResponse.setCreateTime(_ctx.longValue("GetChainResponse.CreateTime"));
		getChainResponse.setScopeType(_ctx.stringValue("GetChainResponse.ScopeType"));
		getChainResponse.setCode(_ctx.stringValue("GetChainResponse.Code"));
		getChainResponse.setChainId(_ctx.stringValue("GetChainResponse.ChainId"));
		getChainResponse.setInstanceId(_ctx.stringValue("GetChainResponse.InstanceId"));
		getChainResponse.setIsSuccess(_ctx.booleanValue("GetChainResponse.IsSuccess"));
		getChainResponse.setName(_ctx.stringValue("GetChainResponse.Name"));

		ChainConfig chainConfig = new ChainConfig();
		chainConfig.setChainConfigId(_ctx.stringValue("GetChainResponse.ChainConfig.ChainConfigId"));
		chainConfig.setIsActive(_ctx.booleanValue("GetChainResponse.ChainConfig.IsActive"));
		chainConfig.setVersion(_ctx.stringValue("GetChainResponse.ChainConfig.Version"));

		List<RoutersItem> routers = new ArrayList<RoutersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetChainResponse.ChainConfig.Routers.Length"); i++) {
			RoutersItem routersItem = new RoutersItem();

			From from = new From();
			from.setNodeName(_ctx.stringValue("GetChainResponse.ChainConfig.Routers["+ i +"].From.NodeName"));
			routersItem.setFrom(from);

			To to = new To();
			to.setNodeName(_ctx.stringValue("GetChainResponse.ChainConfig.Routers["+ i +"].To.NodeName"));
			routersItem.setTo(to);

			routers.add(routersItem);
		}
		chainConfig.setRouters(routers);

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetChainResponse.ChainConfig.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setNodeName(_ctx.stringValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeName"));
			nodesItem.setEnable(_ctx.booleanValue("GetChainResponse.ChainConfig.Nodes["+ i +"].Enable"));

			NodeConfig nodeConfig = new NodeConfig();
			nodeConfig.setTimeout(_ctx.longValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.Timeout"));
			nodeConfig.setRetry(_ctx.integerValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.Retry"));
			nodeConfig.setScanEngine(_ctx.stringValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.ScanEngine"));

			DenyPolicy denyPolicy = new DenyPolicy();
			denyPolicy.setLogic(_ctx.stringValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.DenyPolicy.Logic"));
			denyPolicy.setIssueLevel(_ctx.stringValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.DenyPolicy.IssueLevel"));
			denyPolicy.setIssueCount(_ctx.stringValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.DenyPolicy.IssueCount"));
			denyPolicy.setAction(_ctx.stringValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.DenyPolicy.Action"));
			denyPolicy.setIssueList(_ctx.stringValue("GetChainResponse.ChainConfig.Nodes["+ i +"].NodeConfig.DenyPolicy.IssueList"));
			nodeConfig.setDenyPolicy(denyPolicy);
			nodesItem.setNodeConfig(nodeConfig);

			nodes.add(nodesItem);
		}
		chainConfig.setNodes(nodes);
		getChainResponse.setChainConfig(chainConfig);
	 
	 	return getChainResponse;
	}
}