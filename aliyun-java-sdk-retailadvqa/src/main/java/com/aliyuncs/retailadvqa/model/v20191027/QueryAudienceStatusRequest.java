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

package com.aliyuncs.retailadvqa.model.v20191027;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryAudienceStatusRequest extends RpcAcsRequest<QueryAudienceStatusResponse> {
	   

	private String uid;

	private Integer uploadId;

	private String crowdId;
	public QueryAudienceStatusRequest() {
		super("retailadvqa", "2019-10-27", "QueryAudienceStatus");
		setMethod(MethodType.POST);
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public Integer getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(Integer uploadId) {
		this.uploadId = uploadId;
		if(uploadId != null){
			putQueryParameter("UploadId", uploadId.toString());
		}
	}

	public String getCrowdId() {
		return this.crowdId;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
		if(crowdId != null){
			putQueryParameter("CrowdId", crowdId);
		}
	}

	@Override
	public Class<QueryAudienceStatusResponse> getResponseClass() {
		return QueryAudienceStatusResponse.class;
	}

}
