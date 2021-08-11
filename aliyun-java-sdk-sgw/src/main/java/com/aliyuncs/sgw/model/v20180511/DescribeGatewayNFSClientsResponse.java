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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayNFSClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayNFSClientsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private Boolean version3Enabled;

	private Boolean version40Enabled;

	private Boolean version41Enabled;

	private List<ClientInfo> clientInfoList;

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

	public Boolean getVersion3Enabled() {
		return this.version3Enabled;
	}

	public void setVersion3Enabled(Boolean version3Enabled) {
		this.version3Enabled = version3Enabled;
	}

	public Boolean getVersion40Enabled() {
		return this.version40Enabled;
	}

	public void setVersion40Enabled(Boolean version40Enabled) {
		this.version40Enabled = version40Enabled;
	}

	public Boolean getVersion41Enabled() {
		return this.version41Enabled;
	}

	public void setVersion41Enabled(Boolean version41Enabled) {
		this.version41Enabled = version41Enabled;
	}

	public List<ClientInfo> getClientInfoList() {
		return this.clientInfoList;
	}

	public void setClientInfoList(List<ClientInfo> clientInfoList) {
		this.clientInfoList = clientInfoList;
	}

	public static class ClientInfo {

		private String clientIpAddr;

		private Boolean hasNFSv3;

		private Boolean hasNFSv40;

		private Boolean hasNFSv41;

		public String getClientIpAddr() {
			return this.clientIpAddr;
		}

		public void setClientIpAddr(String clientIpAddr) {
			this.clientIpAddr = clientIpAddr;
		}

		public Boolean getHasNFSv3() {
			return this.hasNFSv3;
		}

		public void setHasNFSv3(Boolean hasNFSv3) {
			this.hasNFSv3 = hasNFSv3;
		}

		public Boolean getHasNFSv40() {
			return this.hasNFSv40;
		}

		public void setHasNFSv40(Boolean hasNFSv40) {
			this.hasNFSv40 = hasNFSv40;
		}

		public Boolean getHasNFSv41() {
			return this.hasNFSv41;
		}

		public void setHasNFSv41(Boolean hasNFSv41) {
			this.hasNFSv41 = hasNFSv41;
		}
	}

	@Override
	public DescribeGatewayNFSClientsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayNFSClientsResponseUnmarshaller.unmarshall(this, context);
	}
}
