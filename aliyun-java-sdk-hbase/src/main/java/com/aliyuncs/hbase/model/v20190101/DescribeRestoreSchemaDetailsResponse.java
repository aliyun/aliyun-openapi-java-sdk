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
import com.aliyuncs.hbase.transform.v20190101.DescribeRestoreSchemaDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreSchemaDetailsResponse extends AcsResponse {

	private String requestId;

	private RestoreSchema restoreSchema;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RestoreSchema getRestoreSchema() {
		return this.restoreSchema;
	}

	public void setRestoreSchema(RestoreSchema restoreSchema) {
		this.restoreSchema = restoreSchema;
	}

	public static class RestoreSchema {

		private Integer succeed;

		private Integer fail;

		private Long total;

		private Integer pageNumber;

		private Integer pageSize;

		private List<RestoreSchemaDetail> restoreSchemaDetails;

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

		public List<RestoreSchemaDetail> getRestoreSchemaDetails() {
			return this.restoreSchemaDetails;
		}

		public void setRestoreSchemaDetails(List<RestoreSchemaDetail> restoreSchemaDetails) {
			this.restoreSchemaDetails = restoreSchemaDetails;
		}

		public static class RestoreSchemaDetail {

			private String table;

			private String startTime;

			private String endTime;

			private String state;

			private String message;

			public String getTable() {
				return this.table;
			}

			public void setTable(String table) {
				this.table = table;
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

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
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
	public DescribeRestoreSchemaDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreSchemaDetailsResponseUnmarshaller.unmarshall(this, context);
	}
}
