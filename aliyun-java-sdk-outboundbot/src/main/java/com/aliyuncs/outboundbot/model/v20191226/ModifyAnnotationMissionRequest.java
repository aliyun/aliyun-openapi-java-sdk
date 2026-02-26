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
public class ModifyAnnotationMissionRequest extends RpcAcsRequest<ModifyAnnotationMissionResponse> {
	   

	private Integer annotationStatus;

	private Boolean delete;

	private String annotationMissionId;

	private String annotationMissionName;
	public ModifyAnnotationMissionRequest() {
		super("OutboundBot", "2019-12-26", "ModifyAnnotationMission", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAnnotationStatus() {
		return this.annotationStatus;
	}

	public void setAnnotationStatus(Integer annotationStatus) {
		this.annotationStatus = annotationStatus;
		if(annotationStatus != null){
			putQueryParameter("AnnotationStatus", annotationStatus.toString());
		}
	}

	public Boolean getDelete() {
		return this.delete;
	}

	public void setDelete(Boolean delete) {
		this.delete = delete;
		if(delete != null){
			putQueryParameter("Delete", delete.toString());
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

	public String getAnnotationMissionName() {
		return this.annotationMissionName;
	}

	public void setAnnotationMissionName(String annotationMissionName) {
		this.annotationMissionName = annotationMissionName;
		if(annotationMissionName != null){
			putQueryParameter("AnnotationMissionName", annotationMissionName);
		}
	}

	@Override
	public Class<ModifyAnnotationMissionResponse> getResponseClass() {
		return ModifyAnnotationMissionResponse.class;
	}

}
