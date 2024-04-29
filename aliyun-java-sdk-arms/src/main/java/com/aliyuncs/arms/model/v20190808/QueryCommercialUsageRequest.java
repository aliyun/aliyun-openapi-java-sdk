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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryCommercialUsageRequest extends RpcAcsRequest<QueryCommercialUsageResponse> {
	   

	private Long startTime;

	private List<String> measuress;

	private Integer intervalInSec;

	private String queryType;

	private String order;

	private Long endTime;

	private String orderBy;

	private String metric;

	private List<AdvancedFilters> advancedFilterss;

	private List<String> dimensionss;
	public QueryCommercialUsageRequest() {
		super("ARMS", "2019-08-08", "QueryCommercialUsage", "arms");
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
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public List<String> getMeasuress() {
		return this.measuress;
	}

	public void setMeasuress(List<String> measuress) {
		this.measuress = measuress;	
		if (measuress != null) {
			for (int i = 0; i < measuress.size(); i++) {
				putQueryParameter("Measures." + (i + 1) , measuress.get(i));
			}
		}	
	}

	public Integer getIntervalInSec() {
		return this.intervalInSec;
	}

	public void setIntervalInSec(Integer intervalInSec) {
		this.intervalInSec = intervalInSec;
		if(intervalInSec != null){
			putQueryParameter("IntervalInSec", intervalInSec.toString());
		}
	}

	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		if(metric != null){
			putQueryParameter("Metric", metric);
		}
	}

	public List<AdvancedFilters> getAdvancedFilterss() {
		return this.advancedFilterss;
	}

	public void setAdvancedFilterss(List<AdvancedFilters> advancedFilterss) {
		this.advancedFilterss = advancedFilterss;	
		if (advancedFilterss != null) {
			for (int depth1 = 0; depth1 < advancedFilterss.size(); depth1++) {
				putQueryParameter("AdvancedFilters." + (depth1 + 1) + ".OpType" , advancedFilterss.get(depth1).getOpType());
				putQueryParameter("AdvancedFilters." + (depth1 + 1) + ".Value" , advancedFilterss.get(depth1).getValue());
				putQueryParameter("AdvancedFilters." + (depth1 + 1) + ".Key" , advancedFilterss.get(depth1).getKey());
			}
		}	
	}

	public List<String> getDimensionss() {
		return this.dimensionss;
	}

	public void setDimensionss(List<String> dimensionss) {
		this.dimensionss = dimensionss;	
		if (dimensionss != null) {
			for (int i = 0; i < dimensionss.size(); i++) {
				putQueryParameter("Dimensions." + (i + 1) , dimensionss.get(i));
			}
		}	
	}

	public static class AdvancedFilters {

		private String opType;

		private String value;

		private String key;

		public String getOpType() {
			return this.opType;
		}

		public void setOpType(String opType) {
			this.opType = opType;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<QueryCommercialUsageResponse> getResponseClass() {
		return QueryCommercialUsageResponse.class;
	}

}
