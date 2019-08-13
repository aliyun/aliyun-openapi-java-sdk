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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.GetLogHistogramResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLogHistogramResponse extends AcsResponse {

	private String requestId;

	private Boolean completed;

	private Long totalCount;

	private List<SlsLogHistogram> slsLogHistogramList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SlsLogHistogram> getSlsLogHistogramList() {
		return this.slsLogHistogramList;
	}

	public void setSlsLogHistogramList(List<SlsLogHistogram> slsLogHistogramList) {
		this.slsLogHistogramList = slsLogHistogramList;
	}

	public static class SlsLogHistogram {

		private Integer fromTime;

		private Integer toTime;

		private Long count;

		private Boolean completed;

		public Integer getFromTime() {
			return this.fromTime;
		}

		public void setFromTime(Integer fromTime) {
			this.fromTime = fromTime;
		}

		public Integer getToTime() {
			return this.toTime;
		}

		public void setToTime(Integer toTime) {
			this.toTime = toTime;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Boolean getCompleted() {
			return this.completed;
		}

		public void setCompleted(Boolean completed) {
			this.completed = completed;
		}
	}

	@Override
	public GetLogHistogramResponse getInstance(UnmarshallerContext context) {
		return	GetLogHistogramResponseUnmarshaller.unmarshall(this, context);
	}
}
