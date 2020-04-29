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
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnCcTopIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnCcTopIpResponse extends AcsResponse {

	private String requestId;

	private String total;

	private String domainName;

	private List<AttackIpDatas> attackIpDataList;

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

	public List<AttackIpDatas> getAttackIpDataList() {
		return this.attackIpDataList;
	}

	public void setAttackIpDataList(List<AttackIpDatas> attackIpDataList) {
		this.attackIpDataList = attackIpDataList;
	}

	public static class AttackIpDatas {

		private String ip;

		private String attackCount;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getAttackCount() {
			return this.attackCount;
		}

		public void setAttackCount(String attackCount) {
			this.attackCount = attackCount;
		}
	}

	@Override
	public DescribeScdnCcTopIpResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnCcTopIpResponseUnmarshaller.unmarshall(this, context);
	}
}
