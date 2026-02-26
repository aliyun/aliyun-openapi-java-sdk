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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.ListJobScriptHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobScriptHistoryResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<JobScriptHistoryInfo> jobScriptHistoryInfos;

		public List<JobScriptHistoryInfo> getJobScriptHistoryInfos() {
			return this.jobScriptHistoryInfos;
		}

		public void setJobScriptHistoryInfos(List<JobScriptHistoryInfo> jobScriptHistoryInfos) {
			this.jobScriptHistoryInfos = jobScriptHistoryInfos;
		}

		public static class JobScriptHistoryInfo {

			private String versionesDescription;

			private String creator;

			private String createTime;

			private String scriptContent;

			public String getVersionesDescription() {
				return this.versionesDescription;
			}

			public void setVersionesDescription(String versionesDescription) {
				this.versionesDescription = versionesDescription;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getScriptContent() {
				return this.scriptContent;
			}

			public void setScriptContent(String scriptContent) {
				this.scriptContent = scriptContent;
			}
		}
	}

	@Override
	public ListJobScriptHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListJobScriptHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
