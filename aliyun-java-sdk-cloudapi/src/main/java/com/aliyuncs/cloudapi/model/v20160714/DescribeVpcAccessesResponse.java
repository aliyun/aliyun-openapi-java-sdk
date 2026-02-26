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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeVpcAccessesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcAccessesResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<VpcAccessAttribute> vpcAccessAttributes;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpcAccessAttribute> getVpcAccessAttributes() {
		return this.vpcAccessAttributes;
	}

	public void setVpcAccessAttributes(List<VpcAccessAttribute> vpcAccessAttributes) {
		this.vpcAccessAttributes = vpcAccessAttributes;
	}

	public static class VpcAccessAttribute {

		private String vpcId;

		private String description;

		private String instanceId;

		private Integer port;

		private String name;

		private String createdTime;

		private String regionId;

		private String vpcAccessId;

		private String vpcTargetHostName;

		private List<TagInfo> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcAccessId() {
			return this.vpcAccessId;
		}

		public void setVpcAccessId(String vpcAccessId) {
			this.vpcAccessId = vpcAccessId;
		}

		public String getVpcTargetHostName() {
			return this.vpcTargetHostName;
		}

		public void setVpcTargetHostName(String vpcTargetHostName) {
			this.vpcTargetHostName = vpcTargetHostName;
		}

		public List<TagInfo> getTags() {
			return this.tags;
		}

		public void setTags(List<TagInfo> tags) {
			this.tags = tags;
		}

		public static class TagInfo {

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
	}

	@Override
	public DescribeVpcAccessesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcAccessesResponseUnmarshaller.unmarshall(this, context);
	}
}
