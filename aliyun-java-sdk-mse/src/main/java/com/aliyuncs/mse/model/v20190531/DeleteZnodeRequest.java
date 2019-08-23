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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteZnodeRequest extends RpcAcsRequest<DeleteZnodeResponse> {
	
	public DeleteZnodeRequest() {
		super("mse", "2019-05-31", "DeleteZnode", "mse");
	}

	private String path;

	private String requestPars;

	private String clusterId;

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putBodyParameter("Path", path);
		}
	}

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putBodyParameter("RequestPars", requestPars);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<DeleteZnodeResponse> getResponseClass() {
		return DeleteZnodeResponse.class;
	}

}
