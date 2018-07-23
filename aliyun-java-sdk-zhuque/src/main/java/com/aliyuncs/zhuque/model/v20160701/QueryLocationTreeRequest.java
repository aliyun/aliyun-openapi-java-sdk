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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryLocationTreeRequest extends RpcAcsRequest<QueryLocationTreeResponse> {
	
	public QueryLocationTreeRequest() {
		super("Zhuque", "2016-07-01", "QueryLocationTree");
	}

	private String customerId;

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId);
		}
	}

	@Override
	public Class<QueryLocationTreeResponse> getResponseClass() {
		return QueryLocationTreeResponse.class;
	}

}
