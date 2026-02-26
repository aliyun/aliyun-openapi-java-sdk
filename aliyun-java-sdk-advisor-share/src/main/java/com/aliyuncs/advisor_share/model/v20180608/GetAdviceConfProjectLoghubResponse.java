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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.GetAdviceConfProjectLoghubResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAdviceConfProjectLoghubResponse extends AcsResponse {

	private String message;

	private String requestId;

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

		private String accessKey;

		private String region;

		private String profiles;

		private String endpoint;

		private String logstore;

		private String project;

		private String accessId;

		private Long id;

		public String getAccessKey() {
			return this.accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getProfiles() {
			return this.profiles;
		}

		public void setProfiles(String profiles) {
			this.profiles = profiles;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getLogstore() {
			return this.logstore;
		}

		public void setLogstore(String logstore) {
			this.logstore = logstore;
		}

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getAccessId() {
			return this.accessId;
		}

		public void setAccessId(String accessId) {
			this.accessId = accessId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public GetAdviceConfProjectLoghubResponse getInstance(UnmarshallerContext context) {
		return	GetAdviceConfProjectLoghubResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
