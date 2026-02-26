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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.CreatePatchBaselineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePatchBaselineResponse extends AcsResponse {

	private String requestId;

	private PatchBaseline patchBaseline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PatchBaseline getPatchBaseline() {
		return this.patchBaseline;
	}

	public void setPatchBaseline(PatchBaseline patchBaseline) {
		this.patchBaseline = patchBaseline;
	}

	public static class PatchBaseline {

		private String operationSystem;

		private String description;

		private String updatedDate;

		private String updatedBy;

		private String createdBy;

		private String createdDate;

		private String name;

		private String approvalRules;

		private String id;

		private String shareType;

		private String rejectedPatchesAction;

		private Boolean approvedPatchesEnableNonSecurity;

		private String resourceGroupId;

		private List<TagsItem> tags;

		private List<String> rejectedPatches;

		private List<String> approvedPatches;

		private List<String> sources;

		public String getOperationSystem() {
			return this.operationSystem;
		}

		public void setOperationSystem(String operationSystem) {
			this.operationSystem = operationSystem;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUpdatedDate() {
			return this.updatedDate;
		}

		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}

		public String getUpdatedBy() {
			return this.updatedBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		public String getCreatedBy() {
			return this.createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getCreatedDate() {
			return this.createdDate;
		}

		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getApprovalRules() {
			return this.approvalRules;
		}

		public void setApprovalRules(String approvalRules) {
			this.approvalRules = approvalRules;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getShareType() {
			return this.shareType;
		}

		public void setShareType(String shareType) {
			this.shareType = shareType;
		}

		public String getRejectedPatchesAction() {
			return this.rejectedPatchesAction;
		}

		public void setRejectedPatchesAction(String rejectedPatchesAction) {
			this.rejectedPatchesAction = rejectedPatchesAction;
		}

		public Boolean getApprovedPatchesEnableNonSecurity() {
			return this.approvedPatchesEnableNonSecurity;
		}

		public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
			this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getRejectedPatches() {
			return this.rejectedPatches;
		}

		public void setRejectedPatches(List<String> rejectedPatches) {
			this.rejectedPatches = rejectedPatches;
		}

		public List<String> getApprovedPatches() {
			return this.approvedPatches;
		}

		public void setApprovedPatches(List<String> approvedPatches) {
			this.approvedPatches = approvedPatches;
		}

		public List<String> getSources() {
			return this.sources;
		}

		public void setSources(List<String> sources) {
			this.sources = sources;
		}

		public static class TagsItem {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public CreatePatchBaselineResponse getInstance(UnmarshallerContext context) {
		return	CreatePatchBaselineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
