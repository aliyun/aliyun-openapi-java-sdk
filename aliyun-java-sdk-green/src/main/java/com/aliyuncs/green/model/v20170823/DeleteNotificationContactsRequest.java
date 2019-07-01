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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteNotificationContactsRequest extends RpcAcsRequest<DeleteNotificationContactsResponse> {
	
	public DeleteNotificationContactsRequest() {
		super("Green", "2017-08-23", "DeleteNotificationContacts", "green");
	}

	private String sourceIp;

	private String lang;

	private String contactTypes;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getContactTypes() {
		return this.contactTypes;
	}

	public void setContactTypes(String contactTypes) {
		this.contactTypes = contactTypes;
		if(contactTypes != null){
			putQueryParameter("ContactTypes", contactTypes);
		}
	}

	@Override
	public Class<DeleteNotificationContactsResponse> getResponseClass() {
		return DeleteNotificationContactsResponse.class;
	}

}
