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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.ListMcubeNebulaAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMcubeNebulaAppsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ListMcubeNebulaAppsResult listMcubeNebulaAppsResult;

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

	public ListMcubeNebulaAppsResult getListMcubeNebulaAppsResult() {
		return this.listMcubeNebulaAppsResult;
	}

	public void setListMcubeNebulaAppsResult(ListMcubeNebulaAppsResult listMcubeNebulaAppsResult) {
		this.listMcubeNebulaAppsResult = listMcubeNebulaAppsResult;
	}

	public static class ListMcubeNebulaAppsResult {

		private String errorCode;

		private String resultMsg;

		private Boolean success;

		private String requestId;

		private List<NebulaAppInfosItem> nebulaAppInfos;

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public List<NebulaAppInfosItem> getNebulaAppInfos() {
			return this.nebulaAppInfos;
		}

		public void setNebulaAppInfos(List<NebulaAppInfosItem> nebulaAppInfos) {
			this.nebulaAppInfos = nebulaAppInfos;
		}

		public static class NebulaAppInfosItem {

			private String h5Id;

			private String h5Name;

			public String getH5Id() {
				return this.h5Id;
			}

			public void setH5Id(String h5Id) {
				this.h5Id = h5Id;
			}

			public String getH5Name() {
				return this.h5Name;
			}

			public void setH5Name(String h5Name) {
				this.h5Name = h5Name;
			}
		}
	}

	@Override
	public ListMcubeNebulaAppsResponse getInstance(UnmarshallerContext context) {
		return	ListMcubeNebulaAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
