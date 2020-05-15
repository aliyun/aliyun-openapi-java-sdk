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

package com.aliyuncs.cassandra.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cassandra.transform.v20190101.DescribeParameterModificationHistoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterModificationHistoriesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<History> histories;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<History> getHistories() {
		return this.histories;
	}

	public void setHistories(List<History> histories) {
		this.histories = histories;
	}

	public static class History {

		private String name;

		private String oldValue;

		private String newValue;

		private Long time;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOldValue() {
			return this.oldValue;
		}

		public void setOldValue(String oldValue) {
			this.oldValue = oldValue;
		}

		public String getNewValue() {
			return this.newValue;
		}

		public void setNewValue(String newValue) {
			this.newValue = newValue;
		}

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}
	}

	@Override
	public DescribeParameterModificationHistoriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterModificationHistoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
