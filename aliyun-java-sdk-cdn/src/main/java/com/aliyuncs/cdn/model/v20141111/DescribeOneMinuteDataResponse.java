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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeOneMinuteDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOneMinuteDataResponse extends AcsResponse {

	private String requestId;

	private String bps;

	private String qps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBps() {
		return this.bps;
	}

	public void setBps(String bps) {
		this.bps = bps;
	}

	public String getQps() {
		return this.qps;
	}

	public void setQps(String qps) {
		this.qps = qps;
	}

	@Override
	public DescribeOneMinuteDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeOneMinuteDataResponseUnmarshaller.unmarshall(this, context);
	}
}
