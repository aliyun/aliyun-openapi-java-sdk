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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MarkAuditContentItemRequest extends RpcAcsRequest<MarkAuditContentItemResponse> {
	   

	private String auditIllegalReasons;

	private String sourceIp;

	private String auditResult;

	private String ids;

	private String lang;
	public MarkAuditContentItemRequest() {
		super("Green", "2017-08-23", "MarkAuditContentItem", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuditIllegalReasons() {
		return this.auditIllegalReasons;
	}

	public void setAuditIllegalReasons(String auditIllegalReasons) {
		this.auditIllegalReasons = auditIllegalReasons;
		if(auditIllegalReasons != null){
			putQueryParameter("AuditIllegalReasons", auditIllegalReasons);
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

	public String getAuditResult() {
		return this.auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
		if(auditResult != null){
			putQueryParameter("AuditResult", auditResult);
		}
	}

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("Ids", ids);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<MarkAuditContentItemResponse> getResponseClass() {
		return MarkAuditContentItemResponse.class;
	}

}
