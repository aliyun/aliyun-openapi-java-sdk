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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyImagePermissionRequest extends RpcAcsRequest<ModifyImagePermissionResponse> {
	   

	private String imageId;

	private List<Long> addAccounts;

	private List<Long> removeAccounts;
	public ModifyImagePermissionRequest() {
		super("ecd", "2020-09-30", "ModifyImagePermission");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<Long> getAddAccounts() {
		return this.addAccounts;
	}

	public void setAddAccounts(List<Long> addAccounts) {
		this.addAccounts = addAccounts;	
		if (addAccounts != null) {
			for (int i = 0; i < addAccounts.size(); i++) {
				putQueryParameter("AddAccount." + (i + 1) , addAccounts.get(i));
			}
		}	
	}

	public List<Long> getRemoveAccounts() {
		return this.removeAccounts;
	}

	public void setRemoveAccounts(List<Long> removeAccounts) {
		this.removeAccounts = removeAccounts;	
		if (removeAccounts != null) {
			for (int i = 0; i < removeAccounts.size(); i++) {
				putQueryParameter("RemoveAccount." + (i + 1) , removeAccounts.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyImagePermissionResponse> getResponseClass() {
		return ModifyImagePermissionResponse.class;
	}

}
