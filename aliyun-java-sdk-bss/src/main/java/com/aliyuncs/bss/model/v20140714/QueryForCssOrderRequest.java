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

package com.aliyuncs.bss.model.v20140714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryForCssOrderRequest extends RpcAcsRequest<QueryForCssOrderResponse> {
	
	public QueryForCssOrderRequest() {
		super("Bss", "2014-07-14", "QueryForCssOrder", "bss");
	}

	private String paramStr;

	public String getParamStr() {
		return this.paramStr;
	}

	public void setParamStr(String paramStr) {
		this.paramStr = paramStr;
		if(paramStr != null){
			putQueryParameter("paramStr", paramStr);
		}
	}

	@Override
	public Class<QueryForCssOrderResponse> getResponseClass() {
		return QueryForCssOrderResponse.class;
	}

}
