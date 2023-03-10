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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreateDefaultVpcResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDefaultVpcResponse extends AcsResponse {

	private String vpcId;

	private String vRouterId;

	private String requestId;

	private String routeTableId;

	private List<DefaultVSwitch> defaultVSwitchs;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVRouterId() {
		return this.vRouterId;
	}

	public void setVRouterId(String vRouterId) {
		this.vRouterId = vRouterId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRouteTableId() {
		return this.routeTableId;
	}

	public void setRouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
	}

	public List<DefaultVSwitch> getDefaultVSwitchs() {
		return this.defaultVSwitchs;
	}

	public void setDefaultVSwitchs(List<DefaultVSwitch> defaultVSwitchs) {
		this.defaultVSwitchs = defaultVSwitchs;
	}

	public static class DefaultVSwitch {

		private String zoneId;

		private String vSwitchId;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}
	}

	@Override
	public CreateDefaultVpcResponse getInstance(UnmarshallerContext context) {
		return	CreateDefaultVpcResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
