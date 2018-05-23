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

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryAvailableImagesRequest extends RpcAcsRequest<InnerQueryAvailableImagesResponse> {
	
	public InnerQueryAvailableImagesRequest() {
		super("Market-Inner", "2016-08-01", "InnerQueryAvailableImages", "yunmarket", "innerAPI");
	}

	private Boolean supportIoOptimized;

	private String snapshotId;

	private List<String> imageIds;

	private String imageName;

	private Integer pageSize;

	private List<EcsUnit> ecsUnits;

	private Integer pageIndex;

	private Long aliUid;

	private List<OsType> osTypes;

	private String regionNo;

	public Boolean getSupportIoOptimized() {
		return this.supportIoOptimized;
	}

	public void setSupportIoOptimized(Boolean supportIoOptimized) {
		this.supportIoOptimized = supportIoOptimized;
		if(supportIoOptimized != null){
			putQueryParameter("SupportIoOptimized", supportIoOptimized.toString());
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<EcsUnit> getEcsUnits() {
		return this.ecsUnits;
	}

	public void setEcsUnits(List<EcsUnit> ecsUnits) {
		this.ecsUnits = ecsUnits;	
		if (ecsUnits != null) {
			for (int depth1 = 0; depth1 < ecsUnits.size(); depth1++) {
				putQueryParameter("EcsUnit." + (depth1 + 1) + ".Core" , ecsUnits.get(depth1).getCore());
				putQueryParameter("EcsUnit." + (depth1 + 1) + ".Memory" , ecsUnits.get(depth1).getMemory());
			}
		}	
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public List<OsType> getOsTypes() {
		return this.osTypes;
	}

	public void setOsTypes(List<OsType> osTypes) {
		this.osTypes = osTypes;	
		if (osTypes != null) {
			for (int depth1 = 0; depth1 < osTypes.size(); depth1++) {
				putQueryParameter("OsType." + (depth1 + 1) + ".OsKind" , osTypes.get(depth1).getOsKind());
				putQueryParameter("OsType." + (depth1 + 1) + ".OsBit" , osTypes.get(depth1).getOsBit());
			}
		}	
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public static class EcsUnit {

		private Integer core;

		private Integer memory;

		public Integer getCore() {
			return this.core;
		}

		public void setCore(Integer core) {
			this.core = core;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}
	}

	public static class OsType {

		private String osKind;

		private Integer osBit;

		public String getOsKind() {
			return this.osKind;
		}

		public void setOsKind(String osKind) {
			this.osKind = osKind;
		}

		public Integer getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Integer osBit) {
			this.osBit = osBit;
		}
	}

	@Override
	public Class<InnerQueryAvailableImagesResponse> getResponseClass() {
		return InnerQueryAvailableImagesResponse.class;
	}

}
