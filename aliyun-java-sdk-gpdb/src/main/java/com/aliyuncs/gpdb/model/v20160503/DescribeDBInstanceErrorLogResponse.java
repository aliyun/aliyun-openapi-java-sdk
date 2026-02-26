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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceErrorLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceErrorLogResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private List<ItemsItem> items;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private Long time;

		private String logLevel;

		private String user;

		private String database;

		private String host;

		private String logContext;

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}

		public String getLogLevel() {
			return this.logLevel;
		}

		public void setLogLevel(String logLevel) {
			this.logLevel = logLevel;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getLogContext() {
			return this.logContext;
		}

		public void setLogContext(String logContext) {
			this.logContext = logContext;
		}
	}

	@Override
	public DescribeDBInstanceErrorLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceErrorLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
