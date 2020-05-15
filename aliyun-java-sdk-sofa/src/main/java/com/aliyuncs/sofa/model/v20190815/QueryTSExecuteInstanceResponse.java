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
import com.aliyuncs.sofa.transform.v20190815.QueryTSExecuteInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSExecuteInstanceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageNum;

	private Long pageSize;

	private Long totalCount;

	private List<ListItem> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private Long consume;

		private String context;

		private String executeId;

		private String gmtBegin;

		private String gmtEnd;

		private String handler;

		private Long id;

		private Long jobItemId;

		private String msg;

		private String requestId;

		private Long sharding;

		private String status;

		private String targerServer;

		private String triggerServer;

		private String type;

		public Long getConsume() {
			return this.consume;
		}

		public void setConsume(Long consume) {
			this.consume = consume;
		}

		public String getContext() {
			return this.context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public String getExecuteId() {
			return this.executeId;
		}

		public void setExecuteId(String executeId) {
			this.executeId = executeId;
		}

		public String getGmtBegin() {
			return this.gmtBegin;
		}

		public void setGmtBegin(String gmtBegin) {
			this.gmtBegin = gmtBegin;
		}

		public String getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(String gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public String getHandler() {
			return this.handler;
		}

		public void setHandler(String handler) {
			this.handler = handler;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getJobItemId() {
			return this.jobItemId;
		}

		public void setJobItemId(Long jobItemId) {
			this.jobItemId = jobItemId;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Long getSharding() {
			return this.sharding;
		}

		public void setSharding(Long sharding) {
			this.sharding = sharding;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTargerServer() {
			return this.targerServer;
		}

		public void setTargerServer(String targerServer) {
			this.targerServer = targerServer;
		}

		public String getTriggerServer() {
			return this.triggerServer;
		}

		public void setTriggerServer(String triggerServer) {
			this.triggerServer = triggerServer;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public QueryTSExecuteInstanceResponse getInstance(UnmarshallerContext context) {
		return	QueryTSExecuteInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
