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
import com.aliyuncs.imm.transform.v20170906.DetectImageLogosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageLogosResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private List<LogosItem> logos;

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

	public List<LogosItem> getLogos() {
		return this.logos;
	}

	public void setLogos(List<LogosItem> logos) {
		this.logos = logos;
	}

	public static class LogosItem {

		private String logoName;

		private Float logoConfidence;

		private LogoBoundary logoBoundary;

		public String getLogoName() {
			return this.logoName;
		}

		public void setLogoName(String logoName) {
			this.logoName = logoName;
		}

		public Float getLogoConfidence() {
			return this.logoConfidence;
		}

		public void setLogoConfidence(Float logoConfidence) {
			this.logoConfidence = logoConfidence;
		}

		public LogoBoundary getLogoBoundary() {
			return this.logoBoundary;
		}

		public void setLogoBoundary(LogoBoundary logoBoundary) {
			this.logoBoundary = logoBoundary;
		}

		public static class LogoBoundary {

			private Integer width;

			private Integer height;

			private Integer top;

			private Integer left;

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

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}
		}
	}

	@Override
	public DetectImageLogosResponse getInstance(UnmarshallerContext context) {
		return	DetectImageLogosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
