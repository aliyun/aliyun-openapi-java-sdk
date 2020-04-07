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

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.SearchFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchFaceResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<MatchListItem> matchList;

		public List<MatchListItem> getMatchList() {
			return this.matchList;
		}

		public void setMatchList(List<MatchListItem> matchList) {
			this.matchList = matchList;
		}

		public static class MatchListItem {

			private List<FaceItemsItem> faceItems;

			private Location location;

			public List<FaceItemsItem> getFaceItems() {
				return this.faceItems;
			}

			public void setFaceItems(List<FaceItemsItem> faceItems) {
				this.faceItems = faceItems;
			}

			public Location getLocation() {
				return this.location;
			}

			public void setLocation(Location location) {
				this.location = location;
			}

			public static class FaceItemsItem {

				private String faceId;

				private Float score;

				private String extraData;

				private String entityId;

				public String getFaceId() {
					return this.faceId;
				}

				public void setFaceId(String faceId) {
					this.faceId = faceId;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}

				public String getExtraData() {
					return this.extraData;
				}

				public void setExtraData(String extraData) {
					this.extraData = extraData;
				}

				public String getEntityId() {
					return this.entityId;
				}

				public void setEntityId(String entityId) {
					this.entityId = entityId;
				}
			}

			public static class Location {

				private Integer x;

				private Integer y;

				private Integer width;

				private Integer height;

				public Integer getX() {
					return this.x;
				}

				public void setX(Integer x) {
					this.x = x;
				}

				public Integer getY() {
					return this.y;
				}

				public void setY(Integer y) {
					this.y = y;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}
			}
		}
	}

	@Override
	public SearchFaceResponse getInstance(UnmarshallerContext context) {
		return	SearchFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
