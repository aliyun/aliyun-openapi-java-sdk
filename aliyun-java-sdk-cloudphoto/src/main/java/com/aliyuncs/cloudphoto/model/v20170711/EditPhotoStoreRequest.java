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

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class EditPhotoStoreRequest extends RpcAcsRequest<EditPhotoStoreResponse> {
	
	public EditPhotoStoreRequest() {
		super("CloudPhoto", "2017-07-11", "EditPhotoStore", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String autoCleanEnabled;

	private Long defaultTrashQuota;

	private String storeName;

	private String remark;

	private Long defaultQuota;

	private Integer autoCleanDays;

	public String getAutoCleanEnabled() {
		return this.autoCleanEnabled;
	}

	public void setAutoCleanEnabled(String autoCleanEnabled) {
		this.autoCleanEnabled = autoCleanEnabled;
		if(autoCleanEnabled != null){
			putQueryParameter("AutoCleanEnabled", autoCleanEnabled);
		}
	}

	public Long getDefaultTrashQuota() {
		return this.defaultTrashQuota;
	}

	public void setDefaultTrashQuota(Long defaultTrashQuota) {
		this.defaultTrashQuota = defaultTrashQuota;
		if(defaultTrashQuota != null){
			putQueryParameter("DefaultTrashQuota", defaultTrashQuota.toString());
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Long getDefaultQuota() {
		return this.defaultQuota;
	}

	public void setDefaultQuota(Long defaultQuota) {
		this.defaultQuota = defaultQuota;
		if(defaultQuota != null){
			putQueryParameter("DefaultQuota", defaultQuota.toString());
		}
	}

	public Integer getAutoCleanDays() {
		return this.autoCleanDays;
	}

	public void setAutoCleanDays(Integer autoCleanDays) {
		this.autoCleanDays = autoCleanDays;
		if(autoCleanDays != null){
			putQueryParameter("AutoCleanDays", autoCleanDays.toString());
		}
	}

	@Override
	public Class<EditPhotoStoreResponse> getResponseClass() {
		return EditPhotoStoreResponse.class;
	}

}
