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

package com.aliyuncs.cassandra.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cassandra.transform.v20190101.DescribeContactPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContactPointsResponse extends AcsResponse {

	private String requestId;

	private List<ContactPoint> contactPoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ContactPoint> getContactPoints() {
		return this.contactPoints;
	}

	public void setContactPoints(List<ContactPoint> contactPoints) {
		this.contactPoints = contactPoints;
	}

	public static class ContactPoint {

		private String dataCenterId;

		private Integer port;

		private List<String> privateAddresses;

		private List<String> publicAddresses;

		public String getDataCenterId() {
			return this.dataCenterId;
		}

		public void setDataCenterId(String dataCenterId) {
			this.dataCenterId = dataCenterId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public List<String> getPrivateAddresses() {
			return this.privateAddresses;
		}

		public void setPrivateAddresses(List<String> privateAddresses) {
			this.privateAddresses = privateAddresses;
		}

		public List<String> getPublicAddresses() {
			return this.publicAddresses;
		}

		public void setPublicAddresses(List<String> publicAddresses) {
			this.publicAddresses = publicAddresses;
		}
	}

	@Override
	public DescribeContactPointsResponse getInstance(UnmarshallerContext context) {
		return	DescribeContactPointsResponseUnmarshaller.unmarshall(this, context);
	}
}
