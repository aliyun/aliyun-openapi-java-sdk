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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeLogShipperStatusResponseUnmarshaller;
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

		private String openStatus;

		private String slsServiceStatus;

		private String authStatus;

		private String buyStatus;

		private String postPaidSupportStatus;

		private String postPaidOpenStatus;

		private String slsProjectStatus;

		public String getOpenStatus() {
			return this.openStatus;
		}

		public void setOpenStatus(String openStatus) {
			this.openStatus = openStatus;
		}

		public String getSlsServiceStatus() {
			return this.slsServiceStatus;
		}

		public void setSlsServiceStatus(String slsServiceStatus) {
			this.slsServiceStatus = slsServiceStatus;
		}

		public String getAuthStatus() {
			return this.authStatus;
		}

		public void setAuthStatus(String authStatus) {
			this.authStatus = authStatus;
		}

		public String getBuyStatus() {
			return this.buyStatus;
		}

		public void setBuyStatus(String buyStatus) {
			this.buyStatus = buyStatus;
		}

		public String getPostPaidSupportStatus() {
			return this.postPaidSupportStatus;
		}

		public void setPostPaidSupportStatus(String postPaidSupportStatus) {
			this.postPaidSupportStatus = postPaidSupportStatus;
		}

		public String getPostPaidOpenStatus() {
			return this.postPaidOpenStatus;
		}

		public void setPostPaidOpenStatus(String postPaidOpenStatus) {
			this.postPaidOpenStatus = postPaidOpenStatus;
		}

		public String getSlsProjectStatus() {
			return this.slsProjectStatus;
		}

		public void setSlsProjectStatus(String slsProjectStatus) {
			this.slsProjectStatus = slsProjectStatus;
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
