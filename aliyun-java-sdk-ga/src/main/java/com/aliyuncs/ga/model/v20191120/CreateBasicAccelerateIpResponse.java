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
import com.aliyuncs.ga.transform.v20191120.CreateBasicAccelerateIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateBasicAccelerateIpResponse extends AcsResponse {

	private String requestId;

	private String acceleratorId;

	private String ipSetId;

	private String accelerateIpId;

	private String accelerateIpAddress;

	private String state;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public String getIpSetId() {
		return this.ipSetId;
	}

	public void setIpSetId(String ipSetId) {
		this.ipSetId = ipSetId;
	}

	public String getAccelerateIpId() {
		return this.accelerateIpId;
	}

	public void setAccelerateIpId(String accelerateIpId) {
		this.accelerateIpId = accelerateIpId;
	}

	public String getAccelerateIpAddress() {
		return this.accelerateIpAddress;
	}

	public void setAccelerateIpAddress(String accelerateIpAddress) {
		this.accelerateIpAddress = accelerateIpAddress;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public CreateBasicAccelerateIpResponse getInstance(UnmarshallerContext context) {
		return	CreateBasicAccelerateIpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
