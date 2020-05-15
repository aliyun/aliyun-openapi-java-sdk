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

package com.aliyuncs.tag.model.v20180828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.tag.transform.v20180828.TagResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TagResourcesResponse extends AcsResponse {

	private String requestId;

	private List<FailedResource> failedResources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FailedResource> getFailedResources() {
		return this.failedResources;
	}

	public void setFailedResources(List<FailedResource> failedResources) {
		this.failedResources = failedResources;
	}

	public static class FailedResource {

		private String resourceARN;

		private Result result;

		public String getResourceARN() {
			return this.resourceARN;
		}

		public void setResourceARN(String resourceARN) {
			this.resourceARN = resourceARN;
		}

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public static class Result {

			private String code;

			private String message;

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
		}
	}

	@Override
	public TagResourcesResponse getInstance(UnmarshallerContext context) {
		return	TagResourcesResponseUnmarshaller.unmarshall(this, context);
	}
}
