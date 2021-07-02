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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizePDFResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizePDFResponse extends AcsResponse {

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

		private Long height;

		private Long width;

		private Long orgHeight;

		private Long orgWidth;

		private Long pageIndex;

		private Long angle;

		private List<WordsInfoItem> wordsInfo;

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getOrgHeight() {
			return this.orgHeight;
		}

		public void setOrgHeight(Long orgHeight) {
			this.orgHeight = orgHeight;
		}

		public Long getOrgWidth() {
			return this.orgWidth;
		}

		public void setOrgWidth(Long orgWidth) {
			this.orgWidth = orgWidth;
		}

		public Long getPageIndex() {
			return this.pageIndex;
		}

		public void setPageIndex(Long pageIndex) {
			this.pageIndex = pageIndex;
		}

		public Long getAngle() {
			return this.angle;
		}

		public void setAngle(Long angle) {
			this.angle = angle;
		}

		public List<WordsInfoItem> getWordsInfo() {
			return this.wordsInfo;
		}

		public void setWordsInfo(List<WordsInfoItem> wordsInfo) {
			this.wordsInfo = wordsInfo;
		}

		public static class WordsInfoItem {

			private Long angle;

			private String word;

			private Long height;

			private Long width;

			private Long x;

			private Long y;

			private List<PositionsItem> positions;

			public Long getAngle() {
				return this.angle;
			}

			public void setAngle(Long angle) {
				this.angle = angle;
			}

			public String getWord() {
				return this.word;
			}

			public void setWord(String word) {
				this.word = word;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
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

			public List<PositionsItem> getPositions() {
				return this.positions;
			}

			public void setPositions(List<PositionsItem> positions) {
				this.positions = positions;
			}

			public static class PositionsItem {

				private Long x;

				private Long y;

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
			}
		}
	}

	@Override
	public RecognizePDFResponse getInstance(UnmarshallerContext context) {
		return	RecognizePDFResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
