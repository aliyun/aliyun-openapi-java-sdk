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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAntiBruteForceRuleRequest extends RpcAcsRequest<ModifyAntiBruteForceRuleResponse> {
	   

	private Long resourceOwnerId;

	private Integer forbiddenTime;

	private Integer failCount;

	private String sourceIp;

	private List<String> uuidLists;

	private Long id;

	private String name;

	private Integer span;

	private Boolean defaultRule;
	public ModifyAntiBruteForceRuleRequest() {
		super("Sas", "2018-12-03", "ModifyAntiBruteForceRule", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getForbiddenTime() {
		return this.forbiddenTime;
	}

	public void setForbiddenTime(Integer forbiddenTime) {
		this.forbiddenTime = forbiddenTime;
		if(forbiddenTime != null){
			putQueryParameter("ForbiddenTime", forbiddenTime.toString());
		}
	}

	public Integer getFailCount() {
		return this.failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
		if(failCount != null){
			putQueryParameter("FailCount", failCount.toString());
		}
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

	public List<String> getUuidLists() {
		return this.uuidLists;
	}

	public void setUuidLists(List<String> uuidLists) {
		this.uuidLists = uuidLists;	
		if (uuidLists != null) {
			for (int i = 0; i < uuidLists.size(); i++) {
				putQueryParameter("UuidList." + (i + 1) , uuidLists.get(i));
			}
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getSpan() {
		return this.span;
	}

	public void setSpan(Integer span) {
		this.span = span;
		if(span != null){
			putQueryParameter("Span", span.toString());
		}
	}

	public Boolean getDefaultRule() {
		return this.defaultRule;
	}

	public void setDefaultRule(Boolean defaultRule) {
		this.defaultRule = defaultRule;
		if(defaultRule != null){
			putQueryParameter("DefaultRule", defaultRule.toString());
		}
	}

	@Override
	public Class<ModifyAntiBruteForceRuleResponse> getResponseClass() {
		return ModifyAntiBruteForceRuleResponse.class;
	}

}
