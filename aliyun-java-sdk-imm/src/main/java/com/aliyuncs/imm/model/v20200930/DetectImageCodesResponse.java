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
import com.aliyuncs.imm.transform.v20200930.DetectImageCodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageCodesResponse extends AcsResponse {

	private String requestId;

	private List<CodesItem> codes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CodesItem> getCodes() {
		return this.codes;
	}

	public void setCodes(List<CodesItem> codes) {
		this.codes = codes;
	}

	public static class CodesItem {

		private String content;

		private Float confidence;

		private String type;

		private Boundary boundary;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Float getConfidence() {
			return this.confidence;
		}

		public void setConfidence(Float confidence) {
			this.confidence = confidence;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
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
	public DetectImageCodesResponse getInstance(UnmarshallerContext context) {
		return	DetectImageCodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
