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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateWorkbenchEventResultRequest extends RpcAcsRequest<UpdateWorkbenchEventResultResponse> {
	   

	private String checkResultTip;

	private String checkResult;

	private String messageId;

	private String extensionCode;
	public UpdateWorkbenchEventResultRequest() {
		super("dataworks-public", "2020-05-18", "UpdateWorkbenchEventResult");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCheckResultTip() {
		return this.checkResultTip;
	}

	public void setCheckResultTip(String checkResultTip) {
		this.checkResultTip = checkResultTip;
		if(checkResultTip != null){
			putQueryParameter("CheckResultTip", checkResultTip);
		}
	}

	public String getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
		if(checkResult != null){
			putQueryParameter("CheckResult", checkResult);
		}
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
		if(messageId != null){
			putQueryParameter("MessageId", messageId);
		}
	}

	public String getExtensionCode() {
		return this.extensionCode;
	}

	public void setExtensionCode(String extensionCode) {
		this.extensionCode = extensionCode;
		if(extensionCode != null){
			putQueryParameter("ExtensionCode", extensionCode);
		}
	}

	@Override
	public Class<UpdateWorkbenchEventResultResponse> getResponseClass() {
		return UpdateWorkbenchEventResultResponse.class;
	}

}
