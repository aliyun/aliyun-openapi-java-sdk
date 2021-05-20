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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivision.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchFaceRequest extends RpcAcsRequest<SearchFaceResponse> {
	   

	private String content;

	private String dataType;

	private Float probabilityThreshold;

	private String groupId;

	private Integer count;

	private Long ownerId;
	public SearchFaceRequest() {
		super("ivision", "2019-03-08", "SearchFace");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
		}
	}

	public Float getProbabilityThreshold() {
		return this.probabilityThreshold;
	}

	public void setProbabilityThreshold(Float probabilityThreshold) {
		this.probabilityThreshold = probabilityThreshold;
		if(probabilityThreshold != null){
			putQueryParameter("ProbabilityThreshold", probabilityThreshold.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putQueryParameter("Count", count.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<SearchFaceResponse> getResponseClass() {
		return SearchFaceResponse.class;
	}

}
