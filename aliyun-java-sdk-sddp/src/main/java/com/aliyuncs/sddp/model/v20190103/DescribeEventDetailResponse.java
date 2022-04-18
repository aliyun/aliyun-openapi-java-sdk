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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeEventDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventDetailResponse extends AcsResponse {

	private String requestId;

	private Event event;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public static class Event {

		private String displayName;

		private Integer status;

		private String dealReason;

		private Long userId;

		private String statusName;

		private String departName;

		private Long dealTime;

		private String dealLoginName;

		private String subTypeName;

		private Boolean backed;

		private String dataInstance;

		private Long eventTime;

		private String loginName;

		private String userIdValue;

		private String subTypeCode;

		private String logDetail;

		private String typeCode;

		private String dealUserIdValue;

		private Long alertTime;

		private Long dealUserId;

		private String typeName;

		private String dealDisplayName;

		private Long id;

		private String productCode;

		private List<HandleInfo> handleInfoList;

		private Detail detail;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDealReason() {
			return this.dealReason;
		}

		public void setDealReason(String dealReason) {
			this.dealReason = dealReason;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Long getDealTime() {
			return this.dealTime;
		}

		public void setDealTime(Long dealTime) {
			this.dealTime = dealTime;
		}

		public String getDealLoginName() {
			return this.dealLoginName;
		}

		public void setDealLoginName(String dealLoginName) {
			this.dealLoginName = dealLoginName;
		}

		public String getSubTypeName() {
			return this.subTypeName;
		}

		public void setSubTypeName(String subTypeName) {
			this.subTypeName = subTypeName;
		}

		public Boolean getBacked() {
			return this.backed;
		}

		public void setBacked(Boolean backed) {
			this.backed = backed;
		}

		public String getDataInstance() {
			return this.dataInstance;
		}

		public void setDataInstance(String dataInstance) {
			this.dataInstance = dataInstance;
		}

		public Long getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(Long eventTime) {
			this.eventTime = eventTime;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getUserIdValue() {
			return this.userIdValue;
		}

		public void setUserIdValue(String userIdValue) {
			this.userIdValue = userIdValue;
		}

		public String getSubTypeCode() {
			return this.subTypeCode;
		}

		public void setSubTypeCode(String subTypeCode) {
			this.subTypeCode = subTypeCode;
		}

		public String getLogDetail() {
			return this.logDetail;
		}

		public void setLogDetail(String logDetail) {
			this.logDetail = logDetail;
		}

		public String getTypeCode() {
			return this.typeCode;
		}

		public void setTypeCode(String typeCode) {
			this.typeCode = typeCode;
		}

		public String getDealUserIdValue() {
			return this.dealUserIdValue;
		}

		public void setDealUserIdValue(String dealUserIdValue) {
			this.dealUserIdValue = dealUserIdValue;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
		}

		public Long getDealUserId() {
			return this.dealUserId;
		}

		public void setDealUserId(Long dealUserId) {
			this.dealUserId = dealUserId;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getDealDisplayName() {
			return this.dealDisplayName;
		}

		public void setDealDisplayName(String dealDisplayName) {
			this.dealDisplayName = dealDisplayName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public List<HandleInfo> getHandleInfoList() {
			return this.handleInfoList;
		}

		public void setHandleInfoList(List<HandleInfo> handleInfoList) {
			this.handleInfoList = handleInfoList;
		}

		public Detail getDetail() {
			return this.detail;
		}

		public void setDetail(Detail detail) {
			this.detail = detail;
		}

		public static class HandleInfo {

			private Integer status;

			private Long enableTime;

			private Integer handlerValue;

			private Long disableTime;

			private String handlerName;

			private String handlerType;

			private String currentValue;

			private Long id;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getEnableTime() {
				return this.enableTime;
			}

			public void setEnableTime(Long enableTime) {
				this.enableTime = enableTime;
			}

			public Integer getHandlerValue() {
				return this.handlerValue;
			}

			public void setHandlerValue(Integer handlerValue) {
				this.handlerValue = handlerValue;
			}

			public Long getDisableTime() {
				return this.disableTime;
			}

			public void setDisableTime(Long disableTime) {
				this.disableTime = disableTime;
			}

			public String getHandlerName() {
				return this.handlerName;
			}

			public void setHandlerName(String handlerName) {
				this.handlerName = handlerName;
			}

			public String getHandlerType() {
				return this.handlerType;
			}

			public void setHandlerType(String handlerType) {
				this.handlerType = handlerType;
			}

			public String getCurrentValue() {
				return this.currentValue;
			}

			public void setCurrentValue(String currentValue) {
				this.currentValue = currentValue;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}

		public static class Detail {

			private List<ContentItem> content;

			private List<ChartItem> chart;

			private List<ResourceInfoItem> resourceInfo;

			public List<ContentItem> getContent() {
				return this.content;
			}

			public void setContent(List<ContentItem> content) {
				this.content = content;
			}

			public List<ChartItem> getChart() {
				return this.chart;
			}

			public void setChart(List<ChartItem> chart) {
				this.chart = chart;
			}

			public List<ResourceInfoItem> getResourceInfo() {
				return this.resourceInfo;
			}

			public void setResourceInfo(List<ResourceInfoItem> resourceInfo) {
				this.resourceInfo = resourceInfo;
			}

			public static class ContentItem {

				private String label;

				private String value;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ChartItem {

				private String type;

				private String label;

				private String xLabel;

				private String yLabel;

				private Data data;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getXLabel() {
					return this.xLabel;
				}

				public void setXLabel(String xLabel) {
					this.xLabel = xLabel;
				}

				public String getYLabel() {
					return this.yLabel;
				}

				public void setYLabel(String yLabel) {
					this.yLabel = yLabel;
				}

				public Data getData() {
					return this.data;
				}

				public void setData(Data data) {
					this.data = data;
				}

				public static class Data {

					private List<String> y;

					private List<String> x;

					public List<String> getY() {
						return this.y;
					}

					public void setY(List<String> y) {
						this.y = y;
					}

					public List<String> getX() {
						return this.x;
					}

					public void setX(List<String> x) {
						this.x = x;
					}
				}
			}

			public static class ResourceInfoItem {

				private String label;

				private String value;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public DescribeEventDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
