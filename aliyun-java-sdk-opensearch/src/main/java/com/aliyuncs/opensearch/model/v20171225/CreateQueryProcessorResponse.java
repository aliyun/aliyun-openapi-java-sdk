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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.CreateQueryProcessorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateQueryProcessorResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer created;

		private Boolean active;

		private Integer updated;

		private String name;

		private String domain;

		private List<String> indexes;

		private List<Map<Object,Object>> processors;

		public Integer getCreated() {
			return this.created;
		}

		public void setCreated(Integer created) {
			this.created = created;
		}

		public Boolean getActive() {
			return this.active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public Integer getUpdated() {
			return this.updated;
		}

		public void setUpdated(Integer updated) {
			this.updated = updated;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public List<String> getIndexes() {
			return this.indexes;
		}

		public void setIndexes(List<String> indexes) {
			this.indexes = indexes;
		}

		public List<Map<Object,Object>> getProcessors() {
			return this.processors;
		}

		public void setProcessors(List<Map<Object,Object>> processors) {
			this.processors = processors;
		}
	}

	@Override
	public CreateQueryProcessorResponse getInstance(UnmarshallerContext context) {
		return	CreateQueryProcessorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
