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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMonitorGroupInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorGroupInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<Resource> resources;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String instanceName;

		private String instanceId;

		private String desc;

		private String networkType;

		private String category;

		private String dimension;

		private List<Tag> tags;

		private Region region;

		private Vpc vpc;

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public Region getRegion() {
			return this.region;
		}

		public void setRegion(Region region) {
			this.region = region;
		}

		public Vpc getVpc() {
			return this.vpc;
		}

		public void setVpc(Vpc vpc) {
			this.vpc = vpc;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Region {

			private String regionId;

			private String availabilityZone;

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

			public String getAvailabilityZone() {
				return this.availabilityZone;
			}

			public void setAvailabilityZone(String availabilityZone) {
				this.availabilityZone = availabilityZone;
			}
		}

		public static class Vpc {

			private String vpcInstanceId;

			private String vswitchInstanceId;

			public String getVpcInstanceId() {
				return this.vpcInstanceId;
			}

			public void setVpcInstanceId(String vpcInstanceId) {
				this.vpcInstanceId = vpcInstanceId;
			}

			public String getVswitchInstanceId() {
				return this.vswitchInstanceId;
			}

			public void setVswitchInstanceId(String vswitchInstanceId) {
				this.vswitchInstanceId = vswitchInstanceId;
			}
		}
	}

	@Override
	public DescribeMonitorGroupInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorGroupInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
