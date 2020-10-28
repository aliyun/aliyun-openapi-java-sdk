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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPersonListRequest extends RpcAcsRequest<GetPersonListResponse> {
	   

	private String corpId;

	private String faceMatchingRateThreshold;

	private Long pageNumber;

	private List<Object> corpIdList;

	private String faceUrl;

	private Long pageSize;

	private List<Object> personIdList;
	public GetPersonListRequest() {
		super("Vcs", "2020-05-15", "GetPersonList", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getFaceMatchingRateThreshold() {
		return this.faceMatchingRateThreshold;
	}

	public void setFaceMatchingRateThreshold(String faceMatchingRateThreshold) {
		this.faceMatchingRateThreshold = faceMatchingRateThreshold;
		if(faceMatchingRateThreshold != null){
			putBodyParameter("FaceMatchingRateThreshold", faceMatchingRateThreshold);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<Object> getCorpIdList() {
		return this.corpIdList;
	}

	public void setCorpIdList(List<Object> corpIdList) {
		this.corpIdList = corpIdList;
		if(corpIdList != null){
			putBodyParameter("CorpIdList", new Gson().toJson(corpIdList));
		}
	}

	public String getFaceUrl() {
		return this.faceUrl;
	}

	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
		if(faceUrl != null){
			putBodyParameter("FaceUrl", faceUrl);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<Object> getPersonIdList() {
		return this.personIdList;
	}

	public void setPersonIdList(List<Object> personIdList) {
		this.personIdList = personIdList;
		if(personIdList != null){
			putBodyParameter("PersonIdList", new Gson().toJson(personIdList));
		}
	}

	@Override
	public Class<GetPersonListResponse> getResponseClass() {
		return GetPersonListResponse.class;
	}

}
