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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAiotPersonTableItemRequest extends RpcAcsRequest<UpdateAiotPersonTableItemResponse> {
	   

	private String personTableId;

	private PersonTableItem personTableItem;

	private String id;
	public UpdateAiotPersonTableItemRequest() {
		super("Vcs", "2020-05-15", "UpdateAiotPersonTableItem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPersonTableId() {
		return this.personTableId;
	}

	public void setPersonTableId(String personTableId) {
		this.personTableId = personTableId;
		if(personTableId != null){
			putBodyParameter("PersonTableId", personTableId);
		}
	}

	public PersonTableItem getPersonTableItem() {
		return this.personTableItem;
	}

	public void setPersonTableItem(PersonTableItem personTableItem) {
		this.personTableItem = personTableItem;	
		if (personTableItem != null) {
			
				if (personTableItem.getIdentificationList() != null) {
					for (int depth1 = 0; depth1 < personTableItem.getIdentificationList().size(); depth1++) {
						if (personTableItem.getIdentificationList().get(depth1) != null) {
							
								putBodyParameter("PersonTableItem.IdentificationList." + (depth1 + 1) + ".Number" , personTableItem.getIdentificationList().get(depth1).getNumber());
								putBodyParameter("PersonTableItem.IdentificationList." + (depth1 + 1) + ".Type" , personTableItem.getIdentificationList().get(depth1).getType());
						}
					}
				}
				putBodyParameter("PersonTableItem.PersonCode" , personTableItem.getPersonCode());
				putBodyParameter("PersonTableItem.ImageNum" , personTableItem.getImageNum());
				putBodyParameter("PersonTableItem.PersonId" , personTableItem.getPersonId());
				if (personTableItem.getImageList() != null) {
					for (int depth1 = 0; depth1 < personTableItem.getImageList().size(); depth1++) {
						if (personTableItem.getImageList().get(depth1) != null) {
							
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".ImageId" , personTableItem.getImageList().get(depth1).getImageId());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".Size" , personTableItem.getImageList().get(depth1).getSize());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".Data" , personTableItem.getImageList().get(depth1).getData());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".EventSort" , personTableItem.getImageList().get(depth1).getEventSort());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".ShotTime" , personTableItem.getImageList().get(depth1).getShotTime());
								if (personTableItem.getImageList().get(depth1).getFeatureInfo() != null) {
									
										putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FeatureInfo.AlgorithmType" , personTableItem.getImageList().get(depth1).getFeatureInfo().getAlgorithmType());
										putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FeatureInfo.TabIeId" , personTableItem.getImageList().get(depth1).getFeatureInfo().getTabIeId());
										putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FeatureInfo.ImageId" , personTableItem.getImageList().get(depth1).getFeatureInfo().getImageId());
										putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FeatureInfo.Vendor" , personTableItem.getImageList().get(depth1).getFeatureInfo().getVendor());
										putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FeatureInfo.AlgorithmVersion" , personTableItem.getImageList().get(depth1).getFeatureInfo().getAlgorithmVersion());
										putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FeatureInfo.ObjectId" , personTableItem.getImageList().get(depth1).getFeatureInfo().getObjectId());
										putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FeatureInfo.FeatureData" , personTableItem.getImageList().get(depth1).getFeatureInfo().getFeatureData());
								}
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".StoragePath" , personTableItem.getImageList().get(depth1).getStoragePath());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".Width" , personTableItem.getImageList().get(depth1).getWidth());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".FileFormat" , personTableItem.getImageList().get(depth1).getFileFormat());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".Type" , personTableItem.getImageList().get(depth1).getType());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".DeviceId" , personTableItem.getImageList().get(depth1).getDeviceId());
								putBodyParameter("PersonTableItem.ImageList." + (depth1 + 1) + ".Height" , personTableItem.getImageList().get(depth1).getHeight());
						}
					}
				}
				putBodyParameter("PersonTableItem.Remarks" , personTableItem.getRemarks());
				putBodyParameter("PersonTableItem.PersonName" , personTableItem.getPersonName());
				putBodyParameter("PersonTableItem.IdentificationNum" , personTableItem.getIdentificationNum());
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public static class PersonTableItem {

		private List<IdentificationListItem> identificationList;

		private String personCode;

		private Long imageNum;

		private String personId;

		private List<ImageListItem> imageList;

		private String remarks;

		private String personName;

		private Long identificationNum;

		public List<IdentificationListItem> getIdentificationList() {
			return this.identificationList;
		}

		public void setIdentificationList(List<IdentificationListItem> identificationList) {
			this.identificationList = identificationList;
		}

		public String getPersonCode() {
			return this.personCode;
		}

		public void setPersonCode(String personCode) {
			this.personCode = personCode;
		}

		public Long getImageNum() {
			return this.imageNum;
		}

		public void setImageNum(Long imageNum) {
			this.imageNum = imageNum;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public List<ImageListItem> getImageList() {
			return this.imageList;
		}

		public void setImageList(List<ImageListItem> imageList) {
			this.imageList = imageList;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public String getPersonName() {
			return this.personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		public Long getIdentificationNum() {
			return this.identificationNum;
		}

		public void setIdentificationNum(Long identificationNum) {
			this.identificationNum = identificationNum;
		}

		public static class IdentificationListItem {

			private String number;

			private Long type;

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public Long getType() {
				return this.type;
			}

			public void setType(Long type) {
				this.type = type;
			}
		}

		public static class ImageListItem {

			private String imageId;

			private Long size;

			private String data;

			private String eventSort;

			private String shotTime;

			private FeatureInfo featureInfo;

			private String storagePath;

			private Long width;

			private String fileFormat;

			private String type;

			private String deviceId;

			private Long height;

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getData() {
				return this.data;
			}

			public void setData(String data) {
				this.data = data;
			}

			public String getEventSort() {
				return this.eventSort;
			}

			public void setEventSort(String eventSort) {
				this.eventSort = eventSort;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public FeatureInfo getFeatureInfo() {
				return this.featureInfo;
			}

			public void setFeatureInfo(FeatureInfo featureInfo) {
				this.featureInfo = featureInfo;
			}

			public String getStoragePath() {
				return this.storagePath;
			}

			public void setStoragePath(String storagePath) {
				this.storagePath = storagePath;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public String getFileFormat() {
				return this.fileFormat;
			}

			public void setFileFormat(String fileFormat) {
				this.fileFormat = fileFormat;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public static class FeatureInfo {

				private String algorithmType;

				private String tabIeId;

				private String imageId;

				private String vendor;

				private String algorithmVersion;

				private String objectId;

				private String featureData;

				public String getAlgorithmType() {
					return this.algorithmType;
				}

				public void setAlgorithmType(String algorithmType) {
					this.algorithmType = algorithmType;
				}

				public String getTabIeId() {
					return this.tabIeId;
				}

				public void setTabIeId(String tabIeId) {
					this.tabIeId = tabIeId;
				}

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

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

				public String getObjectId() {
					return this.objectId;
				}

				public void setObjectId(String objectId) {
					this.objectId = objectId;
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
	public Class<UpdateAiotPersonTableItemResponse> getResponseClass() {
		return UpdateAiotPersonTableItemResponse.class;
	}

}
