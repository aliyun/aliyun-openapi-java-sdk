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

package com.aliyuncs.cciotgw.model.v20210721;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListResultTokenUrlRequest extends RpcAcsRequest<ListResultTokenUrlResponse> {
	   

	private String asynToken;
	public ListResultTokenUrlRequest() {
		super("CCIoTGW", "2021-07-21", "ListResultTokenUrl");
		setMethod(MethodType.GET);
	}

	public String getAsynToken() {
		return this.asynToken;
	}

	public void setAsynToken(String asynToken) {
		this.asynToken = asynToken;
		if(asynToken != null){
			putQueryParameter("AsynToken", asynToken);
		}
	}

	@Override
	public Class<ListResultTokenUrlResponse> getResponseClass() {
		return ListResultTokenUrlResponse.class;
	}

}
