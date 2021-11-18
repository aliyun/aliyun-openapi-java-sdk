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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idaas_doraemon.transform.v20210520.ListPwnedPasswordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPwnedPasswordsResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long totalCount;

	private Long pageSize;

	private List<Items> pwnedPasswordInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Items> getPwnedPasswordInfos() {
		return this.pwnedPasswordInfos;
	}

	public void setPwnedPasswordInfos(List<Items> pwnedPasswordInfos) {
		this.pwnedPasswordInfos = pwnedPasswordInfos;
	}

	public static class Items {

		private String hexPasswordSha1Hash;

		private Long pwnedCount;

		public String getHexPasswordSha1Hash() {
			return this.hexPasswordSha1Hash;
		}

		public void setHexPasswordSha1Hash(String hexPasswordSha1Hash) {
			this.hexPasswordSha1Hash = hexPasswordSha1Hash;
		}

		public Long getPwnedCount() {
			return this.pwnedCount;
		}

		public void setPwnedCount(Long pwnedCount) {
			this.pwnedCount = pwnedCount;
		}
	}

	@Override
	public ListPwnedPasswordsResponse getInstance(UnmarshallerContext context) {
		return	ListPwnedPasswordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
