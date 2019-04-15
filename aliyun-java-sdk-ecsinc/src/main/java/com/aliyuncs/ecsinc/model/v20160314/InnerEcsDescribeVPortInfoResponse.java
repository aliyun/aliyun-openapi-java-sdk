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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsDescribeVPortInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsDescribeVPortInfoResponse extends AcsResponse {

	private String requestId;

	private String vPortName;

	private String instanceId;

	private String eniType;

	private String vpcId;

	private String vSwitchId;

	private String eniStatus;

	private String eniNetworkType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVPortName() {
		return this.vPortName;
	}

	public void setVPortName(String vPortName) {
		this.vPortName = vPortName;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getEniType() {
		return this.eniType;
	}

	public void setEniType(String eniType) {
		this.eniType = eniType;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getEniStatus() {
		return this.eniStatus;
	}

	public void setEniStatus(String eniStatus) {
		this.eniStatus = eniStatus;
	}

	public String getEniNetworkType() {
		return this.eniNetworkType;
	}

	public void setEniNetworkType(String eniNetworkType) {
		this.eniNetworkType = eniNetworkType;
	}

	@Override
	public InnerEcsDescribeVPortInfoResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsDescribeVPortInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
