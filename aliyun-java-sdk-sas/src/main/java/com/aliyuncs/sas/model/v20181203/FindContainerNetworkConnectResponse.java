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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.FindContainerNetworkConnectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindContainerNetworkConnectResponse extends AcsResponse {

	private String requestId;

	private List<Connect> connects;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Connect> getConnects() {
		return this.connects;
	}

	public void setConnects(List<Connect> connects) {
		this.connects = connects;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Connect {

		private Long id;

		private Long firstTime;

		private Long lastTime;

		private String srcIp;

		private String srcPort;

		private String dstIp;

		private String dstPort;

		private SrcContainer srcContainer;

		private DstContainer dstContainer;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getFirstTime() {
			return this.firstTime;
		}

		public void setFirstTime(Long firstTime) {
			this.firstTime = firstTime;
		}

		public Long getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(Long lastTime) {
			this.lastTime = lastTime;
		}

		public String getSrcIp() {
			return this.srcIp;
		}

		public void setSrcIp(String srcIp) {
			this.srcIp = srcIp;
		}

		public String getSrcPort() {
			return this.srcPort;
		}

		public void setSrcPort(String srcPort) {
			this.srcPort = srcPort;
		}

		public String getDstIp() {
			return this.dstIp;
		}

		public void setDstIp(String dstIp) {
			this.dstIp = dstIp;
		}

		public String getDstPort() {
			return this.dstPort;
		}

		public void setDstPort(String dstPort) {
			this.dstPort = dstPort;
		}

		public SrcContainer getSrcContainer() {
			return this.srcContainer;
		}

		public void setSrcContainer(SrcContainer srcContainer) {
			this.srcContainer = srcContainer;
		}

		public DstContainer getDstContainer() {
			return this.dstContainer;
		}

		public void setDstContainer(DstContainer dstContainer) {
			this.dstContainer = dstContainer;
		}

		public static class SrcContainer {

			private String containerId;

			public String getContainerId() {
				return this.containerId;
			}

			public void setContainerId(String containerId) {
				this.containerId = containerId;
			}
		}

		public static class DstContainer {

			private String containerId;

			public String getContainerId() {
				return this.containerId;
			}

			public void setContainerId(String containerId) {
				this.containerId = containerId;
			}
		}
	}

	public static class PageInfo {

		private Long totalCount;

		private Long count;

		private Long pageSize;

		private Long currentPage;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public FindContainerNetworkConnectResponse getInstance(UnmarshallerContext context) {
		return	FindContainerNetworkConnectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
