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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.GetAudioFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAudioFileResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String code;

	private String message;

	private Boolean published;

	private Boolean mainFlow;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	public Boolean getMainFlow() {
		return this.mainFlow;
	}

	public void setMainFlow(Boolean mainFlow) {
		this.mainFlow = mainFlow;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String audioFileName;

		private String ossFileKey;

		private String updatedTime;

		private String audioResourceId;

		private String instanceId;

		private String name;

		private String createdTime;

		public String getAudioFileName() {
			return this.audioFileName;
		}

		public void setAudioFileName(String audioFileName) {
			this.audioFileName = audioFileName;
		}

		public String getOssFileKey() {
			return this.ossFileKey;
		}

		public void setOssFileKey(String ossFileKey) {
			this.ossFileKey = ossFileKey;
		}

		public String getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(String updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getAudioResourceId() {
			return this.audioResourceId;
		}

		public void setAudioResourceId(String audioResourceId) {
			this.audioResourceId = audioResourceId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public GetAudioFileResponse getInstance(UnmarshallerContext context) {
		return	GetAudioFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
