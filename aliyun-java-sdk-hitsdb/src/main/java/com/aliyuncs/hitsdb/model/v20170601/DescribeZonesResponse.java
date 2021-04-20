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

package com.aliyuncs.hitsdb.model.v20170601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20170601.DescribeZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeZonesResponse extends AcsResponse {

	private String requestId;

	private List<ZoneModel> zoneList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ZoneModel> getZoneList() {
		return this.zoneList;
	}

	public void setZoneList(List<ZoneModel> zoneList) {
		this.zoneList = zoneList;
	}

	public static class ZoneModel {

		private String zoneId;

		private String localName;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}
	}

	@Override
	public DescribeZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeZonesResponseUnmarshaller.unmarshall(this, context);
	}
}
