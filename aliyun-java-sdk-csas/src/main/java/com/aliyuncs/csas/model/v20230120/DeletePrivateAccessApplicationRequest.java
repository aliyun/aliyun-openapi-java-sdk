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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeletePrivateAccessApplicationRequest extends RpcAcsRequest<DeletePrivateAccessApplicationResponse> {
	   

	private String applicationId;
	public DeletePrivateAccessApplicationRequest() {
		super("csas", "2023-01-20", "DeletePrivateAccessApplication");
		setMethod(MethodType.POST);
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putBodyParameter("ApplicationId", applicationId);
		}
	}

	@Override
	public Class<DeletePrivateAccessApplicationResponse> getResponseClass() {
		return DeletePrivateAccessApplicationResponse.class;
	}

}
