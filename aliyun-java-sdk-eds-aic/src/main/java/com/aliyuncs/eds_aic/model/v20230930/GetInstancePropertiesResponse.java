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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.GetInstancePropertiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstancePropertiesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private PropertyTemplateModel propertyTemplateModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public PropertyTemplateModel getPropertyTemplateModel() {
		return this.propertyTemplateModel;
	}

	public void setPropertyTemplateModel(PropertyTemplateModel propertyTemplateModel) {
		this.propertyTemplateModel = propertyTemplateModel;
	}

	public static class PropertyTemplateModel {

		private String content;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public GetInstancePropertiesResponse getInstance(UnmarshallerContext context) {
		return	GetInstancePropertiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
