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
import com.aliyuncs.facebody.transform.v20191230.CompareFaceWithMaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CompareFaceWithMaskResponse extends AcsResponse {

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

		private Float confidence;

		private Long isMaskA;

		private Long isMaskB;

		private Float qualityScoreA;

		private Float qualityScoreB;

		private String messageTips;

		private List<Long> landmarksAList;

		private List<Long> landmarksBList;

		private List<Long> rectAList;

		private List<Long> rectBList;

		private List<Long> thresholds;

		public Float getConfidence() {
			return this.confidence;
		}

		public void setConfidence(Float confidence) {
			this.confidence = confidence;
		}

		public Long getIsMaskA() {
			return this.isMaskA;
		}

		public void setIsMaskA(Long isMaskA) {
			this.isMaskA = isMaskA;
		}

		public Long getIsMaskB() {
			return this.isMaskB;
		}

		public void setIsMaskB(Long isMaskB) {
			this.isMaskB = isMaskB;
		}

		public Float getQualityScoreA() {
			return this.qualityScoreA;
		}

		public void setQualityScoreA(Float qualityScoreA) {
			this.qualityScoreA = qualityScoreA;
		}

		public Float getQualityScoreB() {
			return this.qualityScoreB;
		}

		public void setQualityScoreB(Float qualityScoreB) {
			this.qualityScoreB = qualityScoreB;
		}

		public String getMessageTips() {
			return this.messageTips;
		}

		public void setMessageTips(String messageTips) {
			this.messageTips = messageTips;
		}

		public List<Long> getLandmarksAList() {
			return this.landmarksAList;
		}

		public void setLandmarksAList(List<Long> landmarksAList) {
			this.landmarksAList = landmarksAList;
		}

		public List<Long> getLandmarksBList() {
			return this.landmarksBList;
		}

		public void setLandmarksBList(List<Long> landmarksBList) {
			this.landmarksBList = landmarksBList;
		}

		public List<Long> getRectAList() {
			return this.rectAList;
		}

		public void setRectAList(List<Long> rectAList) {
			this.rectAList = rectAList;
		}

		public List<Long> getRectBList() {
			return this.rectBList;
		}

		public void setRectBList(List<Long> rectBList) {
			this.rectBList = rectBList;
		}

		public List<Long> getThresholds() {
			return this.thresholds;
		}

		public void setThresholds(List<Long> thresholds) {
			this.thresholds = thresholds;
		}
	}

	@Override
	public CompareFaceWithMaskResponse getInstance(UnmarshallerContext context) {
		return	CompareFaceWithMaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
