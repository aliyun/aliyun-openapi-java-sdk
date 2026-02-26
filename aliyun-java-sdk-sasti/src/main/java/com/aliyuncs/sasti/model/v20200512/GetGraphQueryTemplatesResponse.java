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

package com.aliyuncs.sasti.model.v20200512;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sasti.transform.v20200512.GetGraphQueryTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGraphQueryTemplatesResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String scenario;

		private String gremlinTemplate;

		private String lastModifier;

		private Integer status;

		private String scenarioDesc;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public String getGremlinTemplate() {
			return this.gremlinTemplate;
		}

		public void setGremlinTemplate(String gremlinTemplate) {
			this.gremlinTemplate = gremlinTemplate;
		}

		public String getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(String lastModifier) {
			this.lastModifier = lastModifier;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getScenarioDesc() {
			return this.scenarioDesc;
		}

		public void setScenarioDesc(String scenarioDesc) {
			this.scenarioDesc = scenarioDesc;
		}
	}

	@Override
	public GetGraphQueryTemplatesResponse getInstance(UnmarshallerContext context) {
		return	GetGraphQueryTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
