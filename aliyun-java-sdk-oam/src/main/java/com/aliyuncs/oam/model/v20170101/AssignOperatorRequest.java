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
public class AssignOperatorRequest extends RpcAcsRequest<AssignOperatorResponse> {
	   

	private String operatorUserName;

	private String operatorId;

	private String operatorType;
	public AssignOperatorRequest() {
		super("Oam", "2017-01-01", "AssignOperator");
		setMethod(MethodType.POST);
	}

	public String getOperatorUserName() {
		return this.operatorUserName;
	}

	public void setOperatorUserName(String operatorUserName) {
		this.operatorUserName = operatorUserName;
		if(operatorUserName != null){
			putQueryParameter("OperatorUserName", operatorUserName);
		}
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putQueryParameter("OperatorId", operatorId);
		}
	}

	public String getOperatorType() {
		return this.operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
		if(operatorType != null){
			putQueryParameter("OperatorType", operatorType);
		}
	}

	@Override
	public Class<AssignOperatorResponse> getResponseClass() {
		return AssignOperatorResponse.class;
	}

}
