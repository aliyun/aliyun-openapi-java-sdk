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
import com.aliyuncs.imageprocess.transform.v20200320.ScreenCRCResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScreenCRCResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Lesion lesion;

		public Lesion getLesion() {
			return this.lesion;
		}

		public void setLesion(Lesion lesion) {
			this.lesion = lesion;
		}

		public static class Lesion {

			private String probabilities;

			private String stage2Volume;

			private String colorectumVolume;

			private String cRCVolume;

			private String nonCRCVolumel;

			private String mask;

			public String getProbabilities() {
				return this.probabilities;
			}

			public void setProbabilities(String probabilities) {
				this.probabilities = probabilities;
			}

			public String getStage2Volume() {
				return this.stage2Volume;
			}

			public void setStage2Volume(String stage2Volume) {
				this.stage2Volume = stage2Volume;
			}

			public String getColorectumVolume() {
				return this.colorectumVolume;
			}

			public void setColorectumVolume(String colorectumVolume) {
				this.colorectumVolume = colorectumVolume;
			}

			public String getCRCVolume() {
				return this.cRCVolume;
			}

			public void setCRCVolume(String cRCVolume) {
				this.cRCVolume = cRCVolume;
			}

			public String getNonCRCVolumel() {
				return this.nonCRCVolumel;
			}

			public void setNonCRCVolumel(String nonCRCVolumel) {
				this.nonCRCVolumel = nonCRCVolumel;
			}

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}
		}
	}

	@Override
	public ScreenCRCResponse getInstance(UnmarshallerContext context) {
		return	ScreenCRCResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
