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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListUsersRequest extends RpcAcsRequest<ListUsersResponse> {
	   

	private String phoneNumber;

	private String phoneRegion;

	private Long pageNumber;

	private String usernameStartsWith;

	private String userSourceType;

	private Long pageSize;

	private String email;

	private String userExternalId;

	private String displayNameStartsWith;

	private String instanceId;

	private List<String> userIds;

	private String userSourceId;

	private String organizationalUnitId;

	private String status;
	public ListUsersRequest() {
		super("Eiam", "2021-12-01", "ListUsers", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getPhoneRegion() {
		return this.phoneRegion;
	}

	public void setPhoneRegion(String phoneRegion) {
		this.phoneRegion = phoneRegion;
		if(phoneRegion != null){
			putQueryParameter("PhoneRegion", phoneRegion);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getUsernameStartsWith() {
		return this.usernameStartsWith;
	}

	public void setUsernameStartsWith(String usernameStartsWith) {
		this.usernameStartsWith = usernameStartsWith;
		if(usernameStartsWith != null){
			putQueryParameter("UsernameStartsWith", usernameStartsWith);
		}
	}

	public String getUserSourceType() {
		return this.userSourceType;
	}

	public void setUserSourceType(String userSourceType) {
		this.userSourceType = userSourceType;
		if(userSourceType != null){
			putQueryParameter("UserSourceType", userSourceType);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getUserExternalId() {
		return this.userExternalId;
	}

	public void setUserExternalId(String userExternalId) {
		this.userExternalId = userExternalId;
		if(userExternalId != null){
			putQueryParameter("UserExternalId", userExternalId);
		}
	}

	public String getDisplayNameStartsWith() {
		return this.displayNameStartsWith;
	}

	public void setDisplayNameStartsWith(String displayNameStartsWith) {
		this.displayNameStartsWith = displayNameStartsWith;
		if(displayNameStartsWith != null){
			putQueryParameter("DisplayNameStartsWith", displayNameStartsWith);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getUserIds() {
		return this.userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;	
		if (userIds != null) {
			for (int depth1 = 0; depth1 < userIds.size(); depth1++) {
				putQueryParameter("UserIds." + (depth1 + 1) , userIds.get(depth1));
			}
		}	
	}

	public String getUserSourceId() {
		return this.userSourceId;
	}

	public void setUserSourceId(String userSourceId) {
		this.userSourceId = userSourceId;
		if(userSourceId != null){
			putQueryParameter("UserSourceId", userSourceId);
		}
	}

	public String getOrganizationalUnitId() {
		return this.organizationalUnitId;
	}

	public void setOrganizationalUnitId(String organizationalUnitId) {
		this.organizationalUnitId = organizationalUnitId;
		if(organizationalUnitId != null){
			putQueryParameter("OrganizationalUnitId", organizationalUnitId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListUsersResponse> getResponseClass() {
		return ListUsersResponse.class;
	}

}
