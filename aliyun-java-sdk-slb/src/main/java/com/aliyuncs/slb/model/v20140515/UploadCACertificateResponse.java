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
package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.UploadCACertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadCACertificateResponse extends AcsResponse {

	private String requestId;

	private String cACertificateId;

	private String cACertificateName;

	private String fingerprint;

	private String resourceGroupId;

	private String createTime;

	private Long createTimeStamp;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCACertificateId() {
		return this.cACertificateId;
	}

	public void setCACertificateId(String cACertificateId) {
		this.cACertificateId = cACertificateId;
	}

	public String getCACertificateName() {
		return this.cACertificateName;
	}

	public void setCACertificateName(String cACertificateName) {
		this.cACertificateName = cACertificateName;
	}

	public String getFingerprint() {
		return this.fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getCreateTimeStamp() {
		return this.createTimeStamp;
	}

	public void setCreateTimeStamp(Long createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	@Override
	public UploadCACertificateResponse getInstance(UnmarshallerContext context) {
		return	UploadCACertificateResponseUnmarshaller.unmarshall(this, context);
	}
}
