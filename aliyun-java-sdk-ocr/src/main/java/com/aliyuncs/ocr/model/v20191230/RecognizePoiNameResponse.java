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
import com.aliyuncs.ocr.transform.v20191230.RecognizePoiNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizePoiNameResponse extends AcsResponse {

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

		private List<SignboardsItem> signboards;

		private Summary summary;

		public List<SignboardsItem> getSignboards() {
			return this.signboards;
		}

		public void setSignboards(List<SignboardsItem> signboards) {
			this.signboards = signboards;
		}

		public Summary getSummary() {
			return this.summary;
		}

		public void setSummary(Summary summary) {
			this.summary = summary;
		}

		public static class SignboardsItem {

			private List<TextsItem> texts;

			public List<TextsItem> getTexts() {
				return this.texts;
			}

			public void setTexts(List<TextsItem> texts) {
				this.texts = texts;
			}

			public static class TextsItem {

				private String label;

				private Float score;

				private String tag;

				private String type;

				private List<Integer> points;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}

				public String getTag() {
					return this.tag;
				}

				public void setTag(String tag) {
					this.tag = tag;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public List<Integer> getPoints() {
					return this.points;
				}

				public void setPoints(List<Integer> points) {
					this.points = points;
				}
			}
		}

		public static class Summary {

			private String brand;

			private Float score;

			public String getBrand() {
				return this.brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}
		}
	}

	@Override
	public RecognizePoiNameResponse getInstance(UnmarshallerContext context) {
		return	RecognizePoiNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
