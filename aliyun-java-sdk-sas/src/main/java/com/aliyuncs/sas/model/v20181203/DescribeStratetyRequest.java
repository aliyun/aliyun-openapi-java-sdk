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

/**
 * @author auto create
 * @version 
 */
public class DescribeStratetyRequest extends RpcAcsRequest<DescribeStratetyResponse> {
	   

	private String sourceIp;

	private String strategyIds;

	private String lang;
	public DescribeStratetyRequest() {
		super("Sas", "2018-12-03", "DescribeStratety", "sas");
		setMethod(MethodType.POST);
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getStrategyIds() {
		return this.strategyIds;
	}

	public void setStrategyIds(String strategyIds) {
		this.strategyIds = strategyIds;
		if(strategyIds != null){
			putQueryParameter("StrategyIds", strategyIds);
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
	public Class<DescribeStratetyResponse> getResponseClass() {
		return DescribeStratetyResponse.class;
	}

}
