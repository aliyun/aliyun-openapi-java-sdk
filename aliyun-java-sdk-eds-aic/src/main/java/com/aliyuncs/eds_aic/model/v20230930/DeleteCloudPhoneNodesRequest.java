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
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteCloudPhoneNodesRequest extends RpcAcsRequest<DeleteCloudPhoneNodesResponse> {
	   

	private List<String> nodeIdss;
	public DeleteCloudPhoneNodesRequest() {
		super("eds-aic", "2023-09-30", "DeleteCloudPhoneNodes");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getNodeIdss() {
		return this.nodeIdss;
	}

	public void setNodeIdss(List<String> nodeIdss) {
		this.nodeIdss = nodeIdss;	
		if (nodeIdss != null) {
			for (int i = 0; i < nodeIdss.size(); i++) {
				putBodyParameter("NodeIds." + (i + 1) , nodeIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteCloudPhoneNodesResponse> getResponseClass() {
		return DeleteCloudPhoneNodesResponse.class;
	}

}
