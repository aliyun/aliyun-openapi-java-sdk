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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeWebApplicationScalingConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebApplicationScalingConfigResponse extends AcsResponse {

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

		private Long maximumInstanceCount;

		private Long minimumInstanceCount;

		public Long getMaximumInstanceCount() {
			return this.maximumInstanceCount;
		}

		public void setMaximumInstanceCount(Long maximumInstanceCount) {
			this.maximumInstanceCount = maximumInstanceCount;
		}

		public Long getMinimumInstanceCount() {
			return this.minimumInstanceCount;
		}

		public void setMinimumInstanceCount(Long minimumInstanceCount) {
			this.minimumInstanceCount = minimumInstanceCount;
		}
	}

	@Override
	public DescribeWebApplicationScalingConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebApplicationScalingConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
