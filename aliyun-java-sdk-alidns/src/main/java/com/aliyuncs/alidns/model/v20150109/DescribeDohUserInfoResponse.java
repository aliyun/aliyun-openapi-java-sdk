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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDohUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDohUserInfoResponse extends AcsResponse {

	private String requestId;

	private Integer subDomainCount;

	private Long pdnsId;

	private Integer domainCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getSubDomainCount() {
		return this.subDomainCount;
	}

	public void setSubDomainCount(Integer subDomainCount) {
		this.subDomainCount = subDomainCount;
	}

	public Long getPdnsId() {
		return this.pdnsId;
	}

	public void setPdnsId(Long pdnsId) {
		this.pdnsId = pdnsId;
	}

	public Integer getDomainCount() {
		return this.domainCount;
	}

	public void setDomainCount(Integer domainCount) {
		this.domainCount = domainCount;
	}

	@Override
	public DescribeDohUserInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDohUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
