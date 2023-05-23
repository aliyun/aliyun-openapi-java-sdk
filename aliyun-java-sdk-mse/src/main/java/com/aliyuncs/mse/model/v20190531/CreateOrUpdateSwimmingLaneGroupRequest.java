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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateSwimmingLaneGroupRequest extends RpcAcsRequest<CreateOrUpdateSwimmingLaneGroupResponse> {
	   

	private String appIds;

	private Boolean dbGrayEnable;

	private Boolean enable;

	private Long id;

	private String name;

	private String messageQueueFilterSide;

	private String region;

	private Integer status;

	private Boolean messageQueueGrayEnable;

	private String entryApp;

	private Boolean recordCanaryDetail;

	private String namespace;

	private String acceptLanguage;
	public CreateOrUpdateSwimmingLaneGroupRequest() {
		super("mse", "2019-05-31", "CreateOrUpdateSwimmingLaneGroup", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppIds() {
		return this.appIds;
	}

	public void setAppIds(String appIds) {
		this.appIds = appIds;
		if(appIds != null){
			putQueryParameter("AppIds", appIds);
		}
	}

	public Boolean getDbGrayEnable() {
		return this.dbGrayEnable;
	}

	public void setDbGrayEnable(Boolean dbGrayEnable) {
		this.dbGrayEnable = dbGrayEnable;
		if(dbGrayEnable != null){
			putQueryParameter("DbGrayEnable", dbGrayEnable.toString());
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getMessageQueueFilterSide() {
		return this.messageQueueFilterSide;
	}

	public void setMessageQueueFilterSide(String messageQueueFilterSide) {
		this.messageQueueFilterSide = messageQueueFilterSide;
		if(messageQueueFilterSide != null){
			putQueryParameter("MessageQueueFilterSide", messageQueueFilterSide);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public Boolean getMessageQueueGrayEnable() {
		return this.messageQueueGrayEnable;
	}

	public void setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
		this.messageQueueGrayEnable = messageQueueGrayEnable;
		if(messageQueueGrayEnable != null){
			putQueryParameter("MessageQueueGrayEnable", messageQueueGrayEnable.toString());
		}
	}

	public String getEntryApp() {
		return this.entryApp;
	}

	public void setEntryApp(String entryApp) {
		this.entryApp = entryApp;
		if(entryApp != null){
			putQueryParameter("EntryApp", entryApp);
		}
	}

	public Boolean getRecordCanaryDetail() {
		return this.recordCanaryDetail;
	}

	public void setRecordCanaryDetail(Boolean recordCanaryDetail) {
		this.recordCanaryDetail = recordCanaryDetail;
		if(recordCanaryDetail != null){
			putQueryParameter("RecordCanaryDetail", recordCanaryDetail.toString());
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<CreateOrUpdateSwimmingLaneGroupResponse> getResponseClass() {
		return CreateOrUpdateSwimmingLaneGroupResponse.class;
	}

}
