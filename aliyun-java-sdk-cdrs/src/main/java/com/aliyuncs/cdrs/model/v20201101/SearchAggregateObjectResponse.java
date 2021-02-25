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

package com.aliyuncs.cdrs.model.v20201101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdrs.transform.v20201101.SearchAggregateObjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchAggregateObjectResponse extends AcsResponse {

	private String code;

	private String message;

	private Integer total;

	private Long pageSize;

	private String requestId;

	private Boolean success;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<BodyListItem> bodyList;

		private List<FaceListItem> faceList;

		private List<MotorListItem> motorList;

		private List<NonMotorListItem> nonMotorList;

		public List<BodyListItem> getBodyList() {
			return this.bodyList;
		}

		public void setBodyList(List<BodyListItem> bodyList) {
			this.bodyList = bodyList;
		}

		public List<FaceListItem> getFaceList() {
			return this.faceList;
		}

		public void setFaceList(List<FaceListItem> faceList) {
			this.faceList = faceList;
		}

		public List<MotorListItem> getMotorList() {
			return this.motorList;
		}

		public void setMotorList(List<MotorListItem> motorList) {
			this.motorList = motorList;
		}

		public List<NonMotorListItem> getNonMotorList() {
			return this.nonMotorList;
		}

		public void setNonMotorList(List<NonMotorListItem> nonMotorList) {
			this.nonMotorList = nonMotorList;
		}

		public static class BodyListItem {

			private String deviceID;

			private String objectType;

			private Integer leftTopX;

			private Integer leftTopY;

			private Integer rightBottomX;

			private Integer rightBottomY;

			private Float score;

			private String shotTime;

			private String sourceImageUrl;

			private String targetImageUrl;

			private String deviceName;

			private Float deviceLatitude;

			private Float deviceLongitude;

			private String personId;

			public String getDeviceID() {
				return this.deviceID;
			}

			public void setDeviceID(String deviceID) {
				this.deviceID = deviceID;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public Integer getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Integer leftTopX) {
				this.leftTopX = leftTopX;
			}

			public Integer getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Integer leftTopY) {
				this.leftTopY = leftTopY;
			}

			public Integer getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Integer rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Integer getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Integer rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getSourceImageUrl() {
				return this.sourceImageUrl;
			}

			public void setSourceImageUrl(String sourceImageUrl) {
				this.sourceImageUrl = sourceImageUrl;
			}

			public String getTargetImageUrl() {
				return this.targetImageUrl;
			}

			public void setTargetImageUrl(String targetImageUrl) {
				this.targetImageUrl = targetImageUrl;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public Float getDeviceLatitude() {
				return this.deviceLatitude;
			}

			public void setDeviceLatitude(Float deviceLatitude) {
				this.deviceLatitude = deviceLatitude;
			}

			public Float getDeviceLongitude() {
				return this.deviceLongitude;
			}

			public void setDeviceLongitude(Float deviceLongitude) {
				this.deviceLongitude = deviceLongitude;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}
		}

		public static class FaceListItem {

			private String deviceID;

			private String objectType;

			private Integer leftTopX;

			private Integer leftTopY;

			private Integer rightBottomX;

			private Integer rightBottomY;

			private Float score;

			private String shotTime;

			private String sourceImageUrl;

			private String targetImageUrl;

			private String deviceName;

			private Float deviceLatitude;

			private Float deviceLongitude;

			private String personId;

			public String getDeviceID() {
				return this.deviceID;
			}

			public void setDeviceID(String deviceID) {
				this.deviceID = deviceID;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public Integer getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Integer leftTopX) {
				this.leftTopX = leftTopX;
			}

			public Integer getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Integer leftTopY) {
				this.leftTopY = leftTopY;
			}

			public Integer getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Integer rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Integer getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Integer rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getSourceImageUrl() {
				return this.sourceImageUrl;
			}

			public void setSourceImageUrl(String sourceImageUrl) {
				this.sourceImageUrl = sourceImageUrl;
			}

			public String getTargetImageUrl() {
				return this.targetImageUrl;
			}

			public void setTargetImageUrl(String targetImageUrl) {
				this.targetImageUrl = targetImageUrl;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public Float getDeviceLatitude() {
				return this.deviceLatitude;
			}

			public void setDeviceLatitude(Float deviceLatitude) {
				this.deviceLatitude = deviceLatitude;
			}

			public Float getDeviceLongitude() {
				return this.deviceLongitude;
			}

			public void setDeviceLongitude(Float deviceLongitude) {
				this.deviceLongitude = deviceLongitude;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}
		}

		public static class MotorListItem {

			private String deviceID;

			private String objectType;

			private Integer leftTopX;

			private Integer leftTopY;

			private Integer rightBottomX;

			private Integer rightBottomY;

			private Float score;

			private String shotTime;

			private String sourceImageUrl;

			private String targetImageUrl;

			private String deviceName;

			private Float deviceLatitude;

			private Float deviceLongitude;

			private String personId;

			public String getDeviceID() {
				return this.deviceID;
			}

			public void setDeviceID(String deviceID) {
				this.deviceID = deviceID;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public Integer getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Integer leftTopX) {
				this.leftTopX = leftTopX;
			}

			public Integer getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Integer leftTopY) {
				this.leftTopY = leftTopY;
			}

			public Integer getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Integer rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Integer getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Integer rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getSourceImageUrl() {
				return this.sourceImageUrl;
			}

			public void setSourceImageUrl(String sourceImageUrl) {
				this.sourceImageUrl = sourceImageUrl;
			}

			public String getTargetImageUrl() {
				return this.targetImageUrl;
			}

			public void setTargetImageUrl(String targetImageUrl) {
				this.targetImageUrl = targetImageUrl;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public Float getDeviceLatitude() {
				return this.deviceLatitude;
			}

			public void setDeviceLatitude(Float deviceLatitude) {
				this.deviceLatitude = deviceLatitude;
			}

			public Float getDeviceLongitude() {
				return this.deviceLongitude;
			}

			public void setDeviceLongitude(Float deviceLongitude) {
				this.deviceLongitude = deviceLongitude;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}
		}

		public static class NonMotorListItem {

			private String deviceID;

			private String objectType;

			private Integer leftTopX;

			private Integer leftTopY;

			private Integer rightBottomX;

			private Integer rightBottomY;

			private Float score;

			private String shotTime;

			private String sourceImageUrl;

			private String targetImageUrl;

			private String deviceName;

			private Float deviceLatitude;

			private Float deviceLongitude;

			private String personId;

			public String getDeviceID() {
				return this.deviceID;
			}

			public void setDeviceID(String deviceID) {
				this.deviceID = deviceID;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public Integer getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Integer leftTopX) {
				this.leftTopX = leftTopX;
			}

			public Integer getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Integer leftTopY) {
				this.leftTopY = leftTopY;
			}

			public Integer getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Integer rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Integer getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Integer rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getSourceImageUrl() {
				return this.sourceImageUrl;
			}

			public void setSourceImageUrl(String sourceImageUrl) {
				this.sourceImageUrl = sourceImageUrl;
			}

			public String getTargetImageUrl() {
				return this.targetImageUrl;
			}

			public void setTargetImageUrl(String targetImageUrl) {
				this.targetImageUrl = targetImageUrl;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public Float getDeviceLatitude() {
				return this.deviceLatitude;
			}

			public void setDeviceLatitude(Float deviceLatitude) {
				this.deviceLatitude = deviceLatitude;
			}

			public Float getDeviceLongitude() {
				return this.deviceLongitude;
			}

			public void setDeviceLongitude(Float deviceLongitude) {
				this.deviceLongitude = deviceLongitude;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}
		}
	}

	@Override
	public SearchAggregateObjectResponse getInstance(UnmarshallerContext context) {
		return	SearchAggregateObjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
