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
public class UpdateLinkeLinklogAddconditionRequest extends RpcAcsRequest<UpdateLinkeLinklogAddconditionResponse> {
	   

	private String logSample;

	private String pattern;

	private String compiled;

	private Long indicationId;

	private Long id;

	private Long conditionId;
	public UpdateLinkeLinklogAddconditionRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinklogAddcondition", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLogSample() {
		return this.logSample;
	}

	public void setLogSample(String logSample) {
		this.logSample = logSample;
		if(logSample != null){
			putBodyParameter("LogSample", logSample);
		}
	}

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
		if(pattern != null){
			putBodyParameter("Pattern", pattern);
		}
	}

	public String getCompiled() {
		return this.compiled;
	}

	public void setCompiled(String compiled) {
		this.compiled = compiled;
		if(compiled != null){
			putBodyParameter("Compiled", compiled);
		}
	}

	public Long getIndicationId() {
		return this.indicationId;
	}

	public void setIndicationId(Long indicationId) {
		this.indicationId = indicationId;
		if(indicationId != null){
			putBodyParameter("IndicationId", indicationId.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public Long getConditionId() {
		return this.conditionId;
	}

	public void setConditionId(Long conditionId) {
		this.conditionId = conditionId;
		if(conditionId != null){
			putBodyParameter("ConditionId", conditionId.toString());
		}
	}

	@Override
	public Class<UpdateLinkeLinklogAddconditionResponse> getResponseClass() {
		return UpdateLinkeLinklogAddconditionResponse.class;
	}

}
