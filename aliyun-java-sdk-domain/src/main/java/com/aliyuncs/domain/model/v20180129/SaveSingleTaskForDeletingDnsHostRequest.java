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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForDeletingDnsHostRequest extends RpcAcsRequest<SaveSingleTaskForDeletingDnsHostResponse> {
	
	public SaveSingleTaskForDeletingDnsHostRequest() {
		super("Domain", "2018-01-29", "SaveSingleTaskForDeletingDnsHost");
	}

	private String instanceId;

	private String dnsName;

	private String lang;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDnsName() {
		return this.dnsName;
	}

	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
		if(dnsName != null){
			putQueryParameter("DnsName", dnsName);
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
	public Class<SaveSingleTaskForDeletingDnsHostResponse> getResponseClass() {
		return SaveSingleTaskForDeletingDnsHostResponse.class;
	}

}
