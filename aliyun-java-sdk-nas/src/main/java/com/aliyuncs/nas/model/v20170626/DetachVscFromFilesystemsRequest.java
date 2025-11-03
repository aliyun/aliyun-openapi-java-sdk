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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetachVscFromFilesystemsRequest extends RpcAcsRequest<DetachVscFromFilesystemsResponse> {
	   

	private String clientToken;

	private List<ResourceIds> resourceIds;
	public DetachVscFromFilesystemsRequest() {
		super("NAS", "2017-06-26", "DetachVscFromFilesystems", "nas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<ResourceIds> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<ResourceIds> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int depth1 = 0; depth1 < resourceIds.size(); depth1++) {
				if (resourceIds.get(depth1) != null) {
					
						putQueryParameter("ResourceIds." + (depth1 + 1) + ".VscId" , resourceIds.get(depth1).getVscId());
						putQueryParameter("ResourceIds." + (depth1 + 1) + ".FileSystemId" , resourceIds.get(depth1).getFileSystemId());
				}
			}
		}	
	}

	public static class ResourceIds {

		private String vscId;

		private String fileSystemId;

		public String getVscId() {
			return this.vscId;
		}

		public void setVscId(String vscId) {
			this.vscId = vscId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}
	}

	@Override
	public Class<DetachVscFromFilesystemsResponse> getResponseClass() {
		return DetachVscFromFilesystemsResponse.class;
	}

}
