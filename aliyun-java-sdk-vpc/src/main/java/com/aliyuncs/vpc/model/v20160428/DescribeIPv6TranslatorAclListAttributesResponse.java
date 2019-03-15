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
import com.aliyuncs.vpc.transform.v20160428.DescribeIPv6TranslatorAclListAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIPv6TranslatorAclListAttributesResponse extends AcsResponse {

	private String requestId;

	private String aclId;

	private String aclName;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AclEntry> aclEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getAclName() {
		return this.aclName;
	}

	public void setAclName(String aclName) {
		this.aclName = aclName;
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

	public List<AclEntry> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntry> aclEntries) {
		this.aclEntries = aclEntries;
	}

	public static class AclEntry {

		private String aclEntryId;

		private String aclEntryIp;

		private String aclEntryComment;

		public String getAclEntryId() {
			return this.aclEntryId;
		}

		public void setAclEntryId(String aclEntryId) {
			this.aclEntryId = aclEntryId;
		}

		public String getAclEntryIp() {
			return this.aclEntryIp;
		}

		public void setAclEntryIp(String aclEntryIp) {
			this.aclEntryIp = aclEntryIp;
		}

		public String getAclEntryComment() {
			return this.aclEntryComment;
		}

		public void setAclEntryComment(String aclEntryComment) {
			this.aclEntryComment = aclEntryComment;
		}
	}

	@Override
	public DescribeIPv6TranslatorAclListAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIPv6TranslatorAclListAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
