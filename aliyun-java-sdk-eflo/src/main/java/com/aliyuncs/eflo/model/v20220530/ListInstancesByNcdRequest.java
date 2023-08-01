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
public class ListInstancesByNcdRequest extends RpcAcsRequest<ListInstancesByNcdResponse> {
	   

	private Integer maxNcd;

	private String instanceId;

	private String instanceType;
	public ListInstancesByNcdRequest() {
		super("eflo", "2022-05-30", "ListInstancesByNcd", "eflo");
		setMethod(MethodType.POST);
	}

	public Integer getMaxNcd() {
		return this.maxNcd;
	}

	public void setMaxNcd(Integer maxNcd) {
		this.maxNcd = maxNcd;
		if(maxNcd != null){
			putBodyParameter("MaxNcd", maxNcd.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
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
	public Class<ListInstancesByNcdResponse> getResponseClass() {
		return ListInstancesByNcdResponse.class;
	}

}
