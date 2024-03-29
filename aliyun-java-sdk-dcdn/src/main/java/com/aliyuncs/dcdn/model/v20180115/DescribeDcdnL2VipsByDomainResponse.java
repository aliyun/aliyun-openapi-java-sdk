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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnL2VipsByDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnL2VipsByDomainResponse extends AcsResponse {

	private String domainName;

	private String requestId;

	private List<String> vips;

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getVips() {
		return this.vips;
	}

	public void setVips(List<String> vips) {
		this.vips = vips;
	}

	@Override
	public DescribeDcdnL2VipsByDomainResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnL2VipsByDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
