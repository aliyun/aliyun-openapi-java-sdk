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
import com.aliyuncs.cms.transform.v20190101.DescribeExporterOutputListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExporterOutputListResponse extends AcsResponse {

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

		private String destType;

		private Long createTime;

		private String destName;

		private ConfigJson configJson;

		public String getDestType() {
			return this.destType;
		}

		public void setDestType(String destType) {
			this.destType = destType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getDestName() {
			return this.destName;
		}

		public void setDestName(String destName) {
			this.destName = destName;
		}

		public ConfigJson getConfigJson() {
			return this.configJson;
		}

		public void setConfigJson(ConfigJson configJson) {
			this.configJson = configJson;
		}

		public static class ConfigJson {

			private String ak;

			private String endpoint;

			private String logstore;

			private String project;

			public String getAk() {
				return this.ak;
			}

			public void setAk(String ak) {
				this.ak = ak;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getLogstore() {
				return this.logstore;
			}

			public void setLogstore(String logstore) {
				this.logstore = logstore;
			}

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}
		}
	}

	@Override
	public DescribeExporterOutputListResponse getInstance(UnmarshallerContext context) {
		return	DescribeExporterOutputListResponseUnmarshaller.unmarshall(this, context);
	}
}
