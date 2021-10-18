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
public class SearchTargetRequest extends RpcAcsRequest<SearchTargetResponse> {
	   

	private String targetImageUrl;

	private String corpId;

	private String targetType;

	private Long pageNumber;

	private Long pageSize;

	private String modelId;

	private String orderBy;

	private String endTime;

	private String beginTime;

	private String targetImageData;

	private String deviceList;

	private String targetAttributes;

	private Double similarityThreshold;
	public SearchTargetRequest() {
		super("Vcs", "2020-05-15", "SearchTarget");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetImageUrl() {
		return this.targetImageUrl;
	}

	public void setTargetImageUrl(String targetImageUrl) {
		this.targetImageUrl = targetImageUrl;
		if(targetImageUrl != null){
			putBodyParameter("TargetImageUrl", targetImageUrl);
		}
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

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putBodyParameter("TargetType", targetType);
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putBodyParameter("ModelId", modelId);
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putBodyParameter("OrderBy", orderBy);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putBodyParameter("BeginTime", beginTime);
		}
	}

	public String getTargetImageData() {
		return this.targetImageData;
	}

	public void setTargetImageData(String targetImageData) {
		this.targetImageData = targetImageData;
		if(targetImageData != null){
			putBodyParameter("TargetImageData", targetImageData);
		}
	}

	public String getDeviceList() {
		return this.deviceList;
	}

	public void setDeviceList(String deviceList) {
		this.deviceList = deviceList;
		if(deviceList != null){
			putBodyParameter("DeviceList", deviceList);
		}
	}

	public String getTargetAttributes() {
		return this.targetAttributes;
	}

	public void setTargetAttributes(String targetAttributes) {
		this.targetAttributes = targetAttributes;
		if(targetAttributes != null){
			putBodyParameter("TargetAttributes", targetAttributes);
		}
	}

	public Double getSimilarityThreshold() {
		return this.similarityThreshold;
	}

	public void setSimilarityThreshold(Double similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
		if(similarityThreshold != null){
			putBodyParameter("SimilarityThreshold", similarityThreshold.toString());
		}
	}

	@Override
	public Class<SearchTargetResponse> getResponseClass() {
		return SearchTargetResponse.class;
	}

}
