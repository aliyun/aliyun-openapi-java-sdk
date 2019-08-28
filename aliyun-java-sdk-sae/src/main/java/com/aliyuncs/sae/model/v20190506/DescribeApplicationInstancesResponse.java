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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeApplicationInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationInstancesResponse extends AcsResponse {

	private String code;

	private String message;

	private String traceId;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalSize;

		private List<Instance> instances;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<Instance> getInstances() {
			return this.instances;
		}

		public void setInstances(List<Instance> instances) {
			this.instances = instances;
		}

		public static class Instance {

			private String groupId;

			private String instanceId;

			private String instanceContainerStatus;

			private String instanceContainerIp;

			private Long createTimeStamp;

			private String groupId1;

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceContainerStatus() {
				return this.instanceContainerStatus;
			}

			public void setInstanceContainerStatus(String instanceContainerStatus) {
				this.instanceContainerStatus = instanceContainerStatus;
			}

			public String getInstanceContainerIp() {
				return this.instanceContainerIp;
			}

			public void setInstanceContainerIp(String instanceContainerIp) {
				this.instanceContainerIp = instanceContainerIp;
			}

			public Long getCreateTimeStamp() {
				return this.createTimeStamp;
			}

			public void setCreateTimeStamp(Long createTimeStamp) {
				this.createTimeStamp = createTimeStamp;
			}

			public String getGroupId1() {
				return this.groupId1;
			}

			public void setGroupId1(String groupId1) {
				this.groupId1 = groupId1;
			}
		}
	}

	@Override
	public DescribeApplicationInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
