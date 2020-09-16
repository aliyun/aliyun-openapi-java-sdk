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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetHotlineCallActionRequest extends RpcAcsRequest<GetHotlineCallActionResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String accountName;

	private Integer act;

	private String fromSource;

	private String biz;

	private String acc;
	public GetHotlineCallActionRequest() {
		super("aiccs", "2019-10-15", "GetHotlineCallAction", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putBodyParameter("AccountName", accountName);
		}
	}

	public Integer getAct() {
		return this.act;
	}

	public void setAct(Integer act) {
		this.act = act;
		if(act != null){
			putBodyParameter("Act", act.toString());
		}
	}

	public String getFromSource() {
		return this.fromSource;
	}

	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
		if(fromSource != null){
			putBodyParameter("FromSource", fromSource);
		}
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putBodyParameter("Biz", biz);
		}
	}

	public String getAcc() {
		return this.acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
		if(acc != null){
			putBodyParameter("Acc", acc);
		}
	}

	@Override
	public Class<GetHotlineCallActionResponse> getResponseClass() {
		return GetHotlineCallActionResponse.class;
	}

}
