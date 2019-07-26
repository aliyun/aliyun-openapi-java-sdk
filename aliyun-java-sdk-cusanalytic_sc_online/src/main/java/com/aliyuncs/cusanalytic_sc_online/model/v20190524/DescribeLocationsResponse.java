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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.DescribeLocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLocationsResponse extends AcsResponse {

	private String storeId;

	private List<LocationMsgItem> locationMsgItems;

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public List<LocationMsgItem> getLocationMsgItems() {
		return this.locationMsgItems;
	}

	public void setLocationMsgItems(List<LocationMsgItem> locationMsgItems) {
		this.locationMsgItems = locationMsgItems;
	}

	public static class LocationMsgItem {

		private String tag;

		private Long id;

		private String extId;

		private String locationType;

		private String name;

		private Long status;

		private String gmtCreate;

		private Long storeId;

		private String gmtModified;

		private Long parentLocationId;

		private String layerType;

		private List<RectRoi> rectRois;

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getExtId() {
			return this.extId;
		}

		public void setExtId(String extId) {
			this.extId = extId;
		}

		public String getLocationType() {
			return this.locationType;
		}

		public void setLocationType(String locationType) {
			this.locationType = locationType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getParentLocationId() {
			return this.parentLocationId;
		}

		public void setParentLocationId(Long parentLocationId) {
			this.parentLocationId = parentLocationId;
		}

		public String getLayerType() {
			return this.layerType;
		}

		public void setLayerType(String layerType) {
			this.layerType = layerType;
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
	public DescribeLocationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLocationsResponseUnmarshaller.unmarshall(this, context);
	}
}
