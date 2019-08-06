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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeShardTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeShardTaskListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<ListItem> list;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String sourceTableName;

		private String targetTableName;

		private String expired;

		private Long expired1;

		private Integer stage;

		private Integer progress;

		private Integer delay;

		public String getSourceTableName() {
			return this.sourceTableName;
		}

		public void setSourceTableName(String sourceTableName) {
			this.sourceTableName = sourceTableName;
		}

		public String getTargetTableName() {
			return this.targetTableName;
		}

		public void setTargetTableName(String targetTableName) {
			this.targetTableName = targetTableName;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public Long getExpired1() {
			return this.expired1;
		}

		public void setExpired1(Long expired1) {
			this.expired1 = expired1;
		}

		public Integer getStage() {
			return this.stage;
		}

		public void setStage(Integer stage) {
			this.stage = stage;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public Integer getDelay() {
			return this.delay;
		}

		public void setDelay(Integer delay) {
			this.delay = delay;
		}
	}

	@Override
	public DescribeShardTaskListResponse getInstance(UnmarshallerContext context) {
		return	DescribeShardTaskListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
