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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListSpareIpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSpareIpsResponse extends AcsResponse {

	private String requestId;

	private List<SpareIpsItem> spareIps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SpareIpsItem> getSpareIps() {
		return this.spareIps;
	}

	public void setSpareIps(List<SpareIpsItem> spareIps) {
		this.spareIps = spareIps;
	}

	public static class SpareIpsItem {

		private String spareIp;

		private String state;

		public String getSpareIp() {
			return this.spareIp;
		}

		public void setSpareIp(String spareIp) {
			this.spareIp = spareIp;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public ListSpareIpsResponse getInstance(UnmarshallerContext context) {
		return	ListSpareIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
