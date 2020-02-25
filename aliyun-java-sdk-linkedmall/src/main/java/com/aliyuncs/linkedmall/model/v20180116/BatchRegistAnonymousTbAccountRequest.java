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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchRegistAnonymousTbAccountRequest extends RpcAcsRequest<BatchRegistAnonymousTbAccountResponse> {
	   

	private String bizId;

	private String idJsonList;
	public BatchRegistAnonymousTbAccountRequest() {
		super("linkedmall", "2018-01-16", "BatchRegistAnonymousTbAccount");
		setMethod(MethodType.POST);
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getIdJsonList() {
		return this.idJsonList;
	}

	public void setIdJsonList(String idJsonList) {
		this.idJsonList = idJsonList;
		if(idJsonList != null){
			putQueryParameter("IdJsonList", idJsonList);
		}
	}

	@Override
	public Class<BatchRegistAnonymousTbAccountResponse> getResponseClass() {
		return BatchRegistAnonymousTbAccountResponse.class;
	}

}
