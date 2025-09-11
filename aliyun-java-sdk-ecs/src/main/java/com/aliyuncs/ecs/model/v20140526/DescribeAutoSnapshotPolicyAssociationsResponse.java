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
import com.aliyuncs.ecs.transform.v20140526.DescribeAutoSnapshotPolicyAssociationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoSnapshotPolicyAssociationsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<AutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociations;

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

	public List<AutoSnapshotPolicyAssociation> getAutoSnapshotPolicyAssociations() {
		return this.autoSnapshotPolicyAssociations;
	}

	public void setAutoSnapshotPolicyAssociations(List<AutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociations) {
		this.autoSnapshotPolicyAssociations = autoSnapshotPolicyAssociations;
	}

	public static class AutoSnapshotPolicyAssociation {

		private String autoSnapshotPolicyId;

		private String diskId;

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}
	}

	@Override
	public DescribeAutoSnapshotPolicyAssociationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoSnapshotPolicyAssociationsResponseUnmarshaller.unmarshall(this, context);
	}
}
