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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetInstanceCountTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceCountTrendResponse extends AcsResponse {

	private String requestId;

	private List<IntanceCounts> instanceCounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IntanceCounts> getInstanceCounts() {
		return this.instanceCounts;
	}

	public void setInstanceCounts(List<IntanceCounts> instanceCounts) {
		this.instanceCounts = instanceCounts;
	}

	public static class IntanceCounts {

		private Long date;

		private Integer count;

		public Long getDate() {
			return this.date;
		}

		public void setDate(Long date) {
			this.date = date;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public GetInstanceCountTrendResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceCountTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
