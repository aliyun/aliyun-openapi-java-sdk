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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveLinkeBahamutCloudtenantRequest extends RpcAcsRequest<SaveLinkeBahamutCloudtenantResponse> {
	   

	private String endPoint;

	private String accessKey;

	private String tenantId;

	private String id;

	private String accessSecret;

	private Long created;

	private String stationName;

	private String token;

	private Boolean deleted;

	private Long lastModified;

	private String customerId;

	private String tenantName;

	private String linkETenant;
	public SaveLinkeBahamutCloudtenantRequest() {
		super("SOFA", "2019-08-15", "SaveLinkeBahamutCloudtenant", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndPoint() {
		return this.endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
		if(endPoint != null){
			putBodyParameter("EndPoint", endPoint);
		}
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putBodyParameter("AccessKey", accessKey);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getAccessSecret() {
		return this.accessSecret;
	}

	public void setAccessSecret(String accessSecret) {
		this.accessSecret = accessSecret;
		if(accessSecret != null){
			putBodyParameter("AccessSecret", accessSecret);
		}
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
		if(created != null){
			putBodyParameter("Created", created.toString());
		}
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
		if(stationName != null){
			putBodyParameter("StationName", stationName);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
		if(deleted != null){
			putBodyParameter("Deleted", deleted.toString());
		}
	}

	public Long getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Long lastModified) {
		this.lastModified = lastModified;
		if(lastModified != null){
			putBodyParameter("LastModified", lastModified.toString());
		}
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putBodyParameter("CustomerId", customerId);
		}
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	public String getLinkETenant() {
		return this.linkETenant;
	}

	public void setLinkETenant(String linkETenant) {
		this.linkETenant = linkETenant;
		if(linkETenant != null){
			putBodyParameter("LinkETenant", linkETenant);
		}
	}

	@Override
	public Class<SaveLinkeBahamutCloudtenantResponse> getResponseClass() {
		return SaveLinkeBahamutCloudtenantResponse.class;
	}

}
