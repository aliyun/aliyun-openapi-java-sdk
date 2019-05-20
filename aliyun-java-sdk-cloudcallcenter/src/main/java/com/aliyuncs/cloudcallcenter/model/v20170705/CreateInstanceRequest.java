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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	
	public CreateInstanceRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateInstance", "CloudCallCenter", "innerAPI");
	}

	private List<String> userObjects;

	private String name;

	private String domainName;

	private List<String> phoneNumbers;

	private String description;

	private Integer storageMaxDays;

	private Integer storageMaxSize;

	private String directoryId;

	private List<String> adminRamIds;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public List<String> getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;	
		if (phoneNumbers != null) {
			for (int i = 0; i < phoneNumbers.size(); i++) {
				putQueryParameter("PhoneNumber." + (i + 1) , phoneNumbers.get(i));
			}
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

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
