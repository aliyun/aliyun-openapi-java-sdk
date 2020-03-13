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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDSTBizLogsRequest extends RpcAcsRequest<ListDSTBizLogsResponse> {
	   

	private String traceId;

	private Long pageNumber;

	private String logType;

	private Long pageSize;

	private String spanId;

	private String instanceId;

	private Long bizLogConfigId;
	public ListDSTBizLogsRequest() {
		super("SOFA", "2019-08-15", "ListDSTBizLogs", "ApplySidecarCert");
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
			putBodyParameter("TraceId", traceId);
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

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
		if(logType != null){
			putBodyParameter("LogType", logType);
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

	public String getSpanId() {
		return this.spanId;
	}

	public void setSpanId(String spanId) {
		this.spanId = spanId;
		if(spanId != null){
			putBodyParameter("SpanId", spanId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Long getBizLogConfigId() {
		return this.bizLogConfigId;
	}

	public void setBizLogConfigId(Long bizLogConfigId) {
		this.bizLogConfigId = bizLogConfigId;
		if(bizLogConfigId != null){
			putBodyParameter("BizLogConfigId", bizLogConfigId.toString());
		}
	}

	@Override
	public Class<ListDSTBizLogsResponse> getResponseClass() {
		return ListDSTBizLogsResponse.class;
	}

}
