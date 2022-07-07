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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.ApplyCoordinationForMonitoringResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ApplyCoordinationForMonitoringResponse extends AcsResponse {

	private String requestId;

	private List<CoordinateFlowModel> coordinateFlowModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CoordinateFlowModel> getCoordinateFlowModels() {
		return this.coordinateFlowModels;
	}

	public void setCoordinateFlowModels(List<CoordinateFlowModel> coordinateFlowModels) {
		this.coordinateFlowModels = coordinateFlowModels;
	}

	public static class CoordinateFlowModel {

		private String coordinateStatus;

		private String initiatorType;

		private String ownerUserId;

		private String coordinateTicket;

		private String coId;

		private String resourceId;

		private String resourceName;

		public String getCoordinateStatus() {
			return this.coordinateStatus;
		}

		public void setCoordinateStatus(String coordinateStatus) {
			this.coordinateStatus = coordinateStatus;
		}

		public String getInitiatorType() {
			return this.initiatorType;
		}

		public void setInitiatorType(String initiatorType) {
			this.initiatorType = initiatorType;
		}

		public String getOwnerUserId() {
			return this.ownerUserId;
		}

		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}

		public String getCoordinateTicket() {
			return this.coordinateTicket;
		}

		public void setCoordinateTicket(String coordinateTicket) {
			this.coordinateTicket = coordinateTicket;
		}

		public String getCoId() {
			return this.coId;
		}

		public void setCoId(String coId) {
			this.coId = coId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
	}

	@Override
	public ApplyCoordinationForMonitoringResponse getInstance(UnmarshallerContext context) {
		return	ApplyCoordinationForMonitoringResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
