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
import com.aliyuncs.imageprocess.transform.v20200320.ClassifyFNFResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ClassifyFNFResponse extends AcsResponse {

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

		private List<FracturesItem> fractures;

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

		public List<FracturesItem> getFractures() {
			return this.fractures;
		}

		public void setFractures(List<FracturesItem> fractures) {
			this.fractures = fractures;
		}

		public static class FracturesItem {

			private Float value;

			private List<Integer> boxes;

			private Tag tag;

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}

			public List<Integer> getBoxes() {
				return this.boxes;
			}

			public void setBoxes(List<Integer> boxes) {
				this.boxes = boxes;
			}

			public Tag getTag() {
				return this.tag;
			}

			public void setTag(Tag tag) {
				this.tag = tag;
			}

			public static class Tag {

				private String label;

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
	public ClassifyFNFResponse getInstance(UnmarshallerContext context) {
		return	ClassifyFNFResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
