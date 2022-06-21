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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddDomainDnsRecordRequest extends RpcAcsRequest<AddDomainDnsRecordResponse> {
	   

	private String type;

	private String recordId;

	private String site;

	private String serverUid;

	private String domain;

	private String value;
	public AddDomainDnsRecordRequest() {
		super("SWAS", "2017-08-10", "AddDomainDnsRecord", "SWAS");
		setMethod(MethodType.POST);
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

	public String getRecordId() {
		return this.recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
		if(recordId != null){
			putQueryParameter("RecordId", recordId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getServerUid() {
		return this.serverUid;
	}

	public void setServerUid(String serverUid) {
		this.serverUid = serverUid;
		if(serverUid != null){
			putQueryParameter("ServerUid", serverUid);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	@Override
	public Class<AddDomainDnsRecordResponse> getResponseClass() {
		return AddDomainDnsRecordResponse.class;
	}

}
