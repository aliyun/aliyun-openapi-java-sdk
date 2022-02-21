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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeExporterRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExporterRuleListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer total;

	private List<Datapoint> datapoints;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Datapoint> getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(List<Datapoint> datapoints) {
		this.datapoints = datapoints;
	}

	public static class Datapoint {

		private String metricName;

		private String describe;

		private String targetWindows;

		private Long createTime;

		private Boolean enabled;

		private String dimension;

		private String namespace;

		private String ruleName;

		private List<String> dstName;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getDescribe() {
			return this.describe;
		}

		public void setDescribe(String describe) {
			this.describe = describe;
		}

		public String getTargetWindows() {
			return this.targetWindows;
		}

		public void setTargetWindows(String targetWindows) {
			this.targetWindows = targetWindows;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public List<String> getDstName() {
			return this.dstName;
		}

		public void setDstName(List<String> dstName) {
			this.dstName = dstName;
		}
	}

	@Override
	public DescribeExporterRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeExporterRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
