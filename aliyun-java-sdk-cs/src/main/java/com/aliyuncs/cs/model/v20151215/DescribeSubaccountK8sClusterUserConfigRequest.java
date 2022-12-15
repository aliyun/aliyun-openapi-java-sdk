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
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubaccountK8sClusterUserConfigRequest extends RoaAcsRequest<DescribeSubaccountK8sClusterUserConfigResponse> {
	   

	private Boolean privateIpAddress;

	private String uid;

	private Long temporaryDurationMinutes;

	private String clusterId;
	public DescribeSubaccountK8sClusterUserConfigRequest() {
		super("CS", "2015-12-15", "DescribeSubaccountK8sClusterUserConfig");
		setUriPattern("/k8s/[ClusterId]/users/[Uid]/user_config");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(Boolean privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress.toString());
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putPathParameter("Uid", uid);
		}
	}

	public Long getTemporaryDurationMinutes() {
		return this.temporaryDurationMinutes;
	}

	public void setTemporaryDurationMinutes(Long temporaryDurationMinutes) {
		this.temporaryDurationMinutes = temporaryDurationMinutes;
		if(temporaryDurationMinutes != null){
			putQueryParameter("TemporaryDurationMinutes", temporaryDurationMinutes.toString());
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
	public Class<DescribeSubaccountK8sClusterUserConfigResponse> getResponseClass() {
		return DescribeSubaccountK8sClusterUserConfigResponse.class;
	}

}
