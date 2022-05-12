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

package com.aliyuncs.unimkt.model.v20181212;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.GetPublishPriceTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPublishPriceTaskResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMsg;

	private Map<Object,Object> ext;

	private String requestId;

	private Result result;

	private Header header;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Map<Object,Object> getExt() {
		return this.ext;
	}

	public void setExt(Map<Object,Object> ext) {
		this.ext = ext;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Header getHeader() {
		return this.header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public static class Result {

		private Long id;

		private String taskId;

		private String type;

		private String accountType;

		private String code;

		private String version;

		private String name;

		private String remarks;

		private Long catalogPrice;

		private String bpmsProcInsId;

		private String bpmsProcId;

		private String approver;

		private String deleteFlag;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public Long getCatalogPrice() {
			return this.catalogPrice;
		}

		public void setCatalogPrice(Long catalogPrice) {
			this.catalogPrice = catalogPrice;
		}

		public String getBpmsProcInsId() {
			return this.bpmsProcInsId;
		}

		public void setBpmsProcInsId(String bpmsProcInsId) {
			this.bpmsProcInsId = bpmsProcInsId;
		}

		public String getBpmsProcId() {
			return this.bpmsProcId;
		}

		public void setBpmsProcId(String bpmsProcId) {
			this.bpmsProcId = bpmsProcId;
		}

		public String getApprover() {
			return this.approver;
		}

		public void setApprover(String approver) {
			this.approver = approver;
		}

		public String getDeleteFlag() {
			return this.deleteFlag;
		}

		public void setDeleteFlag(String deleteFlag) {
			this.deleteFlag = deleteFlag;
		}
	}

	public static class Header {

		private String traceId;

		private String rpcId;

		private String version;

		private Long costTime;

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public String getRpcId() {
			return this.rpcId;
		}

		public void setRpcId(String rpcId) {
			this.rpcId = rpcId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Long getCostTime() {
			return this.costTime;
		}

		public void setCostTime(Long costTime) {
			this.costTime = costTime;
		}
	}

	@Override
	public GetPublishPriceTaskResponse getInstance(UnmarshallerContext context) {
		return	GetPublishPriceTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
