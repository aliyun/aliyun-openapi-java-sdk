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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetConnectionRequest extends RpcAcsRequest<GetConnectionResponse> {
	   

	private String connectionName;
	public GetConnectionRequest() {
		super("eventbridge", "2020-04-01", "GetConnection");
		setMethod(MethodType.POST);
	}

	public String getConnectionName() {
		return this.connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
		if(connectionName != null){
			putQueryParameter("ConnectionName", connectionName);
		}
	}

	@Override
	public Class<GetConnectionResponse> getResponseClass() {
		return GetConnectionResponse.class;
	}

}
