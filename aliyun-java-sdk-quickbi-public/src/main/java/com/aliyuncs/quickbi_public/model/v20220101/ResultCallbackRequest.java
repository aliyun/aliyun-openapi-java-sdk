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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ResultCallbackRequest extends RpcAcsRequest<ResultCallbackResponse> {
	   

	private String handleReason;

	private String applicationId;

	private Integer status;
	public ResultCallbackRequest() {
		super("quickbi-public", "2022-01-01", "ResultCallback", "quickbi");
		setMethod(MethodType.POST);
	}

	public String getHandleReason() {
		return this.handleReason;
	}

	public void setHandleReason(String handleReason) {
		this.handleReason = handleReason;
		if(handleReason != null){
			putQueryParameter("HandleReason", handleReason);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ResultCallbackResponse> getResponseClass() {
		return ResultCallbackResponse.class;
	}

}
