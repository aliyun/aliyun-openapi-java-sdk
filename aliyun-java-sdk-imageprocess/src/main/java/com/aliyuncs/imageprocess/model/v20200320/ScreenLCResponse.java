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
import com.aliyuncs.imageprocess.transform.v20200320.ScreenLCResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScreenLCResponse extends AcsResponse {

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

			private String mask;

			private Float liverVolume;

			private List<LesionListItem> lesionList;

			private PatientLevelResult patientLevelResult;

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}

			public Float getLiverVolume() {
				return this.liverVolume;
			}

			public void setLiverVolume(Float liverVolume) {
				this.liverVolume = liverVolume;
			}

			public List<LesionListItem> getLesionList() {
				return this.lesionList;
			}

			public void setLesionList(List<LesionListItem> lesionList) {
				this.lesionList = lesionList;
			}

			public PatientLevelResult getPatientLevelResult() {
				return this.patientLevelResult;
			}

			public void setPatientLevelResult(PatientLevelResult patientLevelResult) {
				this.patientLevelResult = patientLevelResult;
			}

			public static class LesionListItem {

				private String type;

				private Float volume;

				private Long keySlice;

				private Float malignancy;

				private List<Float> recistEndpoints;

				private List<Float> diameter;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Float getVolume() {
					return this.volume;
				}

				public void setVolume(Float volume) {
					this.volume = volume;
				}

				public Long getKeySlice() {
					return this.keySlice;
				}

				public void setKeySlice(Long keySlice) {
					this.keySlice = keySlice;
				}

				public Float getMalignancy() {
					return this.malignancy;
				}

				public void setMalignancy(Float malignancy) {
					this.malignancy = malignancy;
				}

				public List<Float> getRecistEndpoints() {
					return this.recistEndpoints;
				}

				public void setRecistEndpoints(List<Float> recistEndpoints) {
					this.recistEndpoints = recistEndpoints;
				}

				public List<Float> getDiameter() {
					return this.diameter;
				}

				public void setDiameter(List<Float> diameter) {
					this.diameter = diameter;
				}
			}

			public static class PatientLevelResult {

				private Float tumorNonCystProb;

				private Float hCCProb;

				private Float malignantNonHCCProb;

				private String benignNonCystProb;

				private Float cystProb;

				public Float getTumorNonCystProb() {
					return this.tumorNonCystProb;
				}

				public void setTumorNonCystProb(Float tumorNonCystProb) {
					this.tumorNonCystProb = tumorNonCystProb;
				}

				public Float getHCCProb() {
					return this.hCCProb;
				}

				public void setHCCProb(Float hCCProb) {
					this.hCCProb = hCCProb;
				}

				public Float getMalignantNonHCCProb() {
					return this.malignantNonHCCProb;
				}

				public void setMalignantNonHCCProb(Float malignantNonHCCProb) {
					this.malignantNonHCCProb = malignantNonHCCProb;
				}

				public String getBenignNonCystProb() {
					return this.benignNonCystProb;
				}

				public void setBenignNonCystProb(String benignNonCystProb) {
					this.benignNonCystProb = benignNonCystProb;
				}

				public Float getCystProb() {
					return this.cystProb;
				}

				public void setCystProb(Float cystProb) {
					this.cystProb = cystProb;
				}
			}
		}
	}

	@Override
	public ScreenLCResponse getInstance(UnmarshallerContext context) {
		return	ScreenLCResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
