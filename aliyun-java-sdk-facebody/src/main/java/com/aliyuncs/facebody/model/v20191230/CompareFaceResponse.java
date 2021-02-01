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
import com.aliyuncs.facebody.transform.v20191230.CompareFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CompareFaceResponse extends AcsResponse {

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

		private List<Float> thresholds;

		private List<Integer> rectAList;

		private List<Integer> rectBList;

		public Float getConfidence() {
			return this.confidence;
		}

		public void setConfidence(Float confidence) {
			this.confidence = confidence;
		}

		public List<Float> getThresholds() {
			return this.thresholds;
		}

		public void setThresholds(List<Float> thresholds) {
			this.thresholds = thresholds;
		}

		public List<Integer> getRectAList() {
			return this.rectAList;
		}

		public void setRectAList(List<Integer> rectAList) {
			this.rectAList = rectAList;
		}

		public List<Integer> getRectBList() {
			return this.rectBList;
		}

		public void setRectBList(List<Integer> rectBList) {
			this.rectBList = rectBList;
		}
	}

	@Override
	public CompareFaceResponse getInstance(UnmarshallerContext context) {
		return	CompareFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
