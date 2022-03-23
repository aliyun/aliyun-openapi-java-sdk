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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetUpgradeWorkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUpgradeWorkResponse extends AcsResponse {

	private Long modifiedTime;

	private String requestId;

	private String newSku;

	private Boolean success;

	private Long createTime;

	private Long workId;

	private String oldSku;

	private Integer workStatus;

	private String reason;

	public Long getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNewSku() {
		return this.newSku;
	}

	public void setNewSku(String newSku) {
		this.newSku = newSku;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getWorkId() {
		return this.workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	public String getOldSku() {
		return this.oldSku;
	}

	public void setOldSku(String oldSku) {
		this.oldSku = oldSku;
	}

	public Integer getWorkStatus() {
		return this.workStatus;
	}

	public void setWorkStatus(Integer workStatus) {
		this.workStatus = workStatus;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public GetUpgradeWorkResponse getInstance(UnmarshallerContext context) {
		return	GetUpgradeWorkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
