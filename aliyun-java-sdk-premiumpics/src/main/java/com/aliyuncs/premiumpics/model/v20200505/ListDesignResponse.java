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

package com.aliyuncs.premiumpics.model.v20200505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.premiumpics.transform.v20200505.ListDesignResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDesignResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String version;

	private Integer end;

	private Integer pageNumber;

	private String designVersion;

	private List<Designs> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getEnd() {
		return this.end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDesignVersion() {
		return this.designVersion;
	}

	public void setDesignVersion(String designVersion) {
		this.designVersion = designVersion;
	}

	public List<Designs> getData() {
		return this.data;
	}

	public void setData(List<Designs> data) {
		this.data = data;
	}

	public static class Designs {

		private String goodsId;

		private List<TemplatesItem> templates;

		public String getGoodsId() {
			return this.goodsId;
		}

		public void setGoodsId(String goodsId) {
			this.goodsId = goodsId;
		}

		public List<TemplatesItem> getTemplates() {
			return this.templates;
		}

		public void setTemplates(List<TemplatesItem> templates) {
			this.templates = templates;
		}

		public static class TemplatesItem {

			private String templateId;

			private String previewUrl;

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getPreviewUrl() {
				return this.previewUrl;
			}

			public void setPreviewUrl(String previewUrl) {
				this.previewUrl = previewUrl;
			}
		}
	}

	@Override
	public ListDesignResponse getInstance(UnmarshallerContext context) {
		return	ListDesignResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
