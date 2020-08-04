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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeTableResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private String fileContent;

		private List<Table> tables;

		public String getFileContent() {
			return this.fileContent;
		}

		public void setFileContent(String fileContent) {
			this.fileContent = fileContent;
		}

		public List<Table> getTables() {
			return this.tables;
		}

		public void setTables(List<Table> tables) {
			this.tables = tables;
		}

		public static class Table {

			private List<TableRow> tableRows;

			private List<String> head;

			private List<String> tail;

			public List<TableRow> getTableRows() {
				return this.tableRows;
			}

			public void setTableRows(List<TableRow> tableRows) {
				this.tableRows = tableRows;
			}

			public List<String> getHead() {
				return this.head;
			}

			public void setHead(List<String> head) {
				this.head = head;
			}

			public List<String> getTail() {
				return this.tail;
			}

			public void setTail(List<String> tail) {
				this.tail = tail;
			}

			public static class TableRow {

				private List<TableColumn> tableColumns;

				public List<TableColumn> getTableColumns() {
					return this.tableColumns;
				}

				public void setTableColumns(List<TableColumn> tableColumns) {
					this.tableColumns = tableColumns;
				}

				public static class TableColumn {

					private Integer startColumn;

					private Integer startRow;

					private Integer endColumn;

					private Integer endRow;

					private Integer height;

					private Integer width;

					private List<String> texts;

					public Integer getStartColumn() {
						return this.startColumn;
					}

					public void setStartColumn(Integer startColumn) {
						this.startColumn = startColumn;
					}

					public Integer getStartRow() {
						return this.startRow;
					}

					public void setStartRow(Integer startRow) {
						this.startRow = startRow;
					}

					public Integer getEndColumn() {
						return this.endColumn;
					}

					public void setEndColumn(Integer endColumn) {
						this.endColumn = endColumn;
					}

					public Integer getEndRow() {
						return this.endRow;
					}

					public void setEndRow(Integer endRow) {
						this.endRow = endRow;
					}

					public Integer getHeight() {
						return this.height;
					}

					public void setHeight(Integer height) {
						this.height = height;
					}

					public Integer getWidth() {
						return this.width;
					}

					public void setWidth(Integer width) {
						this.width = width;
					}

					public List<String> getTexts() {
						return this.texts;
					}

					public void setTexts(List<String> texts) {
						this.texts = texts;
					}
				}
			}
		}
	}

	@Override
	public RecognizeTableResponse getInstance(UnmarshallerContext context) {
		return	RecognizeTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
