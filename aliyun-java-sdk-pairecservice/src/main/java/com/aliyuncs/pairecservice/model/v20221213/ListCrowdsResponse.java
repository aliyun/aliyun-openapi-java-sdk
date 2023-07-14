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
import com.aliyuncs.pairecservice.transform.v20221213.ListCrowdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCrowdsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<CrowdsItem> crowds;

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

	public List<CrowdsItem> getCrowds() {
		return this.crowds;
	}

	public void setCrowds(List<CrowdsItem> crowds) {
		this.crowds = crowds;
	}

	public static class CrowdsItem {

		private String crowdId;

		private String name;

		private String description;

		private String label;

		private String source;

		private String quantity;

		private String users;

		private String gmtCreateTime;

		public String getCrowdId() {
			return this.crowdId;
		}

		public void setCrowdId(String crowdId) {
			this.crowdId = crowdId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getQuantity() {
			return this.quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getUsers() {
			return this.users;
		}

		public void setUsers(String users) {
			this.users = users;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}
	}

	@Override
	public ListCrowdsResponse getInstance(UnmarshallerContext context) {
		return	ListCrowdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
