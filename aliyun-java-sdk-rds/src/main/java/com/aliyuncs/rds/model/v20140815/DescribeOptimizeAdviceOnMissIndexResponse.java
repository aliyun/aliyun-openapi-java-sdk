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
import com.aliyuncs.rds.transform.v20140815.DescribeOptimizeAdviceOnMissIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOptimizeAdviceOnMissIndexResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private Integer totalRecordsCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<AdviceOnMissIndex> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
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

	public List<AdviceOnMissIndex> getItems() {
		return this.items;
	}

	public void setItems(List<AdviceOnMissIndex> items) {
		this.items = items;
	}

	public static class AdviceOnMissIndex {

		private String dBName;

		private String tableName;

		private String queryColumn;

		private String sQLText;

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

		public String getQueryColumn() {
			return this.queryColumn;
		}

		public void setQueryColumn(String queryColumn) {
			this.queryColumn = queryColumn;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}
	}

	@Override
	public DescribeOptimizeAdviceOnMissIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeOptimizeAdviceOnMissIndexResponseUnmarshaller.unmarshall(this, context);
	}
}
