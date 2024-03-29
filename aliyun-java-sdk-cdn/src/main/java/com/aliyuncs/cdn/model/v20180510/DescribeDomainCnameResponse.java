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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeDomainCnameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainCnameResponse extends AcsResponse {

	private String requestId;

	private List<Data> cnameDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getCnameDatas() {
		return this.cnameDatas;
	}

	public void setCnameDatas(List<Data> cnameDatas) {
		this.cnameDatas = cnameDatas;
	}

	public static class Data {

		private Integer status;

		private String domain;

		private String cname;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}
	}

	@Override
	public DescribeDomainCnameResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainCnameResponseUnmarshaller.unmarshall(this, context);
	}
}
