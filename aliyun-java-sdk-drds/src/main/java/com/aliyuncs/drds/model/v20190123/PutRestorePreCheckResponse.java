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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.PutRestorePreCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PutRestorePreCheckResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private PrecheckBackupResult precheckBackupResult;

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

	public PrecheckBackupResult getPrecheckBackupResult() {
		return this.precheckBackupResult;
	}

	public void setPrecheckBackupResult(PrecheckBackupResult precheckBackupResult) {
		this.precheckBackupResult = precheckBackupResult;
	}

	public static class PrecheckBackupResult {

		private Boolean result;

		private List<ListItem> list;

		public Boolean getResult() {
			return this.result;
		}

		public void setResult(Boolean result) {
			this.result = result;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long itemId;

			private String checkItemName;

			private String checkItemContent;

			private String checkResult;

			private String checkFailReason;

			private Boolean result;

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}

			public String getCheckItemName() {
				return this.checkItemName;
			}

			public void setCheckItemName(String checkItemName) {
				this.checkItemName = checkItemName;
			}

			public String getCheckItemContent() {
				return this.checkItemContent;
			}

			public void setCheckItemContent(String checkItemContent) {
				this.checkItemContent = checkItemContent;
			}

			public String getCheckResult() {
				return this.checkResult;
			}

			public void setCheckResult(String checkResult) {
				this.checkResult = checkResult;
			}

			public String getCheckFailReason() {
				return this.checkFailReason;
			}

			public void setCheckFailReason(String checkFailReason) {
				this.checkFailReason = checkFailReason;
			}

			public Boolean getResult() {
				return this.result;
			}

			public void setResult(Boolean result) {
				this.result = result;
			}
		}
	}

	@Override
	public PutRestorePreCheckResponse getInstance(UnmarshallerContext context) {
		return	PutRestorePreCheckResponseUnmarshaller.unmarshall(this, context);
	}
}
