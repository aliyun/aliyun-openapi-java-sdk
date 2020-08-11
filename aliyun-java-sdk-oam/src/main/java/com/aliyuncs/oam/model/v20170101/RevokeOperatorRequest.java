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

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RevokeOperatorRequest extends RpcAcsRequest<RevokeOperatorResponse> {
	   

	private String operatorName;
	public RevokeOperatorRequest() {
		super("Oam", "2017-01-01", "RevokeOperator");
		setMethod(MethodType.POST);
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putQueryParameter("OperatorName", operatorName);
		}
	}

	@Override
	public Class<RevokeOperatorResponse> getResponseClass() {
		return RevokeOperatorResponse.class;
	}

}
