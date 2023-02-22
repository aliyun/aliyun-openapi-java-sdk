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
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySecurityEventMarkMissIndividuallyRequest extends RpcAcsRequest<ModifySecurityEventMarkMissIndividuallyResponse> {
	   

	private String insertMarkMissParam;

	private String sourceIp;

	private String deleteMarkMissParam;

	private String from;

	private String lang;
	public ModifySecurityEventMarkMissIndividuallyRequest() {
		super("Sas", "2018-12-03", "ModifySecurityEventMarkMissIndividually");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInsertMarkMissParam() {
		return this.insertMarkMissParam;
	}

	public void setInsertMarkMissParam(String insertMarkMissParam) {
		this.insertMarkMissParam = insertMarkMissParam;
		if(insertMarkMissParam != null){
			putBodyParameter("InsertMarkMissParam", insertMarkMissParam);
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

	public String getDeleteMarkMissParam() {
		return this.deleteMarkMissParam;
	}

	public void setDeleteMarkMissParam(String deleteMarkMissParam) {
		this.deleteMarkMissParam = deleteMarkMissParam;
		if(deleteMarkMissParam != null){
			putBodyParameter("DeleteMarkMissParam", deleteMarkMissParam);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putBodyParameter("Lang", lang);
		}
	}

	@Override
	public Class<ModifySecurityEventMarkMissIndividuallyResponse> getResponseClass() {
		return ModifySecurityEventMarkMissIndividuallyResponse.class;
	}

}
