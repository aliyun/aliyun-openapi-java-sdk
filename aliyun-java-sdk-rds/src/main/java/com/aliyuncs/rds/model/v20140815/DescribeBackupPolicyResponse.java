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

	private String archiveBackupKeepCount;

	private String archiveBackupKeepPolicy;

	private String archiveBackupRetentionPeriod;

	private String backupInterval;

	private String backupLog;

	private String backupMethod;

	private Integer backupPriority;

	private Integer backupRetentionPeriod;

	private String category;

	private String compressType;

	private String duplication;

	private String duplicationContent;

	private String enableBackupLog;

	private Boolean enableIncrementDataBackup;

	private Boolean enablePitrProtection;

	private String highSpaceUsageProtection;

	private Integer localLogRetentionHours;

	private String localLogRetentionSpace;

	private String logBackupFrequency;

	private Integer logBackupLocalRetentionNumber;

	private Integer logBackupRetentionPeriod;

	private Integer pitrRetentionPeriod;

	private String preferredBackupPeriod;

	private String preferredBackupTime;

	private String preferredNextBackupTime;

	private String releasedKeepPolicy;

	private String requestId;

	private Boolean supportModifyBackupPriority;

	private Integer supportReleasedKeep;

	private Integer supportVolumeShadowCopy;

	private Long supportsHighFrequencyBackup;

	private DuplicationLocation duplicationLocation;

	public String getArchiveBackupKeepCount() {
		return this.archiveBackupKeepCount;
	}

	public void setArchiveBackupKeepCount(String archiveBackupKeepCount) {
		this.archiveBackupKeepCount = archiveBackupKeepCount;
	}

	public String getArchiveBackupKeepPolicy() {
		return this.archiveBackupKeepPolicy;
	}

	public void setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
		this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
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

	public String getBackupLog() {
		return this.backupLog;
	}

	public void setBackupLog(String backupLog) {
		this.backupLog = backupLog;
	}

	public String getBackupMethod() {
		return this.backupMethod;
	}

	public void setBackupMethod(String backupMethod) {
		this.backupMethod = backupMethod;
	}

	public Integer getBackupPriority() {
		return this.backupPriority;
	}

	public void setBackupPriority(Integer backupPriority) {
		this.backupPriority = backupPriority;
	}

	public Integer getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompressType() {
		return this.compressType;
	}

	public void setCompressType(String compressType) {
		this.compressType = compressType;
	}

	public String getDuplication() {
		return this.duplication;
	}

	public void setDuplication(String duplication) {
		this.duplication = duplication;
	}

	public String getDuplicationContent() {
		return this.duplicationContent;
	}

	public void setDuplicationContent(String duplicationContent) {
		this.duplicationContent = duplicationContent;
	}

	public String getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(String enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
	}

	public Boolean getEnableIncrementDataBackup() {
		return this.enableIncrementDataBackup;
	}

	public void setEnableIncrementDataBackup(Boolean enableIncrementDataBackup) {
		this.enableIncrementDataBackup = enableIncrementDataBackup;
	}

	public Boolean getEnablePitrProtection() {
		return this.enablePitrProtection;
	}

	public void setEnablePitrProtection(Boolean enablePitrProtection) {
		this.enablePitrProtection = enablePitrProtection;
	}

	public String getHighSpaceUsageProtection() {
		return this.highSpaceUsageProtection;
	}

	public void setHighSpaceUsageProtection(String highSpaceUsageProtection) {
		this.highSpaceUsageProtection = highSpaceUsageProtection;
	}

	public Integer getLocalLogRetentionHours() {
		return this.localLogRetentionHours;
	}

	public void setLocalLogRetentionHours(Integer localLogRetentionHours) {
		this.localLogRetentionHours = localLogRetentionHours;
	}

	public String getLocalLogRetentionSpace() {
		return this.localLogRetentionSpace;
	}

	public void setLocalLogRetentionSpace(String localLogRetentionSpace) {
		this.localLogRetentionSpace = localLogRetentionSpace;
	}

	public String getLogBackupFrequency() {
		return this.logBackupFrequency;
	}

	public void setLogBackupFrequency(String logBackupFrequency) {
		this.logBackupFrequency = logBackupFrequency;
	}

	public Integer getLogBackupLocalRetentionNumber() {
		return this.logBackupLocalRetentionNumber;
	}

	public void setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
		this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
	}

	public Integer getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
	}

	public Integer getPitrRetentionPeriod() {
		return this.pitrRetentionPeriod;
	}

	public void setPitrRetentionPeriod(Integer pitrRetentionPeriod) {
		this.pitrRetentionPeriod = pitrRetentionPeriod;
	}

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
	}

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
	}

	public String getPreferredNextBackupTime() {
		return this.preferredNextBackupTime;
	}

	public void setPreferredNextBackupTime(String preferredNextBackupTime) {
		this.preferredNextBackupTime = preferredNextBackupTime;
	}

	public String getReleasedKeepPolicy() {
		return this.releasedKeepPolicy;
	}

	public void setReleasedKeepPolicy(String releasedKeepPolicy) {
		this.releasedKeepPolicy = releasedKeepPolicy;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSupportModifyBackupPriority() {
		return this.supportModifyBackupPriority;
	}

	public void setSupportModifyBackupPriority(Boolean supportModifyBackupPriority) {
		this.supportModifyBackupPriority = supportModifyBackupPriority;
	}

	public Integer getSupportReleasedKeep() {
		return this.supportReleasedKeep;
	}

	public void setSupportReleasedKeep(Integer supportReleasedKeep) {
		this.supportReleasedKeep = supportReleasedKeep;
	}

	public Integer getSupportVolumeShadowCopy() {
		return this.supportVolumeShadowCopy;
	}

	public void setSupportVolumeShadowCopy(Integer supportVolumeShadowCopy) {
		this.supportVolumeShadowCopy = supportVolumeShadowCopy;
	}

	public Long getSupportsHighFrequencyBackup() {
		return this.supportsHighFrequencyBackup;
	}

	public void setSupportsHighFrequencyBackup(Long supportsHighFrequencyBackup) {
		this.supportsHighFrequencyBackup = supportsHighFrequencyBackup;
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
