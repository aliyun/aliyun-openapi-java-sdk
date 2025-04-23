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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.ListPropertyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPropertyResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Data> properties;

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

	public List<Data> getProperties() {
		return this.properties;
	}

	public void setProperties(List<Data> properties) {
		this.properties = properties;
	}

	public static class Data {

		private Long propertyId;

		private String propertyKey;

		private List<PropertyValuesItem> propertyValues;

		public Long getPropertyId() {
			return this.propertyId;
		}

		public void setPropertyId(Long propertyId) {
			this.propertyId = propertyId;
		}

		public String getPropertyKey() {
			return this.propertyKey;
		}

		public void setPropertyKey(String propertyKey) {
			this.propertyKey = propertyKey;
		}

		public List<PropertyValuesItem> getPropertyValues() {
			return this.propertyValues;
		}

		public void setPropertyValues(List<PropertyValuesItem> propertyValues) {
			this.propertyValues = propertyValues;
		}

		public static class PropertyValuesItem {

			private Long propertyValueId;

			private String propertyValue;

			public Long getPropertyValueId() {
				return this.propertyValueId;
			}

			public void setPropertyValueId(Long propertyValueId) {
				this.propertyValueId = propertyValueId;
			}

			public String getPropertyValue() {
				return this.propertyValue;
			}

			public void setPropertyValue(String propertyValue) {
				this.propertyValue = propertyValue;
			}
		}
	}

	@Override
	public ListPropertyResponse getInstance(UnmarshallerContext context) {
		return	ListPropertyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
