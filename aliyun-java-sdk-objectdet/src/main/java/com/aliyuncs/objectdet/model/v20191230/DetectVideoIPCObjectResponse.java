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
import com.aliyuncs.objectdet.transform.v20191230.DetectVideoIPCObjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectVideoIPCObjectResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long width;

		private Long height;

		private String inputFile;

		private List<Frame> frames;

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

		public String getInputFile() {
			return this.inputFile;
		}

		public void setInputFile(String inputFile) {
			this.inputFile = inputFile;
		}

		public List<Frame> getFrames() {
			return this.frames;
		}

		public void setFrames(List<Frame> frames) {
			this.frames = frames;
		}

		public static class Frame {

			private Long time;

			private List<ElementsItem> elements;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public List<ElementsItem> getElements() {
				return this.elements;
			}

			public void setElements(List<ElementsItem> elements) {
				this.elements = elements;
			}

			public static class ElementsItem {

				private String type;

				private Long x;

				private Long y;

				private Long width;

				private Long height;

				private Float score;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Long getX() {
					return this.x;
				}

				public void setX(Long x) {
					this.x = x;
				}

				public Long getY() {
					return this.y;
				}

				public void setY(Long y) {
					this.y = y;
				}

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

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}
		}
	}

	@Override
	public DetectVideoIPCObjectResponse getInstance(UnmarshallerContext context) {
		return	DetectVideoIPCObjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
