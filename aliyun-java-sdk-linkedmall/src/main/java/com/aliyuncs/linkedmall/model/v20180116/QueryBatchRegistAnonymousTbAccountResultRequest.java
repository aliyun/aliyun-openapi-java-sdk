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
public class QueryBatchRegistAnonymousTbAccountResultRequest extends RpcAcsRequest<QueryBatchRegistAnonymousTbAccountResultResponse> {
	   

	private String bizId;

	private String batchId;
	public QueryBatchRegistAnonymousTbAccountResultRequest() {
		super("linkedmall", "2018-01-16", "QueryBatchRegistAnonymousTbAccountResult");
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

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
		if(batchId != null){
			putQueryParameter("BatchId", batchId);
		}
	}

	@Override
	public Class<QueryBatchRegistAnonymousTbAccountResultResponse> getResponseClass() {
		return QueryBatchRegistAnonymousTbAccountResultResponse.class;
	}

}
