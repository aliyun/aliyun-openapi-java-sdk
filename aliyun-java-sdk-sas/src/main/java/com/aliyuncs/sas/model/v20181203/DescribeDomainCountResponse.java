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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeDomainCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainCountResponse extends AcsResponse {

	private String requestId;

	private Integer totalDomainsCount;

	private Integer rootDomainsCount;

	private Integer subDomainsCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalDomainsCount() {
		return this.totalDomainsCount;
	}

	public void setTotalDomainsCount(Integer totalDomainsCount) {
		this.totalDomainsCount = totalDomainsCount;
	}

	public Integer getRootDomainsCount() {
		return this.rootDomainsCount;
	}

	public void setRootDomainsCount(Integer rootDomainsCount) {
		this.rootDomainsCount = rootDomainsCount;
	}

	public Integer getSubDomainsCount() {
		return this.subDomainsCount;
	}

	public void setSubDomainsCount(Integer subDomainsCount) {
		this.subDomainsCount = subDomainsCount;
	}

	@Override
	public DescribeDomainCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
