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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryDomainAdminDivisionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainAdminDivisionResponse extends AcsResponse {

	private String requestId;

	private List<AdminDivision> adminDivisions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AdminDivision> getAdminDivisions() {
		return this.adminDivisions;
	}

	public void setAdminDivisions(List<AdminDivision> adminDivisions) {
		this.adminDivisions = adminDivisions;
	}

	public static class AdminDivision {

		private String divisionName;

		private List<ChildrenItem> children;

		public String getDivisionName() {
			return this.divisionName;
		}

		public void setDivisionName(String divisionName) {
			this.divisionName = divisionName;
		}

		public List<ChildrenItem> getChildren() {
			return this.children;
		}

		public void setChildren(List<ChildrenItem> children) {
			this.children = children;
		}

		public static class ChildrenItem {

			private String childDivisionName;

			public String getChildDivisionName() {
				return this.childDivisionName;
			}

			public void setChildDivisionName(String childDivisionName) {
				this.childDivisionName = childDivisionName;
			}
		}
	}

	@Override
	public QueryDomainAdminDivisionResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainAdminDivisionResponseUnmarshaller.unmarshall(this, context);
	}
}
