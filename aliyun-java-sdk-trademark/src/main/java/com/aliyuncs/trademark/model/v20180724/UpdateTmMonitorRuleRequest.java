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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTmMonitorRuleRequest extends RpcAcsRequest<UpdateTmMonitorRuleResponse> {
	   

	private List<Integer> notifyStatuss;

	private String ruleName;

	private Long id;
	public UpdateTmMonitorRuleRequest() {
		super("Trademark", "2018-07-24", "UpdateTmMonitorRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Integer> getNotifyStatuss() {
		return this.notifyStatuss;
	}

	public void setNotifyStatuss(List<Integer> notifyStatuss) {
		this.notifyStatuss = notifyStatuss;	
		if (notifyStatuss != null) {
			for (int i = 0; i < notifyStatuss.size(); i++) {
				putQueryParameter("NotifyStatus." + (i + 1) , notifyStatuss.get(i));
			}
		}	
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	@Override
	public Class<UpdateTmMonitorRuleResponse> getResponseClass() {
		return UpdateTmMonitorRuleResponse.class;
	}

}
