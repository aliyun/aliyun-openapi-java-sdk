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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryStoreSkuConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryStoreSkuConfigResponse extends AcsResponse {

	private String requestId;

	private String ebsCloudBoxConfigId;

	private String name;

	private String storageType;

	private String performanceLevel;

	private String machineType;

	private String productName;

	private Long minCapacity;

	private Long maxCapacity;

	private Long stepCapacity;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEbsCloudBoxConfigId() {
		return this.ebsCloudBoxConfigId;
	}

	public void setEbsCloudBoxConfigId(String ebsCloudBoxConfigId) {
		this.ebsCloudBoxConfigId = ebsCloudBoxConfigId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getPerformanceLevel() {
		return this.performanceLevel;
	}

	public void setPerformanceLevel(String performanceLevel) {
		this.performanceLevel = performanceLevel;
	}

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getMinCapacity() {
		return this.minCapacity;
	}

	public void setMinCapacity(Long minCapacity) {
		this.minCapacity = minCapacity;
	}

	public Long getMaxCapacity() {
		return this.maxCapacity;
	}

	public void setMaxCapacity(Long maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Long getStepCapacity() {
		return this.stepCapacity;
	}

	public void setStepCapacity(Long stepCapacity) {
		this.stepCapacity = stepCapacity;
	}

	@Override
	public OpsQueryStoreSkuConfigResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryStoreSkuConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
