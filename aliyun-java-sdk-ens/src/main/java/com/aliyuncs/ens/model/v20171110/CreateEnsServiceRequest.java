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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateEnsServiceRequest extends RpcAcsRequest<CreateEnsServiceResponse> {
	   

	private String ensServiceId;

	private String orderType;
	public CreateEnsServiceRequest() {
		super("Ens", "2017-11-10", "CreateEnsService");
		setMethod(MethodType.POST);
	}

	public String getEnsServiceId() {
		return this.ensServiceId;
	}

	public void setEnsServiceId(String ensServiceId) {
		this.ensServiceId = ensServiceId;
		if(ensServiceId != null){
			putQueryParameter("EnsServiceId", ensServiceId);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<CreateEnsServiceResponse> getResponseClass() {
		return CreateEnsServiceResponse.class;
	}

}
