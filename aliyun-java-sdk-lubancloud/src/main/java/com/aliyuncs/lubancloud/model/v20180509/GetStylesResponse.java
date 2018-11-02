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

package com.aliyuncs.lubancloud.model.v20180509;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lubancloud.transform.v20180509.GetStylesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStylesResponse extends AcsResponse {

	private String requestId;

	private List<Style> styles;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Style> getStyles() {
		return this.styles;
	}

	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}

	public static class Style {

		private Long id;

		private String name;

		private Long parentId;

		private String previewUrl;

		private List<SubStyle> subStyles;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public String getPreviewUrl() {
			return this.previewUrl;
		}

		public void setPreviewUrl(String previewUrl) {
			this.previewUrl = previewUrl;
		}

		public List<SubStyle> getSubStyles() {
			return this.subStyles;
		}

		public void setSubStyles(List<SubStyle> subStyles) {
			this.subStyles = subStyles;
		}

		public static class SubStyle {

			private Long id;

			private String name;

			private Long parentId;

			private String previewUrl;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
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
	public GetStylesResponse getInstance(UnmarshallerContext context) {
		return	GetStylesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
