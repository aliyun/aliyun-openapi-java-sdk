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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPolicyResponse extends AcsResponse {

	private Integer logBackupRetentionPeriod;

	private String archiveBackupKeepPolicy;

	private String archiveBackupKeepCount;

	private Integer localLogRetentionHours;

	private Integer backupRetentionPeriod;

	private String requestId;

	private String preferredBackupPeriod;

	private String compressType;

	private Integer supportReleasedKeep;

	private String localLogRetentionSpace;

	private Integer supportVolumeShadowCopy;

	private String backupMethod;

	private String logBackupFrequency;

	private String preferredNextBackupTime;

	private String highSpaceUsageProtection;

	private String duplicationContent;

	private String archiveBackupRetentionPeriod;

	private String backupInterval;

	private String releasedKeepPolicy;

	private String preferredBackupTime;

	private String duplication;

	private Integer logBackupLocalRetentionNumber;

	private String category;

	private String enableBackupLog;

	private String backupLog;

	private Boolean enableIncrementDataBackup;

	private DuplicationLocation duplicationLocation;

	public Integer getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
	}

	public String getArchiveBackupKeepPolicy() {
		return this.archiveBackupKeepPolicy;
	}

	public void setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
		this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
	}

	public String getArchiveBackupKeepCount() {
		return this.archiveBackupKeepCount;
	}

	public void setArchiveBackupKeepCount(String archiveBackupKeepCount) {
		this.archiveBackupKeepCount = archiveBackupKeepCount;
	}

	public Integer getLocalLogRetentionHours() {
		return this.localLogRetentionHours;
	}

	public void setLocalLogRetentionHours(Integer localLogRetentionHours) {
		this.localLogRetentionHours = localLogRetentionHours;
	}

	public Integer getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
	}

	public String getCompressType() {
		return this.compressType;
	}

	public void setCompressType(String compressType) {
		this.compressType = compressType;
	}

	public Integer getSupportReleasedKeep() {
		return this.supportReleasedKeep;
	}

	public void setSupportReleasedKeep(Integer supportReleasedKeep) {
		this.supportReleasedKeep = supportReleasedKeep;
	}

	public String getLocalLogRetentionSpace() {
		return this.localLogRetentionSpace;
	}

	public void setLocalLogRetentionSpace(String localLogRetentionSpace) {
		this.localLogRetentionSpace = localLogRetentionSpace;
	}

	public Integer getSupportVolumeShadowCopy() {
		return this.supportVolumeShadowCopy;
	}

	public void setSupportVolumeShadowCopy(Integer supportVolumeShadowCopy) {
		this.supportVolumeShadowCopy = supportVolumeShadowCopy;
	}

	public String getBackupMethod() {
		return this.backupMethod;
	}

	public void setBackupMethod(String backupMethod) {
		this.backupMethod = backupMethod;
	}

	public String getLogBackupFrequency() {
		return this.logBackupFrequency;
	}

	public void setLogBackupFrequency(String logBackupFrequency) {
		this.logBackupFrequency = logBackupFrequency;
	}

	public String getPreferredNextBackupTime() {
		return this.preferredNextBackupTime;
	}

	public void setPreferredNextBackupTime(String preferredNextBackupTime) {
		this.preferredNextBackupTime = preferredNextBackupTime;
	}

	public String getHighSpaceUsageProtection() {
		return this.highSpaceUsageProtection;
	}

	public void setHighSpaceUsageProtection(String highSpaceUsageProtection) {
		this.highSpaceUsageProtection = highSpaceUsageProtection;
	}

	public String getDuplicationContent() {
		return this.duplicationContent;
	}

	public void setDuplicationContent(String duplicationContent) {
		this.duplicationContent = duplicationContent;
	}

	public String getArchiveBackupRetentionPeriod() {
		return this.archiveBackupRetentionPeriod;
	}

	public void setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
		this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
	}

	public String getBackupInterval() {
		return this.backupInterval;
	}

	public void setBackupInterval(String backupInterval) {
		this.backupInterval = backupInterval;
	}

	public String getReleasedKeepPolicy() {
		return this.releasedKeepPolicy;
	}

	public void setReleasedKeepPolicy(String releasedKeepPolicy) {
		this.releasedKeepPolicy = releasedKeepPolicy;
	}

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
	}

	public String getDuplication() {
		return this.duplication;
	}

	public void setDuplication(String duplication) {
		this.duplication = duplication;
	}

	public Integer getLogBackupLocalRetentionNumber() {
		return this.logBackupLocalRetentionNumber;
	}

	public void setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
		this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(String enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
	}

	public String getBackupLog() {
		return this.backupLog;
	}

	public void setBackupLog(String backupLog) {
		this.backupLog = backupLog;
	}

	public Boolean getEnableIncrementDataBackup() {
		return this.enableIncrementDataBackup;
	}

	public void setEnableIncrementDataBackup(Boolean enableIncrementDataBackup) {
		this.enableIncrementDataBackup = enableIncrementDataBackup;
	}

	public DuplicationLocation getDuplicationLocation() {
		return this.duplicationLocation;
	}

	public void setDuplicationLocation(DuplicationLocation duplicationLocation) {
		this.duplicationLocation = duplicationLocation;
	}

	public static class DuplicationLocation {

		private String sotrage;

		private Location location;

		public String getSotrage() {
			return this.sotrage;
		}

		public void setSotrage(String sotrage) {
			this.sotrage = sotrage;
		}

		public Location getLocation() {
			return this.location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}

		public static class Location {

			private String bucket;

			private String endpoint;

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}
		}
	}

	@Override
	public DescribeBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
