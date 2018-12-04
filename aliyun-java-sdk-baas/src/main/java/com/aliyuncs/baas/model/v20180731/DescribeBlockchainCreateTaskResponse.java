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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.DescribeBlockchainCreateTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBlockchainCreateTaskResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<BlockchainCreateTasksItem> blockchainCreateTasks;

		private Pagination pagination;

		public List<BlockchainCreateTasksItem> getBlockchainCreateTasks() {
			return this.blockchainCreateTasks;
		}

		public void setBlockchainCreateTasks(List<BlockchainCreateTasksItem> blockchainCreateTasks) {
			this.blockchainCreateTasks = blockchainCreateTasks;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class BlockchainCreateTasksItem {

			private String bizid;

			private String name;

			private String status;

			private String memo;

			private Long createTime;

			public String getBizid() {
				return this.bizid;
			}

			public void setBizid(String bizid) {
				this.bizid = bizid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMemo() {
				return this.memo;
			}

			public void setMemo(String memo) {
				this.memo = memo;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}
		}

		public static class Pagination {

			private Integer pageSize;

			private Integer current;

			private Integer total;

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getCurrent() {
				return this.current;
			}

			public void setCurrent(Integer current) {
				this.current = current;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}
		}
	}

	@Override
	public DescribeBlockchainCreateTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeBlockchainCreateTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
