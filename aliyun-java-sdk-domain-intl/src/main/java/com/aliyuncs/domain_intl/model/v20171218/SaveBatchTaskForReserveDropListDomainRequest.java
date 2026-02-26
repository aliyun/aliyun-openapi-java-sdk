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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForReserveDropListDomainRequest extends RpcAcsRequest<SaveBatchTaskForReserveDropListDomainResponse> {
	   

	private List<Domains> domainss;

	private String contactTemplateId;
	public SaveBatchTaskForReserveDropListDomainRequest() {
		super("Domain-intl", "2017-12-18", "SaveBatchTaskForReserveDropListDomain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<Domains> getDomainss() {
		return this.domainss;
	}

	public void setDomainss(List<Domains> domainss) {
		this.domainss = domainss;	
		if (domainss != null) {
			for (int depth1 = 0; depth1 < domainss.size(); depth1++) {
				putQueryParameter("Domains." + (depth1 + 1) + ".Dns2" , domainss.get(depth1).getDns2());
				putQueryParameter("Domains." + (depth1 + 1) + ".Dns1" , domainss.get(depth1).getDns1());
				putQueryParameter("Domains." + (depth1 + 1) + ".DomainName" , domainss.get(depth1).getDomainName());
			}
		}	
	}

	public String getContactTemplateId() {
		return this.contactTemplateId;
	}

	public void setContactTemplateId(String contactTemplateId) {
		this.contactTemplateId = contactTemplateId;
		if(contactTemplateId != null){
			putQueryParameter("ContactTemplateId", contactTemplateId);
		}
	}

	public static class Domains {

		private String dns2;

		private String dns1;

		private String domainName;

		public String getDns2() {
			return this.dns2;
		}

		public void setDns2(String dns2) {
			this.dns2 = dns2;
		}

		public String getDns1() {
			return this.dns1;
		}

		public void setDns1(String dns1) {
			this.dns1 = dns1;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public Class<SaveBatchTaskForReserveDropListDomainResponse> getResponseClass() {
		return SaveBatchTaskForReserveDropListDomainResponse.class;
	}

}
