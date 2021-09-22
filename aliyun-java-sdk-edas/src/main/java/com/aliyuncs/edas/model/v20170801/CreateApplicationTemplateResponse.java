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

package com.aliyuncs.edas.model.v20170801;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.CreateApplicationTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationTemplateResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

		private String showName;

		private String description;

		private String name;

		private Long id;

		private Map<Object,Object> attributes;

		private SourceConfig sourceConfig;

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Map<Object,Object> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(Map<Object,Object> attributes) {
			this.attributes = attributes;
		}

		public SourceConfig getSourceConfig() {
			return this.sourceConfig;
		}

		public void setSourceConfig(SourceConfig sourceConfig) {
			this.sourceConfig = sourceConfig;
		}

		public static class SourceConfig {

			private String sourceUrl;

			public String getSourceUrl() {
				return this.sourceUrl;
			}

			public void setSourceUrl(String sourceUrl) {
				this.sourceUrl = sourceUrl;
			}
		}
	}

	@Override
	public CreateApplicationTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreateApplicationTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
