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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.ListSmartAGByAccessPointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSmartAGByAccessPointResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<SmartAccessGateway> smartAccessGateways;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SmartAccessGateway> getSmartAccessGateways() {
		return this.smartAccessGateways;
	}

	public void setSmartAccessGateways(List<SmartAccessGateway> smartAccessGateways) {
		this.smartAccessGateways = smartAccessGateways;
	}

	public static class SmartAccessGateway {

		private String routingStrategy;

		private String smartAGName;

		private String smartAGId;

		private String smartAGStatus;

		private String smartAGDescription;

		private String associatedCcnId;

		private String hardwareVersion;

		public String getRoutingStrategy() {
			return this.routingStrategy;
		}

		public void setRoutingStrategy(String routingStrategy) {
			this.routingStrategy = routingStrategy;
		}

		public String getSmartAGName() {
			return this.smartAGName;
		}

		public void setSmartAGName(String smartAGName) {
			this.smartAGName = smartAGName;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}

		public String getSmartAGStatus() {
			return this.smartAGStatus;
		}

		public void setSmartAGStatus(String smartAGStatus) {
			this.smartAGStatus = smartAGStatus;
		}

		public String getSmartAGDescription() {
			return this.smartAGDescription;
		}

		public void setSmartAGDescription(String smartAGDescription) {
			this.smartAGDescription = smartAGDescription;
		}

		public String getAssociatedCcnId() {
			return this.associatedCcnId;
		}

		public void setAssociatedCcnId(String associatedCcnId) {
			this.associatedCcnId = associatedCcnId;
		}

		public String getHardwareVersion() {
			return this.hardwareVersion;
		}

		public void setHardwareVersion(String hardwareVersion) {
			this.hardwareVersion = hardwareVersion;
		}
	}

	@Override
	public ListSmartAGByAccessPointResponse getInstance(UnmarshallerContext context) {
		return	ListSmartAGByAccessPointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
