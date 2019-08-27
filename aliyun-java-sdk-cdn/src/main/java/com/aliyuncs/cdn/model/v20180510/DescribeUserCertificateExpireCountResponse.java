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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeUserCertificateExpireCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserCertificateExpireCountResponse extends AcsResponse {

	private String requestId;

	private Integer expireWithin30DaysCount;

	private Integer expiredCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getExpireWithin30DaysCount() {
		return this.expireWithin30DaysCount;
	}

	public void setExpireWithin30DaysCount(Integer expireWithin30DaysCount) {
		this.expireWithin30DaysCount = expireWithin30DaysCount;
	}

	public Integer getExpiredCount() {
		return this.expiredCount;
	}

	public void setExpiredCount(Integer expiredCount) {
		this.expiredCount = expiredCount;
	}

	@Override
	public DescribeUserCertificateExpireCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserCertificateExpireCountResponseUnmarshaller.unmarshall(this, context);
	}
}
