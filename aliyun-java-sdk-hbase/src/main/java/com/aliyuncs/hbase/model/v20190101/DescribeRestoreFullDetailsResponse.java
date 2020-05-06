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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeRestoreFullDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreFullDetailsResponse extends AcsResponse {

	private String requestId;

	private RestoreFull restoreFull;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RestoreFull getRestoreFull() {
		return this.restoreFull;
	}

	public void setRestoreFull(RestoreFull restoreFull) {
		this.restoreFull = restoreFull;
	}

	public static class RestoreFull {

		private Integer succeed;

		private Integer fail;

		private String dataSize;

		private String speed;

		private Long total;

		private Integer pageNumber;

		private Integer pageSize;

		private List<RestoreFullDetail> restoreFullDetails;

		public Integer getSucceed() {
			return this.succeed;
		}

		public void setSucceed(Integer succeed) {
			this.succeed = succeed;
		}

		public Integer getFail() {
			return this.fail;
		}

		public void setFail(Integer fail) {
			this.fail = fail;
		}

		public String getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(String dataSize) {
			this.dataSize = dataSize;
		}

		public String getSpeed() {
			return this.speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
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

		public List<RestoreFullDetail> getRestoreFullDetails() {
			return this.restoreFullDetails;
		}

		public void setRestoreFullDetails(List<RestoreFullDetail> restoreFullDetails) {
			this.restoreFullDetails = restoreFullDetails;
		}

		public static class RestoreFullDetail {

			private String table;

			private String state;

			private String startTime;

			private String endTime;

			private String process;

			private String dataSize;

			private String speed;

			private String message;

			public String getTable() {
				return this.table;
			}

			public void setTable(String table) {
				this.table = table;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getProcess() {
				return this.process;
			}

			public void setProcess(String process) {
				this.process = process;
			}

			public String getDataSize() {
				return this.dataSize;
			}

			public void setDataSize(String dataSize) {
				this.dataSize = dataSize;
			}

			public String getSpeed() {
				return this.speed;
			}

			public void setSpeed(String speed) {
				this.speed = speed;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	@Override
	public DescribeRestoreFullDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreFullDetailsResponseUnmarshaller.unmarshall(this, context);
	}
}
