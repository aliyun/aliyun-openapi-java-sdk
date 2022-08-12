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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVpnCrossAccountAuthorizationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpnCrossAccountAuthorizationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CrossAccountAuthorization> crossAccountAuthorizations;

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

	public List<CrossAccountAuthorization> getCrossAccountAuthorizations() {
		return this.crossAccountAuthorizations;
	}

	public void setCrossAccountAuthorizations(List<CrossAccountAuthorization> crossAccountAuthorizations) {
		this.crossAccountAuthorizations = crossAccountAuthorizations;
	}

	public static class CrossAccountAuthorization {

		private String vpnConnectionId;

		private Long bindUid;

		private String bindProduct;

		private String bindInstance;

		private Long aliUid;

		private Long creationTime;

		public String getVpnConnectionId() {
			return this.vpnConnectionId;
		}

		public void setVpnConnectionId(String vpnConnectionId) {
			this.vpnConnectionId = vpnConnectionId;
		}

		public Long getBindUid() {
			return this.bindUid;
		}

		public void setBindUid(Long bindUid) {
			this.bindUid = bindUid;
		}

		public String getBindProduct() {
			return this.bindProduct;
		}

		public void setBindProduct(String bindProduct) {
			this.bindProduct = bindProduct;
		}

		public String getBindInstance() {
			return this.bindInstance;
		}

		public void setBindInstance(String bindInstance) {
			this.bindInstance = bindInstance;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DescribeVpnCrossAccountAuthorizationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnCrossAccountAuthorizationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
