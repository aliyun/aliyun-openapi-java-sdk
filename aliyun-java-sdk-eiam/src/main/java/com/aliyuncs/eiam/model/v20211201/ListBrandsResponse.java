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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListBrandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBrandsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private String previousToken;

	private Long maxResults;

	private List<Brand> brands;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getPreviousToken() {
		return this.previousToken;
	}

	public void setPreviousToken(String previousToken) {
		this.previousToken = previousToken;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<Brand> getBrands() {
		return this.brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public static class Brand {

		private String instanceId;

		private String brandId;

		private String brandName;

		private String brandType;

		private String status;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBrandId() {
			return this.brandId;
		}

		public void setBrandId(String brandId) {
			this.brandId = brandId;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public String getBrandType() {
			return this.brandType;
		}

		public void setBrandType(String brandType) {
			this.brandType = brandType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListBrandsResponse getInstance(UnmarshallerContext context) {
		return	ListBrandsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
