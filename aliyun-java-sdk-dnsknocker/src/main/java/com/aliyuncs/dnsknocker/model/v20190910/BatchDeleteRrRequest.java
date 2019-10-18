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
public class BatchDeleteRrRequest extends RpcAcsRequest<BatchDeleteRrResponse> {
	   

	private String accessID;

	private String accessSecret;

	private String resourceRecords;

	private String line;

	private String zoneName;

	private String transactionId;

	private String group;
	public BatchDeleteRrRequest() {
		super("DnsKnocker", "2019-09-10", "BatchDeleteRr", "dns_knocker");
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

	public String getResourceRecords() {
		return this.resourceRecords;
	}

	public void setResourceRecords(String resourceRecords) {
		this.resourceRecords = resourceRecords;
		if(resourceRecords != null){
			putBodyParameter("ResourceRecords", resourceRecords);
		}
	}

	public String getLine() {
		return this.line;
	}

	public void setLine(String line) {
		this.line = line;
		if(line != null){
			putBodyParameter("Line", line);
		}
	}

	public String getZoneName() {
		return this.zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
		if(zoneName != null){
			putBodyParameter("ZoneName", zoneName);
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
	public Class<BatchDeleteRrResponse> getResponseClass() {
		return BatchDeleteRrResponse.class;
	}

}
