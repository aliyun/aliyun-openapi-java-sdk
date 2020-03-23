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

package com.aliyuncs.goodstech.model.v20191230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.goodstech.transform.v20191230.RecognizeFurnitureAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFurnitureAttributeResponse extends AcsResponse {

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

		private String predStyleId;

		private String predStyle;

		private Float predProbability;

		public String getPredStyleId() {
			return this.predStyleId;
		}

		public void setPredStyleId(String predStyleId) {
			this.predStyleId = predStyleId;
		}

		public String getPredStyle() {
			return this.predStyle;
		}

		public void setPredStyle(String predStyle) {
			this.predStyle = predStyle;
		}

		public Float getPredProbability() {
			return this.predProbability;
		}

		public void setPredProbability(Float predProbability) {
			this.predProbability = predProbability;
		}
	}

	@Override
	public RecognizeFurnitureAttributeResponse getInstance(UnmarshallerContext context) {
		return	RecognizeFurnitureAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
