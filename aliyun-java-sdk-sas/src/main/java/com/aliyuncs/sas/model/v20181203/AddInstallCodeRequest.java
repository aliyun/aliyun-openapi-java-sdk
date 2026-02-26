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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddInstallCodeRequest extends RpcAcsRequest<AddInstallCodeResponse> {
	   

	private Long expiredDate;

	private String os;

	private Long groupId;

	private String proxyCluster;

	private Boolean onlyImage;

	private String vendorName;
	public AddInstallCodeRequest() {
		super("Sas", "2018-12-03", "AddInstallCode");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(Long expiredDate) {
		this.expiredDate = expiredDate;
		if(expiredDate != null){
			putQueryParameter("ExpiredDate", expiredDate.toString());
		}
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
		if(os != null){
			putQueryParameter("Os", os);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public String getProxyCluster() {
		return this.proxyCluster;
	}

	public void setProxyCluster(String proxyCluster) {
		this.proxyCluster = proxyCluster;
		if(proxyCluster != null){
			putQueryParameter("ProxyCluster", proxyCluster);
		}
	}

	public Boolean getOnlyImage() {
		return this.onlyImage;
	}

	public void setOnlyImage(Boolean onlyImage) {
		this.onlyImage = onlyImage;
		if(onlyImage != null){
			putQueryParameter("OnlyImage", onlyImage.toString());
		}
	}

	public String getVendorName() {
		return this.vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
		if(vendorName != null){
			putQueryParameter("VendorName", vendorName);
		}
	}

	@Override
	public Class<AddInstallCodeResponse> getResponseClass() {
		return AddInstallCodeResponse.class;
	}

}
