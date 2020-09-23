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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTemplatesResponse extends AcsResponse {

	private List<TemplatesItem> templates;

	private Page_info page_info;

	public List<TemplatesItem> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<TemplatesItem> templates) {
		this.templates = templates;
	}

	public Page_info getPage_info() {
		return this.page_info;
	}

	public void setPage_info(Page_info page_info) {
		this.page_info = page_info;
	}

	public static class TemplatesItem {

		private String template;

		private String created;

		private String name;

		private String description;

		private String template_type;

		private String id;

		private String acl;

		private String updated;

		private String tags;

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTemplate_type() {
			return this.template_type;
		}

		public void setTemplate_type(String template_type) {
			this.template_type = template_type;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAcl() {
			return this.acl;
		}

		public void setAcl(String acl) {
			this.acl = acl;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}
	}

	public static class Page_info {

		private Long page_number;

		private Long total_count;

		private Long page_size;

		public Long getPage_number() {
			return this.page_number;
		}

		public void setPage_number(Long page_number) {
			this.page_number = page_number;
		}

		public Long getTotal_count() {
			return this.total_count;
		}

		public void setTotal_count(Long total_count) {
			this.total_count = total_count;
		}

		public Long getPage_size() {
			return this.page_size;
		}

		public void setPage_size(Long page_size) {
			this.page_size = page_size;
		}
	}

	@Override
	public DescribeTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
