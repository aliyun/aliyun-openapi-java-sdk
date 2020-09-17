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
public class ImportEmapRequest extends RpcAcsRequest<ImportEmapResponse> {
	   

	private String ossObjectKey;

	private Long storeId;
	public ImportEmapRequest() {
		super("emap", "2020-06-08", "ImportEmap");
		setMethod(MethodType.POST);
	}

	public String getOssObjectKey() {
		return this.ossObjectKey;
	}

	public void setOssObjectKey(String ossObjectKey) {
		this.ossObjectKey = ossObjectKey;
		if(ossObjectKey != null){
			putBodyParameter("OssObjectKey", ossObjectKey);
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

	@Override
	public Class<ImportEmapResponse> getResponseClass() {
		return ImportEmapResponse.class;
	}

}
