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
import com.aliyuncs.facebody.transform.v20191230.DetectVideoLivingFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectVideoLivingFaceResponse extends AcsResponse {

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

			private Float faceConfidence;

			private Float liveConfidence;

			private List<Integer> rect;

			public Float getFaceConfidence() {
				return this.faceConfidence;
			}

			public void setFaceConfidence(Float faceConfidence) {
				this.faceConfidence = faceConfidence;
			}

			public Float getLiveConfidence() {
				return this.liveConfidence;
			}

			public void setLiveConfidence(Float liveConfidence) {
				this.liveConfidence = liveConfidence;
			}

			public List<Integer> getRect() {
				return this.rect;
			}

			public void setRect(List<Integer> rect) {
				this.rect = rect;
			}
		}
	}

	@Override
	public DetectVideoLivingFaceResponse getInstance(UnmarshallerContext context) {
		return	DetectVideoLivingFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
