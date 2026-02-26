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
import com.aliyuncs.dataworks_public.transform.v20200518.ListMeasureDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMeasureDataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private List<MeasureData> measureDatas;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<MeasureData> getMeasureDatas() {
		return this.measureDatas;
	}

	public void setMeasureDatas(List<MeasureData> measureDatas) {
		this.measureDatas = measureDatas;
	}

	public static class MeasureData {

		private String domainCode;

		private String componentCode;

		private Long startTime;

		private Long endTime;

		private Long usage;

		public String getDomainCode() {
			return this.domainCode;
		}

		public void setDomainCode(String domainCode) {
			this.domainCode = domainCode;
		}

		public String getComponentCode() {
			return this.componentCode;
		}

		public void setComponentCode(String componentCode) {
			this.componentCode = componentCode;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getUsage() {
			return this.usage;
		}

		public void setUsage(Long usage) {
			this.usage = usage;
		}
	}

	@Override
	public ListMeasureDataResponse getInstance(UnmarshallerContext context) {
		return	ListMeasureDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
