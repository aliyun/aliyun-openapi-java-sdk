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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.ListGroupByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupByIdResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<DataItem> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Integer status;

		private Long buId;

		private String showName;

		private Boolean supportCase;

		private String description;

		private String groupName;

		private Long groupId;

		private Boolean supportIm;

		private Boolean supportPhone;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public Boolean getSupportCase() {
			return this.supportCase;
		}

		public void setSupportCase(Boolean supportCase) {
			this.supportCase = supportCase;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public Boolean getSupportIm() {
			return this.supportIm;
		}

		public void setSupportIm(Boolean supportIm) {
			this.supportIm = supportIm;
		}

		public Boolean getSupportPhone() {
			return this.supportPhone;
		}

		public void setSupportPhone(Boolean supportPhone) {
			this.supportPhone = supportPhone;
		}
	}

	@Override
	public ListGroupByIdResponse getInstance(UnmarshallerContext context) {
		return	ListGroupByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
