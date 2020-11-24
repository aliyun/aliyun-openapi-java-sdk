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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDDosEventIspResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDDosEventIspResponse extends AcsResponse {

	private String requestId;

	private List<EventIsp> isps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventIsp> getIsps() {
		return this.isps;
	}

	public void setIsps(List<EventIsp> isps) {
		this.isps = isps;
	}

	public static class EventIsp {

		private String isp;

		private Long inPkts;

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public Long getInPkts() {
			return this.inPkts;
		}

		public void setInPkts(Long inPkts) {
			this.inPkts = inPkts;
		}
	}

	@Override
	public DescribeDDosEventIspResponse getInstance(UnmarshallerContext context) {
		return	DescribeDDosEventIspResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
