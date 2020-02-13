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

package com.aliyuncs.dts.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20180801.DescribeSubscriptionObjectModifyStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubscriptionObjectModifyStatusResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String percent;

	private List<CheckItem> detail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPercent() {
		return this.percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public List<CheckItem> getDetail() {
		return this.detail;
	}

	public void setDetail(List<CheckItem> detail) {
		this.detail = detail;
	}

	public static class CheckItem {

		private String itemName;

		private String checkStatus;

		private String errorMessage;

		private String repairMethod;

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getCheckStatus() {
			return this.checkStatus;
		}

		public void setCheckStatus(String checkStatus) {
			this.checkStatus = checkStatus;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getRepairMethod() {
			return this.repairMethod;
		}

		public void setRepairMethod(String repairMethod) {
			this.repairMethod = repairMethod;
		}
	}

	@Override
	public DescribeSubscriptionObjectModifyStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeSubscriptionObjectModifyStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
