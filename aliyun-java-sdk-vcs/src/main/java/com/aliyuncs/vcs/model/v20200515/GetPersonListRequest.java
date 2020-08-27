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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPersonListRequest extends RpcAcsRequest<GetPersonListResponse> {
	   

	private String faceImageUrl;

	private String pageNumber;

	private String corpIdList;

	private String pageSize;
	public GetPersonListRequest() {
		super("Vcs", "2020-05-15", "GetPersonList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaceImageUrl() {
		return this.faceImageUrl;
	}

	public void setFaceImageUrl(String faceImageUrl) {
		this.faceImageUrl = faceImageUrl;
		if(faceImageUrl != null){
			putBodyParameter("FaceImageUrl", faceImageUrl);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber);
		}
	}

	public String getCorpIdList() {
		return this.corpIdList;
	}

	public void setCorpIdList(String corpIdList) {
		this.corpIdList = corpIdList;
		if(corpIdList != null){
			putBodyParameter("CorpIdList", corpIdList);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	@Override
	public Class<GetPersonListResponse> getResponseClass() {
		return GetPersonListResponse.class;
	}

}
