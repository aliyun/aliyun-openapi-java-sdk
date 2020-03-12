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

		private Long id;

		private Long userId;

		private String loginName;

		private String displayName;

		private String productCode;

		private String typeCode;

		private String typeName;

		private String subTypeCode;

		private String subTypeName;

		private Long alertTime;

		private String dataInstance;

		private Long eventTime;

		private Integer status;

		private String statusName;

		private Long dealUserId;

		private String dealLoginName;

		private String dealDisplayName;

		private Long dealTime;

		private String departName;

		private Boolean backed;

		private String dealReason;

		private Detail detail;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getTypeCode() {
			return this.typeCode;
		}

		public void setTypeCode(String typeCode) {
			this.typeCode = typeCode;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getSubTypeCode() {
			return this.subTypeCode;
		}

		public void setSubTypeCode(String subTypeCode) {
			this.subTypeCode = subTypeCode;
		}

		public String getSubTypeName() {
			return this.subTypeName;
		}

		public void setSubTypeName(String subTypeName) {
			this.subTypeName = subTypeName;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
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

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public Long getDealUserId() {
			return this.dealUserId;
		}

		public void setDealUserId(Long dealUserId) {
			this.dealUserId = dealUserId;
		}

		public String getDealLoginName() {
			return this.dealLoginName;
		}

		public void setDealLoginName(String dealLoginName) {
			this.dealLoginName = dealLoginName;
		}

		public String getDealDisplayName() {
			return this.dealDisplayName;
		}

		public void setDealDisplayName(String dealDisplayName) {
			this.dealDisplayName = dealDisplayName;
		}

		public Long getDealTime() {
			return this.dealTime;
		}

		public void setDealTime(Long dealTime) {
			this.dealTime = dealTime;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Boolean getBacked() {
			return this.backed;
		}

		public void setBacked(Boolean backed) {
			this.backed = backed;
		}

		public String getDealReason() {
			return this.dealReason;
		}

		public void setDealReason(String dealReason) {
			this.dealReason = dealReason;
		}

		public Detail getDetail() {
			return this.detail;
		}

		public void setDetail(Detail detail) {
			this.detail = detail;
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

				private String label;

				private String xLabel;

				private String yLabel;

				private String type;

				private Data data;

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

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Data getData() {
					return this.data;
				}

				public void setData(Data data) {
					this.data = data;
				}

				public static class Data {

					private String x;

					private String y;

					public String getX() {
						return this.x;
					}

					public void setX(String x) {
						this.x = x;
					}

					public String getY() {
						return this.y;
					}

					public void setY(String y) {
						this.y = y;
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
