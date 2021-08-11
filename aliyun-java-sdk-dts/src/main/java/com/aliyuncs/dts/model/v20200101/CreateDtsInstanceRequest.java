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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDtsInstanceRequest extends RpcAcsRequest<CreateDtsInstanceResponse> {
	   

	private Boolean autoStart;

	private String type;

	private String instanceClass;

	private Integer databaseCount;

	private String jobId;

	private Integer computeUnit;

	private String destinationRegion;

	private String period;

	private String destinationEndpointEngineName;

	private Integer quantity;

	private Boolean autoPay;

	private Integer usedTime;

	private String syncArchitecture;

	private String payType;

	private String sourceRegion;

	private String sourceEndpointEngineName;
	public CreateDtsInstanceRequest() {
		super("Dts", "2020-01-01", "CreateDtsInstance", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoStart() {
		return this.autoStart;
	}

	public void setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
		if(autoStart != null){
			putQueryParameter("AutoStart", autoStart.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putQueryParameter("InstanceClass", instanceClass);
		}
	}

	public Integer getDatabaseCount() {
		return this.databaseCount;
	}

	public void setDatabaseCount(Integer databaseCount) {
		this.databaseCount = databaseCount;
		if(databaseCount != null){
			putQueryParameter("DatabaseCount", databaseCount.toString());
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public Integer getComputeUnit() {
		return this.computeUnit;
	}

	public void setComputeUnit(Integer computeUnit) {
		this.computeUnit = computeUnit;
		if(computeUnit != null){
			putQueryParameter("ComputeUnit", computeUnit.toString());
		}
	}

	public String getDestinationRegion() {
		return this.destinationRegion;
	}

	public void setDestinationRegion(String destinationRegion) {
		this.destinationRegion = destinationRegion;
		if(destinationRegion != null){
			putQueryParameter("DestinationRegion", destinationRegion);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getDestinationEndpointEngineName() {
		return this.destinationEndpointEngineName;
	}

	public void setDestinationEndpointEngineName(String destinationEndpointEngineName) {
		this.destinationEndpointEngineName = destinationEndpointEngineName;
		if(destinationEndpointEngineName != null){
			putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
		}
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Integer getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Integer usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime.toString());
		}
	}

	public String getSyncArchitecture() {
		return this.syncArchitecture;
	}

	public void setSyncArchitecture(String syncArchitecture) {
		this.syncArchitecture = syncArchitecture;
		if(syncArchitecture != null){
			putQueryParameter("SyncArchitecture", syncArchitecture);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getSourceRegion() {
		return this.sourceRegion;
	}

	public void setSourceRegion(String sourceRegion) {
		this.sourceRegion = sourceRegion;
		if(sourceRegion != null){
			putQueryParameter("SourceRegion", sourceRegion);
		}
	}

	public String getSourceEndpointEngineName() {
		return this.sourceEndpointEngineName;
	}

	public void setSourceEndpointEngineName(String sourceEndpointEngineName) {
		this.sourceEndpointEngineName = sourceEndpointEngineName;
		if(sourceEndpointEngineName != null){
			putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
		}
	}

	@Override
	public Class<CreateDtsInstanceResponse> getResponseClass() {
		return CreateDtsInstanceResponse.class;
	}

}
