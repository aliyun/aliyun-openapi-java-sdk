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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeGlobalDistributeCacheResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalDistributeCacheResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalRecordCount;

	private List<GlobalDistributeCache> globalDistributeCaches;

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

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<GlobalDistributeCache> getGlobalDistributeCaches() {
		return this.globalDistributeCaches;
	}

	public void setGlobalDistributeCaches(List<GlobalDistributeCache> globalDistributeCaches) {
		this.globalDistributeCaches = globalDistributeCaches;
	}

	public static class GlobalDistributeCache {

		private String status;

		private String globalInstanceName;

		private String globalInstanceId;

		private List<SubInstance> subInstances;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGlobalInstanceName() {
			return this.globalInstanceName;
		}

		public void setGlobalInstanceName(String globalInstanceName) {
			this.globalInstanceName = globalInstanceName;
		}

		public String getGlobalInstanceId() {
			return this.globalInstanceId;
		}

		public void setGlobalInstanceId(String globalInstanceId) {
			this.globalInstanceId = globalInstanceId;
		}

		public List<SubInstance> getSubInstances() {
			return this.subInstances;
		}

		public void setSubInstances(List<SubInstance> subInstances) {
			this.subInstances = subInstances;
		}

		public static class SubInstance {

			private String instanceStatus;

			private String instanceID;

			private String instanceClass;

			private String globalInstanceId;

			private String regionId;

			public String getInstanceStatus() {
				return this.instanceStatus;
			}

			public void setInstanceStatus(String instanceStatus) {
				this.instanceStatus = instanceStatus;
			}

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getInstanceClass() {
				return this.instanceClass;
			}

			public void setInstanceClass(String instanceClass) {
				this.instanceClass = instanceClass;
			}

			public String getGlobalInstanceId() {
				return this.globalInstanceId;
			}

			public void setGlobalInstanceId(String globalInstanceId) {
				this.globalInstanceId = globalInstanceId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public DescribeGlobalDistributeCacheResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalDistributeCacheResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
