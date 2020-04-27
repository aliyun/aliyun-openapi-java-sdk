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

package com.aliyuncs.resourcemanager.model.v20200331;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.ListTrustedServiceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrustedServiceStatusResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<EnabledServicePrincipal> enabledServicePrincipals;

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

	public List<EnabledServicePrincipal> getEnabledServicePrincipals() {
		return this.enabledServicePrincipals;
	}

	public void setEnabledServicePrincipals(List<EnabledServicePrincipal> enabledServicePrincipals) {
		this.enabledServicePrincipals = enabledServicePrincipals;
	}

	public static class EnabledServicePrincipal {

		private String enableTime;

		private String servicePrincipal;

		public String getEnableTime() {
			return this.enableTime;
		}

		public void setEnableTime(String enableTime) {
			this.enableTime = enableTime;
		}

		public String getServicePrincipal() {
			return this.servicePrincipal;
		}

		public void setServicePrincipal(String servicePrincipal) {
			this.servicePrincipal = servicePrincipal;
		}
	}

	@Override
	public ListTrustedServiceStatusResponse getInstance(UnmarshallerContext context) {
		return	ListTrustedServiceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
