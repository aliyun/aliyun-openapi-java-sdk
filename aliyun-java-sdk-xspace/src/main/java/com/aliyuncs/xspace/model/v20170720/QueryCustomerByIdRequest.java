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

package com.aliyuncs.xspace.model.v20170720;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomerByIdRequest extends RoaAcsRequest<QueryCustomerByIdResponse> {
	
	public QueryCustomerByIdRequest() {
		super("xspace", "2017-07-20", "QueryCustomerById");
		setUriPattern("/customer");
		setMethod(MethodType.PUT);
	}

	private String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	@Override
	public Class<QueryCustomerByIdResponse> getResponseClass() {
		return QueryCustomerByIdResponse.class;
	}

}
