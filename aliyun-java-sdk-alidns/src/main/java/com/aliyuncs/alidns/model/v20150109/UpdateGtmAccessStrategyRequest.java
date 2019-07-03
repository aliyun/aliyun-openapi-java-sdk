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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateGtmAccessStrategyRequest extends RpcAcsRequest<UpdateGtmAccessStrategyResponse> {
	
	public UpdateGtmAccessStrategyRequest() {
		super("Alidns", "2015-01-09", "UpdateGtmAccessStrategy", "Alidns");
	}

	private String strategyName;

	private String defaultAddrPoolId;

	private String accessLines;

	private String failoverAddrPoolId;

	private String strategyId;

	private String lang;

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
		if(strategyName != null){
			putQueryParameter("StrategyName", strategyName);
		}
	}

	public String getDefaultAddrPoolId() {
		return this.defaultAddrPoolId;
	}

	public void setDefaultAddrPoolId(String defaultAddrPoolId) {
		this.defaultAddrPoolId = defaultAddrPoolId;
		if(defaultAddrPoolId != null){
			putQueryParameter("DefaultAddrPoolId", defaultAddrPoolId);
		}
	}

	public String getAccessLines() {
		return this.accessLines;
	}

	public void setAccessLines(String accessLines) {
		this.accessLines = accessLines;
		if(accessLines != null){
			putQueryParameter("AccessLines", accessLines);
		}
	}

	public String getFailoverAddrPoolId() {
		return this.failoverAddrPoolId;
	}

	public void setFailoverAddrPoolId(String failoverAddrPoolId) {
		this.failoverAddrPoolId = failoverAddrPoolId;
		if(failoverAddrPoolId != null){
			putQueryParameter("FailoverAddrPoolId", failoverAddrPoolId);
		}
	}

	public String getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
		if(strategyId != null){
			putQueryParameter("StrategyId", strategyId);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<UpdateGtmAccessStrategyResponse> getResponseClass() {
		return UpdateGtmAccessStrategyResponse.class;
	}

}
