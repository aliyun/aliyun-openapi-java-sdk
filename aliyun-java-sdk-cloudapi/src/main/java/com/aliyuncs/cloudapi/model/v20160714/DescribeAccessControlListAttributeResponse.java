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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeAccessControlListAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccessControlListAttributeResponse extends AcsResponse {

	private String aclId;

	private String requestId;

	private String aclName;

	private List<AclEntry> aclEntrys;

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAclName() {
		return this.aclName;
	}

	public void setAclName(String aclName) {
		this.aclName = aclName;
	}

	public List<AclEntry> getAclEntrys() {
		return this.aclEntrys;
	}

	public void setAclEntrys(List<AclEntry> aclEntrys) {
		this.aclEntrys = aclEntrys;
	}

	public static class AclEntry {

		private String aclEntryIp;

		private String aclEntryComment;

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
	public DescribeAccessControlListAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccessControlListAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
