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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeOssBucketInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssBucketInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Boolean isArchive;

	private Boolean isBackToResource;

	private Integer pollingInterval;

	private Boolean isSupportServerSideEncryption;

	private Boolean isFresh;

	private Long storageSize;

	private Boolean isVersioning;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getIsArchive() {
		return this.isArchive;
	}

	public void setIsArchive(Boolean isArchive) {
		this.isArchive = isArchive;
	}

	public Boolean getIsBackToResource() {
		return this.isBackToResource;
	}

	public void setIsBackToResource(Boolean isBackToResource) {
		this.isBackToResource = isBackToResource;
	}

	public Integer getPollingInterval() {
		return this.pollingInterval;
	}

	public void setPollingInterval(Integer pollingInterval) {
		this.pollingInterval = pollingInterval;
	}

	public Boolean getIsSupportServerSideEncryption() {
		return this.isSupportServerSideEncryption;
	}

	public void setIsSupportServerSideEncryption(Boolean isSupportServerSideEncryption) {
		this.isSupportServerSideEncryption = isSupportServerSideEncryption;
	}

	public Boolean getIsFresh() {
		return this.isFresh;
	}

	public void setIsFresh(Boolean isFresh) {
		this.isFresh = isFresh;
	}

	public Long getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
	}

	public Boolean getIsVersioning() {
		return this.isVersioning;
	}

	public void setIsVersioning(Boolean isVersioning) {
		this.isVersioning = isVersioning;
	}

	@Override
	public DescribeOssBucketInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssBucketInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
