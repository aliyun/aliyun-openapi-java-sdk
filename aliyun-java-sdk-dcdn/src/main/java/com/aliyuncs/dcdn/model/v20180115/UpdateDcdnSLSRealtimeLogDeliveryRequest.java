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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDcdnSLSRealtimeLogDeliveryRequest extends RpcAcsRequest<UpdateDcdnSLSRealtimeLogDeliveryResponse> {
	   

	private String sLSLogStore;

	private String sLSProject;

	private String sLSRegion;

	private String projectName;

	private String domainName;

	private String samplingRate;

	private String dataCenter;

	private Long ownerId;
	public UpdateDcdnSLSRealtimeLogDeliveryRequest() {
		super("dcdn", "2018-01-15", "UpdateDcdnSLSRealtimeLogDelivery");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSLSLogStore() {
		return this.sLSLogStore;
	}

	public void setSLSLogStore(String sLSLogStore) {
		this.sLSLogStore = sLSLogStore;
		if(sLSLogStore != null){
			putBodyParameter("SLSLogStore", sLSLogStore);
		}
	}

	public String getSLSProject() {
		return this.sLSProject;
	}

	public void setSLSProject(String sLSProject) {
		this.sLSProject = sLSProject;
		if(sLSProject != null){
			putBodyParameter("SLSProject", sLSProject);
		}
	}

	public String getSLSRegion() {
		return this.sLSRegion;
	}

	public void setSLSRegion(String sLSRegion) {
		this.sLSRegion = sLSRegion;
		if(sLSRegion != null){
			putBodyParameter("SLSRegion", sLSRegion);
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	public String getSamplingRate() {
		return this.samplingRate;
	}

	public void setSamplingRate(String samplingRate) {
		this.samplingRate = samplingRate;
		if(samplingRate != null){
			putBodyParameter("SamplingRate", samplingRate);
		}
	}

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
		if(dataCenter != null){
			putBodyParameter("DataCenter", dataCenter);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<UpdateDcdnSLSRealtimeLogDeliveryResponse> getResponseClass() {
		return UpdateDcdnSLSRealtimeLogDeliveryResponse.class;
	}

}
