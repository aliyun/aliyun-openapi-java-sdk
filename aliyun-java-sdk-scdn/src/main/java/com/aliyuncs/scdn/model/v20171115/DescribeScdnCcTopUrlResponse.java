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

package com.aliyuncs.scdn.model.v20171115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnCcTopUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnCcTopUrlResponse extends AcsResponse {

	private String requestId;

	private String total;

	private String domainName;

	private List<AttackUrlDatas> attackUrlDataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public List<AttackUrlDatas> getAttackUrlDataList() {
		return this.attackUrlDataList;
	}

	public void setAttackUrlDataList(List<AttackUrlDatas> attackUrlDataList) {
		this.attackUrlDataList = attackUrlDataList;
	}

	public static class AttackUrlDatas {

		private String url;

		private String attackCount;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getAttackCount() {
			return this.attackCount;
		}

		public void setAttackCount(String attackCount) {
			this.attackCount = attackCount;
		}
	}

	@Override
	public DescribeScdnCcTopUrlResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnCcTopUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
