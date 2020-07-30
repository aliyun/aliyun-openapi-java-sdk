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

package com.aliyuncs.teambition_aliyun.model.v20200226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckAliyunUserExistsRequest extends RpcAcsRequest<CheckAliyunUserExistsResponse> {
	   

	private String userPk;
	public CheckAliyunUserExistsRequest() {
		super("teambition-aliyun", "2020-02-26", "CheckAliyunUserExists");
		setMethod(MethodType.POST);
	}

	public String getUserPk() {
		return this.userPk;
	}

	public void setUserPk(String userPk) {
		this.userPk = userPk;
		if(userPk != null){
			putBodyParameter("UserPk", userPk);
		}
	}

	@Override
	public Class<CheckAliyunUserExistsResponse> getResponseClass() {
		return CheckAliyunUserExistsResponse.class;
	}

}
