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

package com.aliyuncs.cciotgw.model.v20210721;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cciotgw.transform.v20210721.ListConnectionPoolIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConnectionPoolIpResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Long count;

	private Long pageSize;

	private String pageId;

	private List<IpInfo> ipInfoList;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
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

	public String getPageId() {
		return this.pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public List<IpInfo> getIpInfoList() {
		return this.ipInfoList;
	}

	public void setIpInfoList(List<IpInfo> ipInfoList) {
		this.ipInfoList = ipInfoList;
	}

	public static class IpInfo {

		private String ip;

		private String cciotId;

		private String connectionPoolId;

		private String status;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getCciotId() {
			return this.cciotId;
		}

		public void setCciotId(String cciotId) {
			this.cciotId = cciotId;
		}

		public String getConnectionPoolId() {
			return this.connectionPoolId;
		}

		public void setConnectionPoolId(String connectionPoolId) {
			this.connectionPoolId = connectionPoolId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListConnectionPoolIpResponse getInstance(UnmarshallerContext context) {
		return	ListConnectionPoolIpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
