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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeCdnUserBillPredictionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnUserBillPredictionResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private String billType;

	private List<BillPredictionDataItem> billPredictionData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getBillType() {
		return this.billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public List<BillPredictionDataItem> getBillPredictionData() {
		return this.billPredictionData;
	}

	public void setBillPredictionData(List<BillPredictionDataItem> billPredictionData) {
		this.billPredictionData = billPredictionData;
	}

	public static class BillPredictionDataItem {

		private Float value;

		private String area;

		private String timeStp;

		public Float getValue() {
			return this.value;
		}

		public void setValue(Float value) {
			this.value = value;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getTimeStp() {
			return this.timeStp;
		}

		public void setTimeStp(String timeStp) {
			this.timeStp = timeStp;
		}
	}

	@Override
	public DescribeCdnUserBillPredictionResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnUserBillPredictionResponseUnmarshaller.unmarshall(this, context);
	}
}
