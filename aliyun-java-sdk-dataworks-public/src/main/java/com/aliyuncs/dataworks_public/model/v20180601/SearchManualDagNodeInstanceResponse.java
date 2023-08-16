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
import com.aliyuncs.dataworks_public.transform.v20180601.SearchManualDagNodeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchManualDagNodeInstanceResponse extends AcsResponse {

	private String requestId;

	private String errMsg;

	private String errCode;

	private Boolean success;

	private List<NodeInsInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<NodeInsInfo> getData() {
		return this.data;
	}

	public void setData(List<NodeInsInfo> data) {
		this.data = data;
	}

	public static class NodeInsInfo {

		private Integer status;

		private String beginRunningTime;

		private String finishTime;

		private String paraValue;

		private String createTime;

		private Long dagId;

		private Long instanceId;

		private String beginWaitResTime;

		private Integer dagType;

		private String nodeName;

		private String bizdate;

		private String beginWaitTimeTime;

		private String modifyTime;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getBeginRunningTime() {
			return this.beginRunningTime;
		}

		public void setBeginRunningTime(String beginRunningTime) {
			this.beginRunningTime = beginRunningTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getParaValue() {
			return this.paraValue;
		}

		public void setParaValue(String paraValue) {
			this.paraValue = paraValue;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getDagId() {
			return this.dagId;
		}

		public void setDagId(Long dagId) {
			this.dagId = dagId;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public String getBeginWaitResTime() {
			return this.beginWaitResTime;
		}

		public void setBeginWaitResTime(String beginWaitResTime) {
			this.beginWaitResTime = beginWaitResTime;
		}

		public Integer getDagType() {
			return this.dagType;
		}

		public void setDagType(Integer dagType) {
			this.dagType = dagType;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getBizdate() {
			return this.bizdate;
		}

		public void setBizdate(String bizdate) {
			this.bizdate = bizdate;
		}

		public String getBeginWaitTimeTime() {
			return this.beginWaitTimeTime;
		}

		public void setBeginWaitTimeTime(String beginWaitTimeTime) {
			this.beginWaitTimeTime = beginWaitTimeTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public SearchManualDagNodeInstanceResponse getInstance(UnmarshallerContext context) {
		return	SearchManualDagNodeInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
