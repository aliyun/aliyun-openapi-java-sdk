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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryFlavorInventoryStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryFlavorInventoryStatusResponse extends AcsResponse {

	private String requestId;

	private List<AZoneInventoryStatus> availableZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AZoneInventoryStatus> getAvailableZones() {
		return this.availableZones;
	}

	public void setAvailableZones(List<AZoneInventoryStatus> availableZones) {
		this.availableZones = availableZones;
	}

	public static class AZoneInventoryStatus {

		private String status;

		private String houyiAvailableZoneNo;

		private Boolean meet;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getHouyiAvailableZoneNo() {
			return this.houyiAvailableZoneNo;
		}

		public void setHouyiAvailableZoneNo(String houyiAvailableZoneNo) {
			this.houyiAvailableZoneNo = houyiAvailableZoneNo;
		}

		public Boolean getMeet() {
			return this.meet;
		}

		public void setMeet(Boolean meet) {
			this.meet = meet;
		}
	}

	@Override
	public OpsQueryFlavorInventoryStatusResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryFlavorInventoryStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
