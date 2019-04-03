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

package com.aliyuncs.uis.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uis.transform.v20180821.DescribeHighPriorityIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHighPriorityIpResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<HighPriorityIp> highPriorityIps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<HighPriorityIp> getHighPriorityIps() {
		return this.highPriorityIps;
	}

	public void setHighPriorityIps(List<HighPriorityIp> highPriorityIps) {
		this.highPriorityIps = highPriorityIps;
	}

	public static class HighPriorityIp {

		private String domain;

		private String ip;

		private String state;

		private String staticOffAreaId;

		private String dynamicOffAreaId;

		private String boardAreaId;

		public String getBizDomain() {
			return this.domain;
		}

		public void setBizDomain(String domain) {
			this.domain = domain;
		}

		/**
		 * @deprecated use getBizDomain instead of this.
		 */
		@Deprecated
		public String getDomain() {
			return this.domain;
		}

		/**
		 * @deprecated use setBizDomain instead of this.
		 */
		@Deprecated
		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStaticOffAreaId() {
			return this.staticOffAreaId;
		}

		public void setStaticOffAreaId(String staticOffAreaId) {
			this.staticOffAreaId = staticOffAreaId;
		}

		public String getDynamicOffAreaId() {
			return this.dynamicOffAreaId;
		}

		public void setDynamicOffAreaId(String dynamicOffAreaId) {
			this.dynamicOffAreaId = dynamicOffAreaId;
		}

		public String getBoardAreaId() {
			return this.boardAreaId;
		}

		public void setBoardAreaId(String boardAreaId) {
			this.boardAreaId = boardAreaId;
		}
	}

	@Override
	public DescribeHighPriorityIpResponse getInstance(UnmarshallerContext context) {
		return	DescribeHighPriorityIpResponseUnmarshaller.unmarshall(this, context);
	}
}
