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

package com.aliyuncs.sls.model.v20191023;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sls.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAlertHistoriesRequest extends RpcAcsRequest<GetAlertHistoriesResponse> {
	   

	private Integer line;

	private Integer toTs;

	private String endpoint;

	private String app;

	private Integer fromTs;

	private String projectName;

	private Integer offset;

	private String alertId;

	private String region;
	public GetAlertHistoriesRequest() {
		super("Sls", "2019-10-23", "GetAlertHistories");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getLine() {
		return this.line;
	}

	public void setLine(Integer line) {
		this.line = line;
		if(line != null){
			putBodyParameter("Line", line.toString());
		}
	}

	public Integer getToTs() {
		return this.toTs;
	}

	public void setToTs(Integer toTs) {
		this.toTs = toTs;
		if(toTs != null){
			putBodyParameter("ToTs", toTs.toString());
		}
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putBodyParameter("Endpoint", endpoint);
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

	public Integer getFromTs() {
		return this.fromTs;
	}

	public void setFromTs(Integer fromTs) {
		this.fromTs = fromTs;
		if(fromTs != null){
			putBodyParameter("FromTs", fromTs.toString());
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putBodyParameter("Offset", offset.toString());
		}
	}

	public String getAlertId() {
		return this.alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
		if(alertId != null){
			putBodyParameter("AlertId", alertId);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	@Override
	public Class<GetAlertHistoriesResponse> getResponseClass() {
		return GetAlertHistoriesResponse.class;
	}

}
