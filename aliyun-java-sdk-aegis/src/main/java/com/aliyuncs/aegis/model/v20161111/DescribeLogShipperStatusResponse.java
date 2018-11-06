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
import com.aliyuncs.aegis.transform.v20161111.DescribeLogShipperStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogShipperStatusResponse extends AcsResponse {

	private String requestId;

	private LogShipperStatus logShipperStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LogShipperStatus getLogShipperStatus() {
		return this.logShipperStatus;
	}

	public void setLogShipperStatus(LogShipperStatus logShipperStatus) {
		this.logShipperStatus = logShipperStatus;
	}

	public static class LogShipperStatus {

		private String buyStatus;

		private String authStatus;

		private String openStatus;

		public String getBuyStatus() {
			return this.buyStatus;
		}

		public void setBuyStatus(String buyStatus) {
			this.buyStatus = buyStatus;
		}

		public String getAuthStatus() {
			return this.authStatus;
		}

		public void setAuthStatus(String authStatus) {
			this.authStatus = authStatus;
		}

		public String getOpenStatus() {
			return this.openStatus;
		}

		public void setOpenStatus(String openStatus) {
			this.openStatus = openStatus;
		}
	}

	@Override
	public DescribeLogShipperStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogShipperStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
