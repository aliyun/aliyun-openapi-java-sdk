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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeDatabaseInstanceMetricDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseInstanceMetricDataResponse extends AcsResponse {

	private String requestId;

	private String metricName;

	private String unit;

	private String dataFormat;

	private String metricData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}

	public String getMetricData() {
		return this.metricData;
	}

	public void setMetricData(String metricData) {
		this.metricData = metricData;
	}

	@Override
	public DescribeDatabaseInstanceMetricDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabaseInstanceMetricDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
