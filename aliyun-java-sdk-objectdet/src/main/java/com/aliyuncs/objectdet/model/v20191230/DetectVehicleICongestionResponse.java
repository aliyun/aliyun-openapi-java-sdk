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

package com.aliyuncs.objectdet.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.objectdet.transform.v20191230.DetectVehicleICongestionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectVehicleICongestionResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<RegionIntersectFeaturesItem> regionIntersectFeatures;

		private List<RegionIntersectsItem> regionIntersects;

		private List<RegionIntersectMatchedItem> regionIntersectMatched;

		private List<Element> elements;

		public List<RegionIntersectFeaturesItem> getRegionIntersectFeatures() {
			return this.regionIntersectFeatures;
		}

		public void setRegionIntersectFeatures(List<RegionIntersectFeaturesItem> regionIntersectFeatures) {
			this.regionIntersectFeatures = regionIntersectFeatures;
		}

		public List<RegionIntersectsItem> getRegionIntersects() {
			return this.regionIntersects;
		}

		public void setRegionIntersects(List<RegionIntersectsItem> regionIntersects) {
			this.regionIntersects = regionIntersects;
		}

		public List<RegionIntersectMatchedItem> getRegionIntersectMatched() {
			return this.regionIntersectMatched;
		}

		public void setRegionIntersectMatched(List<RegionIntersectMatchedItem> regionIntersectMatched) {
			this.regionIntersectMatched = regionIntersectMatched;
		}

		public List<Element> getElements() {
			return this.elements;
		}

		public void setElements(List<Element> elements) {
			this.elements = elements;
		}

		public static class RegionIntersectFeaturesItem {

			private List<String> features;

			public List<String> getFeatures() {
				return this.features;
			}

			public void setFeatures(List<String> features) {
				this.features = features;
			}
		}

		public static class RegionIntersectsItem {

			private List<Long> ids;

			public List<Long> getIds() {
				return this.ids;
			}

			public void setIds(List<Long> ids) {
				this.ids = ids;
			}
		}

		public static class RegionIntersectMatchedItem {

			private List<Long> ids1;

			public List<Long> getIds1() {
				return this.ids1;
			}

			public void setIds1(List<Long> ids1) {
				this.ids1 = ids1;
			}
		}

		public static class Element {

			private String typeName;

			private Float score;

			private List<BoxesItem> boxes;

			public String getTypeName() {
				return this.typeName;
			}

			public void setTypeName(String typeName) {
				this.typeName = typeName;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public List<BoxesItem> getBoxes() {
				return this.boxes;
			}

			public void setBoxes(List<BoxesItem> boxes) {
				this.boxes = boxes;
			}

			public static class BoxesItem {

				private Long left;

				private Long top;

				private Long right;

				private Long bottom;

				public Long getLeft() {
					return this.left;
				}

				public void setLeft(Long left) {
					this.left = left;
				}

				public Long getTop() {
					return this.top;
				}

				public void setTop(Long top) {
					this.top = top;
				}

				public Long getRight() {
					return this.right;
				}

				public void setRight(Long right) {
					this.right = right;
				}

				public Long getBottom() {
					return this.bottom;
				}

				public void setBottom(Long bottom) {
					this.bottom = bottom;
				}
			}
		}
	}

	@Override
	public DetectVehicleICongestionResponse getInstance(UnmarshallerContext context) {
		return	DetectVehicleICongestionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
