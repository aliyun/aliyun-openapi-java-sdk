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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.GetOperationOssUploadPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOperationOssUploadPolicyResponse extends AcsResponse {

	private String requestId;

	private String accessid;

	private String encodedPolicy;

	private String signature;

	private String fileDir;

	private String host;

	private String expireTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessid() {
		return this.accessid;
	}

	public void setAccessid(String accessid) {
		this.accessid = accessid;
	}

	public String getEncodedPolicy() {
		return this.encodedPolicy;
	}

	public void setEncodedPolicy(String encodedPolicy) {
		this.encodedPolicy = encodedPolicy;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getFileDir() {
		return this.fileDir;
	}

	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	@Override
	public GetOperationOssUploadPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetOperationOssUploadPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
