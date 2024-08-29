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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveAnnotationMissionTagInfoListRequest extends RpcAcsRequest<SaveAnnotationMissionTagInfoListResponse> {
	   

	private String instanceId;

	private String annotationMissionTagInfoListJsonString;

	private Boolean reset;

	private List<AnnotationMissionTagInfoList> annotationMissionTagInfoLists;
	public SaveAnnotationMissionTagInfoListRequest() {
		super("OutboundBot", "2019-12-26", "SaveAnnotationMissionTagInfoList", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAnnotationMissionTagInfoListJsonString() {
		return this.annotationMissionTagInfoListJsonString;
	}

	public void setAnnotationMissionTagInfoListJsonString(String annotationMissionTagInfoListJsonString) {
		this.annotationMissionTagInfoListJsonString = annotationMissionTagInfoListJsonString;
		if(annotationMissionTagInfoListJsonString != null){
			putQueryParameter("AnnotationMissionTagInfoListJsonString", annotationMissionTagInfoListJsonString);
		}
	}

	public Boolean getReset() {
		return this.reset;
	}

	public void setReset(Boolean reset) {
		this.reset = reset;
		if(reset != null){
			putQueryParameter("Reset", reset.toString());
		}
	}

	public List<AnnotationMissionTagInfoList> getAnnotationMissionTagInfoLists() {
		return this.annotationMissionTagInfoLists;
	}

	public void setAnnotationMissionTagInfoLists(List<AnnotationMissionTagInfoList> annotationMissionTagInfoLists) {
		this.annotationMissionTagInfoLists = annotationMissionTagInfoLists;	
		if (annotationMissionTagInfoLists != null) {
			for (int depth1 = 0; depth1 < annotationMissionTagInfoLists.size(); depth1++) {
				putQueryParameter("AnnotationMissionTagInfoList." + (depth1 + 1) + ".AnnotationMissionTagInfoId" , annotationMissionTagInfoLists.get(depth1).getAnnotationMissionTagInfoId());
				putQueryParameter("AnnotationMissionTagInfoList." + (depth1 + 1) + ".AnnotationMissionTagInfoName" , annotationMissionTagInfoLists.get(depth1).getAnnotationMissionTagInfoName());
				putQueryParameter("AnnotationMissionTagInfoList." + (depth1 + 1) + ".InstanceId" , annotationMissionTagInfoLists.get(depth1).getInstanceId());
				putQueryParameter("AnnotationMissionTagInfoList." + (depth1 + 1) + ".AnnotationMissionTagInfoDescription" , annotationMissionTagInfoLists.get(depth1).getAnnotationMissionTagInfoDescription());
				putQueryParameter("AnnotationMissionTagInfoList." + (depth1 + 1) + ".TenantId" , annotationMissionTagInfoLists.get(depth1).getTenantId());
				putQueryParameter("AnnotationMissionTagInfoList." + (depth1 + 1) + ".Delete" , annotationMissionTagInfoLists.get(depth1).getDelete());
			}
		}	
	}

	public static class AnnotationMissionTagInfoList {

		private String annotationMissionTagInfoId;

		private String annotationMissionTagInfoName;

		private String instanceId;

		private String annotationMissionTagInfoDescription;

		private String tenantId;

		private Boolean delete;

		public String getAnnotationMissionTagInfoId() {
			return this.annotationMissionTagInfoId;
		}

		public void setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
			this.annotationMissionTagInfoId = annotationMissionTagInfoId;
		}

		public String getAnnotationMissionTagInfoName() {
			return this.annotationMissionTagInfoName;
		}

		public void setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
			this.annotationMissionTagInfoName = annotationMissionTagInfoName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAnnotationMissionTagInfoDescription() {
			return this.annotationMissionTagInfoDescription;
		}

		public void setAnnotationMissionTagInfoDescription(String annotationMissionTagInfoDescription) {
			this.annotationMissionTagInfoDescription = annotationMissionTagInfoDescription;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Boolean getDelete() {
			return this.delete;
		}

		public void setDelete(Boolean delete) {
			this.delete = delete;
		}
	}

	@Override
	public Class<SaveAnnotationMissionTagInfoListResponse> getResponseClass() {
		return SaveAnnotationMissionTagInfoListResponse.class;
	}

}
