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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse extends AcsResponse {

	private String datapoints;

	private String requestId;

	private String nextToken;

	private String period;

	public String getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(String datapoints) {
		this.datapoints = datapoints;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@Override
	public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseUnmarshaller.unmarshall(this, context);
	}
}
