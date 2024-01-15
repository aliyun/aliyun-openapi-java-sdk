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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.QueryDetailItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDetailItemResponse extends AcsResponse {

	private Module module;

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private String detailDescription;

		private String detailObjectJson;

		private String detailPagePicUrl;

		private String label;

		private String mainPicUrl;

		private String title;

		private String type;

		private List<Attribute> attributes;

		private List<String> detailPicUrl;

		public String getDetailDescription() {
			return this.detailDescription;
		}

		public void setDetailDescription(String detailDescription) {
			this.detailDescription = detailDescription;
		}

		public String getDetailObjectJson() {
			return this.detailObjectJson;
		}

		public void setDetailObjectJson(String detailObjectJson) {
			this.detailObjectJson = detailObjectJson;
		}

		public String getDetailPagePicUrl() {
			return this.detailPagePicUrl;
		}

		public void setDetailPagePicUrl(String detailPagePicUrl) {
			this.detailPagePicUrl = detailPagePicUrl;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getMainPicUrl() {
			return this.mainPicUrl;
		}

		public void setMainPicUrl(String mainPicUrl) {
			this.mainPicUrl = mainPicUrl;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<Attribute> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<Attribute> attributes) {
			this.attributes = attributes;
		}

		public List<String> getDetailPicUrl() {
			return this.detailPicUrl;
		}

		public void setDetailPicUrl(List<String> detailPicUrl) {
			this.detailPicUrl = detailPicUrl;
		}

		public static class Attribute {

			private String name;

			private String title;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public QueryDetailItemResponse getInstance(UnmarshallerContext context) {
		return	QueryDetailItemResponseUnmarshaller.unmarshall(this, context);
	}
}
