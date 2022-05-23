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
public class ExploreTraceRequest extends RpcAcsRequest<ExploreTraceResponse> {
	   

	private String traceId;

	private String kind;

	private Long endTime;

	private Long startTime;

	private Long minDuration;

	private String selectedField;

	private String serviceIp;

	private String statusCode;

	private Long maxDuration;

	private Integer pageSize;

	private String serviceName;

	private List<Attributes> attributess;

	private Integer page;

	private String spanName;
	public ExploreTraceRequest() {
		super("ARMS", "2019-08-08", "ExploreTrace", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
		if(traceId != null){
			putQueryParameter("TraceId", traceId);
		}
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
		if(kind != null){
			putQueryParameter("Kind", kind);
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Long getMinDuration() {
		return this.minDuration;
	}

	public void setMinDuration(Long minDuration) {
		this.minDuration = minDuration;
		if(minDuration != null){
			putQueryParameter("MinDuration", minDuration.toString());
		}
	}

	public String getSelectedField() {
		return this.selectedField;
	}

	public void setSelectedField(String selectedField) {
		this.selectedField = selectedField;
		if(selectedField != null){
			putQueryParameter("SelectedField", selectedField);
		}
	}

	public String getServiceIp() {
		return this.serviceIp;
	}

	public void setServiceIp(String serviceIp) {
		this.serviceIp = serviceIp;
		if(serviceIp != null){
			putQueryParameter("ServiceIp", serviceIp);
		}
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
		if(statusCode != null){
			putQueryParameter("StatusCode", statusCode);
		}
	}

	public Long getMaxDuration() {
		return this.maxDuration;
	}

	public void setMaxDuration(Long maxDuration) {
		this.maxDuration = maxDuration;
		if(maxDuration != null){
			putQueryParameter("MaxDuration", maxDuration.toString());
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

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public List<Attributes> getAttributess() {
		return this.attributess;
	}

	public void setAttributess(List<Attributes> attributess) {
		this.attributess = attributess;	
		if (attributess != null) {
			for (int depth1 = 0; depth1 < attributess.size(); depth1++) {
				putQueryParameter("Attributes." + (depth1 + 1) + ".Value" , attributess.get(depth1).getValue());
				putQueryParameter("Attributes." + (depth1 + 1) + ".Key" , attributess.get(depth1).getKey());
				putQueryParameter("Attributes." + (depth1 + 1) + ".Operator" , attributess.get(depth1).getOperator());
			}
		}	
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public String getSpanName() {
		return this.spanName;
	}

	public void setSpanName(String spanName) {
		this.spanName = spanName;
		if(spanName != null){
			putQueryParameter("SpanName", spanName);
		}
	}

	public static class Attributes {

		private String value;

		private String key;

		private String operator;

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

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}
	}

	@Override
	public Class<ExploreTraceResponse> getResponseClass() {
		return ExploreTraceResponse.class;
	}

}
