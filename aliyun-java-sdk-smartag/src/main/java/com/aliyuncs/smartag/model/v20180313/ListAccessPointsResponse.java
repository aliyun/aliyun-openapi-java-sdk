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
import com.aliyuncs.smartag.transform.v20180313.ListAccessPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccessPointsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<AccessPoint> accessPoints;

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

	public List<AccessPoint> getAccessPoints() {
		return this.accessPoints;
	}

	public void setAccessPoints(List<AccessPoint> accessPoints) {
		this.accessPoints = accessPoints;
	}

	public static class AccessPoint {

		private String longitude;

		private Integer activeSmartAGCount;

		private Integer inactiveSmartAGCount;

		private String latitude;

		private Integer accessPointId;

		public String getLongitude() {
			return this.longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public Integer getActiveSmartAGCount() {
			return this.activeSmartAGCount;
		}

		public void setActiveSmartAGCount(Integer activeSmartAGCount) {
			this.activeSmartAGCount = activeSmartAGCount;
		}

		public Integer getInactiveSmartAGCount() {
			return this.inactiveSmartAGCount;
		}

		public void setInactiveSmartAGCount(Integer inactiveSmartAGCount) {
			this.inactiveSmartAGCount = inactiveSmartAGCount;
		}

		public String getLatitude() {
			return this.latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public Integer getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(Integer accessPointId) {
			this.accessPointId = accessPointId;
		}
	}

	@Override
	public ListAccessPointsResponse getInstance(UnmarshallerContext context) {
		return	ListAccessPointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
