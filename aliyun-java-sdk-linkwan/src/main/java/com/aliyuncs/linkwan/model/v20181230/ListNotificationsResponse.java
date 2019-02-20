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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListNotificationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNotificationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<Notification> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Notification> getList() {
			return this.list;
		}

		public void setList(List<Notification> list) {
			this.list = list;
		}

		public static class Notification {

			private String notificationId;

			private String category;

			private String handleState;

			private Long noticeMillis;

			private Long handledMillis;

			private GatewayOfflineInfo gatewayOfflineInfo;

			private JoinPermissionAuthInfo joinPermissionAuthInfo;

			public String getNotificationId() {
				return this.notificationId;
			}

			public void setNotificationId(String notificationId) {
				this.notificationId = notificationId;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getHandleState() {
				return this.handleState;
			}

			public void setHandleState(String handleState) {
				this.handleState = handleState;
			}

			public Long getNoticeMillis() {
				return this.noticeMillis;
			}

			public void setNoticeMillis(Long noticeMillis) {
				this.noticeMillis = noticeMillis;
			}

			public Long getHandledMillis() {
				return this.handledMillis;
			}

			public void setHandledMillis(Long handledMillis) {
				this.handledMillis = handledMillis;
			}

			public GatewayOfflineInfo getGatewayOfflineInfo() {
				return this.gatewayOfflineInfo;
			}

			public void setGatewayOfflineInfo(GatewayOfflineInfo gatewayOfflineInfo) {
				this.gatewayOfflineInfo = gatewayOfflineInfo;
			}

			public JoinPermissionAuthInfo getJoinPermissionAuthInfo() {
				return this.joinPermissionAuthInfo;
			}

			public void setJoinPermissionAuthInfo(JoinPermissionAuthInfo joinPermissionAuthInfo) {
				this.joinPermissionAuthInfo = joinPermissionAuthInfo;
			}

			public static class GatewayOfflineInfo {

				private String gwEui;

				private Long offlineMillis;

				public String getGwEui() {
					return this.gwEui;
				}

				public void setGwEui(String gwEui) {
					this.gwEui = gwEui;
				}

				public Long getOfflineMillis() {
					return this.offlineMillis;
				}

				public void setOfflineMillis(Long offlineMillis) {
					this.offlineMillis = offlineMillis;
				}
			}

			public static class JoinPermissionAuthInfo {

				private String orderId;

				private String joinPermissionId;

				private String ownerAliyunId;

				private String renterAliyunId;

				private String orderState;

				private Long applyingMillis;

				private Long acceptedMillis;

				private Long canceledMillis;

				private Long rejectedMillis;

				private String joinEui;

				private String joinPermissionName;

				public String getOrderId() {
					return this.orderId;
				}

				public void setOrderId(String orderId) {
					this.orderId = orderId;
				}

				public String getJoinPermissionId() {
					return this.joinPermissionId;
				}

				public void setJoinPermissionId(String joinPermissionId) {
					this.joinPermissionId = joinPermissionId;
				}

				public String getOwnerAliyunId() {
					return this.ownerAliyunId;
				}

				public void setOwnerAliyunId(String ownerAliyunId) {
					this.ownerAliyunId = ownerAliyunId;
				}

				public String getRenterAliyunId() {
					return this.renterAliyunId;
				}

				public void setRenterAliyunId(String renterAliyunId) {
					this.renterAliyunId = renterAliyunId;
				}

				public String getOrderState() {
					return this.orderState;
				}

				public void setOrderState(String orderState) {
					this.orderState = orderState;
				}

				public Long getApplyingMillis() {
					return this.applyingMillis;
				}

				public void setApplyingMillis(Long applyingMillis) {
					this.applyingMillis = applyingMillis;
				}

				public Long getAcceptedMillis() {
					return this.acceptedMillis;
				}

				public void setAcceptedMillis(Long acceptedMillis) {
					this.acceptedMillis = acceptedMillis;
				}

				public Long getCanceledMillis() {
					return this.canceledMillis;
				}

				public void setCanceledMillis(Long canceledMillis) {
					this.canceledMillis = canceledMillis;
				}

				public Long getRejectedMillis() {
					return this.rejectedMillis;
				}

				public void setRejectedMillis(Long rejectedMillis) {
					this.rejectedMillis = rejectedMillis;
				}

				public String getJoinEui() {
					return this.joinEui;
				}

				public void setJoinEui(String joinEui) {
					this.joinEui = joinEui;
				}

				public String getJoinPermissionName() {
					return this.joinPermissionName;
				}

				public void setJoinPermissionName(String joinPermissionName) {
					this.joinPermissionName = joinPermissionName;
				}
			}
		}
	}

	@Override
	public ListNotificationsResponse getInstance(UnmarshallerContext context) {
		return	ListNotificationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
