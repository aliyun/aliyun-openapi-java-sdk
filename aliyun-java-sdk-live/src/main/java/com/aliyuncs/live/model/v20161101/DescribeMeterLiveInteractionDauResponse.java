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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeMeterLiveInteractionDauResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMeterLiveInteractionDauResponse extends AcsResponse {

	private Double peakDau;

	private String requestId;

	private List<DataItem> data;

	public Double getPeakDau() {
		return this.peakDau;
	}

	public void setPeakDau(Double peakDau) {
		this.peakDau = peakDau;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Double dau;

		private Long timestamp;

		public Double getDau() {
			return this.dau;
		}

		public void setDau(Double dau) {
			this.dau = dau;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public DescribeMeterLiveInteractionDauResponse getInstance(UnmarshallerContext context) {
		return	DescribeMeterLiveInteractionDauResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
