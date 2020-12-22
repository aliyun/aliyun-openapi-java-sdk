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
import com.aliyuncs.imageprocess.transform.v20200320.ScreenChestCTResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScreenChestCTResponse extends AcsResponse {

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

		private LungNodule lungNodule;

		private CACS cACS;

		private Covid covid;

		public LungNodule getLungNodule() {
			return this.lungNodule;
		}

		public void setLungNodule(LungNodule lungNodule) {
			this.lungNodule = lungNodule;
		}

		public CACS getCACS() {
			return this.cACS;
		}

		public void setCACS(CACS cACS) {
			this.cACS = cACS;
		}

		public Covid getCovid() {
			return this.covid;
		}

		public void setCovid(Covid covid) {
			this.covid = covid;
		}

		public static class LungNodule {

			private List<Serie> series;

			public List<Serie> getSeries() {
				return this.series;
			}

			public void setSeries(List<Serie> series) {
				this.series = series;
			}

			public static class Serie {

				private String seriesInstanceUid;

				private String report;

				private List<Element> elements;

				private List<Float> origin;

				private List<Float> spacing;

				public String getSeriesInstanceUid() {
					return this.seriesInstanceUid;
				}

				public void setSeriesInstanceUid(String seriesInstanceUid) {
					this.seriesInstanceUid = seriesInstanceUid;
				}

				public String getReport() {
					return this.report;
				}

				public void setReport(String report) {
					this.report = report;
				}

				public List<Element> getElements() {
					return this.elements;
				}

				public void setElements(List<Element> elements) {
					this.elements = elements;
				}

				public List<Float> getOrigin() {
					return this.origin;
				}

				public void setOrigin(List<Float> origin) {
					this.origin = origin;
				}

				public List<Float> getSpacing() {
					return this.spacing;
				}

				public void setSpacing(List<Float> spacing) {
					this.spacing = spacing;
				}

				public static class Element {

					private String category;

					private Float confidence;

					private Float diameter;

					private String lobe;

					private String lung;

					private Float x;

					private Float z;

					private Float y;

					private Float imageX;

					private Float imageY;

					private Float imageZ;

					private String sOPInstanceUID;

					private Float volume;

					private Float meanValue;

					public String getCategory() {
						return this.category;
					}

					public void setCategory(String category) {
						this.category = category;
					}

					public Float getConfidence() {
						return this.confidence;
					}

					public void setConfidence(Float confidence) {
						this.confidence = confidence;
					}

					public Float getDiameter() {
						return this.diameter;
					}

					public void setDiameter(Float diameter) {
						this.diameter = diameter;
					}

					public String getLobe() {
						return this.lobe;
					}

					public void setLobe(String lobe) {
						this.lobe = lobe;
					}

					public String getLung() {
						return this.lung;
					}

					public void setLung(String lung) {
						this.lung = lung;
					}

					public Float getX() {
						return this.x;
					}

					public void setX(Float x) {
						this.x = x;
					}

					public Float getZ() {
						return this.z;
					}

					public void setZ(Float z) {
						this.z = z;
					}

					public Float getY() {
						return this.y;
					}

					public void setY(Float y) {
						this.y = y;
					}

					public Float getImageX() {
						return this.imageX;
					}

					public void setImageX(Float imageX) {
						this.imageX = imageX;
					}

					public Float getImageY() {
						return this.imageY;
					}

					public void setImageY(Float imageY) {
						this.imageY = imageY;
					}

					public Float getImageZ() {
						return this.imageZ;
					}

					public void setImageZ(Float imageZ) {
						this.imageZ = imageZ;
					}

					public String getSOPInstanceUID() {
						return this.sOPInstanceUID;
					}

					public void setSOPInstanceUID(String sOPInstanceUID) {
						this.sOPInstanceUID = sOPInstanceUID;
					}

					public Float getVolume() {
						return this.volume;
					}

					public void setVolume(Float volume) {
						this.volume = volume;
					}

					public Float getMeanValue() {
						return this.meanValue;
					}

					public void setMeanValue(Float meanValue) {
						this.meanValue = meanValue;
					}
				}
			}
		}

		public static class CACS {

			private String score;

			private String resultUrl;

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getResultUrl() {
				return this.resultUrl;
			}

			public void setResultUrl(String resultUrl) {
				this.resultUrl = resultUrl;
			}
		}

		public static class Covid {

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
	}

	@Override
	public ScreenChestCTResponse getInstance(UnmarshallerContext context) {
		return	ScreenChestCTResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
