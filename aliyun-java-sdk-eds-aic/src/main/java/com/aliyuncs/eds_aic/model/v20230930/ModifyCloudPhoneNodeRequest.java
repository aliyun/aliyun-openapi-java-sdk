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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyCloudPhoneNodeRequest extends RpcAcsRequest<ModifyCloudPhoneNodeResponse> {
	   

	private String newNodeName;

	private Integer streamMode;

	private String nodeId;
	public ModifyCloudPhoneNodeRequest() {
		super("eds-aic", "2023-09-30", "ModifyCloudPhoneNode");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNewNodeName() {
		return this.newNodeName;
	}

	public void setNewNodeName(String newNodeName) {
		this.newNodeName = newNodeName;
		if(newNodeName != null){
			putQueryParameter("NewNodeName", newNodeName);
		}
	}

	public Integer getStreamMode() {
		return this.streamMode;
	}

	public void setStreamMode(Integer streamMode) {
		this.streamMode = streamMode;
		if(streamMode != null){
			putQueryParameter("StreamMode", streamMode.toString());
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
		}
	}

	@Override
	public Class<ModifyCloudPhoneNodeResponse> getResponseClass() {
		return ModifyCloudPhoneNodeResponse.class;
	}

}
