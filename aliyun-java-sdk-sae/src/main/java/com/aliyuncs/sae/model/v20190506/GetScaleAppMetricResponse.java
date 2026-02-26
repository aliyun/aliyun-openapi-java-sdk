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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.GetScaleAppMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetScaleAppMetricResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<ScaleAppMetricDto> data;

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

	public List<ScaleAppMetricDto> getData() {
		return this.data;
	}

	public void setData(List<ScaleAppMetricDto> data) {
		this.data = data;
	}

	public static class ScaleAppMetricDto {

		private String appId;

		private String name;

		private String regionId;

		private Long runnings;

		private Long maxReplicas;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getRunnings() {
			return this.runnings;
		}

		public void setRunnings(Long runnings) {
			this.runnings = runnings;
		}

		public Long getMaxReplicas() {
			return this.maxReplicas;
		}

		public void setMaxReplicas(Long maxReplicas) {
			this.maxReplicas = maxReplicas;
		}
	}

	@Override
	public GetScaleAppMetricResponse getInstance(UnmarshallerContext context) {
		return	GetScaleAppMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
