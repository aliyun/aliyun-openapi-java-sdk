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
package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ScheduleKeyDeletionRequest extends RpcAcsRequest<ScheduleKeyDeletionResponse> {
	
	public ScheduleKeyDeletionRequest() {
		super("Kms", "2016-01-20", "ScheduleKeyDeletion", "kms");
		setProtocol(ProtocolType.HTTPS);
	}

	private String keyId;

	private Integer pendingWindowInDays;

	private String sTSToken;

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
		putQueryParameter("KeyId", keyId);
	}

	public Integer getPendingWindowInDays() {
		return this.pendingWindowInDays;
	}

	public void setPendingWindowInDays(Integer pendingWindowInDays) {
		this.pendingWindowInDays = pendingWindowInDays;
		putQueryParameter("PendingWindowInDays", pendingWindowInDays);
	}

	public String getSTSToken() {
		return this.sTSToken;
	}

	public void setSTSToken(String sTSToken) {
		this.sTSToken = sTSToken;
		putQueryParameter("STSToken", sTSToken);
	}

	@Override
	public Class<ScheduleKeyDeletionResponse> getResponseClass() {
		return ScheduleKeyDeletionResponse.class;
	}

}
