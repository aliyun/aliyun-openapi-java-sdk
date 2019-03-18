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

package com.aliyuncs.cf.model.v20151127;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MonthlyPaymentCheckOrderRequest extends RpcAcsRequest<MonthlyPaymentCheckOrderResponse> {
	
	public MonthlyPaymentCheckOrderRequest() {
		super("CF", "2015-11-27", "MonthlyPaymentCheckOrder", "cf");
	}

	private String data;

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("data", data);
		}
	}

	@Override
	public Class<MonthlyPaymentCheckOrderResponse> getResponseClass() {
		return MonthlyPaymentCheckOrderResponse.class;
	}

}
