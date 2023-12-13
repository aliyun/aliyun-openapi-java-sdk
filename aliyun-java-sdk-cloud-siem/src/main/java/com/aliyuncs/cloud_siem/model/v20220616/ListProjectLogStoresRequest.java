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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListProjectLogStoresRequest extends RpcAcsRequest<ListProjectLogStoresResponse> {
	   

	private Long subUserId;

	private String sourceProdCode;

	private String sourceLogCode;
	public ListProjectLogStoresRequest() {
		super("cloud-siem", "2022-06-16", "ListProjectLogStores", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Long getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(Long subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putBodyParameter("SubUserId", subUserId.toString());
		}
	}

	public String getSourceProdCode() {
		return this.sourceProdCode;
	}

	public void setSourceProdCode(String sourceProdCode) {
		this.sourceProdCode = sourceProdCode;
		if(sourceProdCode != null){
			putBodyParameter("SourceProdCode", sourceProdCode);
		}
	}

	public String getSourceLogCode() {
		return this.sourceLogCode;
	}

	public void setSourceLogCode(String sourceLogCode) {
		this.sourceLogCode = sourceLogCode;
		if(sourceLogCode != null){
			putBodyParameter("SourceLogCode", sourceLogCode);
		}
	}

	@Override
	public Class<ListProjectLogStoresResponse> getResponseClass() {
		return ListProjectLogStoresResponse.class;
	}

}
