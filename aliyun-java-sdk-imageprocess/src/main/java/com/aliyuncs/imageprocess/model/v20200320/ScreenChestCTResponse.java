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

		private String errorMessage;

		private LungNodule lungNodule;

		private CACS cACS;

		private Covid covid;

		private DetectRibFracture detectRibFracture;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

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

		public DetectRibFracture getDetectRibFracture() {
			return this.detectRibFracture;
		}

		public void setDetectRibFracture(DetectRibFracture detectRibFracture) {
			this.detectRibFracture = detectRibFracture;
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

					private String lobe;

					private Float meanValue;

					private String lung;

					private Float confidence;

					private String sOPInstanceUID;

					private String category;

					private Float volume;

					private Float diameter;

					private Float x;

					private Float y;

					private Float z;

					private Float imageX;

					private Float imageY;

					private Float imageZ;

					public String getLobe() {
						return this.lobe;
					}

					public void setLobe(String lobe) {
						this.lobe = lobe;
					}

					public Float getMeanValue() {
						return this.meanValue;
					}

					public void setMeanValue(Float meanValue) {
						this.meanValue = meanValue;
					}

					public String getLung() {
						return this.lung;
					}

					public void setLung(String lung) {
						this.lung = lung;
					}

					public Float getConfidence() {
						return this.confidence;
					}

					public void setConfidence(Float confidence) {
						this.confidence = confidence;
					}

					public String getSOPInstanceUID() {
						return this.sOPInstanceUID;
					}

					public void setSOPInstanceUID(String sOPInstanceUID) {
						this.sOPInstanceUID = sOPInstanceUID;
					}

					public String getCategory() {
						return this.category;
					}

					public void setCategory(String category) {
						this.category = category;
					}

					public Float getVolume() {
						return this.volume;
					}

					public void setVolume(Float volume) {
						this.volume = volume;
					}

					public Float getDiameter() {
						return this.diameter;
					}

					public void setDiameter(Float diameter) {
						this.diameter = diameter;
					}

					public Float getX() {
						return this.x;
					}

					public void setX(Float x) {
						this.x = x;
					}

					public Float getY() {
						return this.y;
					}

					public void setY(Float y) {
						this.y = y;
					}

					public Float getZ() {
						return this.z;
					}

					public void setZ(Float z) {
						this.z = z;
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
				}
			}
		}

		public static class CACS {

			private String resultUrl;

			private String score;

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
		}

		public static class Covid {

			private String normalProbability;

			private String newProbability;

			private String lesionRatio;

			private String otherProbability;

			private String mask;

			public String getNormalProbability() {
				return this.normalProbability;
			}

			public void setNormalProbability(String normalProbability) {
				this.normalProbability = normalProbability;
			}

			public String getNewProbability() {
				return this.newProbability;
			}

			public void setNewProbability(String newProbability) {
				this.newProbability = newProbability;
			}

			public String getLesionRatio() {
				return this.lesionRatio;
			}

			public void setLesionRatio(String lesionRatio) {
				this.lesionRatio = lesionRatio;
			}

			public String getOtherProbability() {
				return this.otherProbability;
			}

			public void setOtherProbability(String otherProbability) {
				this.otherProbability = otherProbability;
			}

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}
		}

		public static class DetectRibFracture {

			private String resultURL;

			private List<DetectionsItem> detections;

			private List<Float> spacing1;

			private List<Float> origin2;

			public String getResultURL() {
				return this.resultURL;
			}

			public void setResultURL(String resultURL) {
				this.resultURL = resultURL;
			}

			public List<DetectionsItem> getDetections() {
				return this.detections;
			}

			public void setDetections(List<DetectionsItem> detections) {
				this.detections = detections;
			}

			public List<Float> getSpacing1() {
				return this.spacing1;
			}

			public void setSpacing1(List<Float> spacing1) {
				this.spacing1 = spacing1;
			}

			public List<Float> getOrigin2() {
				return this.origin2;
			}

			public void setOrigin2(List<Float> origin2) {
				this.origin2 = origin2;
			}

			public static class DetectionsItem {

				private Long fractureId;

				private Float fractureConfidence;

				private Long fractureCategory;

				private String fractureLocation;

				private Long fractureSegment;

				private List<Long> coordinates;

				private List<Long> coordinateImage;

				public Long getFractureId() {
					return this.fractureId;
				}

				public void setFractureId(Long fractureId) {
					this.fractureId = fractureId;
				}

				public Float getFractureConfidence() {
					return this.fractureConfidence;
				}

				public void setFractureConfidence(Float fractureConfidence) {
					this.fractureConfidence = fractureConfidence;
				}

				public Long getFractureCategory() {
					return this.fractureCategory;
				}

				public void setFractureCategory(Long fractureCategory) {
					this.fractureCategory = fractureCategory;
				}

				public String getFractureLocation() {
					return this.fractureLocation;
				}

				public void setFractureLocation(String fractureLocation) {
					this.fractureLocation = fractureLocation;
				}

				public Long getFractureSegment() {
					return this.fractureSegment;
				}

				public void setFractureSegment(Long fractureSegment) {
					this.fractureSegment = fractureSegment;
				}

				public List<Long> getCoordinates() {
					return this.coordinates;
				}

				public void setCoordinates(List<Long> coordinates) {
					this.coordinates = coordinates;
				}

				public List<Long> getCoordinateImage() {
					return this.coordinateImage;
				}

				public void setCoordinateImage(List<Long> coordinateImage) {
					this.coordinateImage = coordinateImage;
				}
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
