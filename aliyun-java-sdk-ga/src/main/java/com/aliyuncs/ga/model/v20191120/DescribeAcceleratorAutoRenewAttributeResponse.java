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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.DescribeAcceleratorAutoRenewAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAcceleratorAutoRenewAttributeResponse extends AcsResponse {

	private String acceleratorId;

	private Boolean autoRenew;

	private Integer autoRenewDuration;

	private String renewalStatus;

	private String requestId;

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
	}

	public Integer getAutoRenewDuration() {
		return this.autoRenewDuration;
	}

	public void setAutoRenewDuration(Integer autoRenewDuration) {
		this.autoRenewDuration = autoRenewDuration;
	}

	public String getRenewalStatus() {
		return this.renewalStatus;
	}

	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeAcceleratorAutoRenewAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAcceleratorAutoRenewAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
