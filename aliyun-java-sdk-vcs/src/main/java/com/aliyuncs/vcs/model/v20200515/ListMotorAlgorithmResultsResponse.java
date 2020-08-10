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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.ListMotorAlgorithmResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMotorAlgorithmResultsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private Integer totalPage;

		private List<RecordsItem> records;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String corpId;

			private String dataSourceId;

			private Float leftTopX;

			private Float leftTopY;

			private String motorId;

			private String picUrlPath;

			private String plateNumber;

			private Float rightBottomX;

			private Float rightBottomY;

			private String shotTime;

			private String targetPicUrlPath;

			private String motorStyle;

			private String motorModel;

			private String motorColor;

			private String motorClass;

			private String motorBrand;

			private String plateColor;

			private String plateClass;

			private String safetyBelt;

			private String calling;

			private String sourceId;

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(String dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public Float getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Float leftTopX) {
				this.leftTopX = leftTopX;
			}

			public Float getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Float leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getMotorId() {
				return this.motorId;
			}

			public void setMotorId(String motorId) {
				this.motorId = motorId;
			}

			public String getPicUrlPath() {
				return this.picUrlPath;
			}

			public void setPicUrlPath(String picUrlPath) {
				this.picUrlPath = picUrlPath;
			}

			public String getPlateNumber() {
				return this.plateNumber;
			}

			public void setPlateNumber(String plateNumber) {
				this.plateNumber = plateNumber;
			}

			public Float getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Float rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Float getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Float rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getTargetPicUrlPath() {
				return this.targetPicUrlPath;
			}

			public void setTargetPicUrlPath(String targetPicUrlPath) {
				this.targetPicUrlPath = targetPicUrlPath;
			}

			public String getMotorStyle() {
				return this.motorStyle;
			}

			public void setMotorStyle(String motorStyle) {
				this.motorStyle = motorStyle;
			}

			public String getMotorModel() {
				return this.motorModel;
			}

			public void setMotorModel(String motorModel) {
				this.motorModel = motorModel;
			}

			public String getMotorColor() {
				return this.motorColor;
			}

			public void setMotorColor(String motorColor) {
				this.motorColor = motorColor;
			}

			public String getMotorClass() {
				return this.motorClass;
			}

			public void setMotorClass(String motorClass) {
				this.motorClass = motorClass;
			}

			public String getMotorBrand() {
				return this.motorBrand;
			}

			public void setMotorBrand(String motorBrand) {
				this.motorBrand = motorBrand;
			}

			public String getPlateColor() {
				return this.plateColor;
			}

			public void setPlateColor(String plateColor) {
				this.plateColor = plateColor;
			}

			public String getPlateClass() {
				return this.plateClass;
			}

			public void setPlateClass(String plateClass) {
				this.plateClass = plateClass;
			}

			public String getSafetyBelt() {
				return this.safetyBelt;
			}

			public void setSafetyBelt(String safetyBelt) {
				this.safetyBelt = safetyBelt;
			}

			public String getCalling() {
				return this.calling;
			}

			public void setCalling(String calling) {
				this.calling = calling;
			}

			public String getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(String sourceId) {
				this.sourceId = sourceId;
			}
		}
	}

	@Override
	public ListMotorAlgorithmResultsResponse getInstance(UnmarshallerContext context) {
		return	ListMotorAlgorithmResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
