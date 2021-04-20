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
public class AddAiotPersonTableItemsRequest extends RpcAcsRequest<AddAiotPersonTableItemsResponse> {
	   

	private String personTableId;

	private List<PersonTableItemList> personTableItemList;

	private String id;
	public AddAiotPersonTableItemsRequest() {
		super("Vcs", "2020-05-15", "AddAiotPersonTableItems");
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

	public List<PersonTableItemList> getPersonTableItemList() {
		return this.personTableItemList;
	}

	public void setPersonTableItemList(List<PersonTableItemList> personTableItemList) {
		this.personTableItemList = personTableItemList;	
		if (personTableItemList != null) {
			for (int depth1 = 0; depth1 < personTableItemList.size(); depth1++) {
				if (personTableItemList.get(depth1) != null) {
					
						if (personTableItemList.get(depth1).getIdentificationList() != null) {
							for (int depth2 = 0; depth2 < personTableItemList.get(depth1).getIdentificationList().size(); depth2++) {
								if (personTableItemList.get(depth1).getIdentificationList().get(depth2) != null) {
									
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".IdentificationList." + (depth2 + 1) + ".Number" , personTableItemList.get(depth1).getIdentificationList().get(depth2).getNumber());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".IdentificationList." + (depth2 + 1) + ".Type" , personTableItemList.get(depth1).getIdentificationList().get(depth2).getType());
								}
							}
						}
						putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".PersonCode" , personTableItemList.get(depth1).getPersonCode());
						putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageNum" , personTableItemList.get(depth1).getImageNum());
						putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".PersonId" , personTableItemList.get(depth1).getPersonId());
						if (personTableItemList.get(depth1).getImageList() != null) {
							for (int depth2 = 0; depth2 < personTableItemList.get(depth1).getImageList().size(); depth2++) {
								if (personTableItemList.get(depth1).getImageList().get(depth2) != null) {
									
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".ImageId" , personTableItemList.get(depth1).getImageList().get(depth2).getImageId());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".Size" , personTableItemList.get(depth1).getImageList().get(depth2).getSize());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".Data" , personTableItemList.get(depth1).getImageList().get(depth2).getData());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".EventSort" , personTableItemList.get(depth1).getImageList().get(depth2).getEventSort());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".ShotTime" , personTableItemList.get(depth1).getImageList().get(depth2).getShotTime());
										if (personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo() != null) {
											
												putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FeatureInfo.AlgorithmType" , personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo().getAlgorithmType());
												putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FeatureInfo.ImageId" , personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo().getImageId());
												putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FeatureInfo.TabIed" , personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo().getTabIed());
												putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FeatureInfo.Vendor" , personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo().getVendor());
												putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FeatureInfo.AlgorithmVersion" , personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo().getAlgorithmVersion());
												putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FeatureInfo.ObjectId" , personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo().getObjectId());
												putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FeatureInfo.FeatureData" , personTableItemList.get(depth1).getImageList().get(depth2).getFeatureInfo().getFeatureData());
										}
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".StoragePath" , personTableItemList.get(depth1).getImageList().get(depth2).getStoragePath());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".Width" , personTableItemList.get(depth1).getImageList().get(depth2).getWidth());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".FileFormat" , personTableItemList.get(depth1).getImageList().get(depth2).getFileFormat());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".Type" , personTableItemList.get(depth1).getImageList().get(depth2).getType());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".DeviceId" , personTableItemList.get(depth1).getImageList().get(depth2).getDeviceId());
										putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".ImageList." + (depth2 + 1) + ".Height" , personTableItemList.get(depth1).getImageList().get(depth2).getHeight());
								}
							}
						}
						putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".Remarks" , personTableItemList.get(depth1).getRemarks());
						putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".PersonName" , personTableItemList.get(depth1).getPersonName());
						putBodyParameter("PersonTableItemList." + (depth1 + 1) + ".IdentificationNum" , personTableItemList.get(depth1).getIdentificationNum());
				}
			}
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

	public static class PersonTableItemList {

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

				private String imageId;

				private String tabIed;

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

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

				public String getTabIed() {
					return this.tabIed;
				}

				public void setTabIed(String tabIed) {
					this.tabIed = tabIed;
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
	public Class<AddAiotPersonTableItemsResponse> getResponseClass() {
		return AddAiotPersonTableItemsResponse.class;
	}

}
