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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.CheckTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckTagsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Boolean success;

	private String code;

	private List<CheckTagResultBiz> checkResult;

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

	public List<CheckTagResultBiz> getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(List<CheckTagResultBiz> checkResult) {
		this.checkResult = checkResult;
	}

	public static class CheckTagResultBiz {

		private String tagValue;

		private String tagId;

		private String barcode;

		private Integer isExist;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public Integer getIsExist() {
			return this.isExist;
		}

		public void setIsExist(Integer isExist) {
			this.isExist = isExist;
		}
	}

	@Override
	public CheckTagsResponse getInstance(UnmarshallerContext context) {
		return	CheckTagsResponseUnmarshaller.unmarshall(this, context);
	}
}
