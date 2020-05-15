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

package com.aliyuncs.imageenhan.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageenhan.transform.v20190930.IntelligentCompositionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class IntelligentCompositionResponse extends AcsResponse {

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

			private Integer minX;

			private Integer minY;

			private Integer maxX;

			private Integer maxY;

			private Float score;

			public Integer getMinX() {
				return this.minX;
			}

			public void setMinX(Integer minX) {
				this.minX = minX;
			}

			public Integer getMinY() {
				return this.minY;
			}

			public void setMinY(Integer minY) {
				this.minY = minY;
			}

			public Integer getMaxX() {
				return this.maxX;
			}

			public void setMaxX(Integer maxX) {
				this.maxX = maxX;
			}

			public Integer getMaxY() {
				return this.maxY;
			}

			public void setMaxY(Integer maxY) {
				this.maxY = maxY;
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
	public IntelligentCompositionResponse getInstance(UnmarshallerContext context) {
		return	IntelligentCompositionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
