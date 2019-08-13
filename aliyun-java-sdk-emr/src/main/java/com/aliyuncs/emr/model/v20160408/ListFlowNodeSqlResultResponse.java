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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListFlowNodeSqlResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowNodeSqlResultResponse extends AcsResponse {

	private String requestId;

	private Boolean end;

	private List<Row> rowList;

	private List<String> headerList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getEnd() {
		return this.end;
	}

	public void setEnd(Boolean end) {
		this.end = end;
	}

	public List<Row> getRowList() {
		return this.rowList;
	}

	public void setRowList(List<Row> rowList) {
		this.rowList = rowList;
	}

	public List<String> getHeaderList() {
		return this.headerList;
	}

	public void setHeaderList(List<String> headerList) {
		this.headerList = headerList;
	}

	public static class Row {

		private Integer rowIndex;

		private List<String> rowItemList;

		public Integer getRowIndex() {
			return this.rowIndex;
		}

		public void setRowIndex(Integer rowIndex) {
			this.rowIndex = rowIndex;
		}

		public List<String> getRowItemList() {
			return this.rowItemList;
		}

		public void setRowItemList(List<String> rowItemList) {
			this.rowItemList = rowItemList;
		}
	}

	@Override
	public ListFlowNodeSqlResultResponse getInstance(UnmarshallerContext context) {
		return	ListFlowNodeSqlResultResponseUnmarshaller.unmarshall(this, context);
	}
}
