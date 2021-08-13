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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeQosesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeQosesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<Qos> qoses;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Qos> getQoses() {
		return this.qoses;
	}

	public void setQoses(List<Qos> qoses) {
		this.qoses = qoses;
	}

	public static class Qos {

		private String qosDescription;

		private String sagCount;

		private String smartAGIds;

		private String qosId;

		private String qosName;

		private String resourceGroupId;

		public String getQosDescription() {
			return this.qosDescription;
		}

		public void setQosDescription(String qosDescription) {
			this.qosDescription = qosDescription;
		}

		public String getSagCount() {
			return this.sagCount;
		}

		public void setSagCount(String sagCount) {
			this.sagCount = sagCount;
		}

		public String getSmartAGIds() {
			return this.smartAGIds;
		}

		public void setSmartAGIds(String smartAGIds) {
			this.smartAGIds = smartAGIds;
		}

		public String getQosId() {
			return this.qosId;
		}

		public void setQosId(String qosId) {
			this.qosId = qosId;
		}

		public String getQosName() {
			return this.qosName;
		}

		public void setQosName(String qosName) {
			this.qosName = qosName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}
	}

	@Override
	public DescribeQosesResponse getInstance(UnmarshallerContext context) {
		return	DescribeQosesResponseUnmarshaller.unmarshall(this, context);
	}
}
