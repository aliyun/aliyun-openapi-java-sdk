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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.QueryUserSourceSummariesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserSourceSummariesResponse extends AcsResponse {

	private String requestId;

	private List<UserSourceSummary> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserSourceSummary> getData() {
		return this.data;
	}

	public void setData(List<UserSourceSummary> data) {
		this.data = data;
	}

	public static class UserSourceSummary {

		private String source;

		private Long count;

		private Float rate;

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Float getRate() {
			return this.rate;
		}

		public void setRate(Float rate) {
			this.rate = rate;
		}
	}

	@Override
	public QueryUserSourceSummariesResponse getInstance(UnmarshallerContext context) {
		return	QueryUserSourceSummariesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
