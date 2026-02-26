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

package com.aliyuncs.eflo_controller.model.v20221215;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodeRequest extends RpcAcsRequest<DescribeNodeResponse> {
	   

	private String nodeId;
	public DescribeNodeRequest() {
		super("eflo-controller", "2022-12-15", "DescribeNode");
		setMethod(MethodType.POST);
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId);
		}
	}

	@Override
	public Class<DescribeNodeResponse> getResponseClass() {
		return DescribeNodeResponse.class;
	}

}
