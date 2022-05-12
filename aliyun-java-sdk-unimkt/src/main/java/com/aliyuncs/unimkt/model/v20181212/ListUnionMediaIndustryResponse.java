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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.ListUnionMediaIndustryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUnionMediaIndustryResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private Integer code;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

		private String industryCode;

		private String industryName;

		private String parentIndustryCode;

		private String level;

		private Boolean usedFlag;

		public String getIndustryCode() {
			return this.industryCode;
		}

		public void setIndustryCode(String industryCode) {
			this.industryCode = industryCode;
		}

		public String getIndustryName() {
			return this.industryName;
		}

		public void setIndustryName(String industryName) {
			this.industryName = industryName;
		}

		public String getParentIndustryCode() {
			return this.parentIndustryCode;
		}

		public void setParentIndustryCode(String parentIndustryCode) {
			this.parentIndustryCode = parentIndustryCode;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Boolean getUsedFlag() {
			return this.usedFlag;
		}

		public void setUsedFlag(Boolean usedFlag) {
			this.usedFlag = usedFlag;
		}
	}

	@Override
	public ListUnionMediaIndustryResponse getInstance(UnmarshallerContext context) {
		return	ListUnionMediaIndustryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
