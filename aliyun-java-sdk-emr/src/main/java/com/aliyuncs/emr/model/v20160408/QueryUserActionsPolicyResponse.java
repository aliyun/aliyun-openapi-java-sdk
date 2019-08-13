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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QueryUserActionsPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserActionsPolicyResponse extends AcsResponse {

	private Boolean paging;

	private String requestId;

	private List<PolicyDTO> data;

	public Boolean getPaging() {
		return this.paging;
	}

	public void setPaging(Boolean paging) {
		this.paging = paging;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PolicyDTO> getData() {
		return this.data;
	}

	public void setData(List<PolicyDTO> data) {
		this.data = data;
	}

	public static class PolicyDTO {

		private String name;

		private String gmtCreate;

		private String effect;

		private String action;

		private String conditions;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getEffect() {
			return this.effect;
		}

		public void setEffect(String effect) {
			this.effect = effect;
		}

		public String getBizAction() {
			return this.action;
		}

		public void setBizAction(String action) {
			this.action = action;
		}

		/**
		 * @deprecated use getBizAction instead of this.
		 */
		@Deprecated
		public String getAction() {
			return this.action;
		}

		/**
		 * @deprecated use setBizAction instead of this.
		 */
		@Deprecated
		public void setAction(String action) {
			this.action = action;
		}

		public String getConditions() {
			return this.conditions;
		}

		public void setConditions(String conditions) {
			this.conditions = conditions;
		}
	}

	@Override
	public QueryUserActionsPolicyResponse getInstance(UnmarshallerContext context) {
		return	QueryUserActionsPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
