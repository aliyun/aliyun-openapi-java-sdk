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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyImageSharePermissionRequest extends RpcAcsRequest<ModifyImageSharePermissionResponse> {
	   

	private String imageId;

	private String removeAccounts;

	private String addAccounts;
	public ModifyImageSharePermissionRequest() {
		super("Ens", "2017-11-10", "ModifyImageSharePermission", "ens");
		setMethod(MethodType.POST);
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getRemoveAccounts() {
		return this.removeAccounts;
	}

	public void setRemoveAccounts(String removeAccounts) {
		this.removeAccounts = removeAccounts;
		if(removeAccounts != null){
			putQueryParameter("RemoveAccounts", removeAccounts);
		}
	}

	public String getAddAccounts() {
		return this.addAccounts;
	}

	public void setAddAccounts(String addAccounts) {
		this.addAccounts = addAccounts;
		if(addAccounts != null){
			putQueryParameter("AddAccounts", addAccounts);
		}
	}

	@Override
	public Class<ModifyImageSharePermissionResponse> getResponseClass() {
		return ModifyImageSharePermissionResponse.class;
	}

}
