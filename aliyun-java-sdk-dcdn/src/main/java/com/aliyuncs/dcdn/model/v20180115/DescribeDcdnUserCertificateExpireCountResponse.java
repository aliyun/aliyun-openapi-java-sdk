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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnUserCertificateExpireCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnUserCertificateExpireCountResponse extends AcsResponse {

	private Integer expireWithin30DaysCount;

	private String requestId;

	private Integer expiredCount;

	public Integer getExpireWithin30DaysCount() {
		return this.expireWithin30DaysCount;
	}

	public void setExpireWithin30DaysCount(Integer expireWithin30DaysCount) {
		this.expireWithin30DaysCount = expireWithin30DaysCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getExpiredCount() {
		return this.expiredCount;
	}

	public void setExpiredCount(Integer expiredCount) {
		this.expiredCount = expiredCount;
	}

	@Override
	public DescribeDcdnUserCertificateExpireCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnUserCertificateExpireCountResponseUnmarshaller.unmarshall(this, context);
	}
}
