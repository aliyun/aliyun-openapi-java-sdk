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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsEccQueryNcTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsEccQueryNcTemplatesResponse extends AcsResponse {

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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<TemplateInfo> templateInfos;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<TemplateInfo> getTemplateInfos() {
			return this.templateInfos;
		}

		public void setTemplateInfos(List<TemplateInfo> templateInfos) {
			this.templateInfos = templateInfos;
		}

		public static class TemplateInfo {

			private String templateDesc;

			private Long gmtCreate;

			private Long gmtModified;

			private String templateName;

			private String adjustStandModels;

			public String getTemplateDesc() {
				return this.templateDesc;
			}

			public void setTemplateDesc(String templateDesc) {
				this.templateDesc = templateDesc;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getAdjustStandModels() {
				return this.adjustStandModels;
			}

			public void setAdjustStandModels(String adjustStandModels) {
				this.adjustStandModels = adjustStandModels;
			}
		}
	}

	@Override
	public OpsEccQueryNcTemplatesResponse getInstance(UnmarshallerContext context) {
		return	OpsEccQueryNcTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
