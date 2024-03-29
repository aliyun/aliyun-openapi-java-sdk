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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.ListAliasesByKeyIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAliasesByKeyIdResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Alias> aliases;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Alias> getAliases() {
		return this.aliases;
	}

	public void setAliases(List<Alias> aliases) {
		this.aliases = aliases;
	}

	public static class Alias {

		private String keyId;

		private String aliasArn;

		private String aliasName;

		public String getKeyId() {
			return this.keyId;
		}

		public void setKeyId(String keyId) {
			this.keyId = keyId;
		}

		public String getAliasArn() {
			return this.aliasArn;
		}

		public void setAliasArn(String aliasArn) {
			this.aliasArn = aliasArn;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}
	}

	@Override
	public ListAliasesByKeyIdResponse getInstance(UnmarshallerContext context) {
		return	ListAliasesByKeyIdResponseUnmarshaller.unmarshall(this, context);
	}
}
