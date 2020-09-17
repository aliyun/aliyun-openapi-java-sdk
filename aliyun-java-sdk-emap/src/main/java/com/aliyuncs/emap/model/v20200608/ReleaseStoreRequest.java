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

package com.aliyuncs.emap.model.v20200608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReleaseStoreRequest extends RpcAcsRequest<ReleaseStoreResponse> {
	   

	private Boolean immediatelyRelease;

	private Long storeId;

	private String editData;
	public ReleaseStoreRequest() {
		super("emap", "2020-06-08", "ReleaseStore");
		setMethod(MethodType.POST);
	}

	public Boolean getImmediatelyRelease() {
		return this.immediatelyRelease;
	}

	public void setImmediatelyRelease(Boolean immediatelyRelease) {
		this.immediatelyRelease = immediatelyRelease;
		if(immediatelyRelease != null){
			putBodyParameter("ImmediatelyRelease", immediatelyRelease.toString());
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public String getEditData() {
		return this.editData;
	}

	public void setEditData(String editData) {
		this.editData = editData;
		if(editData != null){
			putBodyParameter("EditData", editData);
		}
	}

	@Override
	public Class<ReleaseStoreResponse> getResponseClass() {
		return ReleaseStoreResponse.class;
	}

}
