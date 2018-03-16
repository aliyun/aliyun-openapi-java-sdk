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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeSecurityGroupReferencesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityGroupReferencesResponse extends AcsResponse {

	private String requestId;

	private List<SecurityGroupReference> securityGroupReferences;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SecurityGroupReference> getSecurityGroupReferences() {
		return this.securityGroupReferences;
	}

	public void setSecurityGroupReferences(List<SecurityGroupReference> securityGroupReferences) {
		this.securityGroupReferences = securityGroupReferences;
	}

	public static class SecurityGroupReference {

		private String securityGroupId;

		private List<ReferencingSecurityGroup> referencingSecurityGroups;

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public List<ReferencingSecurityGroup> getReferencingSecurityGroups() {
			return this.referencingSecurityGroups;
		}

		public void setReferencingSecurityGroups(List<ReferencingSecurityGroup> referencingSecurityGroups) {
			this.referencingSecurityGroups = referencingSecurityGroups;
		}

		public static class ReferencingSecurityGroup {

			private String aliUid;

			private String securityGroupId;

			public String getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(String aliUid) {
				this.aliUid = aliUid;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}
		}
	}

	@Override
	public DescribeSecurityGroupReferencesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityGroupReferencesResponseUnmarshaller.unmarshall(this, context);
	}
}
