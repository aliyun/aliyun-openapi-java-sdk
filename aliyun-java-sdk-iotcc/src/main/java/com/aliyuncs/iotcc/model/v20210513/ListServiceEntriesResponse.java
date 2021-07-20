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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListServiceEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<ServiceEntryModel> serviceEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ServiceEntryModel> getServiceEntries() {
		return this.serviceEntries;
	}

	public void setServiceEntries(List<ServiceEntryModel> serviceEntries) {
		this.serviceEntries = serviceEntries;
	}

	public static class ServiceEntryModel {

		private String serviceId;

		private String serviceEntryStatus;

		private String target;

		private String targetType;

		private String serviceEntryName;

		private String serviceEntryDescription;

		private String serviceEntryId;

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceEntryStatus() {
			return this.serviceEntryStatus;
		}

		public void setServiceEntryStatus(String serviceEntryStatus) {
			this.serviceEntryStatus = serviceEntryStatus;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getServiceEntryName() {
			return this.serviceEntryName;
		}

		public void setServiceEntryName(String serviceEntryName) {
			this.serviceEntryName = serviceEntryName;
		}

		public String getServiceEntryDescription() {
			return this.serviceEntryDescription;
		}

		public void setServiceEntryDescription(String serviceEntryDescription) {
			this.serviceEntryDescription = serviceEntryDescription;
		}

		public String getServiceEntryId() {
			return this.serviceEntryId;
		}

		public void setServiceEntryId(String serviceEntryId) {
			this.serviceEntryId = serviceEntryId;
		}
	}

	@Override
	public ListServiceEntriesResponse getInstance(UnmarshallerContext context) {
		return	ListServiceEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
