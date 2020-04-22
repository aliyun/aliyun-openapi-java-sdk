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

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCaseExpressRequest extends RpcAcsRequest<UpdateCaseExpressResponse> {
	   

	private String orderId;

	private String expressCompanyId;

	private String caseId;

	private String expressSN;
	public UpdateCaseExpressRequest() {
		super("digitalstore", "2020-01-07", "UpdateCaseExpress", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putBodyParameter("OrderId", orderId);
		}
	}

	public String getExpressCompanyId() {
		return this.expressCompanyId;
	}

	public void setExpressCompanyId(String expressCompanyId) {
		this.expressCompanyId = expressCompanyId;
		if(expressCompanyId != null){
			putBodyParameter("ExpressCompanyId", expressCompanyId);
		}
	}

	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
		if(caseId != null){
			putBodyParameter("CaseId", caseId);
		}
	}

	public String getExpressSN() {
		return this.expressSN;
	}

	public void setExpressSN(String expressSN) {
		this.expressSN = expressSN;
		if(expressSN != null){
			putBodyParameter("ExpressSN", expressSN);
		}
	}

	@Override
	public Class<UpdateCaseExpressResponse> getResponseClass() {
		return UpdateCaseExpressResponse.class;
	}

}
