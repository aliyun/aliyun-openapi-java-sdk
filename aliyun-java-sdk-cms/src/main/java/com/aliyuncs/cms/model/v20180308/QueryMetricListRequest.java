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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricListRequest extends RpcAcsRequest<QueryMetricListResponse> {
	
	public QueryMetricListRequest() {
		super("Cms", "2018-03-08", "QueryMetricList", "cms");
	}

	private String cursor;

	private String callby_cms_owner;

	private Long resourceOwnerId;

	private String period;

	private String length;

	private String project;

	private String endTime;

	private String express;

	private String startTime;

	private String metric;

	private String page;

	private String dimensions;

	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
		if(cursor != null){
			putQueryParameter("Cursor", cursor);
		}
	}

	public String getCallby_cms_owner() {
		return this.callby_cms_owner;
	}

	public void setCallby_cms_owner(String callby_cms_owner) {
		this.callby_cms_owner = callby_cms_owner;
		if(callby_cms_owner != null){
			putQueryParameter("callby_cms_owner", callby_cms_owner);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
		if(length != null){
			putQueryParameter("Length", length);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getExpress() {
		return this.express;
	}

	public void setExpress(String express) {
		this.express = express;
		if(express != null){
			putQueryParameter("Express", express);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page);
		}
	}

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
		if(dimensions != null){
			putQueryParameter("Dimensions", dimensions);
		}
	}

	@Override
	public Class<QueryMetricListResponse> getResponseClass() {
		return QueryMetricListResponse.class;
	}

}
