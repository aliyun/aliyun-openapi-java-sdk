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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeLinklogIndicationRequest extends RpcAcsRequest<AddLinkeLinklogIndicationResponse> {
	   

	private Long id;

	private List<String> conditionsRepeatLists;

	private Long knowledgeId;
	public AddLinkeLinklogIndicationRequest() {
		super("SOFA", "2019-08-15", "AddLinkeLinklogIndication", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getConditionsRepeatLists() {
		return this.conditionsRepeatLists;
	}

	public void setConditionsRepeatLists(List<String> conditionsRepeatLists) {
		this.conditionsRepeatLists = conditionsRepeatLists;	
		if (conditionsRepeatLists != null) {
			for (int i = 0; i < conditionsRepeatLists.size(); i++) {
				putBodyParameter("ConditionsRepeatList." + (i + 1) , conditionsRepeatLists.get(i));
			}
		}	
	}

	public Long getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
		if(knowledgeId != null){
			putBodyParameter("KnowledgeId", knowledgeId.toString());
		}
	}

	@Override
	public Class<AddLinkeLinklogIndicationResponse> getResponseClass() {
		return AddLinkeLinklogIndicationResponse.class;
	}

}
