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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitExternalNodesAddingTaskRequest extends RpcAcsRequest<SubmitExternalNodesAddingTaskResponse> {
	   

	private String nodeGroupId;

	private List<Nodes> nodess;
	public SubmitExternalNodesAddingTaskRequest() {
		super("LinkWAN", "2019-03-01", "SubmitExternalNodesAddingTask", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putQueryParameter("NodeGroupId", nodeGroupId);
		}
	}

	public List<Nodes> getNodess() {
		return this.nodess;
	}

	public void setNodess(List<Nodes> nodess) {
		this.nodess = nodess;	
		if (nodess != null) {
			for (int depth1 = 0; depth1 < nodess.size(); depth1++) {
				putQueryParameter("Nodes." + (depth1 + 1) + ".DevEui" , nodess.get(depth1).getDevEui());
			}
		}	
	}

	public static class Nodes {

		private String devEui;

		public String getDevEui() {
			return this.devEui;
		}

		public void setDevEui(String devEui) {
			this.devEui = devEui;
		}
	}

	@Override
	public Class<SubmitExternalNodesAddingTaskResponse> getResponseClass() {
		return SubmitExternalNodesAddingTaskResponse.class;
	}

}
