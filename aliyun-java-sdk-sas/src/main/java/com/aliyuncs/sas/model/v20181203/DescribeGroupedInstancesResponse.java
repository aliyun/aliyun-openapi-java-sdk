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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeGroupedInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupedInstancesResponse extends AcsResponse {

	private String requestId;

	private List<Instance> instances;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Instance {

		private String unProtectedInstanceCount;

		private String fieldAliasName;

		private Integer groupFlag;

		private Long fieldId;

		private String riskInstanceCount;

		private String instanceCount;

		private Long asapVulInstanceCount;

		private List<String> groupPath;

		public String getUnProtectedInstanceCount() {
			return this.unProtectedInstanceCount;
		}

		public void setUnProtectedInstanceCount(String unProtectedInstanceCount) {
			this.unProtectedInstanceCount = unProtectedInstanceCount;
		}

		public String getFieldAliasName() {
			return this.fieldAliasName;
		}

		public void setFieldAliasName(String fieldAliasName) {
			this.fieldAliasName = fieldAliasName;
		}

		public Integer getGroupFlag() {
			return this.groupFlag;
		}

		public void setGroupFlag(Integer groupFlag) {
			this.groupFlag = groupFlag;
		}

		public Long getFieldId() {
			return this.fieldId;
		}

		public void setFieldId(Long fieldId) {
			this.fieldId = fieldId;
		}

		public String getRiskInstanceCount() {
			return this.riskInstanceCount;
		}

		public void setRiskInstanceCount(String riskInstanceCount) {
			this.riskInstanceCount = riskInstanceCount;
		}

		public String getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(String instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Long getAsapVulInstanceCount() {
			return this.asapVulInstanceCount;
		}

		public void setAsapVulInstanceCount(Long asapVulInstanceCount) {
			this.asapVulInstanceCount = asapVulInstanceCount;
		}

		public List<String> getGroupPath() {
			return this.groupPath;
		}

		public void setGroupPath(List<String> groupPath) {
			this.groupPath = groupPath;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeGroupedInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupedInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
