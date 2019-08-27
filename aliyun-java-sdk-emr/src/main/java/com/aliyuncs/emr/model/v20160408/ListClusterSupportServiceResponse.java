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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterSupportServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterSupportServiceResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageNumber;

	private List<SupportService> supportServiceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<SupportService> getSupportServiceList() {
		return this.supportServiceList;
	}

	public void setSupportServiceList(List<SupportService> supportServiceList) {
		this.supportServiceList = supportServiceList;
	}

	public static class SupportService {

		private String serviceName;

		private String serviceDisplayName;

		private String serviceVersion;

		private String serviceEcmVersion;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDisplayName() {
			return this.serviceDisplayName;
		}

		public void setServiceDisplayName(String serviceDisplayName) {
			this.serviceDisplayName = serviceDisplayName;
		}

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public String getServiceEcmVersion() {
			return this.serviceEcmVersion;
		}

		public void setServiceEcmVersion(String serviceEcmVersion) {
			this.serviceEcmVersion = serviceEcmVersion;
		}
	}

	@Override
	public ListClusterSupportServiceResponse getInstance(UnmarshallerContext context) {
		return	ListClusterSupportServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
