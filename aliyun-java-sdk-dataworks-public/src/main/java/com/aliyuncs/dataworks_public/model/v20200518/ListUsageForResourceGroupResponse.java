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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListUsageForResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsageForResourceGroupResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private List<PopUsageForResourceGroupDto> data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<PopUsageForResourceGroupDto> getData() {
		return this.data;
	}

	public void setData(List<PopUsageForResourceGroupDto> data) {
		this.data = data;
	}

	public static class PopUsageForResourceGroupDto {

		private Double usage;

		private Long recodeTime;

		public Double getUsage() {
			return this.usage;
		}

		public void setUsage(Double usage) {
			this.usage = usage;
		}

		public Long getRecodeTime() {
			return this.recodeTime;
		}

		public void setRecodeTime(Long recodeTime) {
			this.recodeTime = recodeTime;
		}
	}

	@Override
	public ListUsageForResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	ListUsageForResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
