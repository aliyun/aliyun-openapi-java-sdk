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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListPrefixListsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrefixListsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Long totalCount;

	private Long maxResults;

	private List<PrefixList> prefixLists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<PrefixList> getPrefixLists() {
		return this.prefixLists;
	}

	public void setPrefixLists(List<PrefixList> prefixLists) {
		this.prefixLists = prefixLists;
	}

	public static class PrefixList {

		private String prefixListId;

		private String prefixListStatus;

		private String prefixListName;

		private String prefixListDescription;

		private String ipVersion;

		private String creationTime;

		private List<String> cidrBlocks;

		public String getPrefixListId() {
			return this.prefixListId;
		}

		public void setPrefixListId(String prefixListId) {
			this.prefixListId = prefixListId;
		}

		public String getPrefixListStatus() {
			return this.prefixListStatus;
		}

		public void setPrefixListStatus(String prefixListStatus) {
			this.prefixListStatus = prefixListStatus;
		}

		public String getPrefixListName() {
			return this.prefixListName;
		}

		public void setPrefixListName(String prefixListName) {
			this.prefixListName = prefixListName;
		}

		public String getPrefixListDescription() {
			return this.prefixListDescription;
		}

		public void setPrefixListDescription(String prefixListDescription) {
			this.prefixListDescription = prefixListDescription;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<String> getCidrBlocks() {
			return this.cidrBlocks;
		}

		public void setCidrBlocks(List<String> cidrBlocks) {
			this.cidrBlocks = cidrBlocks;
		}
	}

	@Override
	public ListPrefixListsResponse getInstance(UnmarshallerContext context) {
		return	ListPrefixListsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
