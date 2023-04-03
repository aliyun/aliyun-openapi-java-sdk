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

package com.aliyuncs.btripopen.model.v20220517;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.btripopen.transform.v20220517.ScanMsgListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScanMsgListResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String msg;

	private String extMsg;

	private String requestId;

	private List<ModuleItem> module;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getExtMsg() {
		return this.extMsg;
	}

	public void setExtMsg(String extMsg) {
		this.extMsg = extMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ModuleItem> getModule() {
		return this.module;
	}

	public void setModule(List<ModuleItem> module) {
		this.module = module;
	}

	public static class ModuleItem {

		private Long sequenceId;

		private String biz;

		private String content;

		private String sendTime;

		private Boolean haveRedDot;

		private Integer unReadCount;

		private Boolean showMsg;

		public Long getSequenceId() {
			return this.sequenceId;
		}

		public void setSequenceId(Long sequenceId) {
			this.sequenceId = sequenceId;
		}

		public String getBiz() {
			return this.biz;
		}

		public void setBiz(String biz) {
			this.biz = biz;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(String sendTime) {
			this.sendTime = sendTime;
		}

		public Boolean getHaveRedDot() {
			return this.haveRedDot;
		}

		public void setHaveRedDot(Boolean haveRedDot) {
			this.haveRedDot = haveRedDot;
		}

		public Integer getUnReadCount() {
			return this.unReadCount;
		}

		public void setUnReadCount(Integer unReadCount) {
			this.unReadCount = unReadCount;
		}

		public Boolean getShowMsg() {
			return this.showMsg;
		}

		public void setShowMsg(Boolean showMsg) {
			this.showMsg = showMsg;
		}
	}

	@Override
	public ScanMsgListResponse getInstance(UnmarshallerContext context) {
		return	ScanMsgListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
