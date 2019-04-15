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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.DescribeResourcesBySystemTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourcesBySystemTagResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<ResourceCount> resourceCounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ResourceCount> getResourceCounts() {
		return this.resourceCounts;
	}

	public void setResourceCounts(List<ResourceCount> resourceCounts) {
		this.resourceCounts = resourceCounts;
	}

	public static class ResourceCount {

		private String relatedResourceService;

		private String resourceType;

		private Integer count;

		public String getRelatedResourceService() {
			return this.relatedResourceService;
		}

		public void setRelatedResourceService(String relatedResourceService) {
			this.relatedResourceService = relatedResourceService;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeResourcesBySystemTagResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourcesBySystemTagResponseUnmarshaller.unmarshall(this, context);
	}
}
