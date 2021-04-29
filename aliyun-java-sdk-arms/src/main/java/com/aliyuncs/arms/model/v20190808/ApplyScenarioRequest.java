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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyScenarioRequest extends RpcAcsRequest<ApplyScenarioResponse> {
	   

	private Boolean snForce;

	private String sign;

	private Boolean snStat;

	private String scenario;

	private Boolean snDump;

	private String appId;

	private String name;

	private Boolean snTransfer;

	private Boolean updateOption;

	private String config;
	public ApplyScenarioRequest() {
		super("ARMS", "2019-08-08", "ApplyScenario", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getSnForce() {
		return this.snForce;
	}

	public void setSnForce(Boolean snForce) {
		this.snForce = snForce;
		if(snForce != null){
			putQueryParameter("SnForce", snForce.toString());
		}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public Boolean getSnStat() {
		return this.snStat;
	}

	public void setSnStat(Boolean snStat) {
		this.snStat = snStat;
		if(snStat != null){
			putQueryParameter("SnStat", snStat.toString());
		}
	}

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
		if(scenario != null){
			putQueryParameter("Scenario", scenario);
		}
	}

	public Boolean getSnDump() {
		return this.snDump;
	}

	public void setSnDump(Boolean snDump) {
		this.snDump = snDump;
		if(snDump != null){
			putQueryParameter("SnDump", snDump.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Boolean getSnTransfer() {
		return this.snTransfer;
	}

	public void setSnTransfer(Boolean snTransfer) {
		this.snTransfer = snTransfer;
		if(snTransfer != null){
			putQueryParameter("SnTransfer", snTransfer.toString());
		}
	}

	public Boolean getUpdateOption() {
		return this.updateOption;
	}

	public void setUpdateOption(Boolean updateOption) {
		this.updateOption = updateOption;
		if(updateOption != null){
			putQueryParameter("UpdateOption", updateOption.toString());
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
		}
	}

	@Override
	public Class<ApplyScenarioResponse> getResponseClass() {
		return ApplyScenarioResponse.class;
	}

}
