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
import com.aliyuncs.vpc.transform.v20160428.DescribeEcGrantRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEcGrantRelationResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer count;

	private Integer page;

	private Integer pageSize;

	private List<EcGrantRelationModel> ecGrantRelations;

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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<EcGrantRelationModel> getEcGrantRelations() {
		return this.ecGrantRelations;
	}

	public void setEcGrantRelations(List<EcGrantRelationModel> ecGrantRelations) {
		this.ecGrantRelations = ecGrantRelations;
	}

	public static class EcGrantRelationModel {

		private Long vbrOwnerUid;

		private String vbrInstanceId;

		private String instanceId;

		private Long aliUid;

		private String regionNo;

		private String status;

		private String instanceName;

		private String instanceRouterId;

		private String vbrRegionNo;

		private String gmtCreate;

		public Long getVbrOwnerUid() {
			return this.vbrOwnerUid;
		}

		public void setVbrOwnerUid(Long vbrOwnerUid) {
			this.vbrOwnerUid = vbrOwnerUid;
		}

		public String getVbrInstanceId() {
			return this.vbrInstanceId;
		}

		public void setVbrInstanceId(String vbrInstanceId) {
			this.vbrInstanceId = vbrInstanceId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceRouterId() {
			return this.instanceRouterId;
		}

		public void setInstanceRouterId(String instanceRouterId) {
			this.instanceRouterId = instanceRouterId;
		}

		public String getVbrRegionNo() {
			return this.vbrRegionNo;
		}

		public void setVbrRegionNo(String vbrRegionNo) {
			this.vbrRegionNo = vbrRegionNo;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
	}

	@Override
	public DescribeEcGrantRelationResponse getInstance(UnmarshallerContext context) {
		return	DescribeEcGrantRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
