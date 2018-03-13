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
package com.aliyuncs.yundun.model.v20150416;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150416.DeleteCNameWafResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteCNameWafResponse extends AcsResponse {

	private String requestId;

	private List<WafInfo> wafInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WafInfo> getWafInfoList() {
		return this.wafInfoList;
	}

	public void setWafInfoList(List<WafInfo> wafInfoList) {
		this.wafInfoList = wafInfoList;
	}

	public static class WafInfo {

		private Integer id;

		private String domain;

		private String cname;

		private Integer status;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
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

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DeleteCNameWafResponse getInstance(UnmarshallerContext context) {
		return	DeleteCNameWafResponseUnmarshaller.unmarshall(this, context);
	}
}
