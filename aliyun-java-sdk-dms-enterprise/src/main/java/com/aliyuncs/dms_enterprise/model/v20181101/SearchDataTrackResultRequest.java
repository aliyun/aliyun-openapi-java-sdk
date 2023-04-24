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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchDataTrackResultRequest extends RpcAcsRequest<SearchDataTrackResultResponse> {
	   

	private String filterStartTime;

	@SerializedName("filterTypeList")
	private List<String> filterTypeList;

	private Long tid;

	private Long orderId;

	@SerializedName("filterTableList")
	private List<String> filterTableList;

	private String filterEndTime;

	@SerializedName("columnFilter")
	private ColumnFilter columnFilter;
	public SearchDataTrackResultRequest() {
		super("dms-enterprise", "2018-11-01", "SearchDataTrackResult", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFilterStartTime() {
		return this.filterStartTime;
	}

	public void setFilterStartTime(String filterStartTime) {
		this.filterStartTime = filterStartTime;
		if(filterStartTime != null){
			putQueryParameter("FilterStartTime", filterStartTime);
		}
	}

	public List<String> getFilterTypeList() {
		return this.filterTypeList;
	}

	public void setFilterTypeList(List<String> filterTypeList) {
		this.filterTypeList = filterTypeList;	
		if (filterTypeList != null) {
			putQueryParameter("FilterTypeList" , new Gson().toJson(filterTypeList));
		}	
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public List<String> getFilterTableList() {
		return this.filterTableList;
	}

	public void setFilterTableList(List<String> filterTableList) {
		this.filterTableList = filterTableList;	
		if (filterTableList != null) {
			putQueryParameter("FilterTableList" , new Gson().toJson(filterTableList));
		}	
	}

	public String getFilterEndTime() {
		return this.filterEndTime;
	}

	public void setFilterEndTime(String filterEndTime) {
		this.filterEndTime = filterEndTime;
		if(filterEndTime != null){
			putQueryParameter("FilterEndTime", filterEndTime);
		}
	}

	public ColumnFilter getColumnFilter() {
		return this.columnFilter;
	}

	public void setColumnFilter(ColumnFilter columnFilter) {
		this.columnFilter = columnFilter;	
		if (columnFilter != null) {
			putQueryParameter("ColumnFilter" , new Gson().toJson(columnFilter));
		}	
	}

	public static class ColumnFilter {

		@SerializedName("BetweenStart")
		private String betweenStart;

		@SerializedName("BetweenEnd")
		private String betweenEnd;

		@SerializedName("ColumnName")
		private String columnName;

		@SerializedName("Value")
		private String value;

		@SerializedName("Operator")
		private String operator;

		@SerializedName("InList")
		private List<String> inList;

		public String getBetweenStart() {
			return this.betweenStart;
		}

		public void setBetweenStart(String betweenStart) {
			this.betweenStart = betweenStart;
		}

		public String getBetweenEnd() {
			return this.betweenEnd;
		}

		public void setBetweenEnd(String betweenEnd) {
			this.betweenEnd = betweenEnd;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public List<String> getInList() {
			return this.inList;
		}

		public void setInList(List<String> inList) {
			this.inList = inList;
		}
	}

	@Override
	public Class<SearchDataTrackResultResponse> getResponseClass() {
		return SearchDataTrackResultResponse.class;
	}

}
