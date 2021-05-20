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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCdnDeliverTaskRequest extends RpcAcsRequest<UpdateCdnDeliverTaskResponse> {
	   

	private String reports;

	private String deliver;

	private Long deliverId;

	private String domainName;

	private Long ownerId;

	private String schedule;

	private String name;

	private String status;
	public UpdateCdnDeliverTaskRequest() {
		super("Cdn", "2018-05-10", "UpdateCdnDeliverTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReports() {
		return this.reports;
	}

	public void setReports(String reports) {
		this.reports = reports;
		if(reports != null){
			putBodyParameter("Reports", reports);
		}
	}

	public String getDeliver() {
		return this.deliver;
	}

	public void setDeliver(String deliver) {
		this.deliver = deliver;
		if(deliver != null){
			putBodyParameter("Deliver", deliver);
		}
	}

	public Long getDeliverId() {
		return this.deliverId;
	}

	public void setDeliverId(Long deliverId) {
		this.deliverId = deliverId;
		if(deliverId != null){
			putBodyParameter("DeliverId", deliverId.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
		if(schedule != null){
			putBodyParameter("Schedule", schedule);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<UpdateCdnDeliverTaskResponse> getResponseClass() {
		return UpdateCdnDeliverTaskResponse.class;
	}

}
