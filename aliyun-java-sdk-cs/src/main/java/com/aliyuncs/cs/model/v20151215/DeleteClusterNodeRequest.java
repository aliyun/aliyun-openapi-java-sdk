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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteClusterNodeRequest extends RoaAcsRequest<DeleteClusterNodeResponse> {
	
	public DeleteClusterNodeRequest() {
		super("CS", "2015-12-15", "DeleteClusterNode", "cs");
		setUriPattern("/clusters/[ClusterId]/ip/[Ip]");
		setMethod(MethodType.DELETE);
	}

	private String releaseInstance;

	private String ip;

	private String force;

	private String clusterId;

	public String getReleaseInstance() {
		return this.releaseInstance;
	}

	public void setReleaseInstance(String releaseInstance) {
		this.releaseInstance = releaseInstance;
		if(releaseInstance != null){
			putQueryParameter("releaseInstance", releaseInstance);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putPathParameter("Ip", ip);
		}
	}

	public String getForce() {
		return this.force;
	}

	public void setForce(String force) {
		this.force = force;
		if(force != null){
			putQueryParameter("force", force);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<DeleteClusterNodeResponse> getResponseClass() {
		return DeleteClusterNodeResponse.class;
	}

}
