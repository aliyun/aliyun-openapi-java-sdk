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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCapacityReservationPackageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCapacityReservationPackageResponse extends AcsResponse {

	private String endDateType;

	private String regionNo;

	private String description;

	private String platform;

	private String packageName;

	private String gmtModified;

	private Integer availableAmount;

	private String capacityReservationName;

	private String timeSlot;

	private String packageStatus;

	private String packageChargeType;

	private Integer businessStatus;

	private String occurrenceDays;

	private Integer packageTotalTimes;

	private String startDate;

	private String izNo;

	private Integer frequencyInterval;

	private String networkType;

	private Integer packageTotalAmount;

	private String packageType;

	private String bid;

	private String instanceType;

	private String packageStartTime;

	private String packageEndTime;

	private String status;

	private String requestId;

	private String packageMatchCriteria;

	private String instanceId;

	private String riStatus;

	private Integer totalAmount;

	private String endDate;

	private String capacityReservationId;

	private Long izId;

	private String type;

	private String gmtCreate;

	private String riId;

	private String frequency;

	private Integer packageUsedTimes;

	private String gmtRelease;

	private String packageId;

	private Long regionId;

	private Long id;

	private String instanceMatchCriteria;

	private Integer packageUsedAmount;

	private Long aliUid;

	public String getEndDateType() {
		return this.endDateType;
	}

	public void setEndDateType(String endDateType) {
		this.endDateType = endDateType;
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Integer getAvailableAmount() {
		return this.availableAmount;
	}

	public void setAvailableAmount(Integer availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getCapacityReservationName() {
		return this.capacityReservationName;
	}

	public void setCapacityReservationName(String capacityReservationName) {
		this.capacityReservationName = capacityReservationName;
	}

	public String getTimeSlot() {
		return this.timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getPackageStatus() {
		return this.packageStatus;
	}

	public void setPackageStatus(String packageStatus) {
		this.packageStatus = packageStatus;
	}

	public String getPackageChargeType() {
		return this.packageChargeType;
	}

	public void setPackageChargeType(String packageChargeType) {
		this.packageChargeType = packageChargeType;
	}

	public Integer getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(Integer businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getOccurrenceDays() {
		return this.occurrenceDays;
	}

	public void setOccurrenceDays(String occurrenceDays) {
		this.occurrenceDays = occurrenceDays;
	}

	public Integer getPackageTotalTimes() {
		return this.packageTotalTimes;
	}

	public void setPackageTotalTimes(Integer packageTotalTimes) {
		this.packageTotalTimes = packageTotalTimes;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
	}

	public Integer getFrequencyInterval() {
		return this.frequencyInterval;
	}

	public void setFrequencyInterval(Integer frequencyInterval) {
		this.frequencyInterval = frequencyInterval;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public Integer getPackageTotalAmount() {
		return this.packageTotalAmount;
	}

	public void setPackageTotalAmount(Integer packageTotalAmount) {
		this.packageTotalAmount = packageTotalAmount;
	}

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getPackageStartTime() {
		return this.packageStartTime;
	}

	public void setPackageStartTime(String packageStartTime) {
		this.packageStartTime = packageStartTime;
	}

	public String getPackageEndTime() {
		return this.packageEndTime;
	}

	public void setPackageEndTime(String packageEndTime) {
		this.packageEndTime = packageEndTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPackageMatchCriteria() {
		return this.packageMatchCriteria;
	}

	public void setPackageMatchCriteria(String packageMatchCriteria) {
		this.packageMatchCriteria = packageMatchCriteria;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getRiStatus() {
		return this.riStatus;
	}

	public void setRiStatus(String riStatus) {
		this.riStatus = riStatus;
	}

	public Integer getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCapacityReservationId() {
		return this.capacityReservationId;
	}

	public void setCapacityReservationId(String capacityReservationId) {
		this.capacityReservationId = capacityReservationId;
	}

	public Long getIzId() {
		return this.izId;
	}

	public void setIzId(Long izId) {
		this.izId = izId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getRiId() {
		return this.riId;
	}

	public void setRiId(String riId) {
		this.riId = riId;
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public Integer getPackageUsedTimes() {
		return this.packageUsedTimes;
	}

	public void setPackageUsedTimes(Integer packageUsedTimes) {
		this.packageUsedTimes = packageUsedTimes;
	}

	public String getGmtRelease() {
		return this.gmtRelease;
	}

	public void setGmtRelease(String gmtRelease) {
		this.gmtRelease = gmtRelease;
	}

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public Long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInstanceMatchCriteria() {
		return this.instanceMatchCriteria;
	}

	public void setInstanceMatchCriteria(String instanceMatchCriteria) {
		this.instanceMatchCriteria = instanceMatchCriteria;
	}

	public Integer getPackageUsedAmount() {
		return this.packageUsedAmount;
	}

	public void setPackageUsedAmount(Integer packageUsedAmount) {
		this.packageUsedAmount = packageUsedAmount;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	@Override
	public OpsDescribeCapacityReservationPackageResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCapacityReservationPackageResponseUnmarshaller.unmarshall(this, context);
	}
}
