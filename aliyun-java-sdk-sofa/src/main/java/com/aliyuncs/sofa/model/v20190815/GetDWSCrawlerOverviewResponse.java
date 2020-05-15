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
import com.aliyuncs.sofa.transform.v20190815.GetDWSCrawlerOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDWSCrawlerOverviewResponse extends AcsResponse {

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

		private List<CrawlerOverviewListItem> crawlerOverviewList;

		private List<String> dbTypeList;

		public Long getPageTotal() {
			return this.pageTotal;
		}

		public void setPageTotal(Long pageTotal) {
			this.pageTotal = pageTotal;
		}

		public List<CrawlerOverviewListItem> getCrawlerOverviewList() {
			return this.crawlerOverviewList;
		}

		public void setCrawlerOverviewList(List<CrawlerOverviewListItem> crawlerOverviewList) {
			this.crawlerOverviewList = crawlerOverviewList;
		}

		public List<String> getDbTypeList() {
			return this.dbTypeList;
		}

		public void setDbTypeList(List<String> dbTypeList) {
			this.dbTypeList = dbTypeList;
		}

		public static class CrawlerOverviewListItem {

			private String beginTimeStamp;

			private Long conn;

			private Long crawlerDelay;

			private String crawlerName;

			private String dbType;

			private String endTimeStamp;

			private Long ios;

			private String location;

			private String monitorTime;

			private String status;

			private String tps;

			public String getBeginTimeStamp() {
				return this.beginTimeStamp;
			}

			public void setBeginTimeStamp(String beginTimeStamp) {
				this.beginTimeStamp = beginTimeStamp;
			}

			public Long getConn() {
				return this.conn;
			}

			public void setConn(Long conn) {
				this.conn = conn;
			}

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

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}

			public String getEndTimeStamp() {
				return this.endTimeStamp;
			}

			public void setEndTimeStamp(String endTimeStamp) {
				this.endTimeStamp = endTimeStamp;
			}

			public Long getIos() {
				return this.ios;
			}

			public void setIos(Long ios) {
				this.ios = ios;
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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTps() {
				return this.tps;
			}

			public void setTps(String tps) {
				this.tps = tps;
			}
		}
	}

	@Override
	public GetDWSCrawlerOverviewResponse getInstance(UnmarshallerContext context) {
		return	GetDWSCrawlerOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
