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

package com.aliyuncs.imagerecog.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imagerecog.transform.v20190930.ClassifyingRubbishResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ClassifyingRubbishResponse extends AcsResponse {

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

		private Boolean sensitive;

		private List<Element> elements;

		public Boolean getSensitive() {
			return this.sensitive;
		}

		public void setSensitive(Boolean sensitive) {
			this.sensitive = sensitive;
		}

		public List<Element> getElements() {
			return this.elements;
		}

		public void setElements(List<Element> elements) {
			this.elements = elements;
		}

		public static class Element {

			private String category;

			private Float categoryScore;

			private String rubbish;

			private Float rubbishScore;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Float getCategoryScore() {
				return this.categoryScore;
			}

			public void setCategoryScore(Float categoryScore) {
				this.categoryScore = categoryScore;
			}

			public String getRubbish() {
				return this.rubbish;
			}

			public void setRubbish(String rubbish) {
				this.rubbish = rubbish;
			}

			public Float getRubbishScore() {
				return this.rubbishScore;
			}

			public void setRubbishScore(Float rubbishScore) {
				this.rubbishScore = rubbishScore;
			}
		}
	}

	@Override
	public ClassifyingRubbishResponse getInstance(UnmarshallerContext context) {
		return	ClassifyingRubbishResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
