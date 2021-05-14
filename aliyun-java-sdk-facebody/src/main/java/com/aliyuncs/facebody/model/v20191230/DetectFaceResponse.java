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
import com.aliyuncs.facebody.transform.v20191230.DetectFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectFaceResponse extends AcsResponse {

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

		private Integer faceCount;

		private Integer landmarkCount;

		private List<Float> faceProbabilityList;

		private List<Float> pupils;

		private List<Integer> faceRectangles;

		private List<Float> poseList;

		private List<Float> landmarks;

		private Qualities qualities;

		public Integer getFaceCount() {
			return this.faceCount;
		}

		public void setFaceCount(Integer faceCount) {
			this.faceCount = faceCount;
		}

		public Integer getLandmarkCount() {
			return this.landmarkCount;
		}

		public void setLandmarkCount(Integer landmarkCount) {
			this.landmarkCount = landmarkCount;
		}

		public List<Float> getFaceProbabilityList() {
			return this.faceProbabilityList;
		}

		public void setFaceProbabilityList(List<Float> faceProbabilityList) {
			this.faceProbabilityList = faceProbabilityList;
		}

		public List<Float> getPupils() {
			return this.pupils;
		}

		public void setPupils(List<Float> pupils) {
			this.pupils = pupils;
		}

		public List<Integer> getFaceRectangles() {
			return this.faceRectangles;
		}

		public void setFaceRectangles(List<Integer> faceRectangles) {
			this.faceRectangles = faceRectangles;
		}

		public List<Float> getPoseList() {
			return this.poseList;
		}

		public void setPoseList(List<Float> poseList) {
			this.poseList = poseList;
		}

		public List<Float> getLandmarks() {
			return this.landmarks;
		}

		public void setLandmarks(List<Float> landmarks) {
			this.landmarks = landmarks;
		}

		public Qualities getQualities() {
			return this.qualities;
		}

		public void setQualities(Qualities qualities) {
			this.qualities = qualities;
		}

		public static class Qualities {

			private List<Float> scoreList;

			private List<Float> blurList;

			private List<Float> fnfList;

			private List<Float> glassList;

			private List<Float> illuList;

			private List<Float> maskList;

			private List<Float> noiseList;

			private List<Float> poseList1;

			public List<Float> getScoreList() {
				return this.scoreList;
			}

			public void setScoreList(List<Float> scoreList) {
				this.scoreList = scoreList;
			}

			public List<Float> getBlurList() {
				return this.blurList;
			}

			public void setBlurList(List<Float> blurList) {
				this.blurList = blurList;
			}

			public List<Float> getFnfList() {
				return this.fnfList;
			}

			public void setFnfList(List<Float> fnfList) {
				this.fnfList = fnfList;
			}

			public List<Float> getGlassList() {
				return this.glassList;
			}

			public void setGlassList(List<Float> glassList) {
				this.glassList = glassList;
			}

			public List<Float> getIlluList() {
				return this.illuList;
			}

			public void setIlluList(List<Float> illuList) {
				this.illuList = illuList;
			}

			public List<Float> getMaskList() {
				return this.maskList;
			}

			public void setMaskList(List<Float> maskList) {
				this.maskList = maskList;
			}

			public List<Float> getNoiseList() {
				return this.noiseList;
			}

			public void setNoiseList(List<Float> noiseList) {
				this.noiseList = noiseList;
			}

			public List<Float> getPoseList1() {
				return this.poseList1;
			}

			public void setPoseList1(List<Float> poseList1) {
				this.poseList1 = poseList1;
			}
		}
	}

	@Override
	public DetectFaceResponse getInstance(UnmarshallerContext context) {
		return	DetectFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
