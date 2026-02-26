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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveImageBaselineStrategyRequest extends RpcAcsRequest<SaveImageBaselineStrategyResponse> {
	   

	private String lang;

	private String baselineItemList;

	private String strategyName;

	private Long strategyId;
	public SaveImageBaselineStrategyRequest() {
		super("Sas", "2018-12-03", "SaveImageBaselineStrategy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getBaselineItemList() {
		return this.baselineItemList;
	}

	public void setBaselineItemList(String baselineItemList) {
		this.baselineItemList = baselineItemList;
		if(baselineItemList != null){
			putQueryParameter("BaselineItemList", baselineItemList);
		}
	}

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
		if(strategyName != null){
			putQueryParameter("StrategyName", strategyName);
		}
	}

	public Long getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(Long strategyId) {
		this.strategyId = strategyId;
		if(strategyId != null){
			putQueryParameter("StrategyId", strategyId.toString());
		}
	}

	@Override
	public Class<SaveImageBaselineStrategyResponse> getResponseClass() {
		return SaveImageBaselineStrategyResponse.class;
	}

}
