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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreateHighReliablePhysicalConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateHighReliablePhysicalConnectionResponse extends AcsResponse {

	private String requestId;

	private List<PhysicalConnectionListItem> physicalConnectionList;

	private List<ErrorInfoListItem> errorInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PhysicalConnectionListItem> getPhysicalConnectionList() {
		return this.physicalConnectionList;
	}

	public void setPhysicalConnectionList(List<PhysicalConnectionListItem> physicalConnectionList) {
		this.physicalConnectionList = physicalConnectionList;
	}

	public List<ErrorInfoListItem> getErrorInfoList() {
		return this.errorInfoList;
	}

	public void setErrorInfoList(List<ErrorInfoListItem> errorInfoList) {
		this.errorInfoList = errorInfoList;
	}

	public static class PhysicalConnectionListItem {

		private String instanceId;

		private String regionNo;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}
	}

	public static class ErrorInfoListItem {

		private String errorCode;

		private String errorMessage;

		private String instanceId;

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public CreateHighReliablePhysicalConnectionResponse getInstance(UnmarshallerContext context) {
		return	CreateHighReliablePhysicalConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
