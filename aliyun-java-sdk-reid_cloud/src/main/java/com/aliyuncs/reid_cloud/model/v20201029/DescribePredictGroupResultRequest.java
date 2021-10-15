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

package com.aliyuncs.reid_cloud.model.v20201029;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid_cloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePredictGroupResultRequest extends RpcAcsRequest<DescribePredictGroupResultResponse> {
	   

	private Long startTime;

	private Long ipcId;

	private Long storeId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long trackletId;

	private Long endTime;

	private String predictType;
	public DescribePredictGroupResultRequest() {
		super("reid_cloud", "2020-10-29", "DescribePredictGroupResult", "1.2.3");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public Long getIpcId() {
		return this.ipcId;
	}

	public void setIpcId(Long ipcId) {
		this.ipcId = ipcId;
		if(ipcId != null){
			putBodyParameter("IpcId", ipcId.toString());
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getTrackletId() {
		return this.trackletId;
	}

	public void setTrackletId(Long trackletId) {
		this.trackletId = trackletId;
		if(trackletId != null){
			putBodyParameter("TrackletId", trackletId.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public String getPredictType() {
		return this.predictType;
	}

	public void setPredictType(String predictType) {
		this.predictType = predictType;
		if(predictType != null){
			putBodyParameter("PredictType", predictType);
		}
	}

	@Override
	public Class<DescribePredictGroupResultResponse> getResponseClass() {
		return DescribePredictGroupResultResponse.class;
	}

}
