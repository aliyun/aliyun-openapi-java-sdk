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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPhysicalNodeByOutputNameRequest extends RpcAcsRequest<GetPhysicalNodeByOutputNameResponse> {
	   

	private Long opTenantId;

	private String env;

	private String outputName;
	public GetPhysicalNodeByOutputNameRequest() {
		super("dataphin-public", "2023-06-30", "GetPhysicalNodeByOutputName");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public String getOutputName() {
		return this.outputName;
	}

	public void setOutputName(String outputName) {
		this.outputName = outputName;
		if(outputName != null){
			putQueryParameter("OutputName", outputName);
		}
	}

	@Override
	public Class<GetPhysicalNodeByOutputNameResponse> getResponseClass() {
		return GetPhysicalNodeByOutputNameResponse.class;
	}

}
