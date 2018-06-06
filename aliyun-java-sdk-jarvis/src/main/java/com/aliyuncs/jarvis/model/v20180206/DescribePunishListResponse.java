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
import com.aliyuncs.jarvis.transform.v20180206.DescribePunishListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePunishListResponse extends AcsResponse {

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

		private String gmtCreate;

		private Integer srcPort;

		private Integer feedBack;

		private String gmtExpire;

		private String punishType;

		private String dstIP;

		private String punishResult;

		private String regionId;

		private Integer dstPort;

		private String protocol;

		private String srcIP;

		private String reason;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getSrcPort() {
			return this.srcPort;
		}

		public void setSrcPort(Integer srcPort) {
			this.srcPort = srcPort;
		}

		public Integer getFeedBack() {
			return this.feedBack;
		}

		public void setFeedBack(Integer feedBack) {
			this.feedBack = feedBack;
		}

		public String getGmtExpire() {
			return this.gmtExpire;
		}

		public void setGmtExpire(String gmtExpire) {
			this.gmtExpire = gmtExpire;
		}

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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getDstPort() {
			return this.dstPort;
		}

		public void setDstPort(Integer dstPort) {
			this.dstPort = dstPort;
		}

		public String getProtocol() {
			return this.protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getSrcIP() {
			return this.srcIP;
		}

		public void setSrcIP(String srcIP) {
			this.srcIP = srcIP;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
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
	public DescribePunishListResponse getInstance(UnmarshallerContext context) {
		return	DescribePunishListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
