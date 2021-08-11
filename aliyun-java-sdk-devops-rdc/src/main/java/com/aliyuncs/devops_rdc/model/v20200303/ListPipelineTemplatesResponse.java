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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.ListPipelineTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPipelineTemplatesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float total;

		private List<模板列表> dataList;

		public Float getTotal() {
			return this.total;
		}

		public void setTotal(Float total) {
			this.total = total;
		}

		public List<模板列表> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<模板列表> dataList) {
			this.dataList = dataList;
		}

		public static class 模板列表 {

			private String templateName;

			private Long id;

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public ListPipelineTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListPipelineTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
