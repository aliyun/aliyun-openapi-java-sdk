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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OperateBatchDomainRequest extends RpcAcsRequest<OperateBatchDomainResponse> {
	   

	private List<DomainRecordInfo> domainRecordInfos;

	private String type;

	private String lang;
	public OperateBatchDomainRequest() {
		super("Alidns", "2015-01-09", "OperateBatchDomain", "Alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DomainRecordInfo> getDomainRecordInfos() {
		return this.domainRecordInfos;
	}

	public void setDomainRecordInfos(List<DomainRecordInfo> domainRecordInfos) {
		this.domainRecordInfos = domainRecordInfos;	
		if (domainRecordInfos != null) {
			for (int depth1 = 0; depth1 < domainRecordInfos.size(); depth1++) {
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".Rr" , domainRecordInfos.get(depth1).getRr());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".NewType" , domainRecordInfos.get(depth1).getNewType());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".NewValue" , domainRecordInfos.get(depth1).getNewValue());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".Line" , domainRecordInfos.get(depth1).getLine());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".Domain" , domainRecordInfos.get(depth1).getDomain());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".Type" , domainRecordInfos.get(depth1).getType());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".Priority" , domainRecordInfos.get(depth1).getPriority());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".Value" , domainRecordInfos.get(depth1).getValue());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".Ttl" , domainRecordInfos.get(depth1).getTtl());
				putQueryParameter("DomainRecordInfo." + (depth1 + 1) + ".NewRr" , domainRecordInfos.get(depth1).getNewRr());
			}
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public static class DomainRecordInfo {

		private String rr;

		private String newType;

		private String newValue;

		private String line;

		private String domain;

		private String type;

		private Integer priority;

		private String value;

		private Integer ttl;

		private String newRr;

		public String getRr() {
			return this.rr;
		}

		public void setRr(String rr) {
			this.rr = rr;
		}

		public String getNewType() {
			return this.newType;
		}

		public void setNewType(String newType) {
			this.newType = newType;
		}

		public String getNewValue() {
			return this.newValue;
		}

		public void setNewValue(String newValue) {
			this.newValue = newValue;
		}

		public String getLine() {
			return this.line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public String getNewRr() {
			return this.newRr;
		}

		public void setNewRr(String newRr) {
			this.newRr = newRr;
		}
	}

	@Override
	public Class<OperateBatchDomainResponse> getResponseClass() {
		return OperateBatchDomainResponse.class;
	}

}
