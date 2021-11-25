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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetPatentPlanListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentPlanListResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private Boolean success;

	private Integer totalItemNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<Produces> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

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

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public List<Produces> getData() {
		return this.data;
	}

	public void setData(List<Produces> data) {
		this.data = data;
	}

	public static class Produces {

		private String owner;

		private String contact;

		private Integer soldCount;

		private String unSoldCount;

		private String name;

		private Long planId;

		private Integer totalCount;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getContact() {
			return this.contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public Integer getSoldCount() {
			return this.soldCount;
		}

		public void setSoldCount(Integer soldCount) {
			this.soldCount = soldCount;
		}

		public String getUnSoldCount() {
			return this.unSoldCount;
		}

		public void setUnSoldCount(String unSoldCount) {
			this.unSoldCount = unSoldCount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getPlanId() {
			return this.planId;
		}

		public void setPlanId(Long planId) {
			this.planId = planId;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public GetPatentPlanListResponse getInstance(UnmarshallerContext context) {
		return	GetPatentPlanListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
