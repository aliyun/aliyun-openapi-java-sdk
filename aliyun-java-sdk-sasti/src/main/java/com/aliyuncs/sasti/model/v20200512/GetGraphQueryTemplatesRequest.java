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

package com.aliyuncs.sasti.model.v20200512;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetGraphQueryTemplatesRequest extends RpcAcsRequest<GetGraphQueryTemplatesResponse> {
	   

	private String serviceUnit;

	private String env;
	public GetGraphQueryTemplatesRequest() {
		super("Sasti", "2020-05-12", "GetGraphQueryTemplates");
		setMethod(MethodType.POST);
	}

	public String getServiceUnit() {
		return this.serviceUnit;
	}

	public void setServiceUnit(String serviceUnit) {
		this.serviceUnit = serviceUnit;
		if(serviceUnit != null){
			putBodyParameter("ServiceUnit", serviceUnit);
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putBodyParameter("Env", env);
		}
	}

	@Override
	public Class<GetGraphQueryTemplatesResponse> getResponseClass() {
		return GetGraphQueryTemplatesResponse.class;
	}

}
