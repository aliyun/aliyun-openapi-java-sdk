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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeAclEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAclEntriesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<AclEntry> aclEntries;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AclEntry> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntry> aclEntries) {
		this.aclEntries = aclEntries;
	}

	public static class AclEntry {

		private String policy;

		private String sourceType;

		private String sourceId;

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
	}

	@Override
	public DescribeAclEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAclEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
