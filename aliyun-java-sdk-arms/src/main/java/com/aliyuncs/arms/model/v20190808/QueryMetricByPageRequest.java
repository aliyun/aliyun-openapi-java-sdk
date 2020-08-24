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
public class QueryMetricByPageRequest extends RpcAcsRequest<QueryMetricByPageResponse> {
	   

	private String consistencyQueryStrategy;

	private Long endTime;

	private String orderBy;

	private Integer currentPage;

	private Long startTime;

	private List<Filters> filterss;

	private String consistencyDataKey;

	private String proxyUserId;

	private List<String> measuress;

	private Integer intervalInSec;

	private String metric;

	private Integer pageSize;

	private List<String> dimensionss;

	private String order;
	public QueryMetricByPageRequest() {
		super("ARMS", "2019-08-08", "QueryMetricByPage", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConsistencyQueryStrategy() {
		return this.consistencyQueryStrategy;
	}

	public void setConsistencyQueryStrategy(String consistencyQueryStrategy) {
		this.consistencyQueryStrategy = consistencyQueryStrategy;
		if(consistencyQueryStrategy != null){
			putQueryParameter("ConsistencyQueryStrategy", consistencyQueryStrategy);
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
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

	public List<Filters> getFilterss() {
		return this.filterss;
	}

	public void setFilterss(List<Filters> filterss) {
		this.filterss = filterss;	
		if (filterss != null) {
			for (int depth1 = 0; depth1 < filterss.size(); depth1++) {
				putQueryParameter("Filters." + (depth1 + 1) + ".Value" , filterss.get(depth1).getValue());
				putQueryParameter("Filters." + (depth1 + 1) + ".Key" , filterss.get(depth1).getKey());
			}
		}	
	}

	public String getConsistencyDataKey() {
		return this.consistencyDataKey;
	}

	public void setConsistencyDataKey(String consistencyDataKey) {
		this.consistencyDataKey = consistencyDataKey;
		if(consistencyDataKey != null){
			putQueryParameter("ConsistencyDataKey", consistencyDataKey);
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId);
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

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		if(metric != null){
			putQueryParameter("Metric", metric);
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

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public static class Filters {

		private String value;

		private String key;

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
	public Class<QueryMetricByPageResponse> getResponseClass() {
		return QueryMetricByPageResponse.class;
	}

}
