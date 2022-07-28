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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeResourceDLinkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceDLinkResponse extends AcsResponse {

	private String requestId;

	private String vpcId;

	private String vSwitchId;

	private String securityGroupId;

	private String destinationCIDRs;

	private List<String> auxVSwitchList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getDestinationCIDRs() {
		return this.destinationCIDRs;
	}

	public void setDestinationCIDRs(String destinationCIDRs) {
		this.destinationCIDRs = destinationCIDRs;
	}

	public List<String> getAuxVSwitchList() {
		return this.auxVSwitchList;
	}

	public void setAuxVSwitchList(List<String> auxVSwitchList) {
		this.auxVSwitchList = auxVSwitchList;
	}

	@Override
	public DescribeResourceDLinkResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceDLinkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
