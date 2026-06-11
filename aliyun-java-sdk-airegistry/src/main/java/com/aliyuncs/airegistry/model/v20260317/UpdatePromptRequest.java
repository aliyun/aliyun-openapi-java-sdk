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

package com.aliyuncs.airegistry.model.v20260317;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdatePromptRequest extends RpcAcsRequest<UpdatePromptResponse> {
	   

	private String promptKey;

	@SerializedName("bizTags")
	private List<String> bizTags;

	private String namespaceId;

	@SerializedName("labels")
	private Map<String,String> labels;

	private String description;
	public UpdatePromptRequest() {
		super("AIRegistry", "2026-03-17", "UpdatePrompt");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPromptKey() {
		return this.promptKey;
	}

	public void setPromptKey(String promptKey) {
		this.promptKey = promptKey;
		if(promptKey != null){
			putQueryParameter("PromptKey", promptKey);
		}
	}

	public List<String> getBizTags() {
		return this.bizTags;
	}

	public void setBizTags(List<String> bizTags) {
		this.bizTags = bizTags;	
		if (bizTags != null) {
			putQueryParameter("BizTags" , new Gson().toJson(bizTags));
		}	
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public Map<String,String> getLabels() {
		return this.labels;
	}

	public void setLabels(Map<String,String> labels) {
		this.labels = labels;	
		if (labels != null) {
			putQueryParameter("Labels" , new Gson().toJson(labels));
		}	
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	@Override
	public Class<UpdatePromptResponse> getResponseClass() {
		return UpdatePromptResponse.class;
	}

}
