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
import com.aliyuncs.copyright.transform.v20190123.GetPatentPlanInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentPlanInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String owner;

		private Integer planId;

		private String name;

		private String contact;

		private Integer warnDays;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getPlanId() {
			return this.planId;
		}

		public void setPlanId(Integer planId) {
			this.planId = planId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContact() {
			return this.contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public Integer getWarnDays() {
			return this.warnDays;
		}

		public void setWarnDays(Integer warnDays) {
			this.warnDays = warnDays;
		}
	}

	@Override
	public GetPatentPlanInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPatentPlanInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
