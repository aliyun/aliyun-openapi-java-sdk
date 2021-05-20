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
import com.aliyuncs.facebody.transform.v20191230.RecognizeFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFaceResponse extends AcsResponse {

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

		private Integer denseFeatureLength;

		private List<Float> pupils;

		private List<Integer> genderList;

		private List<Integer> expressions;

		private List<String> denseFeatures;

		private List<Float> landmarks;

		private List<Float> beautyList;

		private List<Integer> hatList;

		private List<Float> faceProbabilityList;

		private List<Integer> glasses;

		private List<Integer> faceRectangles;

		private List<Float> poseList;

		private List<Integer> ageList;

		private List<Long> masks;

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

		public Integer getDenseFeatureLength() {
			return this.denseFeatureLength;
		}

		public void setDenseFeatureLength(Integer denseFeatureLength) {
			this.denseFeatureLength = denseFeatureLength;
		}

		public List<Float> getPupils() {
			return this.pupils;
		}

		public void setPupils(List<Float> pupils) {
			this.pupils = pupils;
		}

		public List<Integer> getGenderList() {
			return this.genderList;
		}

		public void setGenderList(List<Integer> genderList) {
			this.genderList = genderList;
		}

		public List<Integer> getExpressions() {
			return this.expressions;
		}

		public void setExpressions(List<Integer> expressions) {
			this.expressions = expressions;
		}

		public List<String> getDenseFeatures() {
			return this.denseFeatures;
		}

		public void setDenseFeatures(List<String> denseFeatures) {
			this.denseFeatures = denseFeatures;
		}

		public List<Float> getLandmarks() {
			return this.landmarks;
		}

		public void setLandmarks(List<Float> landmarks) {
			this.landmarks = landmarks;
		}

		public List<Float> getBeautyList() {
			return this.beautyList;
		}

		public void setBeautyList(List<Float> beautyList) {
			this.beautyList = beautyList;
		}

		public List<Integer> getHatList() {
			return this.hatList;
		}

		public void setHatList(List<Integer> hatList) {
			this.hatList = hatList;
		}

		public List<Float> getFaceProbabilityList() {
			return this.faceProbabilityList;
		}

		public void setFaceProbabilityList(List<Float> faceProbabilityList) {
			this.faceProbabilityList = faceProbabilityList;
		}

		public List<Integer> getGlasses() {
			return this.glasses;
		}

		public void setGlasses(List<Integer> glasses) {
			this.glasses = glasses;
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

		public List<Integer> getAgeList() {
			return this.ageList;
		}

		public void setAgeList(List<Integer> ageList) {
			this.ageList = ageList;
		}

		public List<Long> getMasks() {
			return this.masks;
		}

		public void setMasks(List<Long> masks) {
			this.masks = masks;
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
	public RecognizeFaceResponse getInstance(UnmarshallerContext context) {
		return	RecognizeFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
