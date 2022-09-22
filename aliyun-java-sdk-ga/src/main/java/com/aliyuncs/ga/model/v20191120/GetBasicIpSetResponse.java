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
import com.aliyuncs.ga.transform.v20191120.GetBasicIpSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBasicIpSetResponse extends AcsResponse {

	private String requestId;

	private String accelerateRegionId;

	private Integer bandwidth;

	private String ipSetId;

	private String ipAddress;

	private String acceleratorId;

	private String ipVersion;

	private String state;

	private String ispType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccelerateRegionId() {
		return this.accelerateRegionId;
	}

	public void setAccelerateRegionId(String accelerateRegionId) {
		this.accelerateRegionId = accelerateRegionId;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getIpSetId() {
		return this.ipSetId;
	}

	public void setIpSetId(String ipSetId) {
		this.ipSetId = ipSetId;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public String getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIspType() {
		return this.ispType;
	}

	public void setIspType(String ispType) {
		this.ispType = ispType;
	}

	@Override
	public GetBasicIpSetResponse getInstance(UnmarshallerContext context) {
		return	GetBasicIpSetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
