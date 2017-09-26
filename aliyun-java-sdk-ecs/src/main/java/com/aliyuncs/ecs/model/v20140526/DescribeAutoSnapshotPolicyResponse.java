/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeAutoSnapshotPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoSnapshotPolicyResponse extends AcsResponse {

	private String requestId;

	private Integer autoSnapshotOccupation;

	private AutoSnapshotPolicy autoSnapshotPolicy;

	private AutoSnapshotExcutionStatus autoSnapshotExcutionStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAutoSnapshotOccupation() {
		return this.autoSnapshotOccupation;
	}

	public void setAutoSnapshotOccupation(Integer autoSnapshotOccupation) {
		this.autoSnapshotOccupation = autoSnapshotOccupation;
	}

	public AutoSnapshotPolicy getAutoSnapshotPolicy() {
		return this.autoSnapshotPolicy;
	}

	public void setAutoSnapshotPolicy(AutoSnapshotPolicy autoSnapshotPolicy) {
		this.autoSnapshotPolicy = autoSnapshotPolicy;
	}

	public AutoSnapshotExcutionStatus getAutoSnapshotExcutionStatus() {
		return this.autoSnapshotExcutionStatus;
	}

	public void setAutoSnapshotExcutionStatus(AutoSnapshotExcutionStatus autoSnapshotExcutionStatus) {
		this.autoSnapshotExcutionStatus = autoSnapshotExcutionStatus;
	}

	public static class AutoSnapshotPolicy {

		private String systemDiskPolicyEnabled;

		private String systemDiskPolicyTimePeriod;

		private String systemDiskPolicyRetentionDays;

		private String systemDiskPolicyRetentionLastWeek;

		private String dataDiskPolicyEnabled;

		private String dataDiskPolicyTimePeriod;

		private String dataDiskPolicyRetentionDays;

		private String dataDiskPolicyRetentionLastWeek;

		public String getSystemDiskPolicyEnabled() {
			return this.systemDiskPolicyEnabled;
		}

		public void setSystemDiskPolicyEnabled(String systemDiskPolicyEnabled) {
			this.systemDiskPolicyEnabled = systemDiskPolicyEnabled;
		}

		public String getSystemDiskPolicyTimePeriod() {
			return this.systemDiskPolicyTimePeriod;
		}

		public void setSystemDiskPolicyTimePeriod(String systemDiskPolicyTimePeriod) {
			this.systemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
		}

		public String getSystemDiskPolicyRetentionDays() {
			return this.systemDiskPolicyRetentionDays;
		}

		public void setSystemDiskPolicyRetentionDays(String systemDiskPolicyRetentionDays) {
			this.systemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
		}

		public String getSystemDiskPolicyRetentionLastWeek() {
			return this.systemDiskPolicyRetentionLastWeek;
		}

		public void setSystemDiskPolicyRetentionLastWeek(String systemDiskPolicyRetentionLastWeek) {
			this.systemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
		}

		public String getDataDiskPolicyEnabled() {
			return this.dataDiskPolicyEnabled;
		}

		public void setDataDiskPolicyEnabled(String dataDiskPolicyEnabled) {
			this.dataDiskPolicyEnabled = dataDiskPolicyEnabled;
		}

		public String getDataDiskPolicyTimePeriod() {
			return this.dataDiskPolicyTimePeriod;
		}

		public void setDataDiskPolicyTimePeriod(String dataDiskPolicyTimePeriod) {
			this.dataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
		}

		public String getDataDiskPolicyRetentionDays() {
			return this.dataDiskPolicyRetentionDays;
		}

		public void setDataDiskPolicyRetentionDays(String dataDiskPolicyRetentionDays) {
			this.dataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
		}

		public String getDataDiskPolicyRetentionLastWeek() {
			return this.dataDiskPolicyRetentionLastWeek;
		}

		public void setDataDiskPolicyRetentionLastWeek(String dataDiskPolicyRetentionLastWeek) {
			this.dataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
		}
	}

	public static class AutoSnapshotExcutionStatus {

		private String systemDiskExcutionStatus;

		private String dataDiskExcutionStatus;

		public String getSystemDiskExcutionStatus() {
			return this.systemDiskExcutionStatus;
		}

		public void setSystemDiskExcutionStatus(String systemDiskExcutionStatus) {
			this.systemDiskExcutionStatus = systemDiskExcutionStatus;
		}

		public String getDataDiskExcutionStatus() {
			return this.dataDiskExcutionStatus;
		}

		public void setDataDiskExcutionStatus(String dataDiskExcutionStatus) {
			this.dataDiskExcutionStatus = dataDiskExcutionStatus;
		}
	}

	@Override
	public DescribeAutoSnapshotPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoSnapshotPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
