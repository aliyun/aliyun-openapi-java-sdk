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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListUserDrawRecordByPkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserDrawRecordByPkResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<Lingmadata> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Lingmadata> getData() {
		return this.data;
	}

	public void setData(List<Lingmadata> data) {
		this.data = data;
	}

	public static class Lingmadata {

		private String uccId;

		private String drawGroup;

		private String drawPoolName;

		private String taskGroupId;

		private String aliyunPk;

		private String gmtCreate;

		private String drawResult;

		public String getUccId() {
			return this.uccId;
		}

		public void setUccId(String uccId) {
			this.uccId = uccId;
		}

		public String getDrawGroup() {
			return this.drawGroup;
		}

		public void setDrawGroup(String drawGroup) {
			this.drawGroup = drawGroup;
		}

		public String getDrawPoolName() {
			return this.drawPoolName;
		}

		public void setDrawPoolName(String drawPoolName) {
			this.drawPoolName = drawPoolName;
		}

		public String getTaskGroupId() {
			return this.taskGroupId;
		}

		public void setTaskGroupId(String taskGroupId) {
			this.taskGroupId = taskGroupId;
		}

		public String getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(String aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getDrawResult() {
			return this.drawResult;
		}

		public void setDrawResult(String drawResult) {
			this.drawResult = drawResult;
		}
	}

	@Override
	public ListUserDrawRecordByPkResponse getInstance(UnmarshallerContext context) {
		return	ListUserDrawRecordByPkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
