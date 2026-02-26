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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.ListBucketsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBucketsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextMarker;

	private List<BucketInfo> bucketInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public List<BucketInfo> getBucketInfos() {
		return this.bucketInfos;
	}

	public void setBucketInfos(List<BucketInfo> bucketInfos) {
		this.bucketInfos = bucketInfos;
	}

	public static class BucketInfo {

		private String bucketAcl;

		private String bucketName;

		private String city;

		private String comment;

		private String cORSRule;

		private String createTime;

		private String dataRedundancyType;

		private String dispatcherType;

		private String endpoint;

		private String engineInfo;

		private String indexTableName;

		private String lifecycleRule;

		private String logicalBucketType;

		private String modifyTime;

		private String product;

		private String resourceType;

		private String storageClass;

		private Long userId;

		private String ensRegionId;

		public String getBucketAcl() {
			return this.bucketAcl;
		}

		public void setBucketAcl(String bucketAcl) {
			this.bucketAcl = bucketAcl;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getCORSRule() {
			return this.cORSRule;
		}

		public void setCORSRule(String cORSRule) {
			this.cORSRule = cORSRule;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDataRedundancyType() {
			return this.dataRedundancyType;
		}

		public void setDataRedundancyType(String dataRedundancyType) {
			this.dataRedundancyType = dataRedundancyType;
		}

		public String getDispatcherType() {
			return this.dispatcherType;
		}

		public void setDispatcherType(String dispatcherType) {
			this.dispatcherType = dispatcherType;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getEngineInfo() {
			return this.engineInfo;
		}

		public void setEngineInfo(String engineInfo) {
			this.engineInfo = engineInfo;
		}

		public String getIndexTableName() {
			return this.indexTableName;
		}

		public void setIndexTableName(String indexTableName) {
			this.indexTableName = indexTableName;
		}

		public String getLifecycleRule() {
			return this.lifecycleRule;
		}

		public void setLifecycleRule(String lifecycleRule) {
			this.lifecycleRule = lifecycleRule;
		}

		public String getLogicalBucketType() {
			return this.logicalBucketType;
		}

		public void setLogicalBucketType(String logicalBucketType) {
			this.logicalBucketType = logicalBucketType;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}
	}

	@Override
	public ListBucketsResponse getInstance(UnmarshallerContext context) {
		return	ListBucketsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
