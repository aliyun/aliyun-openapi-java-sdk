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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayBucketCachesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayBucketCachesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private String code;

	private Boolean success;

	private List<BucketCache> bucketCaches;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public List<BucketCache> getBucketCaches() {
		return this.bucketCaches;
	}

	public void setBucketCaches(List<BucketCache> bucketCaches) {
		this.bucketCaches = bucketCaches;
	}

	public static class BucketCache {

		private String vpcId;

		private String type;

		private String mountPoint;

		private String gatewayId;

		private String cacheMode;

		private String protocol;

		private String gatewayName;

		private String cacheStats;

		private String shareName;

		private String regionId;

		private String vpcCidr;

		private String bucketName;

		private String category;

		private String location;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMountPoint() {
			return this.mountPoint;
		}

		public void setMountPoint(String mountPoint) {
			this.mountPoint = mountPoint;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getCacheMode() {
			return this.cacheMode;
		}

		public void setCacheMode(String cacheMode) {
			this.cacheMode = cacheMode;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public String getCacheStats() {
			return this.cacheStats;
		}

		public void setCacheStats(String cacheStats) {
			this.cacheStats = cacheStats;
		}

		public String getShareName() {
			return this.shareName;
		}

		public void setShareName(String shareName) {
			this.shareName = shareName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcCidr() {
			return this.vpcCidr;
		}

		public void setVpcCidr(String vpcCidr) {
			this.vpcCidr = vpcCidr;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
	}

	@Override
	public DescribeGatewayBucketCachesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayBucketCachesResponseUnmarshaller.unmarshall(this, context);
	}
}
