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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceNcdRequest extends RpcAcsRequest<QueryInstanceNcdResponse> {
	   

	private String instanceId2;

	private String instanceId1;

	private String instanceType;
	public QueryInstanceNcdRequest() {
		super("eflo", "2022-05-30", "QueryInstanceNcd", "eflo");
		setMethod(MethodType.POST);
	}

	public String getInstanceId2() {
		return this.instanceId2;
	}

	public void setInstanceId2(String instanceId2) {
		this.instanceId2 = instanceId2;
		if(instanceId2 != null){
			putBodyParameter("InstanceId2", instanceId2);
		}
	}

	public String getInstanceId1() {
		return this.instanceId1;
	}

	public void setInstanceId1(String instanceId1) {
		this.instanceId1 = instanceId1;
		if(instanceId1 != null){
			putBodyParameter("InstanceId1", instanceId1);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putBodyParameter("InstanceType", instanceType);
		}
	}

	@Override
	public Class<QueryInstanceNcdResponse> getResponseClass() {
		return QueryInstanceNcdResponse.class;
	}

}
