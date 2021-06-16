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

package com.aliyuncs.imageaudit.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageaudit.transform.v20191230.ScanImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScanImageResponse extends AcsResponse {

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

		private List<Result> results;

		public List<Result> getResults() {
			return this.results;
		}

		public void setResults(List<Result> results) {
			this.results = results;
		}

		public static class Result {

			private String taskId;

			private String dataId;

			private String imageURL;

			private List<SubResult> subResults;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getImageURL() {
				return this.imageURL;
			}

			public void setImageURL(String imageURL) {
				this.imageURL = imageURL;
			}

			public List<SubResult> getSubResults() {
				return this.subResults;
			}

			public void setSubResults(List<SubResult> subResults) {
				this.subResults = subResults;
			}

			public static class SubResult {

				private String suggestion;

				private Float rate;

				private String label;

				private String scene;

				private List<Frame> frames;

				private List<SfaceData> sfaceDataList;

				private List<HintWordsInfo> hintWordsInfoList;

				private List<LogoData> logoDataList;

				private List<ProgramCodeData> programCodeDataList;

				private List<String> oCRDataList;

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getScene() {
					return this.scene;
				}

				public void setScene(String scene) {
					this.scene = scene;
				}

				public List<Frame> getFrames() {
					return this.frames;
				}

				public void setFrames(List<Frame> frames) {
					this.frames = frames;
				}

				public List<SfaceData> getSfaceDataList() {
					return this.sfaceDataList;
				}

				public void setSfaceDataList(List<SfaceData> sfaceDataList) {
					this.sfaceDataList = sfaceDataList;
				}

				public List<HintWordsInfo> getHintWordsInfoList() {
					return this.hintWordsInfoList;
				}

				public void setHintWordsInfoList(List<HintWordsInfo> hintWordsInfoList) {
					this.hintWordsInfoList = hintWordsInfoList;
				}

				public List<LogoData> getLogoDataList() {
					return this.logoDataList;
				}

				public void setLogoDataList(List<LogoData> logoDataList) {
					this.logoDataList = logoDataList;
				}

				public List<ProgramCodeData> getProgramCodeDataList() {
					return this.programCodeDataList;
				}

				public void setProgramCodeDataList(List<ProgramCodeData> programCodeDataList) {
					this.programCodeDataList = programCodeDataList;
				}

				public List<String> getOCRDataList() {
					return this.oCRDataList;
				}

				public void setOCRDataList(List<String> oCRDataList) {
					this.oCRDataList = oCRDataList;
				}

				public static class Frame {

					private Float rate;

					private String uRL;

					public Float getRate() {
						return this.rate;
					}

					public void setRate(Float rate) {
						this.rate = rate;
					}

					public String getURL() {
						return this.uRL;
					}

					public void setURL(String uRL) {
						this.uRL = uRL;
					}
				}

				public static class SfaceData {

					private Float x;

					private Float y;

					private Float height;

					private Float width;

					private List<Face> faces;

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

					public Float getHeight() {
						return this.height;
					}

					public void setHeight(Float height) {
						this.height = height;
					}

					public Float getWidth() {
						return this.width;
					}

					public void setWidth(Float width) {
						this.width = width;
					}

					public List<Face> getFaces() {
						return this.faces;
					}

					public void setFaces(List<Face> faces) {
						this.faces = faces;
					}

					public static class Face {

						private Float rate;

						private String id;

						private String name;

						public Float getRate() {
							return this.rate;
						}

						public void setRate(Float rate) {
							this.rate = rate;
						}

						public String getId() {
							return this.id;
						}

						public void setId(String id) {
							this.id = id;
						}

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}
					}
				}

				public static class HintWordsInfo {

					private String context;

					public String getContext() {
						return this.context;
					}

					public void setContext(String context) {
						this.context = context;
					}
				}

				public static class LogoData {

					private String type;

					private Float x;

					private Float y;

					private Float height;

					private Float width;

					private String name;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
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

					public Float getHeight() {
						return this.height;
					}

					public void setHeight(Float height) {
						this.height = height;
					}

					public Float getWidth() {
						return this.width;
					}

					public void setWidth(Float width) {
						this.width = width;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}

				public static class ProgramCodeData {

					private Float x;

					private Float y;

					private Float height;

					private Float width;

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

					public Float getHeight() {
						return this.height;
					}

					public void setHeight(Float height) {
						this.height = height;
					}

					public Float getWidth() {
						return this.width;
					}

					public void setWidth(Float width) {
						this.width = width;
					}
				}
			}
		}
	}

	@Override
	public ScanImageResponse getInstance(UnmarshallerContext context) {
		return	ScanImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
