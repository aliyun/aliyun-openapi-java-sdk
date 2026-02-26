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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageprocess.transform.v20200320.CalcCACSResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CalcCACSResponse extends AcsResponse {

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

		private String resultUrl;

		private String score;

		private String volumeScore;

		private List<DetectionsItem> detections;

		public String getResultUrl() {
			return this.resultUrl;
		}

		public void setResultUrl(String resultUrl) {
			this.resultUrl = resultUrl;
		}

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public String getVolumeScore() {
			return this.volumeScore;
		}

		public void setVolumeScore(String volumeScore) {
			this.volumeScore = volumeScore;
		}

		public List<DetectionsItem> getDetections() {
			return this.detections;
		}

		public void setDetections(List<DetectionsItem> detections) {
			this.detections = detections;
		}

		public static class DetectionsItem {

			private Long calciumId;

			private Float calciumScore;

			private Float calciumVolume;

			private List<Long> calciumCenter;

			public Long getCalciumId() {
				return this.calciumId;
			}

			public void setCalciumId(Long calciumId) {
				this.calciumId = calciumId;
			}

			public Float getCalciumScore() {
				return this.calciumScore;
			}

			public void setCalciumScore(Float calciumScore) {
				this.calciumScore = calciumScore;
			}

			public Float getCalciumVolume() {
				return this.calciumVolume;
			}

			public void setCalciumVolume(Float calciumVolume) {
				this.calciumVolume = calciumVolume;
			}

			public List<Long> getCalciumCenter() {
				return this.calciumCenter;
			}

			public void setCalciumCenter(List<Long> calciumCenter) {
				this.calciumCenter = calciumCenter;
			}
		}
	}

	@Override
	public CalcCACSResponse getInstance(UnmarshallerContext context) {
		return	CalcCACSResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
