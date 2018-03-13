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
package com.aliyuncs.yundun.model.v20150227;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150227.TodayqpsByRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TodayqpsByRegionResponse extends AcsResponse {

	private String requestId;

	private List<Region> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Region> getData() {
		return this.data;
	}

	public void setData(List<Region> data) {
		this.data = data;
	}

	public static class Region {

		private String regionId;

		private Long regionNumber;

		private Long regionFlow;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getRegionNumber() {
			return this.regionNumber;
		}

		public void setRegionNumber(Long regionNumber) {
			this.regionNumber = regionNumber;
		}

		public Long getRegionFlow() {
			return this.regionFlow;
		}

		public void setRegionFlow(Long regionFlow) {
			this.regionFlow = regionFlow;
		}
	}

	@Override
	public TodayqpsByRegionResponse getInstance(UnmarshallerContext context) {
		return	TodayqpsByRegionResponseUnmarshaller.unmarshall(this, context);
	}
}
