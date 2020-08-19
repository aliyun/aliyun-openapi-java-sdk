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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExpandClusterRequest extends RoaAcsRequest<ExpandClusterResponse> {
	   

	private Integer count;

	private String model;

	private String userVSwitch;

	private String clusterId;
	public ExpandClusterRequest() {
		super("foas", "2018-11-11", "ExpandCluster", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/clusters/[clusterId]/expand");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putBodyParameter("count", count.toString());
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("model", model);
		}
	}

	public String getUserVSwitch() {
		return this.userVSwitch;
	}

	public void setUserVSwitch(String userVSwitch) {
		this.userVSwitch = userVSwitch;
		if(userVSwitch != null){
			putBodyParameter("userVSwitch", userVSwitch);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("clusterId", clusterId);
		}
	}

	@Override
	public Class<ExpandClusterResponse> getResponseClass() {
		return ExpandClusterResponse.class;
	}

}
