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

package com.aliyuncs.dataworks_public.model.v20180601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.ListHiveTableLineagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHiveTableLineagesResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Data data;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer upstreamNumber;

		private Integer downstreamNumber;

		private List<TableLineage> upstreamLineages;

		private List<TableLineage> downstreamLineages;

		public Integer getUpstreamNumber() {
			return this.upstreamNumber;
		}

		public void setUpstreamNumber(Integer upstreamNumber) {
			this.upstreamNumber = upstreamNumber;
		}

		public Integer getDownstreamNumber() {
			return this.downstreamNumber;
		}

		public void setDownstreamNumber(Integer downstreamNumber) {
			this.downstreamNumber = downstreamNumber;
		}

		public List<TableLineage> getUpstreamLineages() {
			return this.upstreamLineages;
		}

		public void setUpstreamLineages(List<TableLineage> upstreamLineages) {
			this.upstreamLineages = upstreamLineages;
		}

		public List<TableLineage> getDownstreamLineages() {
			return this.downstreamLineages;
		}

		public void setDownstreamLineages(List<TableLineage> downstreamLineages) {
			this.downstreamLineages = downstreamLineages;
		}

		public static class TableLineage {

			private String modifiedTime;

			private String databaseName;

			private Integer directDestTableNum;

			private String engine;

			private String createTime;

			private Integer directSrcTableNum;

			private String clusterId;

			private String source;

			private String tableName;

			private String jobId;

			private String queryText;

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public Integer getDirectDestTableNum() {
				return this.directDestTableNum;
			}

			public void setDirectDestTableNum(Integer directDestTableNum) {
				this.directDestTableNum = directDestTableNum;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Integer getDirectSrcTableNum() {
				return this.directSrcTableNum;
			}

			public void setDirectSrcTableNum(Integer directSrcTableNum) {
				this.directSrcTableNum = directSrcTableNum;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getQueryText() {
				return this.queryText;
			}

			public void setQueryText(String queryText) {
				this.queryText = queryText;
			}
		}
	}

	@Override
	public ListHiveTableLineagesResponse getInstance(UnmarshallerContext context) {
		return	ListHiveTableLineagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
