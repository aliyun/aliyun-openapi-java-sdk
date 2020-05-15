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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetDWSJdbcwriterOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDWSJdbcwriterOverviewResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageTotal;

		private List<JdbcwriterOverviewListItem> jdbcwriterOverviewList;

		private List<String> destDbTypeList;

		public Long getPageTotal() {
			return this.pageTotal;
		}

		public void setPageTotal(Long pageTotal) {
			this.pageTotal = pageTotal;
		}

		public List<JdbcwriterOverviewListItem> getJdbcwriterOverviewList() {
			return this.jdbcwriterOverviewList;
		}

		public void setJdbcwriterOverviewList(List<JdbcwriterOverviewListItem> jdbcwriterOverviewList) {
			this.jdbcwriterOverviewList = jdbcwriterOverviewList;
		}

		public List<String> getDestDbTypeList() {
			return this.destDbTypeList;
		}

		public void setDestDbTypeList(List<String> destDbTypeList) {
			this.destDbTypeList = destDbTypeList;
		}

		public static class JdbcwriterOverviewListItem {

			private Long crawlerDelay;

			private String crawlerName;

			private String destDbtype;

			private Long iops;

			private Long jdbcwriterDelay;

			private String jdbcwriterName;

			private String location;

			private String monitorTime;

			private Long rps;

			private String sourceDbtype;

			private Long status;

			public Long getCrawlerDelay() {
				return this.crawlerDelay;
			}

			public void setCrawlerDelay(Long crawlerDelay) {
				this.crawlerDelay = crawlerDelay;
			}

			public String getCrawlerName() {
				return this.crawlerName;
			}

			public void setCrawlerName(String crawlerName) {
				this.crawlerName = crawlerName;
			}

			public String getDestDbtype() {
				return this.destDbtype;
			}

			public void setDestDbtype(String destDbtype) {
				this.destDbtype = destDbtype;
			}

			public Long getIops() {
				return this.iops;
			}

			public void setIops(Long iops) {
				this.iops = iops;
			}

			public Long getJdbcwriterDelay() {
				return this.jdbcwriterDelay;
			}

			public void setJdbcwriterDelay(Long jdbcwriterDelay) {
				this.jdbcwriterDelay = jdbcwriterDelay;
			}

			public String getJdbcwriterName() {
				return this.jdbcwriterName;
			}

			public void setJdbcwriterName(String jdbcwriterName) {
				this.jdbcwriterName = jdbcwriterName;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getMonitorTime() {
				return this.monitorTime;
			}

			public void setMonitorTime(String monitorTime) {
				this.monitorTime = monitorTime;
			}

			public Long getRps() {
				return this.rps;
			}

			public void setRps(Long rps) {
				this.rps = rps;
			}

			public String getSourceDbtype() {
				return this.sourceDbtype;
			}

			public void setSourceDbtype(String sourceDbtype) {
				this.sourceDbtype = sourceDbtype;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}
		}
	}

	@Override
	public GetDWSJdbcwriterOverviewResponse getInstance(UnmarshallerContext context) {
		return	GetDWSJdbcwriterOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
