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
import com.aliyuncs.facebody.transform.v20191230.VerifyFaceMaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyFaceMaskResponse extends AcsResponse {

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

		private Float confidence;

		private Integer mask;

		private Integer maskRef;

		private List<Integer> rectangle;

		private List<Integer> rectangleRef;

		private List<Float> thresholds;

		public Float getConfidence() {
			return this.confidence;
		}

		public void setConfidence(Float confidence) {
			this.confidence = confidence;
		}

		public Integer getMask() {
			return this.mask;
		}

		public void setMask(Integer mask) {
			this.mask = mask;
		}

		public Integer getMaskRef() {
			return this.maskRef;
		}

		public void setMaskRef(Integer maskRef) {
			this.maskRef = maskRef;
		}

		public List<Integer> getRectangle() {
			return this.rectangle;
		}

		public void setRectangle(List<Integer> rectangle) {
			this.rectangle = rectangle;
		}

		public List<Integer> getRectangleRef() {
			return this.rectangleRef;
		}

		public void setRectangleRef(List<Integer> rectangleRef) {
			this.rectangleRef = rectangleRef;
		}

		public List<Float> getThresholds() {
			return this.thresholds;
		}

		public void setThresholds(List<Float> thresholds) {
			this.thresholds = thresholds;
		}
	}

	@Override
	public VerifyFaceMaskResponse getInstance(UnmarshallerContext context) {
		return	VerifyFaceMaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
