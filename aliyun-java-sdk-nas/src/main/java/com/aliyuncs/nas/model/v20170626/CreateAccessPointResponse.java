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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.CreateAccessPointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAccessPointResponse extends AcsResponse {

	private String requestId;

	private AccessPoint accessPoint;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccessPoint getAccessPoint() {
		return this.accessPoint;
	}

	public void setAccessPoint(AccessPoint accessPoint) {
		this.accessPoint = accessPoint;
	}

	public static class AccessPoint {

		private String accessPointDomain;

		private String accessPointId;

		public String getAccessPointDomain() {
			return this.accessPointDomain;
		}

		public void setAccessPointDomain(String accessPointDomain) {
			this.accessPointDomain = accessPointDomain;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}
	}

	@Override
	public CreateAccessPointResponse getInstance(UnmarshallerContext context) {
		return	CreateAccessPointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
