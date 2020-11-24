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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDDosEventAreaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDDosEventAreaResponse extends AcsResponse {

	private String requestId;

	private List<EventArea> areas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventArea> getAreas() {
		return this.areas;
	}

	public void setAreas(List<EventArea> areas) {
		this.areas = areas;
	}

	public static class EventArea {

		private String area;

		private Long inPkts;

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public Long getInPkts() {
			return this.inPkts;
		}

		public void setInPkts(Long inPkts) {
			this.inPkts = inPkts;
		}
	}

	@Override
	public DescribeDDosEventAreaResponse getInstance(UnmarshallerContext context) {
		return	DescribeDDosEventAreaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
