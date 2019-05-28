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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeCollationTimeZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCollationTimeZonesResponse extends AcsResponse {

	private String requestId;

	private List<CollationTimeZone> collationTimeZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CollationTimeZone> getCollationTimeZones() {
		return this.collationTimeZones;
	}

	public void setCollationTimeZones(List<CollationTimeZone> collationTimeZones) {
		this.collationTimeZones = collationTimeZones;
	}

	public static class CollationTimeZone {

		private String timeZone;

		private String standardTimeOffset;

		private String description;

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getStandardTimeOffset() {
			return this.standardTimeOffset;
		}

		public void setStandardTimeOffset(String standardTimeOffset) {
			this.standardTimeOffset = standardTimeOffset;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeCollationTimeZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCollationTimeZonesResponseUnmarshaller.unmarshall(this, context);
	}
}
