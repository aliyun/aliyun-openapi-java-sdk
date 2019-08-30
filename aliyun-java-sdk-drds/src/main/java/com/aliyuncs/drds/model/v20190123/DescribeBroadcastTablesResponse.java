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
import com.aliyuncs.drds.transform.v20190123.DescribeBroadcastTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBroadcastTablesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Boolean isShard;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<ListItem> list;

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

	public Boolean getIsShard() {
		return this.isShard;
	}

	public void setIsShard(Boolean isShard) {
		this.isShard = isShard;
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String table;

		private String broadcastType;

		private Boolean isShard;

		private Integer dbInstType;

		private Boolean broadcast;

		private Integer status;

		public String getTable() {
			return this.table;
		}

		public void setTable(String table) {
			this.table = table;
		}

		public String getBroadcastType() {
			return this.broadcastType;
		}

		public void setBroadcastType(String broadcastType) {
			this.broadcastType = broadcastType;
		}

		public Boolean getIsShard() {
			return this.isShard;
		}

		public void setIsShard(Boolean isShard) {
			this.isShard = isShard;
		}

		public Integer getDbInstType() {
			return this.dbInstType;
		}

		public void setDbInstType(Integer dbInstType) {
			this.dbInstType = dbInstType;
		}

		public Boolean getBroadcast() {
			return this.broadcast;
		}

		public void setBroadcast(Boolean broadcast) {
			this.broadcast = broadcast;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeBroadcastTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeBroadcastTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
