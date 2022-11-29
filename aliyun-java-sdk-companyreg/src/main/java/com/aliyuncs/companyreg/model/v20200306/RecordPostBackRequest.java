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

package com.aliyuncs.companyreg.model.v20200306;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecordPostBackRequest extends RpcAcsRequest<RecordPostBackResponse> {
	   

	private String entityKey;

	private String content;

	private String bizType;

	private String bizId;

	private String contactor;
	public RecordPostBackRequest() {
		super("companyreg", "2020-03-06", "RecordPostBack", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEntityKey() {
		return this.entityKey;
	}

	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
		if(entityKey != null){
			putQueryParameter("entityKey", entityKey);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("content", content);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("bizType", bizType);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("bizId", bizId);
		}
	}

	public String getContactor() {
		return this.contactor;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
		if(contactor != null){
			putQueryParameter("contactor", contactor);
		}
	}

	@Override
	public Class<RecordPostBackResponse> getResponseClass() {
		return RecordPostBackResponse.class;
	}

}
