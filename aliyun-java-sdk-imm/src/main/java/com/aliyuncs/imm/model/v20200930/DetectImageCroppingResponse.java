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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.DetectImageCroppingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageCroppingResponse extends AcsResponse {

	private String requestId;

	private List<CroppingsItem> croppings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CroppingsItem> getCroppings() {
		return this.croppings;
	}

	public void setCroppings(List<CroppingsItem> croppings) {
		this.croppings = croppings;
	}

	public static class CroppingsItem {

		private String aspectRatio;

		private Float confidence;

		private Boundary boundary;

		public String getAspectRatio() {
			return this.aspectRatio;
		}

		public void setAspectRatio(String aspectRatio) {
			this.aspectRatio = aspectRatio;
		}

		public Float getConfidence() {
			return this.confidence;
		}

		public void setConfidence(Float confidence) {
			this.confidence = confidence;
		}

		public Boundary getBoundary() {
			return this.boundary;
		}

		public void setBoundary(Boundary boundary) {
			this.boundary = boundary;
		}

		public static class Boundary {

			private Long width;

			private Long height;

			private Long left;

			private Long top;

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

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
		}
	}

	@Override
	public DetectImageCroppingResponse getInstance(UnmarshallerContext context) {
		return	DetectImageCroppingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
