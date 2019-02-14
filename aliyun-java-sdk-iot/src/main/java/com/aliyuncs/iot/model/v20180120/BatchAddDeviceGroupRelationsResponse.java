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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.BatchAddDeviceGroupRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchAddDeviceGroupRelationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private Integer validDeviceCount;

	private Integer exceedTenGroupDeviceCount;

	private Integer alreadyRelatedGroupDeviceCount;

	private Integer successAddedDeviceCount;

	private String errorMessage;

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

	public Integer getValidDeviceCount() {
		return this.validDeviceCount;
	}

	public void setValidDeviceCount(Integer validDeviceCount) {
		this.validDeviceCount = validDeviceCount;
	}

	public Integer getExceedTenGroupDeviceCount() {
		return this.exceedTenGroupDeviceCount;
	}

	public void setExceedTenGroupDeviceCount(Integer exceedTenGroupDeviceCount) {
		this.exceedTenGroupDeviceCount = exceedTenGroupDeviceCount;
	}

	public Integer getAlreadyRelatedGroupDeviceCount() {
		return this.alreadyRelatedGroupDeviceCount;
	}

	public void setAlreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
		this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
	}

	public Integer getSuccessAddedDeviceCount() {
		return this.successAddedDeviceCount;
	}

	public void setSuccessAddedDeviceCount(Integer successAddedDeviceCount) {
		this.successAddedDeviceCount = successAddedDeviceCount;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public BatchAddDeviceGroupRelationsResponse getInstance(UnmarshallerContext context) {
		return	BatchAddDeviceGroupRelationsResponseUnmarshaller.unmarshall(this, context);
	}
}
