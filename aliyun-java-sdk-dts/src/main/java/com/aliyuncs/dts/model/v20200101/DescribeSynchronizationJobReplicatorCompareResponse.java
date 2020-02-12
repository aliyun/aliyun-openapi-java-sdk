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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeSynchronizationJobReplicatorCompareResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSynchronizationJobReplicatorCompareResponse extends AcsResponse {

	private String success;

	private String errCode;

	private String errMessage;

	private String requestId;

	private Boolean synchronizationReplicatorCompareEnable;

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSynchronizationReplicatorCompareEnable() {
		return this.synchronizationReplicatorCompareEnable;
	}

	public void setSynchronizationReplicatorCompareEnable(Boolean synchronizationReplicatorCompareEnable) {
		this.synchronizationReplicatorCompareEnable = synchronizationReplicatorCompareEnable;
	}

	@Override
	public DescribeSynchronizationJobReplicatorCompareResponse getInstance(UnmarshallerContext context) {
		return	DescribeSynchronizationJobReplicatorCompareResponseUnmarshaller.unmarshall(this, context);
	}
}
