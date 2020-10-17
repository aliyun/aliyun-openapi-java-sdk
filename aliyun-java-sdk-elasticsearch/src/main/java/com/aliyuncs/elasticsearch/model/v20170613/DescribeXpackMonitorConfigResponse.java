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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.DescribeXpackMonitorConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeXpackMonitorConfigResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String esInstanceId;

		private String userName;

		private Boolean enable;

		private List<String> endpoints;

		private List<String> pipelineIds;

		public String getEsInstanceId() {
			return this.esInstanceId;
		}

		public void setEsInstanceId(String esInstanceId) {
			this.esInstanceId = esInstanceId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public List<String> getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(List<String> endpoints) {
			this.endpoints = endpoints;
		}

		public List<String> getPipelineIds() {
			return this.pipelineIds;
		}

		public void setPipelineIds(List<String> pipelineIds) {
			this.pipelineIds = pipelineIds;
		}
	}

	@Override
	public DescribeXpackMonitorConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeXpackMonitorConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
