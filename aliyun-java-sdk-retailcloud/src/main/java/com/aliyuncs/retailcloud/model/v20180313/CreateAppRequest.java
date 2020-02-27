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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAppRequest extends RpcAcsRequest<CreateAppResponse> {
	   

	private String bizTitle;

	private String operatingSystem;

	private String description;

	private String language;

	private String title;

	private List<Integer> middleWareIdLists;

	private Integer stateType;

	private String serviceType;

	private List<UserRoles> userRoless;

	private String bizCode;

	private String namespace;
	public CreateAppRequest() {
		super("retailcloud", "2018-03-13", "CreateApp", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizTitle() {
		return this.bizTitle;
	}

	public void setBizTitle(String bizTitle) {
		this.bizTitle = bizTitle;
		if(bizTitle != null){
			putBodyParameter("BizTitle", bizTitle);
		}
	}

	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		if(operatingSystem != null){
			putBodyParameter("OperatingSystem", operatingSystem);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putBodyParameter("Language", language);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public List<Integer> getMiddleWareIdLists() {
		return this.middleWareIdLists;
	}

	public void setMiddleWareIdLists(List<Integer> middleWareIdLists) {
		this.middleWareIdLists = middleWareIdLists;	
		if (middleWareIdLists != null) {
			for (int i = 0; i < middleWareIdLists.size(); i++) {
				putBodyParameter("MiddleWareIdList." + (i + 1) , middleWareIdLists.get(i));
			}
		}	
	}

	public Integer getStateType() {
		return this.stateType;
	}

	public void setStateType(Integer stateType) {
		this.stateType = stateType;
		if(stateType != null){
			putBodyParameter("StateType", stateType.toString());
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putBodyParameter("ServiceType", serviceType);
		}
	}

	public List<UserRoles> getUserRoless() {
		return this.userRoless;
	}

	public void setUserRoless(List<UserRoles> userRoless) {
		this.userRoless = userRoless;	
		if (userRoless != null) {
			for (int depth1 = 0; depth1 < userRoless.size(); depth1++) {
				putBodyParameter("UserRoles." + (depth1 + 1) + ".RoleName" , userRoless.get(depth1).getRoleName());
				putBodyParameter("UserRoles." + (depth1 + 1) + ".UserType" , userRoless.get(depth1).getUserType());
				putBodyParameter("UserRoles." + (depth1 + 1) + ".UserId" , userRoless.get(depth1).getUserId());
			}
		}	
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
		if(bizCode != null){
			putBodyParameter("BizCode", bizCode);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public static class UserRoles {

		private String roleName;

		private String userType;

		private String userId;

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<CreateAppResponse> getResponseClass() {
		return CreateAppResponse.class;
	}

}
