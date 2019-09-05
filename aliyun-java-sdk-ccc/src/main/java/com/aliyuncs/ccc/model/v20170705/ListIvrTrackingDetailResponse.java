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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListIvrTrackingDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIvrTrackingDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private IvrTrackingDetails ivrTrackingDetails;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public IvrTrackingDetails getIvrTrackingDetails() {
		return this.ivrTrackingDetails;
	}

	public void setIvrTrackingDetails(IvrTrackingDetails ivrTrackingDetails) {
		this.ivrTrackingDetails = ivrTrackingDetails;
	}

	public static class IvrTrackingDetails {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<IvrTrackingDetail> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<IvrTrackingDetail> getList() {
			return this.list;
		}

		public void setList(List<IvrTrackingDetail> list) {
			this.list = list;
		}

		public static class IvrTrackingDetail {

			private String flowName;

			private String nodeName;

			private String nodeType;

			private String contactId;

			private String callingNumber;

			private String calledNumber;

			private Long startTime;

			private Long stopTime;

			private String status;

			private String inputData;

			private String outputData;

			private String description;

			private String deviceID;

			private String tenantId;

			public String getFlowName() {
				return this.flowName;
			}

			public void setFlowName(String flowName) {
				this.flowName = flowName;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public String getCalledNumber() {
				return this.calledNumber;
			}

			public void setCalledNumber(String calledNumber) {
				this.calledNumber = calledNumber;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getStopTime() {
				return this.stopTime;
			}

			public void setStopTime(Long stopTime) {
				this.stopTime = stopTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getInputData() {
				return this.inputData;
			}

			public void setInputData(String inputData) {
				this.inputData = inputData;
			}

			public String getOutputData() {
				return this.outputData;
			}

			public void setOutputData(String outputData) {
				this.outputData = outputData;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDeviceID() {
				return this.deviceID;
			}

			public void setDeviceID(String deviceID) {
				this.deviceID = deviceID;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}
		}
	}

	@Override
	public ListIvrTrackingDetailResponse getInstance(UnmarshallerContext context) {
		return	ListIvrTrackingDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
