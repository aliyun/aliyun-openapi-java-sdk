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

package com.aliyuncs.yundun_ds.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeDataLimitSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataLimitSetResponse extends AcsResponse {

	private String requestId;

	private DataLimitSet dataLimitSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DataLimitSet getDataLimitSet() {
		return this.dataLimitSet;
	}

	public void setDataLimitSet(DataLimitSet dataLimitSet) {
		this.dataLimitSet = dataLimitSet;
	}

	public static class DataLimitSet {

		private Integer resourceType;

		private List<DataLimit> dataLimitList;

		private List<OssBucket> ossBucketList;

		private List<Region> regionList;

		public Integer getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(Integer resourceType) {
			this.resourceType = resourceType;
		}

		public List<DataLimit> getDataLimitList() {
			return this.dataLimitList;
		}

		public void setDataLimitList(List<DataLimit> dataLimitList) {
			this.dataLimitList = dataLimitList;
		}

		public List<OssBucket> getOssBucketList() {
			return this.ossBucketList;
		}

		public void setOssBucketList(List<OssBucket> ossBucketList) {
			this.ossBucketList = ossBucketList;
		}

		public List<Region> getRegionList() {
			return this.regionList;
		}

		public void setRegionList(List<Region> regionList) {
			this.regionList = regionList;
		}

		public static class DataLimit {

			private String regionId;

			private String localName;

			private String parentId;

			private Long id;

			private String userName;

			private Long gmtCreate;

			private String connector;

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getLocalName() {
				return this.localName;
			}

			public void setLocalName(String localName) {
				this.localName = localName;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getConnector() {
				return this.connector;
			}

			public void setConnector(String connector) {
				this.connector = connector;
			}
		}

		public static class OssBucket {

			private String bucketName;

			private String regionId;

			public String getBucketName() {
				return this.bucketName;
			}

			public void setBucketName(String bucketName) {
				this.bucketName = bucketName;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class Region {

			private String localName;

			private String regionId;

			public String getLocalName() {
				return this.localName;
			}

			public void setLocalName(String localName) {
				this.localName = localName;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public DescribeDataLimitSetResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataLimitSetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
