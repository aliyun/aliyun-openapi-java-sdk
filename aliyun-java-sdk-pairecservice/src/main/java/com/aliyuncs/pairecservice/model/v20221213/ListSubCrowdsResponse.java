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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.ListSubCrowdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubCrowdsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<SubCrowdsItem> subCrowds;

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

	public List<SubCrowdsItem> getSubCrowds() {
		return this.subCrowds;
	}

	public void setSubCrowds(List<SubCrowdsItem> subCrowds) {
		this.subCrowds = subCrowds;
	}

	public static class SubCrowdsItem {

		private String subCrowdId;

		private String source;

		private String users;

		private Integer quantity;

		private String gmtCreateTime;

		public String getSubCrowdId() {
			return this.subCrowdId;
		}

		public void setSubCrowdId(String subCrowdId) {
			this.subCrowdId = subCrowdId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getUsers() {
			return this.users;
		}

		public void setUsers(String users) {
			this.users = users;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}
	}

	@Override
	public ListSubCrowdsResponse getInstance(UnmarshallerContext context) {
		return	ListSubCrowdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
