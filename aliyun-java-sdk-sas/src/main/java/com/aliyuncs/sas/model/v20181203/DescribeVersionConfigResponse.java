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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeVersionConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVersionConfigResponse extends AcsResponse {

	private String requestId;

	private Integer assetLevel;

	private Integer avdsFlag;

	private Long createTime;

	private Integer flag;

	private String instanceId;

	private Boolean isSasOpening;

	private Integer isTrialVersion;

	private Integer logCapacity;

	private Integer logTime;

	private Long releaseTime;

	private Integer sasLog;

	private Integer sasScreen;

	private Integer version;

	private Integer userDefinedAlarms;

	private Integer webLock;

	private Long webLockAuthCount;

	private Long appWhiteListAuthCount;

	private Integer appWhiteList;

	private Long slsCapacity;

	private Boolean isOverBalance;

	private Long lastTrailEndTime;

	private Long honeypotCapacity;

	private Long imageScanCapacity;

	private Integer vmCores;

	private Boolean isPaidUser;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAssetLevel() {
		return this.assetLevel;
	}

	public void setAssetLevel(Integer assetLevel) {
		this.assetLevel = assetLevel;
	}

	public Integer getAvdsFlag() {
		return this.avdsFlag;
	}

	public void setAvdsFlag(Integer avdsFlag) {
		this.avdsFlag = avdsFlag;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Boolean getIsSasOpening() {
		return this.isSasOpening;
	}

	public void setIsSasOpening(Boolean isSasOpening) {
		this.isSasOpening = isSasOpening;
	}

	public Integer getIsTrialVersion() {
		return this.isTrialVersion;
	}

	public void setIsTrialVersion(Integer isTrialVersion) {
		this.isTrialVersion = isTrialVersion;
	}

	public Integer getLogCapacity() {
		return this.logCapacity;
	}

	public void setLogCapacity(Integer logCapacity) {
		this.logCapacity = logCapacity;
	}

	public Integer getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Integer logTime) {
		this.logTime = logTime;
	}

	public Long getReleaseTime() {
		return this.releaseTime;
	}

	public void setReleaseTime(Long releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Integer getSasLog() {
		return this.sasLog;
	}

	public void setSasLog(Integer sasLog) {
		this.sasLog = sasLog;
	}

	public Integer getSasScreen() {
		return this.sasScreen;
	}

	public void setSasScreen(Integer sasScreen) {
		this.sasScreen = sasScreen;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getUserDefinedAlarms() {
		return this.userDefinedAlarms;
	}

	public void setUserDefinedAlarms(Integer userDefinedAlarms) {
		this.userDefinedAlarms = userDefinedAlarms;
	}

	public Integer getWebLock() {
		return this.webLock;
	}

	public void setWebLock(Integer webLock) {
		this.webLock = webLock;
	}

	public Long getWebLockAuthCount() {
		return this.webLockAuthCount;
	}

	public void setWebLockAuthCount(Long webLockAuthCount) {
		this.webLockAuthCount = webLockAuthCount;
	}

	public Long getAppWhiteListAuthCount() {
		return this.appWhiteListAuthCount;
	}

	public void setAppWhiteListAuthCount(Long appWhiteListAuthCount) {
		this.appWhiteListAuthCount = appWhiteListAuthCount;
	}

	public Integer getAppWhiteList() {
		return this.appWhiteList;
	}

	public void setAppWhiteList(Integer appWhiteList) {
		this.appWhiteList = appWhiteList;
	}

	public Long getSlsCapacity() {
		return this.slsCapacity;
	}

	public void setSlsCapacity(Long slsCapacity) {
		this.slsCapacity = slsCapacity;
	}

	public Boolean getIsOverBalance() {
		return this.isOverBalance;
	}

	public void setIsOverBalance(Boolean isOverBalance) {
		this.isOverBalance = isOverBalance;
	}

	public Long getLastTrailEndTime() {
		return this.lastTrailEndTime;
	}

	public void setLastTrailEndTime(Long lastTrailEndTime) {
		this.lastTrailEndTime = lastTrailEndTime;
	}

	public Long getHoneypotCapacity() {
		return this.honeypotCapacity;
	}

	public void setHoneypotCapacity(Long honeypotCapacity) {
		this.honeypotCapacity = honeypotCapacity;
	}

	public Long getImageScanCapacity() {
		return this.imageScanCapacity;
	}

	public void setImageScanCapacity(Long imageScanCapacity) {
		this.imageScanCapacity = imageScanCapacity;
	}

	public Integer getVmCores() {
		return this.vmCores;
	}

	public void setVmCores(Integer vmCores) {
		this.vmCores = vmCores;
	}

	public Boolean getIsPaidUser() {
		return this.isPaidUser;
	}

	public void setIsPaidUser(Boolean isPaidUser) {
		this.isPaidUser = isPaidUser;
	}

	@Override
	public DescribeVersionConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeVersionConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
