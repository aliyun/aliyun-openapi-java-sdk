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
import com.aliyuncs.smartag.transform.v20180313.DescribeNetworkOptimizationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkOptimizationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNo;

	private Integer pageSize;

	private List<NetworkOptimization> networkOptimizations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<NetworkOptimization> getNetworkOptimizations() {
		return this.networkOptimizations;
	}

	public void setNetworkOptimizations(List<NetworkOptimization> networkOptimizations) {
		this.networkOptimizations = networkOptimizations;
	}

	public static class NetworkOptimization {

		private String instanceId;

		private String name;

		private String state;

		private Long createTime;

		private Integer sagCount;

		private String ccnId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getSagCount() {
			return this.sagCount;
		}

		public void setSagCount(Integer sagCount) {
			this.sagCount = sagCount;
		}

		public String getCcnId() {
			return this.ccnId;
		}

		public void setCcnId(String ccnId) {
			this.ccnId = ccnId;
		}
	}

	@Override
	public DescribeNetworkOptimizationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkOptimizationsResponseUnmarshaller.unmarshall(this, context);
	}
}
