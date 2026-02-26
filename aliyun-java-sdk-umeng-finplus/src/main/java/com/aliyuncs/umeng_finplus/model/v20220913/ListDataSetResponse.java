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

package com.aliyuncs.umeng_finplus.model.v20220913;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.umeng_finplus.transform.v20220913.ListDataSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataSetResponse extends AcsResponse {

	private String requestId;

	private String msg;

	private String code;

	private Boolean success;

	private List<A> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<A> getData() {
		return this.data;
	}

	public void setData(List<A> data) {
		this.data = data;
	}

	public static class A {

		private String name;

		private Long lineNum;

		private String status;

		private String type;

		private Long datasetId;

		private String createTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getLineNum() {
			return this.lineNum;
		}

		public void setLineNum(Long lineNum) {
			this.lineNum = lineNum;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getDatasetId() {
			return this.datasetId;
		}

		public void setDatasetId(Long datasetId) {
			this.datasetId = datasetId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListDataSetResponse getInstance(UnmarshallerContext context) {
		return	ListDataSetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
