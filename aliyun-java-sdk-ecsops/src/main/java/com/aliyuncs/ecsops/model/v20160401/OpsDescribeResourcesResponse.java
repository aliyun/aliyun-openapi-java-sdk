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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourcesResponse extends AcsResponse {

	private String requestId;

	private String marker;

	private Boolean truncated;

	private Integer estimatedTotal;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public Boolean getTruncated() {
		return this.truncated;
	}

	public void setTruncated(Boolean truncated) {
		this.truncated = truncated;
	}

	public Integer getEstimatedTotal() {
		return this.estimatedTotal;
	}

	public void setEstimatedTotal(Integer estimatedTotal) {
		this.estimatedTotal = estimatedTotal;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String product;

		private String resourceType;

		private String resourceId;

		private String resourceName;

		private String createTime;

		private String updateTime;

		private String regionId;

		private Map<Object,Object> matchedAttributes;

		private String arn;

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

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Map<Object,Object> getMatchedAttributes() {
			return this.matchedAttributes;
		}

		public void setMatchedAttributes(Map<Object,Object> matchedAttributes) {
			this.matchedAttributes = matchedAttributes;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}
	}

	@Override
	public OpsDescribeResourcesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourcesResponseUnmarshaller.unmarshall(this, context);
	}
}
