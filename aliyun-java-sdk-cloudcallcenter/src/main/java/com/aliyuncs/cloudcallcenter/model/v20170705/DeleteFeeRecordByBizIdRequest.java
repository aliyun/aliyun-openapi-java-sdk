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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteFeeRecordByBizIdRequest extends RpcAcsRequest<DeleteFeeRecordByBizIdResponse> {
	
	public DeleteFeeRecordByBizIdRequest() {
		super("CloudCallCenter", "2017-07-05", "DeleteFeeRecordByBizId", "CloudCallCenter", "innerAPI");
	}

	private String bizId;

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("bizId", bizId);
		}
	}

	@Override
	public Class<DeleteFeeRecordByBizIdResponse> getResponseClass() {
		return DeleteFeeRecordByBizIdResponse.class;
	}

}
