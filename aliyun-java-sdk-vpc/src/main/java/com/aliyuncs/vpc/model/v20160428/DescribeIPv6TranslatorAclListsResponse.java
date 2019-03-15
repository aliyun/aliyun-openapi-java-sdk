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
import com.aliyuncs.vpc.transform.v20160428.DescribeIPv6TranslatorAclListsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIPv6TranslatorAclListsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<IPv6TranslatorAcl> ipv6TranslatorAcls;

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

	public List<IPv6TranslatorAcl> getIpv6TranslatorAcls() {
		return this.ipv6TranslatorAcls;
	}

	public void setIpv6TranslatorAcls(List<IPv6TranslatorAcl> ipv6TranslatorAcls) {
		this.ipv6TranslatorAcls = ipv6TranslatorAcls;
	}

	public static class IPv6TranslatorAcl {

		private String aclId;

		private String aclName;

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
	}

	@Override
	public DescribeIPv6TranslatorAclListsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIPv6TranslatorAclListsResponseUnmarshaller.unmarshall(this, context);
	}
}
