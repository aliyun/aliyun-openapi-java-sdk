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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeMountedClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMountedClientsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Client> clients;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public static class Client {

		private String clientIP;

		public String getClientIP() {
			return this.clientIP;
		}

		public void setClientIP(String clientIP) {
			this.clientIP = clientIP;
		}
	}

	@Override
	public DescribeMountedClientsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMountedClientsResponseUnmarshaller.unmarshall(this, context);
	}
}
