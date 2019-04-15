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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAnalysisShipperStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnalysisShipperStatusResponse extends AcsResponse {

	private String requestId;

	private ShipperData shipperData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ShipperData getShipperData() {
		return this.shipperData;
	}

	public void setShipperData(ShipperData shipperData) {
		this.shipperData = shipperData;
	}

	public static class ShipperData {

		private String authStatus;

		public String getAuthStatus() {
			return this.authStatus;
		}

		public void setAuthStatus(String authStatus) {
			this.authStatus = authStatus;
		}
	}

	@Override
	public DescribeAnalysisShipperStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnalysisShipperStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
