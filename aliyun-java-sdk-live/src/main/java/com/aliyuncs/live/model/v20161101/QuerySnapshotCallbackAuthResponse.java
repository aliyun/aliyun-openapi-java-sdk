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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.QuerySnapshotCallbackAuthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySnapshotCallbackAuthResponse extends AcsResponse {

	private String requestId;

	private String callbackAuthKey;

	private String domainName;

	private String callbackReqAuth;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCallbackAuthKey() {
		return this.callbackAuthKey;
	}

	public void setCallbackAuthKey(String callbackAuthKey) {
		this.callbackAuthKey = callbackAuthKey;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getCallbackReqAuth() {
		return this.callbackReqAuth;
	}

	public void setCallbackReqAuth(String callbackReqAuth) {
		this.callbackReqAuth = callbackReqAuth;
	}

	@Override
	public QuerySnapshotCallbackAuthResponse getInstance(UnmarshallerContext context) {
		return	QuerySnapshotCallbackAuthResponseUnmarshaller.unmarshall(this, context);
	}
}
