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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListConnectLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConnectLogsResponse extends AcsResponse {

	private String requestId;

	private Logs logs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Logs getLogs() {
		return this.logs;
	}

	public void setLogs(Logs logs) {
		this.logs = logs;
	}

	public static class Logs {

		private List<分页查询列表数据> list;

		private Pagination pagination;

		public List<分页查询列表数据> getList() {
			return this.list;
		}

		public void setList(List<分页查询列表数据> list) {
			this.list = list;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class 分页查询列表数据 {

			private String deviceId;

			private String systemVersion;

			private String terminal;

			private String ip;

			private String netWorking;

			private Long time;

			private String status;

			private String sid;

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getSystemVersion() {
				return this.systemVersion;
			}

			public void setSystemVersion(String systemVersion) {
				this.systemVersion = systemVersion;
			}

			public String getTerminal() {
				return this.terminal;
			}

			public void setTerminal(String terminal) {
				this.terminal = terminal;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getNetWorking() {
				return this.netWorking;
			}

			public void setNetWorking(String netWorking) {
				this.netWorking = netWorking;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSid() {
				return this.sid;
			}

			public void setSid(String sid) {
				this.sid = sid;
			}
		}

		public static class Pagination {

			private Integer totalCount;

			private Integer totalPageCount;

			private Integer pageIndex;

			private Integer pageSize;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public Integer getTotalPageCount() {
				return this.totalPageCount;
			}

			public void setTotalPageCount(Integer totalPageCount) {
				this.totalPageCount = totalPageCount;
			}

			public Integer getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Integer pageIndex) {
				this.pageIndex = pageIndex;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}
		}
	}

	@Override
	public ListConnectLogsResponse getInstance(UnmarshallerContext context) {
		return	ListConnectLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
