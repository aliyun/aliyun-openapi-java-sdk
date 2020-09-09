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

package com.aliyuncs.imageprocess.model.v20200320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageprocess.transform.v20200320.DetectKneeKeypointXRayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectKneeKeypointXRayResponse extends AcsResponse {

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

		private String imageUrl;

		private String orgId;

		private String orgName;

		private List<KeyPointsItem> keyPoints;

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getOrgId() {
			return this.orgId;
		}

		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}

		public String getOrgName() {
			return this.orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public List<KeyPointsItem> getKeyPoints() {
			return this.keyPoints;
		}

		public void setKeyPoints(List<KeyPointsItem> keyPoints) {
			this.keyPoints = keyPoints;
		}

		public static class KeyPointsItem {

			private Float value;

			private List<Integer> coordinates;

			private Tag tag;

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}

			public List<Integer> getCoordinates() {
				return this.coordinates;
			}

			public void setCoordinates(List<Integer> coordinates) {
				this.coordinates = coordinates;
			}

			public Tag getTag() {
				return this.tag;
			}

			public void setTag(Tag tag) {
				this.tag = tag;
			}

			public static class Tag {

				private String direction;

				private String label;

				public String getDirection() {
					return this.direction;
				}

				public void setDirection(String direction) {
					this.direction = direction;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}
			}
		}
	}

	@Override
	public DetectKneeKeypointXRayResponse getInstance(UnmarshallerContext context) {
		return	DetectKneeKeypointXRayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
