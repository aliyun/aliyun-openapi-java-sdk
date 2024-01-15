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
public class QueryActivityItemsRequest extends RpcAcsRequest<QueryActivityItemsResponse> {
	   

	private String umId;

	private Boolean refresh;

	private Integer activityId;

	private Integer pageSize;

	private Boolean mock;

	private Integer pageIndex;

	private String extendInfo;

	private Integer floorIndex;
	public QueryActivityItemsRequest() {
		super("Trademark", "2019-09-02", "QueryActivityItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUmId() {
		return this.umId;
	}

	public void setUmId(String umId) {
		this.umId = umId;
		if(umId != null){
			putQueryParameter("UmId", umId);
		}
	}

	public Boolean getRefresh() {
		return this.refresh;
	}

	public void setRefresh(Boolean refresh) {
		this.refresh = refresh;
		if(refresh != null){
			putQueryParameter("Refresh", refresh.toString());
		}
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
		if(activityId != null){
			putQueryParameter("ActivityId", activityId.toString());
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

	public Boolean getMock() {
		return this.mock;
	}

	public void setMock(Boolean mock) {
		this.mock = mock;
		if(mock != null){
			putQueryParameter("Mock", mock.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
		if(extendInfo != null){
			putQueryParameter("ExtendInfo", extendInfo);
		}
	}

	public Integer getFloorIndex() {
		return this.floorIndex;
	}

	public void setFloorIndex(Integer floorIndex) {
		this.floorIndex = floorIndex;
		if(floorIndex != null){
			putQueryParameter("FloorIndex", floorIndex.toString());
		}
	}

	@Override
	public Class<QueryActivityItemsResponse> getResponseClass() {
		return QueryActivityItemsResponse.class;
	}

}
