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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDDosEventMaxResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDDosEventMaxResponse extends AcsResponse {

	private String requestId;

	private Long mbps;

	private Long qps;

	private Long cps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getMbps() {
		return this.mbps;
	}

	public void setMbps(Long mbps) {
		this.mbps = mbps;
	}

	public Long getQps() {
		return this.qps;
	}

	public void setQps(Long qps) {
		this.qps = qps;
	}

	public Long getCps() {
		return this.cps;
	}

	public void setCps(Long cps) {
		this.cps = cps;
	}

	@Override
	public DescribeDDosEventMaxResponse getInstance(UnmarshallerContext context) {
		return	DescribeDDosEventMaxResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
