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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	
	public CreateInstanceRequest() {
		super("CCC", "2017-07-05", "CreateInstance");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private List<String> phoneNumberss;

	private List<String> userObjects;

	private String domainName;

	private String phoneNumber;

	private String description;

	private Integer storageMaxDays;

	private List<String> adminRamIds;

	private String name;

	private Integer storageMaxSize;

	private String directoryId;

	public List<String> getPhoneNumberss() {
		return this.phoneNumberss;
	}

	public void setPhoneNumberss(List<String> phoneNumberss) {
		this.phoneNumberss = phoneNumberss;	
		if (phoneNumberss != null) {
			for (int i = 0; i < phoneNumberss.size(); i++) {
				putQueryParameter("PhoneNumbers." + (i + 1) , phoneNumberss.get(i));
			}
		}	
	}

	public List<String> getUserObjects() {
		return this.userObjects;
	}

	public void setUserObjects(List<String> userObjects) {
		this.userObjects = userObjects;	
		if (userObjects != null) {
			for (int i = 0; i < userObjects.size(); i++) {
				putQueryParameter("UserObject." + (i + 1) , userObjects.get(i));
			}
		}	
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getStorageMaxDays() {
		return this.storageMaxDays;
	}

	public void setStorageMaxDays(Integer storageMaxDays) {
		this.storageMaxDays = storageMaxDays;
		if(storageMaxDays != null){
			putQueryParameter("StorageMaxDays", storageMaxDays.toString());
		}
	}

	public List<String> getAdminRamIds() {
		return this.adminRamIds;
	}

	public void setAdminRamIds(List<String> adminRamIds) {
		this.adminRamIds = adminRamIds;	
		if (adminRamIds != null) {
			for (int i = 0; i < adminRamIds.size(); i++) {
				putQueryParameter("AdminRamId." + (i + 1) , adminRamIds.get(i));
			}
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

	public Integer getStorageMaxSize() {
		return this.storageMaxSize;
	}

	public void setStorageMaxSize(Integer storageMaxSize) {
		this.storageMaxSize = storageMaxSize;
		if(storageMaxSize != null){
			putQueryParameter("StorageMaxSize", storageMaxSize.toString());
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
