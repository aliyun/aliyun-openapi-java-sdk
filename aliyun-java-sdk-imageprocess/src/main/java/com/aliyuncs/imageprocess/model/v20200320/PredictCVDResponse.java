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
import com.aliyuncs.imageprocess.transform.v20200320.PredictCVDResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PredictCVDResponse extends AcsResponse {

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

			private Float cVDProbability;

			private List<String> resultURL;

			private FeatureScore featureScore;

			public Float getCVDProbability() {
				return this.cVDProbability;
			}

			public void setCVDProbability(Float cVDProbability) {
				this.cVDProbability = cVDProbability;
			}

			public List<String> getResultURL() {
				return this.resultURL;
			}

			public void setResultURL(List<String> resultURL) {
				this.resultURL = resultURL;
			}

			public FeatureScore getFeatureScore() {
				return this.featureScore;
			}

			public void setFeatureScore(FeatureScore featureScore) {
				this.featureScore = featureScore;
			}

			public static class FeatureScore {

				private List<Double> myoEpiRatio;

				private List<Double> ascAoMaxDiam;

				private List<Double> coronaryCalciumVol;

				private List<Double> eatVolume;

				private List<Double> aortaCalciumScore;

				private List<Double> cardioThoracicRatio;

				private List<Double> eatHUMean;

				private List<Double> eatHUSTD;

				private List<Double> rightLungLowattRatio;

				private List<Double> ascendAortaLength;

				private List<Double> leftLungLowattRatio;

				private List<Double> deepFeature;

				private List<Double> aortaCalciumVolume;

				private List<Double> coronaryCalciumScore;

				public List<Double> getMyoEpiRatio() {
					return this.myoEpiRatio;
				}

				public void setMyoEpiRatio(List<Double> myoEpiRatio) {
					this.myoEpiRatio = myoEpiRatio;
				}

				public List<Double> getAscAoMaxDiam() {
					return this.ascAoMaxDiam;
				}

				public void setAscAoMaxDiam(List<Double> ascAoMaxDiam) {
					this.ascAoMaxDiam = ascAoMaxDiam;
				}

				public List<Double> getCoronaryCalciumVol() {
					return this.coronaryCalciumVol;
				}

				public void setCoronaryCalciumVol(List<Double> coronaryCalciumVol) {
					this.coronaryCalciumVol = coronaryCalciumVol;
				}

				public List<Double> getEatVolume() {
					return this.eatVolume;
				}

				public void setEatVolume(List<Double> eatVolume) {
					this.eatVolume = eatVolume;
				}

				public List<Double> getAortaCalciumScore() {
					return this.aortaCalciumScore;
				}

				public void setAortaCalciumScore(List<Double> aortaCalciumScore) {
					this.aortaCalciumScore = aortaCalciumScore;
				}

				public List<Double> getCardioThoracicRatio() {
					return this.cardioThoracicRatio;
				}

				public void setCardioThoracicRatio(List<Double> cardioThoracicRatio) {
					this.cardioThoracicRatio = cardioThoracicRatio;
				}

				public List<Double> getEatHUMean() {
					return this.eatHUMean;
				}

				public void setEatHUMean(List<Double> eatHUMean) {
					this.eatHUMean = eatHUMean;
				}

				public List<Double> getEatHUSTD() {
					return this.eatHUSTD;
				}

				public void setEatHUSTD(List<Double> eatHUSTD) {
					this.eatHUSTD = eatHUSTD;
				}

				public List<Double> getRightLungLowattRatio() {
					return this.rightLungLowattRatio;
				}

				public void setRightLungLowattRatio(List<Double> rightLungLowattRatio) {
					this.rightLungLowattRatio = rightLungLowattRatio;
				}

				public List<Double> getAscendAortaLength() {
					return this.ascendAortaLength;
				}

				public void setAscendAortaLength(List<Double> ascendAortaLength) {
					this.ascendAortaLength = ascendAortaLength;
				}

				public List<Double> getLeftLungLowattRatio() {
					return this.leftLungLowattRatio;
				}

				public void setLeftLungLowattRatio(List<Double> leftLungLowattRatio) {
					this.leftLungLowattRatio = leftLungLowattRatio;
				}

				public List<Double> getDeepFeature() {
					return this.deepFeature;
				}

				public void setDeepFeature(List<Double> deepFeature) {
					this.deepFeature = deepFeature;
				}

				public List<Double> getAortaCalciumVolume() {
					return this.aortaCalciumVolume;
				}

				public void setAortaCalciumVolume(List<Double> aortaCalciumVolume) {
					this.aortaCalciumVolume = aortaCalciumVolume;
				}

				public List<Double> getCoronaryCalciumScore() {
					return this.coronaryCalciumScore;
				}

				public void setCoronaryCalciumScore(List<Double> coronaryCalciumScore) {
					this.coronaryCalciumScore = coronaryCalciumScore;
				}
			}
		}
	}

	@Override
	public PredictCVDResponse getInstance(UnmarshallerContext context) {
		return	PredictCVDResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
