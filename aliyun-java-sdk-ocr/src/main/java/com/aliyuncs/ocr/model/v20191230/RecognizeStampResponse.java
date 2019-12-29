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
import com.aliyuncs.ocr.transform.v20191230.RecognizeStampResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeStampResponse extends AcsResponse {

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

		private List<ResultsItem> results;

		public List<ResultsItem> getResults() {
			return this.results;
		}

		public void setResults(List<ResultsItem> results) {
			this.results = results;
		}

		public static class ResultsItem {

			private List<GeneralTextItem> generalText;

			private Roi roi;

			private Text text;

			public List<GeneralTextItem> getGeneralText() {
				return this.generalText;
			}

			public void setGeneralText(List<GeneralTextItem> generalText) {
				this.generalText = generalText;
			}

			public Roi getRoi() {
				return this.roi;
			}

			public void setRoi(Roi roi) {
				this.roi = roi;
			}

			public Text getText() {
				return this.text;
			}

			public void setText(Text text) {
				this.text = text;
			}

			public static class GeneralTextItem {

				private String content;

				private Float confidence;

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
			}

			public static class Roi {

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

			public static class Text {

				private String content;

				private Float confidence;

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
			}
		}
	}

	@Override
	public RecognizeStampResponse getInstance(UnmarshallerContext context) {
		return	RecognizeStampResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
