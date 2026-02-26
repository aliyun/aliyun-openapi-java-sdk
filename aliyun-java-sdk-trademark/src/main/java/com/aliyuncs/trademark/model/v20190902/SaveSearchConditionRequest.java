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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveSearchConditionRequest extends RpcAcsRequest<SaveSearchConditionResponse> {
	   

	private String umid;

	private String sessionId;

	private Integer type;

	private String tagName;

	private String conditionContent;
	public SaveSearchConditionRequest() {
		super("Trademark", "2019-09-02", "SaveSearchCondition");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUmid() {
		return this.umid;
	}

	public void setUmid(String umid) {
		this.umid = umid;
		if(umid != null){
			putBodyParameter("Umid", umid);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
		if(tagName != null){
			putBodyParameter("TagName", tagName);
		}
	}

	public String getConditionContent() {
		return this.conditionContent;
	}

	public void setConditionContent(String conditionContent) {
		this.conditionContent = conditionContent;
		if(conditionContent != null){
			putBodyParameter("ConditionContent", conditionContent);
		}
	}

	@Override
	public Class<SaveSearchConditionResponse> getResponseClass() {
		return SaveSearchConditionResponse.class;
	}

}
