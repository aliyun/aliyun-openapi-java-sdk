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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMSDdcsClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMSDdcsClientsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalCount;

	private List<ClientsItem> clients;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ClientsItem> getClients() {
		return this.clients;
	}

	public void setClients(List<ClientsItem> clients) {
		this.clients = clients;
	}

	public static class ClientsItem {

		private String cell;

		private String data;

		private String ip;

		private String pushData;

		public String getCell() {
			return this.cell;
		}

		public void setCell(String cell) {
			this.cell = cell;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getPushData() {
			return this.pushData;
		}

		public void setPushData(String pushData) {
			this.pushData = pushData;
		}
	}

	@Override
	public QueryMSDdcsClientsResponse getInstance(UnmarshallerContext context) {
		return	QueryMSDdcsClientsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
