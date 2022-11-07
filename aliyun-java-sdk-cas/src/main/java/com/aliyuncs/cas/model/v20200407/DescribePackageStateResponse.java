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

package com.aliyuncs.cas.model.v20200407;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200407.DescribePackageStateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePackageStateResponse extends AcsResponse {

	private Long issuedCount;

	private String requestId;

	private Long totalCount;

	private String productCode;

	private Long usedCount;

	public Long getIssuedCount() {
		return this.issuedCount;
	}

	public void setIssuedCount(Long issuedCount) {
		this.issuedCount = issuedCount;
	}

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

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}

	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

	@Override
	public DescribePackageStateResponse getInstance(UnmarshallerContext context) {
		return	DescribePackageStateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
