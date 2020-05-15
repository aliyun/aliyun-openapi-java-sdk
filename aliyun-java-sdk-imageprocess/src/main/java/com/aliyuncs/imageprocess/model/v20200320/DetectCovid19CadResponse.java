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

package com.aliyuncs.imageprocess.model.v20200320;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageprocess.transform.v20200320.DetectCovid19CadResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectCovid19CadResponse extends AcsResponse {

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

		private String newProbability;

		private String normalProbability;

		private String otherProbability;

		private String lesionRatio;

		private String mask;

		public String getNewProbability() {
			return this.newProbability;
		}

		public void setNewProbability(String newProbability) {
			this.newProbability = newProbability;
		}

		public String getNormalProbability() {
			return this.normalProbability;
		}

		public void setNormalProbability(String normalProbability) {
			this.normalProbability = normalProbability;
		}

		public String getOtherProbability() {
			return this.otherProbability;
		}

		public void setOtherProbability(String otherProbability) {
			this.otherProbability = otherProbability;
		}

		public String getLesionRatio() {
			return this.lesionRatio;
		}

		public void setLesionRatio(String lesionRatio) {
			this.lesionRatio = lesionRatio;
		}

		public String getMask() {
			return this.mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}
	}

	@Override
	public DetectCovid19CadResponse getInstance(UnmarshallerContext context) {
		return	DetectCovid19CadResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
