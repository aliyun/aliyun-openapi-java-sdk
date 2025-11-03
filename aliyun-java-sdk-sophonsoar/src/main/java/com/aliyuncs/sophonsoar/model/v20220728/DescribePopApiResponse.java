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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribePopApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePopApiResponse extends AcsResponse {

	private String requestId;

	private String popCode;

	private String version;

	private String apiName;

	private Map<Object,Object> apiMeta;

	private List<OpenApiMetaListItem> openApiMetaList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPopCode() {
		return this.popCode;
	}

	public void setPopCode(String popCode) {
		this.popCode = popCode;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public Map<Object,Object> getApiMeta() {
		return this.apiMeta;
	}

	public void setApiMeta(Map<Object,Object> apiMeta) {
		this.apiMeta = apiMeta;
	}

	public List<OpenApiMetaListItem> getOpenApiMetaList() {
		return this.openApiMetaList;
	}

	public void setOpenApiMetaList(List<OpenApiMetaListItem> openApiMetaList) {
		this.openApiMetaList = openApiMetaList;
	}

	public static class OpenApiMetaListItem {

		private String name;

		private Boolean required;

		private String exampleValue;

		private String description;

		private String in;

		private String visibility;

		private String type;

		private Boolean isRequired;

		private String style;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public String getExampleValue() {
			return this.exampleValue;
		}

		public void setExampleValue(String exampleValue) {
			this.exampleValue = exampleValue;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIn() {
			return this.in;
		}

		public void setIn(String in) {
			this.in = in;
		}

		public String getVisibility() {
			return this.visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getIsRequired() {
			return this.isRequired;
		}

		public void setIsRequired(Boolean isRequired) {
			this.isRequired = isRequired;
		}

		public String getStyle() {
			return this.style;
		}

		public void setStyle(String style) {
			this.style = style;
		}
	}

	@Override
	public DescribePopApiResponse getInstance(UnmarshallerContext context) {
		return	DescribePopApiResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
