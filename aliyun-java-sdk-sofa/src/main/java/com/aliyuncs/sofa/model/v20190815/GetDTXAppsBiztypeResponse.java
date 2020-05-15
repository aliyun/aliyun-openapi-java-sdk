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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetDTXAppsBiztypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDTXAppsBiztypeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String appName;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String actionMode;

		private String actionName;

		private String appName;

		private String commit;

		private String rollback;

		private String wsTr;

		public String getActionMode() {
			return this.actionMode;
		}

		public void setActionMode(String actionMode) {
			this.actionMode = actionMode;
		}

		public String getActionName() {
			return this.actionName;
		}

		public void setActionName(String actionName) {
			this.actionName = actionName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getCommit() {
			return this.commit;
		}

		public void setCommit(String commit) {
			this.commit = commit;
		}

		public String getRollback() {
			return this.rollback;
		}

		public void setRollback(String rollback) {
			this.rollback = rollback;
		}

		public String getWsTr() {
			return this.wsTr;
		}

		public void setWsTr(String wsTr) {
			this.wsTr = wsTr;
		}
	}

	@Override
	public GetDTXAppsBiztypeResponse getInstance(UnmarshallerContext context) {
		return	GetDTXAppsBiztypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
