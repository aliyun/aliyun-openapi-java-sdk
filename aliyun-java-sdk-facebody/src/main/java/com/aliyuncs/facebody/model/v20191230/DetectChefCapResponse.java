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
import com.aliyuncs.facebody.transform.v20191230.DetectChefCapResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectChefCapResponse extends AcsResponse {

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

		private List<ElementsItem> elements;

		public List<ElementsItem> getElements() {
			return this.elements;
		}

		public void setElements(List<ElementsItem> elements) {
			this.elements = elements;
		}

		public static class ElementsItem {

			private Float confidence;

			private String category;

			private List<Float> box;

			public Float getConfidence() {
				return this.confidence;
			}

			public void setConfidence(Float confidence) {
				this.confidence = confidence;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public List<Float> getBox() {
				return this.box;
			}

			public void setBox(List<Float> box) {
				this.box = box;
			}
		}
	}

	@Override
	public DetectChefCapResponse getInstance(UnmarshallerContext context) {
		return	DetectChefCapResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
