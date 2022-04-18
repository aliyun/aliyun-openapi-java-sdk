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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeEventTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventTypesResponse extends AcsResponse {

	private String requestId;

	private List<EventType> eventTypeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventType> getEventTypeList() {
		return this.eventTypeList;
	}

	public void setEventTypeList(List<EventType> eventTypeList) {
		this.eventTypeList = eventTypeList;
	}

	public static class EventType {

		private String code;

		private String description;

		private String name;

		private Long id;

		private List<SubType> subTypeList;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
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

		public List<SubType> getSubTypeList() {
			return this.subTypeList;
		}

		public void setSubTypeList(List<SubType> subTypeList) {
			this.subTypeList = subTypeList;
		}

		public static class SubType {

			private Integer status;

			private String description;

			private Integer configContentType;

			private Integer eventHitCount;

			private String configValue;

			private String configCode;

			private String code;

			private String configDescription;

			private String name;

			private String adaptedProduct;

			private Long id;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getConfigContentType() {
				return this.configContentType;
			}

			public void setConfigContentType(Integer configContentType) {
				this.configContentType = configContentType;
			}

			public Integer getEventHitCount() {
				return this.eventHitCount;
			}

			public void setEventHitCount(Integer eventHitCount) {
				this.eventHitCount = eventHitCount;
			}

			public String getConfigValue() {
				return this.configValue;
			}

			public void setConfigValue(String configValue) {
				this.configValue = configValue;
			}

			public String getConfigCode() {
				return this.configCode;
			}

			public void setConfigCode(String configCode) {
				this.configCode = configCode;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getConfigDescription() {
				return this.configDescription;
			}

			public void setConfigDescription(String configDescription) {
				this.configDescription = configDescription;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAdaptedProduct() {
				return this.adaptedProduct;
			}

			public void setAdaptedProduct(String adaptedProduct) {
				this.adaptedProduct = adaptedProduct;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public DescribeEventTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
