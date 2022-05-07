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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetPermissionApplyOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPermissionApplyOrderDetailResponse extends AcsResponse {

	private String requestId;

	private ApplyOrderDetail applyOrderDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplyOrderDetail getApplyOrderDetail() {
		return this.applyOrderDetail;
	}

	public void setApplyOrderDetail(ApplyOrderDetail applyOrderDetail) {
		this.applyOrderDetail = applyOrderDetail;
	}

	public static class ApplyOrderDetail {

		private String applyBaseId;

		private Long applyTimestamp;

		private String flowId;

		private Integer flowStatus;

		private List<ApproveAccountListItem> approveAccountList;

		private List<GranteeObjectListItem> granteeObjectList;

		private ApproveContent approveContent;

		public String getApplyBaseId() {
			return this.applyBaseId;
		}

		public void setApplyBaseId(String applyBaseId) {
			this.applyBaseId = applyBaseId;
		}

		public Long getApplyTimestamp() {
			return this.applyTimestamp;
		}

		public void setApplyTimestamp(Long applyTimestamp) {
			this.applyTimestamp = applyTimestamp;
		}

		public String getFlowId() {
			return this.flowId;
		}

		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}

		public Integer getFlowStatus() {
			return this.flowStatus;
		}

		public void setFlowStatus(Integer flowStatus) {
			this.flowStatus = flowStatus;
		}

		public List<ApproveAccountListItem> getApproveAccountList() {
			return this.approveAccountList;
		}

		public void setApproveAccountList(List<ApproveAccountListItem> approveAccountList) {
			this.approveAccountList = approveAccountList;
		}

		public List<GranteeObjectListItem> getGranteeObjectList() {
			return this.granteeObjectList;
		}

		public void setGranteeObjectList(List<GranteeObjectListItem> granteeObjectList) {
			this.granteeObjectList = granteeObjectList;
		}

		public ApproveContent getApproveContent() {
			return this.approveContent;
		}

		public void setApproveContent(ApproveContent approveContent) {
			this.approveContent = approveContent;
		}

		public static class ApproveAccountListItem {

			private String baseId;

			public String getBaseId() {
				return this.baseId;
			}

			public void setBaseId(String baseId) {
				this.baseId = baseId;
			}
		}

		public static class GranteeObjectListItem {

			private Integer granteeType;

			private Integer granteeTypeSub;

			private String granteeName;

			private String granteeId;

			public Integer getGranteeType() {
				return this.granteeType;
			}

			public void setGranteeType(Integer granteeType) {
				this.granteeType = granteeType;
			}

			public Integer getGranteeTypeSub() {
				return this.granteeTypeSub;
			}

			public void setGranteeTypeSub(Integer granteeTypeSub) {
				this.granteeTypeSub = granteeTypeSub;
			}

			public String getGranteeName() {
				return this.granteeName;
			}

			public void setGranteeName(String granteeName) {
				this.granteeName = granteeName;
			}

			public String getGranteeId() {
				return this.granteeId;
			}

			public void setGranteeId(String granteeId) {
				this.granteeId = granteeId;
			}
		}

		public static class ApproveContent {

			private String applyReason;

			private Long deadline;

			private Integer orderType;

			private ProjectMeta projectMeta;

			public String getApplyReason() {
				return this.applyReason;
			}

			public void setApplyReason(String applyReason) {
				this.applyReason = applyReason;
			}

			public Long getDeadline() {
				return this.deadline;
			}

			public void setDeadline(Long deadline) {
				this.deadline = deadline;
			}

			public Integer getOrderType() {
				return this.orderType;
			}

			public void setOrderType(Integer orderType) {
				this.orderType = orderType;
			}

			public ProjectMeta getProjectMeta() {
				return this.projectMeta;
			}

			public void setProjectMeta(ProjectMeta projectMeta) {
				this.projectMeta = projectMeta;
			}

			public static class ProjectMeta {

				private String maxComputeProjectName;

				private Integer workspaceId;

				private List<ObjectMetaListItem> objectMetaList;

				public String getMaxComputeProjectName() {
					return this.maxComputeProjectName;
				}

				public void setMaxComputeProjectName(String maxComputeProjectName) {
					this.maxComputeProjectName = maxComputeProjectName;
				}

				public Integer getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(Integer workspaceId) {
					this.workspaceId = workspaceId;
				}

				public List<ObjectMetaListItem> getObjectMetaList() {
					return this.objectMetaList;
				}

				public void setObjectMetaList(List<ObjectMetaListItem> objectMetaList) {
					this.objectMetaList = objectMetaList;
				}

				public static class ObjectMetaListItem {

					private String objectName;

					private List<ColumnMetaListItem> columnMetaList;

					public String getObjectName() {
						return this.objectName;
					}

					public void setObjectName(String objectName) {
						this.objectName = objectName;
					}

					public List<ColumnMetaListItem> getColumnMetaList() {
						return this.columnMetaList;
					}

					public void setColumnMetaList(List<ColumnMetaListItem> columnMetaList) {
						this.columnMetaList = columnMetaList;
					}

					public static class ColumnMetaListItem {

						private String columnName;

						private String columnComment;

						public String getColumnName() {
							return this.columnName;
						}

						public void setColumnName(String columnName) {
							this.columnName = columnName;
						}

						public String getColumnComment() {
							return this.columnComment;
						}

						public void setColumnComment(String columnComment) {
							this.columnComment = columnComment;
						}
					}
				}
			}
		}
	}

	@Override
	public GetPermissionApplyOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetPermissionApplyOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
