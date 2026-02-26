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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetResource4ModifyRecordRequest extends RpcAcsRequest<GetResource4ModifyRecordResponse> {
	   

	private Long nextToken;

	private Long maxResults;

	private String applicationId;
	public GetResource4ModifyRecordRequest() {
		super("BPStudio", "2021-09-31", "GetResource4ModifyRecord", "bpstudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Long nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken.toString());
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putBodyParameter("ApplicationId", applicationId);
		}
	}

	@Override
	public Class<GetResource4ModifyRecordResponse> getResponseClass() {
		return GetResource4ModifyRecordResponse.class;
	}

}
