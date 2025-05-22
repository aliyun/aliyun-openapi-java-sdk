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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeHistoryEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHistoryEventsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<ItemsItem> items;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String id;

		private String region;

		private String source;

		private String specversion;

		private String subject;

		private String time;

		private String type;

		private Data data;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSpecversion() {
			return this.specversion;
		}

		public void setSpecversion(String specversion) {
			this.specversion = specversion;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
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

			private String cmsProduct;

			private String dbType;

			private String detailImpact;

			private String detailReason;

			private String endTime;

			private String eventCategory;

			private String eventCode;

			private String eventDetail;

			private String eventId;

			private String eventImpact;

			private String eventLevel;

			private String eventReason;

			private String eventStatus;

			private String eventType;

			private String gmtCreated;

			private String gmtModified;

			private String handleStatus;

			private Integer hasLifeCycle;

			private String instanceId;

			private String instanceName;

			private Integer isClosed;

			private String product;

			private String regionId;

			private String resourceType;

			private String sourceType;

			private String startTime;

			private String uid;

			public String getCmsProduct() {
				return this.cmsProduct;
			}

			public void setCmsProduct(String cmsProduct) {
				this.cmsProduct = cmsProduct;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}

			public String getDetailImpact() {
				return this.detailImpact;
			}

			public void setDetailImpact(String detailImpact) {
				this.detailImpact = detailImpact;
			}

			public String getDetailReason() {
				return this.detailReason;
			}

			public void setDetailReason(String detailReason) {
				this.detailReason = detailReason;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getEventCategory() {
				return this.eventCategory;
			}

			public void setEventCategory(String eventCategory) {
				this.eventCategory = eventCategory;
			}

			public String getEventCode() {
				return this.eventCode;
			}

			public void setEventCode(String eventCode) {
				this.eventCode = eventCode;
			}

			public String getEventDetail() {
				return this.eventDetail;
			}

			public void setEventDetail(String eventDetail) {
				this.eventDetail = eventDetail;
			}

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public String getEventImpact() {
				return this.eventImpact;
			}

			public void setEventImpact(String eventImpact) {
				this.eventImpact = eventImpact;
			}

			public String getEventLevel() {
				return this.eventLevel;
			}

			public void setEventLevel(String eventLevel) {
				this.eventLevel = eventLevel;
			}

			public String getEventReason() {
				return this.eventReason;
			}

			public void setEventReason(String eventReason) {
				this.eventReason = eventReason;
			}

			public String getEventStatus() {
				return this.eventStatus;
			}

			public void setEventStatus(String eventStatus) {
				this.eventStatus = eventStatus;
			}

			public String getEventType() {
				return this.eventType;
			}

			public void setEventType(String eventType) {
				this.eventType = eventType;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getHandleStatus() {
				return this.handleStatus;
			}

			public void setHandleStatus(String handleStatus) {
				this.handleStatus = handleStatus;
			}

			public Integer getHasLifeCycle() {
				return this.hasLifeCycle;
			}

			public void setHasLifeCycle(Integer hasLifeCycle) {
				this.hasLifeCycle = hasLifeCycle;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Integer getIsClosed() {
				return this.isClosed;
			}

			public void setIsClosed(Integer isClosed) {
				this.isClosed = isClosed;
			}

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}
		}
	}

	@Override
	public DescribeHistoryEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHistoryEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
