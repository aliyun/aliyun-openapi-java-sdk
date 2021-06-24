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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateAutoDiagnoseTemplateRequest extends RpcAcsRequest<OpsCreateAutoDiagnoseTemplateResponse> {
	   

	private String diagnoseChannel;

	private String diagnoseAction;

	private String solution;

	private String diagnoseProduct;

	private String errorCode;

	private String auditParamStr;
	public OpsCreateAutoDiagnoseTemplateRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateAutoDiagnoseTemplate", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDiagnoseChannel() {
		return this.diagnoseChannel;
	}

	public void setDiagnoseChannel(String diagnoseChannel) {
		this.diagnoseChannel = diagnoseChannel;
		if(diagnoseChannel != null){
			putQueryParameter("DiagnoseChannel", diagnoseChannel);
		}
	}

	public String getDiagnoseAction() {
		return this.diagnoseAction;
	}

	public void setDiagnoseAction(String diagnoseAction) {
		this.diagnoseAction = diagnoseAction;
		if(diagnoseAction != null){
			putQueryParameter("DiagnoseAction", diagnoseAction);
		}
	}

	public String getSolution() {
		return this.solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
		if(solution != null){
			putQueryParameter("Solution", solution);
		}
	}

	public String getDiagnoseProduct() {
		return this.diagnoseProduct;
	}

	public void setDiagnoseProduct(String diagnoseProduct) {
		this.diagnoseProduct = diagnoseProduct;
		if(diagnoseProduct != null){
			putQueryParameter("DiagnoseProduct", diagnoseProduct);
		}
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putQueryParameter("ErrorCode", errorCode);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsCreateAutoDiagnoseTemplateResponse> getResponseClass() {
		return OpsCreateAutoDiagnoseTemplateResponse.class;
	}

}
