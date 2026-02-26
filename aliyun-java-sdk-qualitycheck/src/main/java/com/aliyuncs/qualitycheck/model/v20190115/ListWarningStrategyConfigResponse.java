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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListWarningStrategyConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWarningStrategyConfigResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Integer count;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private Long intervalTime;

		private String lambda;

		private Long level;

		private Long maxNumber;

		private String name;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getIntervalTime() {
			return this.intervalTime;
		}

		public void setIntervalTime(Long intervalTime) {
			this.intervalTime = intervalTime;
		}

		public String getLambda() {
			return this.lambda;
		}

		public void setLambda(String lambda) {
			this.lambda = lambda;
		}

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}

		public Long getMaxNumber() {
			return this.maxNumber;
		}

		public void setMaxNumber(Long maxNumber) {
			this.maxNumber = maxNumber;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public ListWarningStrategyConfigResponse getInstance(UnmarshallerContext context) {
		return	ListWarningStrategyConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
