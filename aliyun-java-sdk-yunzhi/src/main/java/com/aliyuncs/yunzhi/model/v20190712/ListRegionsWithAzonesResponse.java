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

package com.aliyuncs.yunzhi.model.v20190712;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yunzhi.transform.v20190712.ListRegionsWithAzonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRegionsWithAzonesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<Region> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Region> getData() {
		return this.data;
	}

	public void setData(List<Region> data) {
		this.data = data;
	}

	public static class Region {

		private Long id;

		private String regionCode;

		private String regionShowNameCn;

		private String oversea;

		private List<Azone> azoneList;

		private CloudPlatformDTO cloudPlatformDTO;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRegionCode() {
			return this.regionCode;
		}

		public void setRegionCode(String regionCode) {
			this.regionCode = regionCode;
		}

		public String getRegionShowNameCn() {
			return this.regionShowNameCn;
		}

		public void setRegionShowNameCn(String regionShowNameCn) {
			this.regionShowNameCn = regionShowNameCn;
		}

		public String getOversea() {
			return this.oversea;
		}

		public void setOversea(String oversea) {
			this.oversea = oversea;
		}

		public List<Azone> getAzoneList() {
			return this.azoneList;
		}

		public void setAzoneList(List<Azone> azoneList) {
			this.azoneList = azoneList;
		}

		public CloudPlatformDTO getCloudPlatformDTO() {
			return this.cloudPlatformDTO;
		}

		public void setCloudPlatformDTO(CloudPlatformDTO cloudPlatformDTO) {
			this.cloudPlatformDTO = cloudPlatformDTO;
		}

		public static class Azone {

			private Long id;

			private String azoneCode;

			private String azoneShowNameCn;

			private String azoneShowNameEn;

			private String azoneShowNameJp;

			private String machineRoomId;

			private String status;

			private Integer sort;

			private String cloudPlatformName;

			private Long platformId;

			private String regionCode;

			private Long regionId;

			private String regionShowName;

			private String letter;

			private String azoneShortCode;

			private String planDate;

			private Integer internal;

			private String districtName;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAzoneCode() {
				return this.azoneCode;
			}

			public void setAzoneCode(String azoneCode) {
				this.azoneCode = azoneCode;
			}

			public String getAzoneShowNameCn() {
				return this.azoneShowNameCn;
			}

			public void setAzoneShowNameCn(String azoneShowNameCn) {
				this.azoneShowNameCn = azoneShowNameCn;
			}

			public String getAzoneShowNameEn() {
				return this.azoneShowNameEn;
			}

			public void setAzoneShowNameEn(String azoneShowNameEn) {
				this.azoneShowNameEn = azoneShowNameEn;
			}

			public String getAzoneShowNameJp() {
				return this.azoneShowNameJp;
			}

			public void setAzoneShowNameJp(String azoneShowNameJp) {
				this.azoneShowNameJp = azoneShowNameJp;
			}

			public String getMachineRoomId() {
				return this.machineRoomId;
			}

			public void setMachineRoomId(String machineRoomId) {
				this.machineRoomId = machineRoomId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getSort() {
				return this.sort;
			}

			public void setSort(Integer sort) {
				this.sort = sort;
			}

			public String getCloudPlatformName() {
				return this.cloudPlatformName;
			}

			public void setCloudPlatformName(String cloudPlatformName) {
				this.cloudPlatformName = cloudPlatformName;
			}

			public Long getPlatformId() {
				return this.platformId;
			}

			public void setPlatformId(Long platformId) {
				this.platformId = platformId;
			}

			public String getRegionCode() {
				return this.regionCode;
			}

			public void setRegionCode(String regionCode) {
				this.regionCode = regionCode;
			}

			public Long getRegionId() {
				return this.regionId;
			}

			public void setRegionId(Long regionId) {
				this.regionId = regionId;
			}

			public String getRegionShowName() {
				return this.regionShowName;
			}

			public void setRegionShowName(String regionShowName) {
				this.regionShowName = regionShowName;
			}

			public String getLetter() {
				return this.letter;
			}

			public void setLetter(String letter) {
				this.letter = letter;
			}

			public String getAzoneShortCode() {
				return this.azoneShortCode;
			}

			public void setAzoneShortCode(String azoneShortCode) {
				this.azoneShortCode = azoneShortCode;
			}

			public String getPlanDate() {
				return this.planDate;
			}

			public void setPlanDate(String planDate) {
				this.planDate = planDate;
			}

			public Integer getInternal() {
				return this.internal;
			}

			public void setInternal(Integer internal) {
				this.internal = internal;
			}

			public String getDistrictName() {
				return this.districtName;
			}

			public void setDistrictName(String districtName) {
				this.districtName = districtName;
			}
		}

		public static class CloudPlatformDTO {

			private Long id;

			private String code;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListRegionsWithAzonesResponse getInstance(UnmarshallerContext context) {
		return	ListRegionsWithAzonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
