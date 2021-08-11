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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribePrefixListAssociationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePrefixListAssociationsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<PrefixListAssociation> prefixListAssociations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<PrefixListAssociation> getPrefixListAssociations() {
		return this.prefixListAssociations;
	}

	public void setPrefixListAssociations(List<PrefixListAssociation> prefixListAssociations) {
		this.prefixListAssociations = prefixListAssociations;
	}

	public static class PrefixListAssociation {

		private String resourceId;

		private String resourceType;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public DescribePrefixListAssociationsResponse getInstance(UnmarshallerContext context) {
		return	DescribePrefixListAssociationsResponseUnmarshaller.unmarshall(this, context);
	}
}
