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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteContactGroupRequest extends RpcAcsRequest<DeleteContactGroupResponse> {
	
	public DeleteContactGroupRequest() {
		super("Cms", "2019-01-01", "DeleteContactGroup", "cms");
	}

	private String contactGroupName;

	public String getContactGroupName() {
		return this.contactGroupName;
	}

	public void setContactGroupName(String contactGroupName) {
		this.contactGroupName = contactGroupName;
		if(contactGroupName != null){
			putQueryParameter("ContactGroupName", contactGroupName);
		}
	}

	@Override
	public Class<DeleteContactGroupResponse> getResponseClass() {
		return DeleteContactGroupResponse.class;
	}

}
