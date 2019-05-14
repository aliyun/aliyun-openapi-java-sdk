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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.DetectImageBodiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageBodiesResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private List<BodiesItem> bodies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public List<BodiesItem> getBodies() {
		return this.bodies;
	}

	public void setBodies(List<BodiesItem> bodies) {
		this.bodies = bodies;
	}

	public static class BodiesItem {

		private Float bodyConfidence;

		private BodyBoundary bodyBoundary;

		public Float getBodyConfidence() {
			return this.bodyConfidence;
		}

		public void setBodyConfidence(Float bodyConfidence) {
			this.bodyConfidence = bodyConfidence;
		}

		public BodyBoundary getBodyBoundary() {
			return this.bodyBoundary;
		}

		public void setBodyBoundary(BodyBoundary bodyBoundary) {
			this.bodyBoundary = bodyBoundary;
		}

		public static class BodyBoundary {

			private Integer left;

			private Integer top;

			private Integer width;

			private Integer height;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
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

	@Override
	public DetectImageBodiesResponse getInstance(UnmarshallerContext context) {
		return	DetectImageBodiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
