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
import com.aliyuncs.imagerecog.transform.v20190930.RecognizeVehicleTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeVehicleTypeResponse extends AcsResponse {

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

		private Float threshold;

		private List<Element> elements;

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public List<Element> getElements() {
			return this.elements;
		}

		public void setElements(List<Element> elements) {
			this.elements = elements;
		}

		public static class Element {

			private String name;

			private Float score;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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
	public RecognizeVehicleTypeResponse getInstance(UnmarshallerContext context) {
		return	RecognizeVehicleTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
