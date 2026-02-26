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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAnnotationMissionSessionRequest extends RpcAcsRequest<ListAnnotationMissionSessionResponse> {
	   

	private String annotationMissionSessionId;

	private String annotationMissionId;

	private Integer environment;

	private String includeStatusListJsonString;

	private Integer pageSize;

	private Integer pageIndex;
	public ListAnnotationMissionSessionRequest() {
		super("OutboundBot", "2019-12-26", "ListAnnotationMissionSession", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAnnotationMissionSessionId() {
		return this.annotationMissionSessionId;
	}

	public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
		this.annotationMissionSessionId = annotationMissionSessionId;
		if(annotationMissionSessionId != null){
			putQueryParameter("AnnotationMissionSessionId", annotationMissionSessionId);
		}
	}

	public String getAnnotationMissionId() {
		return this.annotationMissionId;
	}

	public void setAnnotationMissionId(String annotationMissionId) {
		this.annotationMissionId = annotationMissionId;
		if(annotationMissionId != null){
			putQueryParameter("AnnotationMissionId", annotationMissionId);
		}
	}

	public Integer getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(Integer environment) {
		this.environment = environment;
		if(environment != null){
			putQueryParameter("Environment", environment.toString());
		}
	}

	public String getIncludeStatusListJsonString() {
		return this.includeStatusListJsonString;
	}

	public void setIncludeStatusListJsonString(String includeStatusListJsonString) {
		this.includeStatusListJsonString = includeStatusListJsonString;
		if(includeStatusListJsonString != null){
			putQueryParameter("IncludeStatusListJsonString", includeStatusListJsonString);
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

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	@Override
	public Class<ListAnnotationMissionSessionResponse> getResponseClass() {
		return ListAnnotationMissionSessionResponse.class;
	}

}
