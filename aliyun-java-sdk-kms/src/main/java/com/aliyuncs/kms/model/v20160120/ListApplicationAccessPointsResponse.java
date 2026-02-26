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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.ListApplicationAccessPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationAccessPointsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ApplicationAccessPoint> applicationAccessPoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ApplicationAccessPoint> getApplicationAccessPoints() {
		return this.applicationAccessPoints;
	}

	public void setApplicationAccessPoints(List<ApplicationAccessPoint> applicationAccessPoints) {
		this.applicationAccessPoints = applicationAccessPoints;
	}

	public static class ApplicationAccessPoint {

		private String name;

		private String authenticationMethod;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthenticationMethod() {
			return this.authenticationMethod;
		}

		public void setAuthenticationMethod(String authenticationMethod) {
			this.authenticationMethod = authenticationMethod;
		}
	}

	@Override
	public ListApplicationAccessPointsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationAccessPointsResponseUnmarshaller.unmarshall(this, context);
	}
}
