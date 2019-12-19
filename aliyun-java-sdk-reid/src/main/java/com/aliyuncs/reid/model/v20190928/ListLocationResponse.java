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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.ListLocationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLocationResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private List<LocationInfoItem> locationInfoItems;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public List<LocationInfoItem> getLocationInfoItems() {
		return this.locationInfoItems;
	}

	public void setLocationInfoItems(List<LocationInfoItem> locationInfoItems) {
		this.locationInfoItems = locationInfoItems;
	}

	public static class LocationInfoItem {

		private String externalId;

		private String locationType;

		private Integer status;

		private Long storeId;

		private Long gmtCreate;

		private Long parentLocationId;

		private Long gmtModified;

		private String locationName;

		private String layerType;

		private Long locationId;

		private List<RectRoi> rectRois;

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getLocationType() {
			return this.locationType;
		}

		public void setLocationType(String locationType) {
			this.locationType = locationType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getParentLocationId() {
			return this.parentLocationId;
		}

		public void setParentLocationId(Long parentLocationId) {
			this.parentLocationId = parentLocationId;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getLocationName() {
			return this.locationName;
		}

		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}

		public String getLayerType() {
			return this.layerType;
		}

		public void setLayerType(String layerType) {
			this.layerType = layerType;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public List<RectRoi> getRectRois() {
			return this.rectRois;
		}

		public void setRectRois(List<RectRoi> rectRois) {
			this.rectRois = rectRois;
		}

		public static class RectRoi {

			private List<Point> points;

			public List<Point> getPoints() {
				return this.points;
			}

			public void setPoints(List<Point> points) {
				this.points = points;
			}

			public static class Point {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}
	}

	@Override
	public ListLocationResponse getInstance(UnmarshallerContext context) {
		return	ListLocationResponseUnmarshaller.unmarshall(this, context);
	}
}
