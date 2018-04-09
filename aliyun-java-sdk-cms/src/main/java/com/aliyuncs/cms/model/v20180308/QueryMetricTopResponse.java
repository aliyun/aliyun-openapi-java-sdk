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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.QueryMetricTopResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricTopResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String datapoints;

	private String period;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(String datapoints) {
		this.datapoints = datapoints;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@Override
	public QueryMetricTopResponse getInstance(UnmarshallerContext context) {
		return	QueryMetricTopResponseUnmarshaller.unmarshall(this, context);
	}
}
