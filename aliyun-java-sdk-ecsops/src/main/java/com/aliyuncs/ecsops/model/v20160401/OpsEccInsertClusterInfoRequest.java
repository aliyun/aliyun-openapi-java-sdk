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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsEccInsertClusterInfoRequest extends RpcAcsRequest<OpsEccInsertClusterInfoResponse> {
	   

	private String attributesContent;

	private String location;

	private String locationType;

	private String parentLocation;

	private String auditParamStr;
	public OpsEccInsertClusterInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsEccInsertClusterInfo", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAttributesContent() {
		return this.attributesContent;
	}

	public void setAttributesContent(String attributesContent) {
		this.attributesContent = attributesContent;
		if(attributesContent != null){
			putQueryParameter("AttributesContent", attributesContent);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
		}
	}

	public String getLocationType() {
		return this.locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
		if(locationType != null){
			putQueryParameter("LocationType", locationType);
		}
	}

	public String getParentLocation() {
		return this.parentLocation;
	}

	public void setParentLocation(String parentLocation) {
		this.parentLocation = parentLocation;
		if(parentLocation != null){
			putQueryParameter("ParentLocation", parentLocation);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsEccInsertClusterInfoResponse> getResponseClass() {
		return OpsEccInsertClusterInfoResponse.class;
	}

}
