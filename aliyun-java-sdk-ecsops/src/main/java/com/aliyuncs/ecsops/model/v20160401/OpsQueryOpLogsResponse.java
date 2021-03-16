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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryOpLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryOpLogsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<OpLog> opLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<OpLog> getOpLogs() {
		return this.opLogs;
	}

	public void setOpLogs(List<OpLog> opLogs) {
		this.opLogs = opLogs;
	}

	public static class OpLog {

		private String type;

		private String channel;

		private String bizLine;

		private String subLine;

		private String key;

		private String bid;

		private Long aliUid;

		private String resourceId;

		private String resourceId2;

		private String resultCode;

		private String resultMsg;

		private String progress;

		private String data;

		private String operate;

		private String operator;

		private String memo;

		private String startTime;

		private String endTime;

		private Long duration;

		private String extraMapJson;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}

		public String getBizLine() {
			return this.bizLine;
		}

		public void setBizLine(String bizLine) {
			this.bizLine = bizLine;
		}

		public String getSubLine() {
			return this.subLine;
		}

		public void setSubLine(String subLine) {
			this.subLine = subLine;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceId2() {
			return this.resourceId2;
		}

		public void setResourceId2(String resourceId2) {
			this.resourceId2 = resourceId2;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getOperate() {
			return this.operate;
		}

		public void setOperate(String operate) {
			this.operate = operate;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getMemo() {
			return this.memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getExtraMapJson() {
			return this.extraMapJson;
		}

		public void setExtraMapJson(String extraMapJson) {
			this.extraMapJson = extraMapJson;
		}
	}

	@Override
	public OpsQueryOpLogsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryOpLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
