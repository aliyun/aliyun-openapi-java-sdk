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

package com.aliyuncs.dnsknocker.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dnsknocker.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetResourceRecordsRequest extends RpcAcsRequest<GetResourceRecordsResponse> {
	   

	private String accessID;

	private String accessSecret;

	private String zone;

	private String domainName;

	private String transactionId;

	private String domainLine;

	private String group;
	public GetResourceRecordsRequest() {
		super("DnsKnocker", "2019-09-10", "GetResourceRecords", "dns_knocker");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccessID() {
		return this.accessID;
	}

	public void setAccessID(String accessID) {
		this.accessID = accessID;
		if(accessID != null){
			putBodyParameter("AccessID", accessID);
		}
	}

	public String getAccessSecret() {
		return this.accessSecret;
	}

	public void setAccessSecret(String accessSecret) {
		this.accessSecret = accessSecret;
		if(accessSecret != null){
			putBodyParameter("AccessSecret", accessSecret);
		}
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
		if(zone != null){
			putBodyParameter("Zone", zone);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		if(transactionId != null){
			putBodyParameter("TransactionId", transactionId);
		}
	}

	public String getDomainLine() {
		return this.domainLine;
	}

	public void setDomainLine(String domainLine) {
		this.domainLine = domainLine;
		if(domainLine != null){
			putBodyParameter("DomainLine", domainLine);
		}
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
		if(group != null){
			putBodyParameter("Group", group);
		}
	}

	@Override
	public Class<GetResourceRecordsResponse> getResponseClass() {
		return GetResourceRecordsResponse.class;
	}

}
