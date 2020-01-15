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
public class DescribeClusterV2UserKubeconfigRequest extends RoaAcsRequest<DescribeClusterV2UserKubeconfigResponse> {
	   

	private Boolean privateIpAddress;

	private String clusterId;
	public DescribeClusterV2UserKubeconfigRequest() {
		super("CS", "2015-12-15", "DescribeClusterV2UserKubeconfig", "csk");
		setUriPattern("/api/v2/k8s/[ClusterId]/user_config");
		setMethod(MethodType.GET);
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
	public Class<DescribeClusterV2UserKubeconfigResponse> getResponseClass() {
		return DescribeClusterV2UserKubeconfigResponse.class;
	}

}
