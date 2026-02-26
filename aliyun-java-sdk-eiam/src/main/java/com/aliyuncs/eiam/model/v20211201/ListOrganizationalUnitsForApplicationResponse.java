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
import com.aliyuncs.eiam.transform.v20211201.ListOrganizationalUnitsForApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOrganizationalUnitsForApplicationResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<OrganizationalUnit> organizationalUnits;

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

	public List<OrganizationalUnit> getOrganizationalUnits() {
		return this.organizationalUnits;
	}

	public void setOrganizationalUnits(List<OrganizationalUnit> organizationalUnits) {
		this.organizationalUnits = organizationalUnits;
	}

	public static class OrganizationalUnit {

		private String organizationalUnitId;

		public String getOrganizationalUnitId() {
			return this.organizationalUnitId;
		}

		public void setOrganizationalUnitId(String organizationalUnitId) {
			this.organizationalUnitId = organizationalUnitId;
		}
	}

	@Override
	public ListOrganizationalUnitsForApplicationResponse getInstance(UnmarshallerContext context) {
		return	ListOrganizationalUnitsForApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
