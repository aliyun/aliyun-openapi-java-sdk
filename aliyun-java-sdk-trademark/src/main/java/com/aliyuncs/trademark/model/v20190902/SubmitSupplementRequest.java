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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitSupplementRequest extends RpcAcsRequest<SubmitSupplementResponse> {
	   

	private String userFiles;

	private Long supplementId;

	private String content;
	public SubmitSupplementRequest() {
		super("Trademark", "2019-09-02", "SubmitSupplement");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserFiles() {
		return this.userFiles;
	}

	public void setUserFiles(String userFiles) {
		this.userFiles = userFiles;
		if(userFiles != null){
			putQueryParameter("UserFiles", userFiles);
		}
	}

	public Long getSupplementId() {
		return this.supplementId;
	}

	public void setSupplementId(Long supplementId) {
		this.supplementId = supplementId;
		if(supplementId != null){
			putQueryParameter("SupplementId", supplementId.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	@Override
	public Class<SubmitSupplementResponse> getResponseClass() {
		return SubmitSupplementResponse.class;
	}

}
