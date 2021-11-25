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
import com.aliyuncs.copyright.transform.v20190123.GetPatentPlanInfoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentPlanInfoListResponse extends AcsResponse {

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Boolean success;

	private Integer totalItemNum;

	private Integer totalPageNum;

	private List<Produces> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

		private String contact;

		private String name;

		private String owner;

		private Long planId;

		private Integer warnDays;

		public String getContact() {
			return this.contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getPlanId() {
			return this.planId;
		}

		public void setPlanId(Long planId) {
			this.planId = planId;
		}

		public Integer getWarnDays() {
			return this.warnDays;
		}

		public void setWarnDays(Integer warnDays) {
			this.warnDays = warnDays;
		}
	}

	@Override
	public GetPatentPlanInfoListResponse getInstance(UnmarshallerContext context) {
		return	GetPatentPlanInfoListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
