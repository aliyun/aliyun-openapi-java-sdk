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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeCdnServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnServiceResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String internetChargeType;

	private String openingTime;

	private String changingChargeType;

	private String changingAffectTime;

	private List<LockReason> operationLocks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public String getOpeningTime() {
		return this.openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getChangingChargeType() {
		return this.changingChargeType;
	}

	public void setChangingChargeType(String changingChargeType) {
		this.changingChargeType = changingChargeType;
	}

	public String getChangingAffectTime() {
		return this.changingAffectTime;
	}

	public void setChangingAffectTime(String changingAffectTime) {
		this.changingAffectTime = changingAffectTime;
	}

	public List<LockReason> getOperationLocks() {
		return this.operationLocks;
	}

	public void setOperationLocks(List<LockReason> operationLocks) {
		this.operationLocks = operationLocks;
	}

	public static class LockReason {

		private String lockReason;

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}
	}

	@Override
	public DescribeCdnServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
