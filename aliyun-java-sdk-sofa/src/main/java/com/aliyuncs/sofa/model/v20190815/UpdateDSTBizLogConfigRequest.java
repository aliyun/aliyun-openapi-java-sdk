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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDSTBizLogConfigRequest extends RpcAcsRequest<UpdateDSTBizLogConfigResponse> {
	   

	private String logPath;

	private String logBeginRegex;

	private Boolean advSetValid;

	private String instanceId;

	private Long bizLogConfigId;
	public UpdateDSTBizLogConfigRequest() {
		super("SOFA", "2019-08-15", "UpdateDSTBizLogConfig", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLogPath() {
		return this.logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
		if(logPath != null){
			putBodyParameter("LogPath", logPath);
		}
	}

	public String getLogBeginRegex() {
		return this.logBeginRegex;
	}

	public void setLogBeginRegex(String logBeginRegex) {
		this.logBeginRegex = logBeginRegex;
		if(logBeginRegex != null){
			putBodyParameter("LogBeginRegex", logBeginRegex);
		}
	}

	public Boolean getAdvSetValid() {
		return this.advSetValid;
	}

	public void setAdvSetValid(Boolean advSetValid) {
		this.advSetValid = advSetValid;
		if(advSetValid != null){
			putBodyParameter("AdvSetValid", advSetValid.toString());
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

	public Long getBizLogConfigId() {
		return this.bizLogConfigId;
	}

	public void setBizLogConfigId(Long bizLogConfigId) {
		this.bizLogConfigId = bizLogConfigId;
		if(bizLogConfigId != null){
			putBodyParameter("BizLogConfigId", bizLogConfigId.toString());
		}
	}

	@Override
	public Class<UpdateDSTBizLogConfigResponse> getResponseClass() {
		return UpdateDSTBizLogConfigResponse.class;
	}

}
