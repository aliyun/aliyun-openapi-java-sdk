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

package com.aliyuncs.multimediaai.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.multimediaai.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListFacePersonsRequest extends RpcAcsRequest<ListFacePersonsResponse> {
	   

	private Long faceGroupId;

	private String facePersonName;

	private Integer pageNumber;

	private Integer pageSize;
	public ListFacePersonsRequest() {
		super("multimediaai", "2019-08-10", "ListFacePersons", "multimediaai");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFaceGroupId() {
		return this.faceGroupId;
	}

	public void setFaceGroupId(Long faceGroupId) {
		this.faceGroupId = faceGroupId;
		if(faceGroupId != null){
			putQueryParameter("FaceGroupId", faceGroupId.toString());
		}
	}

	public String getFacePersonName() {
		return this.facePersonName;
	}

	public void setFacePersonName(String facePersonName) {
		this.facePersonName = facePersonName;
		if(facePersonName != null){
			putQueryParameter("FacePersonName", facePersonName);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<ListFacePersonsResponse> getResponseClass() {
		return ListFacePersonsResponse.class;
	}

}
