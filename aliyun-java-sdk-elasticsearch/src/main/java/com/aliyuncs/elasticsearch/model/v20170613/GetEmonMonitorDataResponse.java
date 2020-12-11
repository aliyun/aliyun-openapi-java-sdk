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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.GetEmonMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEmonMonitorDataResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<ResultItem> result;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Map<Object,Object> dps;

		private Float integrity;

		private Long messageWatermark;

		private String metric;

		private Float summary;

		private Map<Object,Object> tags;

		public Map<Object,Object> getDps() {
			return this.dps;
		}

		public void setDps(Map<Object,Object> dps) {
			this.dps = dps;
		}

		public Float getIntegrity() {
			return this.integrity;
		}

		public void setIntegrity(Float integrity) {
			this.integrity = integrity;
		}

		public Long getMessageWatermark() {
			return this.messageWatermark;
		}

		public void setMessageWatermark(Long messageWatermark) {
			this.messageWatermark = messageWatermark;
		}

		public String getMetric() {
			return this.metric;
		}

		public void setMetric(String metric) {
			this.metric = metric;
		}

		public Float getSummary() {
			return this.summary;
		}

		public void setSummary(Float summary) {
			this.summary = summary;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}
	}

	@Override
	public GetEmonMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	GetEmonMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
