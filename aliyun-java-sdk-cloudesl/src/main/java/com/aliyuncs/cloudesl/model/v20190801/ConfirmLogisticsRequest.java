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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmLogisticsRequest extends RpcAcsRequest<ConfirmLogisticsResponse> {
	   

	private String prNumber;

	private String logisticsDocuments;

	private String poNumber;

	private String status;
	public ConfirmLogisticsRequest() {
		super("cloudesl", "2019-08-01", "ConfirmLogistics", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPrNumber() {
		return this.prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
		if(prNumber != null){
			putBodyParameter("PrNumber", prNumber);
		}
	}

	public String getLogisticsDocuments() {
		return this.logisticsDocuments;
	}

	public void setLogisticsDocuments(String logisticsDocuments) {
		this.logisticsDocuments = logisticsDocuments;
		if(logisticsDocuments != null){
			putBodyParameter("LogisticsDocuments", logisticsDocuments);
		}
	}

	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
		if(poNumber != null){
			putBodyParameter("PoNumber", poNumber);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ConfirmLogisticsResponse> getResponseClass() {
		return ConfirmLogisticsResponse.class;
	}

}
