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

package com.aliyuncs.jarvis.model.v20180206;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis.transform.v20180206.DescribeResetRecordListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResetRecordListResponse extends AcsResponse {

	private String requestId;

	private String module;

	private List<Data> dataList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<Data> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Data {

		private String punishType;

		private String dstIP;

		private String punishResult;

		private Integer dstPort;

		private String srcIP;

		private Integer punishCount;

		public String getPunishType() {
			return this.punishType;
		}

		public void setPunishType(String punishType) {
			this.punishType = punishType;
		}

		public String getDstIP() {
			return this.dstIP;
		}

		public void setDstIP(String dstIP) {
			this.dstIP = dstIP;
		}

		public String getPunishResult() {
			return this.punishResult;
		}

		public void setPunishResult(String punishResult) {
			this.punishResult = punishResult;
		}

		public Integer getDstPort() {
			return this.dstPort;
		}

		public void setDstPort(Integer dstPort) {
			this.dstPort = dstPort;
		}

		public String getSrcIP() {
			return this.srcIP;
		}

		public void setSrcIP(String srcIP) {
			this.srcIP = srcIP;
		}

		public Integer getPunishCount() {
			return this.punishCount;
		}

		public void setPunishCount(Integer punishCount) {
			this.punishCount = punishCount;
		}
	}

	public static class PageInfo {

		private Integer total;

		private Integer pageSize;

		private Integer currentPage;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeResetRecordListResponse getInstance(UnmarshallerContext context) {
		return	DescribeResetRecordListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
