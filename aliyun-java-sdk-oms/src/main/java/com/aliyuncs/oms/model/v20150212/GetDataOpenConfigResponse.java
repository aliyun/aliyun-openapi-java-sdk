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

package com.aliyuncs.oms.model.v20150212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oms.transform.v20150212.GetDataOpenConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataOpenConfigResponse extends AcsResponse {

	private String requestId;

	private String productName;

	private String tableName;

	private String dataType;

	private String siteBid;

	private List<Product> productList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getSiteBid() {
		return this.siteBid;
	}

	public void setSiteBid(String siteBid) {
		this.siteBid = siteBid;
	}

	public List<Product> getProductList() {
		return this.productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public static class Product {

		private String productName;

		private List<Table> tableList;

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public List<Table> getTableList() {
			return this.tableList;
		}

		public void setTableList(List<Table> tableList) {
			this.tableList = tableList;
		}

		public static class Table {

			private String tableName;

			private List<DataType> dataTypeList;

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public List<DataType> getDataTypeList() {
				return this.dataTypeList;
			}

			public void setDataTypeList(List<DataType> dataTypeList) {
				this.dataTypeList = dataTypeList;
			}

			public static class DataType {

				private String dataType;

				private List<String> fields;

				public String getDataType() {
					return this.dataType;
				}

				public void setDataType(String dataType) {
					this.dataType = dataType;
				}

				public List<String> getFields() {
					return this.fields;
				}

				public void setFields(List<String> fields) {
					this.fields = fields;
				}
			}
		}
	}

	@Override
	public GetDataOpenConfigResponse getInstance(UnmarshallerContext context) {
		return	GetDataOpenConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
