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

import com.aliyuncs.sas.model.v20181203.GetAppNetworkResponse;
import com.aliyuncs.sas.model.v20181203.GetAppNetworkResponse.AppNetwork;
import com.aliyuncs.sas.model.v20181203.GetAppNetworkResponse.AppNetwork.AppNode;
import com.aliyuncs.sas.model.v20181203.GetAppNetworkResponse.AppNetwork.BasicEdge;
import com.aliyuncs.sas.model.v20181203.GetAppNetworkResponse.AppNetwork.NamespaceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppNetworkResponseUnmarshaller {

	public static GetAppNetworkResponse unmarshall(GetAppNetworkResponse getAppNetworkResponse, UnmarshallerContext _ctx) {
		
		getAppNetworkResponse.setRequestId(_ctx.stringValue("GetAppNetworkResponse.RequestId"));

		AppNetwork appNetwork = new AppNetwork();

		List<AppNode> node = new ArrayList<AppNode>();
		for (int i = 0; i < _ctx.lengthValue("GetAppNetworkResponse.AppNetwork.Node.Length"); i++) {
			AppNode appNode = new AppNode();
			appNode.setRiskLevel(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Node["+ i +"].RiskLevel"));
			appNode.setId(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Node["+ i +"].Id"));
			appNode.setNamespaceId(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Node["+ i +"].NamespaceId"));
			appNode.setType(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Node["+ i +"].Type"));
			appNode.setName(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Node["+ i +"].Name"));

			List<String> containerIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAppNetworkResponse.AppNetwork.Node["+ i +"].ContainerIds.Length"); j++) {
				containerIds.add(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Node["+ i +"].ContainerIds["+ j +"]"));
			}
			appNode.setContainerIds(containerIds);

			node.add(appNode);
		}
		appNetwork.setNode(node);

		List<BasicEdge> edge = new ArrayList<BasicEdge>();
		for (int i = 0; i < _ctx.lengthValue("GetAppNetworkResponse.AppNetwork.Edge.Length"); i++) {
			BasicEdge basicEdge = new BasicEdge();
			basicEdge.setId(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Edge["+ i +"].Id"));
			basicEdge.setSrcNodeId(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Edge["+ i +"].SrcNodeId"));
			basicEdge.setSrcNodeType(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Edge["+ i +"].SrcNodeType"));
			basicEdge.setDstNodeId(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Edge["+ i +"].DstNodeId"));
			basicEdge.setDstNodeType(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Edge["+ i +"].DstNodeType"));
			basicEdge.setPort(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Edge["+ i +"].Port"));

			edge.add(basicEdge);
		}
		appNetwork.setEdge(edge);

		List<NamespaceItem> namespace = new ArrayList<NamespaceItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppNetworkResponse.AppNetwork.Namespace.Length"); i++) {
			NamespaceItem namespaceItem = new NamespaceItem();
			namespaceItem.setId(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Namespace["+ i +"].Id"));
			namespaceItem.setName(_ctx.stringValue("GetAppNetworkResponse.AppNetwork.Namespace["+ i +"].Name"));

			namespace.add(namespaceItem);
		}
		appNetwork.setNamespace(namespace);
		getAppNetworkResponse.setAppNetwork(appNetwork);
	 
	 	return getAppNetworkResponse;
	}
}