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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDSTSpansRequest extends RpcAcsRequest<ListDSTSpansResponse> {
	   

	private String traceId;

	private Long startTime;

	private List<CustomTags> customTagss;

	private Long minDuration;

	private Long pageNumber;

	private String testField1;

	private String result;

	private String localServiceName;

	private Long pageSize;

	private String app;

	private String remoteServiceName;

	private String kind;

	private Long endTime;

	private String component;

	private String instanceId;

	private List<MiddlewareTags> middlewareTagss;

	private Long maxDuration;
	public ListDSTSpansRequest() {
		super("SOFA", "2019-08-15", "ListDSTSpans", "ApplySidecarCert");
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public List<CustomTags> getCustomTagss() {
		return this.customTagss;
	}

	public void setCustomTagss(List<CustomTags> customTagss) {
		this.customTagss = customTagss;	
		if (customTagss != null) {
			for (int depth1 = 0; depth1 < customTagss.size(); depth1++) {
				putBodyParameter("CustomTags." + (depth1 + 1) + ".Value" , customTagss.get(depth1).getValue());
				putBodyParameter("CustomTags." + (depth1 + 1) + ".Key" , customTagss.get(depth1).getKey());
			}
		}	
	}

	public Long getMinDuration() {
		return this.minDuration;
	}

	public void setMinDuration(Long minDuration) {
		this.minDuration = minDuration;
		if(minDuration != null){
			putBodyParameter("MinDuration", minDuration.toString());
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

	public String getTestField1() {
		return this.testField1;
	}

	public void setTestField1(String testField1) {
		this.testField1 = testField1;
		if(testField1 != null){
			putBodyParameter("TestField1", testField1);
		}
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
		if(result != null){
			putBodyParameter("Result", result);
		}
	}

	public String getLocalServiceName() {
		return this.localServiceName;
	}

	public void setLocalServiceName(String localServiceName) {
		this.localServiceName = localServiceName;
		if(localServiceName != null){
			putBodyParameter("LocalServiceName", localServiceName);
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

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putBodyParameter("App", app);
		}
	}

	public String getRemoteServiceName() {
		return this.remoteServiceName;
	}

	public void setRemoteServiceName(String remoteServiceName) {
		this.remoteServiceName = remoteServiceName;
		if(remoteServiceName != null){
			putBodyParameter("RemoteServiceName", remoteServiceName);
		}
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
		if(kind != null){
			putBodyParameter("Kind", kind);
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

	public String getComponent() {
		return this.component;
	}

	public void setComponent(String component) {
		this.component = component;
		if(component != null){
			putBodyParameter("Component", component);
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

	public List<MiddlewareTags> getMiddlewareTagss() {
		return this.middlewareTagss;
	}

	public void setMiddlewareTagss(List<MiddlewareTags> middlewareTagss) {
		this.middlewareTagss = middlewareTagss;	
		if (middlewareTagss != null) {
			for (int depth1 = 0; depth1 < middlewareTagss.size(); depth1++) {
				putBodyParameter("MiddlewareTags." + (depth1 + 1) + ".Value" , middlewareTagss.get(depth1).getValue());
				putBodyParameter("MiddlewareTags." + (depth1 + 1) + ".Key" , middlewareTagss.get(depth1).getKey());
			}
		}	
	}

	public Long getMaxDuration() {
		return this.maxDuration;
	}

	public void setMaxDuration(Long maxDuration) {
		this.maxDuration = maxDuration;
		if(maxDuration != null){
			putBodyParameter("MaxDuration", maxDuration.toString());
		}
	}

	public static class CustomTags {

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

	public static class MiddlewareTags {

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
	public Class<ListDSTSpansResponse> getResponseClass() {
		return ListDSTSpansResponse.class;
	}

}
