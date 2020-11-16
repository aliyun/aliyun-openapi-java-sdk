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

package com.aliyuncs.videorecog.model.v20200320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.videorecog.transform.v20200320.GenerateVideoCoverResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateVideoCoverResponse extends AcsResponse {

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

		private List<Output> outputs;

		public List<Output> getOutputs() {
			return this.outputs;
		}

		public void setOutputs(List<Output> outputs) {
			this.outputs = outputs;
		}

		public static class Output {

			private String imageURL;

			private Float confidence;

			public String getImageURL() {
				return this.imageURL;
			}

			public void setImageURL(String imageURL) {
				this.imageURL = imageURL;
			}

			public Float getConfidence() {
				return this.confidence;
			}

			public void setConfidence(Float confidence) {
				this.confidence = confidence;
			}
		}
	}

	@Override
	public GenerateVideoCoverResponse getInstance(UnmarshallerContext context) {
		return	GenerateVideoCoverResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
