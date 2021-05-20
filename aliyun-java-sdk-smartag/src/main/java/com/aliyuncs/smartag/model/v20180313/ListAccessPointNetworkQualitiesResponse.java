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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.ListAccessPointNetworkQualitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccessPointNetworkQualitiesResponse extends AcsResponse {

	private String requestId;

	private List<AccessPointNetworkQuality> accessPointNetworkQualities;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AccessPointNetworkQuality> getAccessPointNetworkQualities() {
		return this.accessPointNetworkQualities;
	}

	public void setAccessPointNetworkQualities(List<AccessPointNetworkQuality> accessPointNetworkQualities) {
		this.accessPointNetworkQualities = accessPointNetworkQualities;
	}

	public static class AccessPointNetworkQuality {

		private String rtt;

		private String loss;

		private Integer id;

		public String getRtt() {
			return this.rtt;
		}

		public void setRtt(String rtt) {
			this.rtt = rtt;
		}

		public String getLoss() {
			return this.loss;
		}

		public void setLoss(String loss) {
			this.loss = loss;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	}

	@Override
	public ListAccessPointNetworkQualitiesResponse getInstance(UnmarshallerContext context) {
		return	ListAccessPointNetworkQualitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
