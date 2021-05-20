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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EditQualityRuleRequest extends RpcAcsRequest<EditQualityRuleResponse> {
	   

	private Integer ruleTag;

	private String instanceId;

	private List<String> keyWordss;

	private Long qualityRuleId;

	private String name;

	private Integer matchType;
	public EditQualityRuleRequest() {
		super("aiccs", "2019-10-15", "EditQualityRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getRuleTag() {
		return this.ruleTag;
	}

	public void setRuleTag(Integer ruleTag) {
		this.ruleTag = ruleTag;
		if(ruleTag != null){
			putBodyParameter("RuleTag", ruleTag.toString());
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

	public List<String> getKeyWordss() {
		return this.keyWordss;
	}

	public void setKeyWordss(List<String> keyWordss) {
		this.keyWordss = keyWordss;	
		if (keyWordss != null) {
			for (int i = 0; i < keyWordss.size(); i++) {
				putBodyParameter("KeyWords." + (i + 1) , keyWordss.get(i));
			}
		}	
	}

	public Long getQualityRuleId() {
		return this.qualityRuleId;
	}

	public void setQualityRuleId(Long qualityRuleId) {
		this.qualityRuleId = qualityRuleId;
		if(qualityRuleId != null){
			putBodyParameter("QualityRuleId", qualityRuleId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Integer getMatchType() {
		return this.matchType;
	}

	public void setMatchType(Integer matchType) {
		this.matchType = matchType;
		if(matchType != null){
			putBodyParameter("MatchType", matchType.toString());
		}
	}

	@Override
	public Class<EditQualityRuleResponse> getResponseClass() {
		return EditQualityRuleResponse.class;
	}

}
