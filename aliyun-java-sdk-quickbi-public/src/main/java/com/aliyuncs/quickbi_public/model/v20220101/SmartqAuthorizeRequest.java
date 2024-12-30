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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SmartqAuthorizeRequest extends RpcAcsRequest<SmartqAuthorizeResponse> {
	   

	private String llmCubeThemes;

	private String llmCubes;

	private Integer operationType;

	private String expireDay;

	private String userIds;
	public SmartqAuthorizeRequest() {
		super("quickbi-public", "2022-01-01", "SmartqAuthorize", "2.2.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getLlmCubeThemes() {
		return this.llmCubeThemes;
	}

	public void setLlmCubeThemes(String llmCubeThemes) {
		this.llmCubeThemes = llmCubeThemes;
		if(llmCubeThemes != null){
			putQueryParameter("LlmCubeThemes", llmCubeThemes);
		}
	}

	public String getLlmCubes() {
		return this.llmCubes;
	}

	public void setLlmCubes(String llmCubes) {
		this.llmCubes = llmCubes;
		if(llmCubes != null){
			putQueryParameter("LlmCubes", llmCubes);
		}
	}

	public Integer getOperationType() {
		return this.operationType;
	}

	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putQueryParameter("OperationType", operationType.toString());
		}
	}

	public String getExpireDay() {
		return this.expireDay;
	}

	public void setExpireDay(String expireDay) {
		this.expireDay = expireDay;
		if(expireDay != null){
			putQueryParameter("ExpireDay", expireDay);
		}
	}

	public String getUserIds() {
		return this.userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
		if(userIds != null){
			putQueryParameter("UserIds", userIds);
		}
	}

	@Override
	public Class<SmartqAuthorizeResponse> getResponseClass() {
		return SmartqAuthorizeResponse.class;
	}

}
