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
import com.aliyuncs.eds_user.transform.v20210308.ListPropertyValueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPropertyValueResponse extends AcsResponse {

	private String requestId;

	private List<Data> propertyValueInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getPropertyValueInfos() {
		return this.propertyValueInfos;
	}

	public void setPropertyValueInfos(List<Data> propertyValueInfos) {
		this.propertyValueInfos = propertyValueInfos;
	}

	public static class Data {

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

	@Override
	public ListPropertyValueResponse getInstance(UnmarshallerContext context) {
		return	ListPropertyValueResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
