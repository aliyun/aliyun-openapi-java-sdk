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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ProcessCompanyRegOrderRequest extends RpcAcsRequest<ProcessCompanyRegOrderResponse> {
	
	public ProcessCompanyRegOrderRequest() {
		super("companyreg", "2019-05-08", "ProcessCompanyRegOrder", "companyreg");
	}

	private String actionType;

	private String bizId;

	private String actionRequestId;

	private String actionInfo;

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType);
		}
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

	public String getActionRequestId() {
		return this.actionRequestId;
	}

	public void setActionRequestId(String actionRequestId) {
		this.actionRequestId = actionRequestId;
		if(actionRequestId != null){
			putQueryParameter("ActionRequestId", actionRequestId);
		}
	}

	public String getActionInfo() {
		return this.actionInfo;
	}

	public void setActionInfo(String actionInfo) {
		this.actionInfo = actionInfo;
		if(actionInfo != null){
			putQueryParameter("ActionInfo", actionInfo);
		}
	}

	@Override
	public Class<ProcessCompanyRegOrderResponse> getResponseClass() {
		return ProcessCompanyRegOrderResponse.class;
	}

}
