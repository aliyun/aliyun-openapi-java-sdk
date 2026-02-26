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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetUserIdRequest extends RpcAcsRequest<SetUserIdResponse> {
	   

	private Long toAliyunId;
	public SetUserIdRequest() {
		super("Advisor-Share", "2018-06-08", "SetUserId", "advisor");
		setMethod(MethodType.POST);
	}

	public Long getToAliyunId() {
		return this.toAliyunId;
	}

	public void setToAliyunId(Long toAliyunId) {
		this.toAliyunId = toAliyunId;
		if(toAliyunId != null){
			putQueryParameter("ToAliyunId", toAliyunId.toString());
		}
	}

	@Override
	public Class<SetUserIdResponse> getResponseClass() {
		return SetUserIdResponse.class;
	}

}
