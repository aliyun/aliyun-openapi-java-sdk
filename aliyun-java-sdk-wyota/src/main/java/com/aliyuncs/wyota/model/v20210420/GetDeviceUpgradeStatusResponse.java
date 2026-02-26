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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.GetDeviceUpgradeStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceUpgradeStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<AppOtaStatusDTOListItem> appOtaStatusDTOList;

		public List<AppOtaStatusDTOListItem> getAppOtaStatusDTOList() {
			return this.appOtaStatusDTOList;
		}

		public void setAppOtaStatusDTOList(List<AppOtaStatusDTOListItem> appOtaStatusDTOList) {
			this.appOtaStatusDTOList = appOtaStatusDTOList;
		}

		public static class AppOtaStatusDTOListItem {

			private String clientUid;

			private String baseVersion;

			private String targetVersion;

			private Integer status;

			private String note;

			private String osType;

			private Integer clientType;

			private String taskUid;

			private String project;

			public String getClientUid() {
				return this.clientUid;
			}

			public void setClientUid(String clientUid) {
				this.clientUid = clientUid;
			}

			public String getBaseVersion() {
				return this.baseVersion;
			}

			public void setBaseVersion(String baseVersion) {
				this.baseVersion = baseVersion;
			}

			public String getTargetVersion() {
				return this.targetVersion;
			}

			public void setTargetVersion(String targetVersion) {
				this.targetVersion = targetVersion;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getNote() {
				return this.note;
			}

			public void setNote(String note) {
				this.note = note;
			}

			public String getOsType() {
				return this.osType;
			}

			public void setOsType(String osType) {
				this.osType = osType;
			}

			public Integer getClientType() {
				return this.clientType;
			}

			public void setClientType(Integer clientType) {
				this.clientType = clientType;
			}

			public String getTaskUid() {
				return this.taskUid;
			}

			public void setTaskUid(String taskUid) {
				this.taskUid = taskUid;
			}

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}
		}
	}

	@Override
	public GetDeviceUpgradeStatusResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceUpgradeStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
