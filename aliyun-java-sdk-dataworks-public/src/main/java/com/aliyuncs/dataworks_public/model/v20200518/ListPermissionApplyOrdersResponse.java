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
import com.aliyuncs.dataworks_public.transform.v20200518.ListPermissionApplyOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPermissionApplyOrdersResponse extends AcsResponse {

	private String requestId;

	private ApplyOrders applyOrders;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplyOrders getApplyOrders() {
		return this.applyOrders;
	}

	public void setApplyOrders(ApplyOrders applyOrders) {
		this.applyOrders = applyOrders;
	}

	public static class ApplyOrders {

		private Integer pageSize;

		private Integer pageNumber;

		private Integer totalCount;

		private List<Orders> applyOrder;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Orders> getApplyOrder() {
			return this.applyOrder;
		}

		public void setApplyOrder(List<Orders> applyOrder) {
			this.applyOrder = applyOrder;
		}

		public static class Orders {

			private String applyBaseId;

			private Long applyTimestamp;

			private String flowId;

			private Integer flowStatus;

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

			public ApproveContent getApproveContent() {
				return this.approveContent;
			}

			public void setApproveContent(ApproveContent approveContent) {
				this.approveContent = approveContent;
			}

			public static class ApproveContent {

				private String applyReason;

				private Integer orderType;

				private ProjectMeta projectMeta;

				public String getApplyReason() {
					return this.applyReason;
				}

				public void setApplyReason(String applyReason) {
					this.applyReason = applyReason;
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

					private String workspaceName;

					private List<ObjectMetaListItem> objectMetaList;

					public String getWorkspaceName() {
						return this.workspaceName;
					}

					public void setWorkspaceName(String workspaceName) {
						this.workspaceName = workspaceName;
					}

					public List<ObjectMetaListItem> getObjectMetaList() {
						return this.objectMetaList;
					}

					public void setObjectMetaList(List<ObjectMetaListItem> objectMetaList) {
						this.objectMetaList = objectMetaList;
					}

					public static class ObjectMetaListItem {

						private String objectName;

						private List<String> actions;

						public String getObjectName() {
							return this.objectName;
						}

						public void setObjectName(String objectName) {
							this.objectName = objectName;
						}

						public List<String> getActions() {
							return this.actions;
						}

						public void setActions(List<String> actions) {
							this.actions = actions;
						}
					}
				}
			}
		}
	}

	@Override
	public ListPermissionApplyOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListPermissionApplyOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
