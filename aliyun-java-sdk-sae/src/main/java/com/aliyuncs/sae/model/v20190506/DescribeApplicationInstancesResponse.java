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

	private String message;

	private String requestId;

	private String traceId;

	private String errorCode;

	private String code;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalSize;

		private List<Instance> instances;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

			private String instanceContainerIp;

			private String instanceHealthStatus;

			private String instanceId;

			private String vSwitchId;

			private String imageUrl;

			private Long instanceContainerRestarts;

			private String packageVersion;

			private String instanceContainerStatus;

			private Long createTimeStamp;

			private String groupId;

			public String getInstanceContainerIp() {
				return this.instanceContainerIp;
			}

			public void setInstanceContainerIp(String instanceContainerIp) {
				this.instanceContainerIp = instanceContainerIp;
			}

			public String getInstanceHealthStatus() {
				return this.instanceHealthStatus;
			}

			public void setInstanceHealthStatus(String instanceHealthStatus) {
				this.instanceHealthStatus = instanceHealthStatus;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public Long getInstanceContainerRestarts() {
				return this.instanceContainerRestarts;
			}

			public void setInstanceContainerRestarts(Long instanceContainerRestarts) {
				this.instanceContainerRestarts = instanceContainerRestarts;
			}

			public String getPackageVersion() {
				return this.packageVersion;
			}

			public void setPackageVersion(String packageVersion) {
				this.packageVersion = packageVersion;
			}

			public String getInstanceContainerStatus() {
				return this.instanceContainerStatus;
			}

			public void setInstanceContainerStatus(String instanceContainerStatus) {
				this.instanceContainerStatus = instanceContainerStatus;
			}

			public Long getCreateTimeStamp() {
				return this.createTimeStamp;
			}

			public void setCreateTimeStamp(Long createTimeStamp) {
				this.createTimeStamp = createTimeStamp;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
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
