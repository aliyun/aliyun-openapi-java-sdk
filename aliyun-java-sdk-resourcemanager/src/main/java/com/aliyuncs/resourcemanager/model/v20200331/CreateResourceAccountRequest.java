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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateResourceAccountRequest extends RpcAcsRequest<CreateResourceAccountResponse> {
	   

	private List<Tag> tag;

	private String accountNamePrefix;

	private String resellAccountType;

	private String parentFolderId;

	private String displayName;

	private String payerAccountId;
	public CreateResourceAccountRequest() {
		super("ResourceManager", "2020-03-31", "CreateResourceAccount");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				if (tag.get(depth1) != null) {
					
						putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
						putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
				}
			}
		}	
	}

	public String getAccountNamePrefix() {
		return this.accountNamePrefix;
	}

	public void setAccountNamePrefix(String accountNamePrefix) {
		this.accountNamePrefix = accountNamePrefix;
		if(accountNamePrefix != null){
			putQueryParameter("AccountNamePrefix", accountNamePrefix);
		}
	}

	public String getResellAccountType() {
		return this.resellAccountType;
	}

	public void setResellAccountType(String resellAccountType) {
		this.resellAccountType = resellAccountType;
		if(resellAccountType != null){
			putQueryParameter("ResellAccountType", resellAccountType);
		}
	}

	public String getParentFolderId() {
		return this.parentFolderId;
	}

	public void setParentFolderId(String parentFolderId) {
		this.parentFolderId = parentFolderId;
		if(parentFolderId != null){
			putQueryParameter("ParentFolderId", parentFolderId);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getPayerAccountId() {
		return this.payerAccountId;
	}

	public void setPayerAccountId(String payerAccountId) {
		this.payerAccountId = payerAccountId;
		if(payerAccountId != null){
			putQueryParameter("PayerAccountId", payerAccountId);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateResourceAccountResponse> getResponseClass() {
		return CreateResourceAccountResponse.class;
	}

}
