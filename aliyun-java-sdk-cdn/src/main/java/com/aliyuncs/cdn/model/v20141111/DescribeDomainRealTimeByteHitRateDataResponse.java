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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainRealTimeByteHitRateDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainRealTimeByteHitRateDataResponse extends AcsResponse {

	private String requestId;

	private List<ByteHitRateDataModel> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ByteHitRateDataModel> getData() {
		return this.data;
	}

	public void setData(List<ByteHitRateDataModel> data) {
		this.data = data;
	}

	public static class ByteHitRateDataModel {

		private Float byteHitRate;

		private String timeStamp;

		public Float getByteHitRate() {
			return this.byteHitRate;
		}

		public void setByteHitRate(Float byteHitRate) {
			this.byteHitRate = byteHitRate;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeDomainRealTimeByteHitRateDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainRealTimeByteHitRateDataResponseUnmarshaller.unmarshall(this, context);
	}
}
