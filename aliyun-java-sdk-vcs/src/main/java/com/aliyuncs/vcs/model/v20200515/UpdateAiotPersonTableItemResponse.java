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
import com.aliyuncs.vcs.transform.v20200515.UpdateAiotPersonTableItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateAiotPersonTableItemResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private PersonTableItem personTableItem;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public PersonTableItem getPersonTableItem() {
		return this.personTableItem;
	}

	public void setPersonTableItem(PersonTableItem personTableItem) {
		this.personTableItem = personTableItem;
	}

	public static class PersonTableItem {

		private String personTableId;

		private String personId;

		private String lastChange;

		private String personCode;

		private String personName;

		private String remarks;

		private Long identificationNum;

		private Long imageNum;

		private List<IdentificationListItem> identificationList;

		private List<ImageListItem> imageList;

		public String getPersonTableId() {
			return this.personTableId;
		}

		public void setPersonTableId(String personTableId) {
			this.personTableId = personTableId;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getLastChange() {
			return this.lastChange;
		}

		public void setLastChange(String lastChange) {
			this.lastChange = lastChange;
		}

		public String getPersonCode() {
			return this.personCode;
		}

		public void setPersonCode(String personCode) {
			this.personCode = personCode;
		}

		public String getPersonName() {
			return this.personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public Long getIdentificationNum() {
			return this.identificationNum;
		}

		public void setIdentificationNum(Long identificationNum) {
			this.identificationNum = identificationNum;
		}

		public Long getImageNum() {
			return this.imageNum;
		}

		public void setImageNum(Long imageNum) {
			this.imageNum = imageNum;
		}

		public List<IdentificationListItem> getIdentificationList() {
			return this.identificationList;
		}

		public void setIdentificationList(List<IdentificationListItem> identificationList) {
			this.identificationList = identificationList;
		}

		public List<ImageListItem> getImageList() {
			return this.imageList;
		}

		public void setImageList(List<ImageListItem> imageList) {
			this.imageList = imageList;
		}

		public static class IdentificationListItem {

			private Long type;

			private String number;

			public Long getType() {
				return this.type;
			}

			public void setType(Long type) {
				this.type = type;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}
		}

		public static class ImageListItem {

			private String imageId;

			private String eventSort;

			private String deviceId;

			private String storagePath;

			private Long size;

			private String type;

			private String fileFormat;

			private String shotTime;

			private Long width;

			private Long height;

			private String data;

			private FeatureInfo featureInfo;

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getEventSort() {
				return this.eventSort;
			}

			public void setEventSort(String eventSort) {
				this.eventSort = eventSort;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getStoragePath() {
				return this.storagePath;
			}

			public void setStoragePath(String storagePath) {
				this.storagePath = storagePath;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getFileFormat() {
				return this.fileFormat;
			}

			public void setFileFormat(String fileFormat) {
				this.fileFormat = fileFormat;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public String getData() {
				return this.data;
			}

			public void setData(String data) {
				this.data = data;
			}

			public FeatureInfo getFeatureInfo() {
				return this.featureInfo;
			}

			public void setFeatureInfo(FeatureInfo featureInfo) {
				this.featureInfo = featureInfo;
			}

			public static class FeatureInfo {

				private String vendor;

				private String algorithmVersion;

				private String algorithmType;

				private String tabIed;

				private String objectId;

				private String imageId;

				private String featureData;

				public String getVendor() {
					return this.vendor;
				}

				public void setVendor(String vendor) {
					this.vendor = vendor;
				}

				public String getAlgorithmVersion() {
					return this.algorithmVersion;
				}

				public void setAlgorithmVersion(String algorithmVersion) {
					this.algorithmVersion = algorithmVersion;
				}

				public String getAlgorithmType() {
					return this.algorithmType;
				}

				public void setAlgorithmType(String algorithmType) {
					this.algorithmType = algorithmType;
				}

				public String getTabIed() {
					return this.tabIed;
				}

				public void setTabIed(String tabIed) {
					this.tabIed = tabIed;
				}

				public String getObjectId() {
					return this.objectId;
				}

				public void setObjectId(String objectId) {
					this.objectId = objectId;
				}

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

				public String getFeatureData() {
					return this.featureData;
				}

				public void setFeatureData(String featureData) {
					this.featureData = featureData;
				}
			}
		}
	}

	@Override
	public UpdateAiotPersonTableItemResponse getInstance(UnmarshallerContext context) {
		return	UpdateAiotPersonTableItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
