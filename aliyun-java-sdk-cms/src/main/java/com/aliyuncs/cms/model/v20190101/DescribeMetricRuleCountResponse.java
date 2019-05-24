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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMetricRuleCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleCountResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private MetricRuleCount metricRuleCount;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MetricRuleCount getMetricRuleCount() {
		return this.metricRuleCount;
	}

	public void setMetricRuleCount(MetricRuleCount metricRuleCount) {
		this.metricRuleCount = metricRuleCount;
	}

	public static class MetricRuleCount {

		private Integer alarm;

		private Integer disable;

		private Integer nodata;

		private Integer ok;

		private Integer total;

		public Integer getAlarm() {
			return this.alarm;
		}

		public void setAlarm(Integer alarm) {
			this.alarm = alarm;
		}

		public Integer getDisable() {
			return this.disable;
		}

		public void setDisable(Integer disable) {
			this.disable = disable;
		}

		public Integer getNodata() {
			return this.nodata;
		}

		public void setNodata(Integer nodata) {
			this.nodata = nodata;
		}

		public Integer getOk() {
			return this.ok;
		}

		public void setOk(Integer ok) {
			this.ok = ok;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}
	}

	@Override
	public DescribeMetricRuleCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricRuleCountResponseUnmarshaller.unmarshall(this, context);
	}
}
