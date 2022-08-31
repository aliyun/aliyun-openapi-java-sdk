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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainHttpCodeDataByLayerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainHttpCodeDataByLayerResponse extends AcsResponse {

	private String dataInterval;

	private String requestId;

	private List<DataModule> httpCodeDataInterval;

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getHttpCodeDataInterval() {
		return this.httpCodeDataInterval;
	}

	public void setHttpCodeDataInterval(List<DataModule> httpCodeDataInterval) {
		this.httpCodeDataInterval = httpCodeDataInterval;
	}

	public static class DataModule {

		private String value;

		private String timeStamp;

		private String totalValue;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getTotalValue() {
			return this.totalValue;
		}

		public void setTotalValue(String totalValue) {
			this.totalValue = totalValue;
		}
	}

	@Override
	public DescribeDcdnDomainHttpCodeDataByLayerResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainHttpCodeDataByLayerResponseUnmarshaller.unmarshall(this, context);
	}
}
