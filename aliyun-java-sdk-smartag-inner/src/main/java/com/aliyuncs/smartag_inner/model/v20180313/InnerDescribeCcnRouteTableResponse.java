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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerDescribeCcnRouteTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerDescribeCcnRouteTableResponse extends AcsResponse {

	private String requestId;

	private RouteTable routeTable;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RouteTable getRouteTable() {
		return this.routeTable;
	}

	public void setRouteTable(RouteTable routeTable) {
		this.routeTable = routeTable;
	}

	public static class RouteTable {

		private String routeTableId;

		private String currentVersion;

		private String targetVersion;

		private String state;

		private String ccnInstanceId;

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String getTargetVersion() {
			return this.targetVersion;
		}

		public void setTargetVersion(String targetVersion) {
			this.targetVersion = targetVersion;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCcnInstanceId() {
			return this.ccnInstanceId;
		}

		public void setCcnInstanceId(String ccnInstanceId) {
			this.ccnInstanceId = ccnInstanceId;
		}
	}

	@Override
	public InnerDescribeCcnRouteTableResponse getInstance(UnmarshallerContext context) {
		return	InnerDescribeCcnRouteTableResponseUnmarshaller.unmarshall(this, context);
	}
}
