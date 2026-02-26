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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListVSwitchCidrReservationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVSwitchCidrReservationsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Long totalCount;

	private Long maxResults;

	private List<VSwitchCidrReservation> vSwitchCidrReservations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<VSwitchCidrReservation> getVSwitchCidrReservations() {
		return this.vSwitchCidrReservations;
	}

	public void setVSwitchCidrReservations(List<VSwitchCidrReservation> vSwitchCidrReservations) {
		this.vSwitchCidrReservations = vSwitchCidrReservations;
	}

	public static class VSwitchCidrReservation {

		private String vpcId;

		private String vSwitchId;

		private String vSwitchCidrReservationId;

		private String vSwitchCidrReservationCidr;

		private String vSwitchCidrReservationName;

		private String vSwitchCidrReservationDescription;

		private String ipVersion;

		private String creationTime;

		private String type;

		private Integer availableCidrCount;

		private Integer assignedCidrCount;

		private String status;

		private List<Tag> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVSwitchCidrReservationId() {
			return this.vSwitchCidrReservationId;
		}

		public void setVSwitchCidrReservationId(String vSwitchCidrReservationId) {
			this.vSwitchCidrReservationId = vSwitchCidrReservationId;
		}

		public String getVSwitchCidrReservationCidr() {
			return this.vSwitchCidrReservationCidr;
		}

		public void setVSwitchCidrReservationCidr(String vSwitchCidrReservationCidr) {
			this.vSwitchCidrReservationCidr = vSwitchCidrReservationCidr;
		}

		public String getVSwitchCidrReservationName() {
			return this.vSwitchCidrReservationName;
		}

		public void setVSwitchCidrReservationName(String vSwitchCidrReservationName) {
			this.vSwitchCidrReservationName = vSwitchCidrReservationName;
		}

		public String getVSwitchCidrReservationDescription() {
			return this.vSwitchCidrReservationDescription;
		}

		public void setVSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
			this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getAvailableCidrCount() {
			return this.availableCidrCount;
		}

		public void setAvailableCidrCount(Integer availableCidrCount) {
			this.availableCidrCount = availableCidrCount;
		}

		public Integer getAssignedCidrCount() {
			return this.assignedCidrCount;
		}

		public void setAssignedCidrCount(Integer assignedCidrCount) {
			this.assignedCidrCount = assignedCidrCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListVSwitchCidrReservationsResponse getInstance(UnmarshallerContext context) {
		return	ListVSwitchCidrReservationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
