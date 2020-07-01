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

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.RecognizeActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeActionResponse extends AcsResponse {

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

		private List<Element> elements;

		public List<Element> getElements() {
			return this.elements;
		}

		public void setElements(List<Element> elements) {
			this.elements = elements;
		}

		public static class Element {

			private Integer timestamp;

			private List<BoxesItem> boxes;

			private List<Float> scores;

			private List<String> labels;

			public Integer getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Integer timestamp) {
				this.timestamp = timestamp;
			}

			public List<BoxesItem> getBoxes() {
				return this.boxes;
			}

			public void setBoxes(List<BoxesItem> boxes) {
				this.boxes = boxes;
			}

			public List<Float> getScores() {
				return this.scores;
			}

			public void setScores(List<Float> scores) {
				this.scores = scores;
			}

			public List<String> getLabels() {
				return this.labels;
			}

			public void setLabels(List<String> labels) {
				this.labels = labels;
			}

			public static class BoxesItem {

				private List<Integer> box;

				public List<Integer> getBox() {
					return this.box;
				}

				public void setBox(List<Integer> box) {
					this.box = box;
				}
			}
		}
	}

	@Override
	public RecognizeActionResponse getInstance(UnmarshallerContext context) {
		return	RecognizeActionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
