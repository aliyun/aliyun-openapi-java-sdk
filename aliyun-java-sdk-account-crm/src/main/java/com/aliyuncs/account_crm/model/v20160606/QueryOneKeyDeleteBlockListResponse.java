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

package com.aliyuncs.account_crm.model.v20160606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryOneKeyDeleteBlockListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOneKeyDeleteBlockListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<OneKeyDeleteBlockDto> data;

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

	public List<OneKeyDeleteBlockDto> getData() {
		return this.data;
	}

	public void setData(List<OneKeyDeleteBlockDto> data) {
		this.data = data;
	}

	public static class OneKeyDeleteBlockDto {

		private String blockMsg;

		private String blockCode;

		public String getBlockMsg() {
			return this.blockMsg;
		}

		public void setBlockMsg(String blockMsg) {
			this.blockMsg = blockMsg;
		}

		public String getBlockCode() {
			return this.blockCode;
		}

		public void setBlockCode(String blockCode) {
			this.blockCode = blockCode;
		}
	}

	@Override
	public QueryOneKeyDeleteBlockListResponse getInstance(UnmarshallerContext context) {
		return	QueryOneKeyDeleteBlockListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
