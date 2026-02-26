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
import com.aliyuncs.vpc.transform.v20160428.DescribeVpcGrantRulesToEcrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcGrantRulesToEcrResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private String totalCount;

	private List<GrantRuleModelsItem> grantRuleModels;

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

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<GrantRuleModelsItem> getGrantRuleModels() {
		return this.grantRuleModels;
	}

	public void setGrantRuleModels(List<GrantRuleModelsItem> grantRuleModels) {
		this.grantRuleModels = grantRuleModels;
	}

	public static class GrantRuleModelsItem {

		private String instanceId;

		private String type;

		private Long instanceUid;

		private String regionNo;

		private String ecrId;

		private Long ecrOwnerId;

		private String creationTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getInstanceUid() {
			return this.instanceUid;
		}

		public void setInstanceUid(Long instanceUid) {
			this.instanceUid = instanceUid;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getEcrId() {
			return this.ecrId;
		}

		public void setEcrId(String ecrId) {
			this.ecrId = ecrId;
		}

		public Long getEcrOwnerId() {
			return this.ecrOwnerId;
		}

		public void setEcrOwnerId(Long ecrOwnerId) {
			this.ecrOwnerId = ecrOwnerId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DescribeVpcGrantRulesToEcrResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcGrantRulesToEcrResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
