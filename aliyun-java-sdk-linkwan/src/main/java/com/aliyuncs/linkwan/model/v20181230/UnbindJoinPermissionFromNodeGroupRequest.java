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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UnbindJoinPermissionFromNodeGroupRequest extends RpcAcsRequest<UnbindJoinPermissionFromNodeGroupResponse> {
	
	public UnbindJoinPermissionFromNodeGroupRequest() {
		super("LinkWAN", "2018-12-30", "UnbindJoinPermissionFromNodeGroup", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String nodeGroupId;

	private String joinPermissionId;

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putBodyParameter("NodeGroupId", nodeGroupId);
		}
	}

	public String getJoinPermissionId() {
		return this.joinPermissionId;
	}

	public void setJoinPermissionId(String joinPermissionId) {
		this.joinPermissionId = joinPermissionId;
		if(joinPermissionId != null){
			putBodyParameter("JoinPermissionId", joinPermissionId);
		}
	}

	@Override
	public Class<UnbindJoinPermissionFromNodeGroupResponse> getResponseClass() {
		return UnbindJoinPermissionFromNodeGroupResponse.class;
	}

}
