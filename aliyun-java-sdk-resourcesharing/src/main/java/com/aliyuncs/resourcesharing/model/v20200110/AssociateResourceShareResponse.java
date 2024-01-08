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

package com.aliyuncs.resourcesharing.model.v20200110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.AssociateResourceShareResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AssociateResourceShareResponse extends AcsResponse {

	private String requestId;

	private List<ResourceShareAssociation> resourceShareAssociations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceShareAssociation> getResourceShareAssociations() {
		return this.resourceShareAssociations;
	}

	public void setResourceShareAssociations(List<ResourceShareAssociation> resourceShareAssociations) {
		this.resourceShareAssociations = resourceShareAssociations;
	}

	public static class ResourceShareAssociation {

		private String updateTime;

		private String entityId;

		private String resourceShareName;

		private String createTime;

		private String entityType;

		private String resourceShareId;

		private String associationStatusMessage;

		private String associationType;

		private String associationStatus;

		private String targetProperty;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getEntityId() {
			return this.entityId;
		}

		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}

		public String getResourceShareName() {
			return this.resourceShareName;
		}

		public void setResourceShareName(String resourceShareName) {
			this.resourceShareName = resourceShareName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEntityType() {
			return this.entityType;
		}

		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}

		public String getResourceShareId() {
			return this.resourceShareId;
		}

		public void setResourceShareId(String resourceShareId) {
			this.resourceShareId = resourceShareId;
		}

		public String getAssociationStatusMessage() {
			return this.associationStatusMessage;
		}

		public void setAssociationStatusMessage(String associationStatusMessage) {
			this.associationStatusMessage = associationStatusMessage;
		}

		public String getAssociationType() {
			return this.associationType;
		}

		public void setAssociationType(String associationType) {
			this.associationType = associationType;
		}

		public String getAssociationStatus() {
			return this.associationStatus;
		}

		public void setAssociationStatus(String associationStatus) {
			this.associationStatus = associationStatus;
		}

		public String getTargetProperty() {
			return this.targetProperty;
		}

		public void setTargetProperty(String targetProperty) {
			this.targetProperty = targetProperty;
		}
	}

	@Override
	public AssociateResourceShareResponse getInstance(UnmarshallerContext context) {
		return	AssociateResourceShareResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
