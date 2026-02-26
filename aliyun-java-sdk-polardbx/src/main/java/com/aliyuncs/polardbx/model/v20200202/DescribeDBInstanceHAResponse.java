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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeDBInstanceHAResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceHAResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String topologyType;

		private String primaryRegionId;

		private String primaryAzoneId;

		private String secondaryRegionId;

		private String secondaryAzoneId;

		public String getTopologyType() {
			return this.topologyType;
		}

		public void setTopologyType(String topologyType) {
			this.topologyType = topologyType;
		}

		public String getPrimaryRegionId() {
			return this.primaryRegionId;
		}

		public void setPrimaryRegionId(String primaryRegionId) {
			this.primaryRegionId = primaryRegionId;
		}

		public String getPrimaryAzoneId() {
			return this.primaryAzoneId;
		}

		public void setPrimaryAzoneId(String primaryAzoneId) {
			this.primaryAzoneId = primaryAzoneId;
		}

		public String getSecondaryRegionId() {
			return this.secondaryRegionId;
		}

		public void setSecondaryRegionId(String secondaryRegionId) {
			this.secondaryRegionId = secondaryRegionId;
		}

		public String getSecondaryAzoneId() {
			return this.secondaryAzoneId;
		}

		public void setSecondaryAzoneId(String secondaryAzoneId) {
			this.secondaryAzoneId = secondaryAzoneId;
		}
	}

	@Override
	public DescribeDBInstanceHAResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceHAResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
