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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListRamRolesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRamRolesResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String name;

		private String service;

		private String template_id;

		private Boolean assumed;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getTemplate_id() {
			return this.template_id;
		}

		public void setTemplate_id(String template_id) {
			this.template_id = template_id;
		}

		public Boolean getAssumed() {
			return this.assumed;
		}

		public void setAssumed(Boolean assumed) {
			this.assumed = assumed;
		}
	}

	@Override
	public ListRamRolesResponse getInstance(UnmarshallerContext context) {
		return	ListRamRolesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
