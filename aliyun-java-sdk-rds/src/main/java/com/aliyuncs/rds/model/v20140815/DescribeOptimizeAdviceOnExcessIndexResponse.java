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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeOptimizeAdviceOnExcessIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOptimizeAdviceOnExcessIndexResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordsCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<AdviceOnExcessIndex> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordsCount() {
		return this.totalRecordsCount;
	}

	public void setTotalRecordsCount(Integer totalRecordsCount) {
		this.totalRecordsCount = totalRecordsCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<AdviceOnExcessIndex> getItems() {
		return this.items;
	}

	public void setItems(List<AdviceOnExcessIndex> items) {
		this.items = items;
	}

	public static class AdviceOnExcessIndex {

		private String dBName;

		private String tableName;

		private Long indexCount;

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Long getIndexCount() {
			return this.indexCount;
		}

		public void setIndexCount(Long indexCount) {
			this.indexCount = indexCount;
		}
	}

	@Override
	public DescribeOptimizeAdviceOnExcessIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeOptimizeAdviceOnExcessIndexResponseUnmarshaller.unmarshall(this, context);
	}
}
