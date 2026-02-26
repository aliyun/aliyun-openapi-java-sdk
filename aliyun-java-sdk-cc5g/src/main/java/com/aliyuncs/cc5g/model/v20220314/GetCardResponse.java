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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.GetCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCardResponse extends AcsResponse {

	private String requestId;

	private String iccid;

	private String netType;

	private String aPN;

	private String iSP;

	private String ipAddress;

	private String imsi;

	private String imei;

	private String lock;

	private String spec;

	private String simStatus;

	private String status;

	private String description;

	private String name;

	private String wirelessCloudConnectorId;

	private String cloudConnectorId;

	private Integer usageDataMonth;

	private String orderId;

	private String activatedTime;

	private String msisdn;

	private Long usageDataTotal;

	private Long limitThreshold;

	private Long stopThreshold;

	private Long alarmThreshold;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
	}

	public String getAPN() {
		return this.aPN;
	}

	public void setAPN(String aPN) {
		this.aPN = aPN;
	}

	public String getISP() {
		return this.iSP;
	}

	public void setISP(String iSP) {
		this.iSP = iSP;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getImsi() {
		return this.imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getLock() {
		return this.lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getSimStatus() {
		return this.simStatus;
	}

	public void setSimStatus(String simStatus) {
		this.simStatus = simStatus;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
	}

	public String getCloudConnectorId() {
		return this.cloudConnectorId;
	}

	public void setCloudConnectorId(String cloudConnectorId) {
		this.cloudConnectorId = cloudConnectorId;
	}

	public Integer getUsageDataMonth() {
		return this.usageDataMonth;
	}

	public void setUsageDataMonth(Integer usageDataMonth) {
		this.usageDataMonth = usageDataMonth;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getActivatedTime() {
		return this.activatedTime;
	}

	public void setActivatedTime(String activatedTime) {
		this.activatedTime = activatedTime;
	}

	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Long getUsageDataTotal() {
		return this.usageDataTotal;
	}

	public void setUsageDataTotal(Long usageDataTotal) {
		this.usageDataTotal = usageDataTotal;
	}

	public Long getLimitThreshold() {
		return this.limitThreshold;
	}

	public void setLimitThreshold(Long limitThreshold) {
		this.limitThreshold = limitThreshold;
	}

	public Long getStopThreshold() {
		return this.stopThreshold;
	}

	public void setStopThreshold(Long stopThreshold) {
		this.stopThreshold = stopThreshold;
	}

	public Long getAlarmThreshold() {
		return this.alarmThreshold;
	}

	public void setAlarmThreshold(Long alarmThreshold) {
		this.alarmThreshold = alarmThreshold;
	}

	@Override
	public GetCardResponse getInstance(UnmarshallerContext context) {
		return	GetCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
