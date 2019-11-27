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
import com.aliyuncs.drds.transform.v20190123.DescribeTableShardingInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableShardingInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dbShardingFunction;

		private Integer dbRightShiftOffset;

		private String tbShardingFunction;

		private Integer tbRightShiftOffset;

		private Integer tbPartitions;

		private Boolean isShard;

		private Integer tbComputeLength;

		private Integer dbComputeLength;

		private List<Column> columnList;

		private List<String> dbShardingColumnList;

		private List<String> tbShardingColumnList;

		public String getDbShardingFunction() {
			return this.dbShardingFunction;
		}

		public void setDbShardingFunction(String dbShardingFunction) {
			this.dbShardingFunction = dbShardingFunction;
		}

		public Integer getDbRightShiftOffset() {
			return this.dbRightShiftOffset;
		}

		public void setDbRightShiftOffset(Integer dbRightShiftOffset) {
			this.dbRightShiftOffset = dbRightShiftOffset;
		}

		public String getTbShardingFunction() {
			return this.tbShardingFunction;
		}

		public void setTbShardingFunction(String tbShardingFunction) {
			this.tbShardingFunction = tbShardingFunction;
		}

		public Integer getTbRightShiftOffset() {
			return this.tbRightShiftOffset;
		}

		public void setTbRightShiftOffset(Integer tbRightShiftOffset) {
			this.tbRightShiftOffset = tbRightShiftOffset;
		}

		public Integer getTbPartitions() {
			return this.tbPartitions;
		}

		public void setTbPartitions(Integer tbPartitions) {
			this.tbPartitions = tbPartitions;
		}

		public Boolean getIsShard() {
			return this.isShard;
		}

		public void setIsShard(Boolean isShard) {
			this.isShard = isShard;
		}

		public Integer getTbComputeLength() {
			return this.tbComputeLength;
		}

		public void setTbComputeLength(Integer tbComputeLength) {
			this.tbComputeLength = tbComputeLength;
		}

		public Integer getDbComputeLength() {
			return this.dbComputeLength;
		}

		public void setDbComputeLength(Integer dbComputeLength) {
			this.dbComputeLength = dbComputeLength;
		}

		public List<Column> getColumnList() {
			return this.columnList;
		}

		public void setColumnList(List<Column> columnList) {
			this.columnList = columnList;
		}

		public List<String> getDbShardingColumnList() {
			return this.dbShardingColumnList;
		}

		public void setDbShardingColumnList(List<String> dbShardingColumnList) {
			this.dbShardingColumnList = dbShardingColumnList;
		}

		public List<String> getTbShardingColumnList() {
			return this.tbShardingColumnList;
		}

		public void setTbShardingColumnList(List<String> tbShardingColumnList) {
			this.tbShardingColumnList = tbShardingColumnList;
		}

		public static class Column {

			private String name;

			private String type;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public DescribeTableShardingInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableShardingInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
