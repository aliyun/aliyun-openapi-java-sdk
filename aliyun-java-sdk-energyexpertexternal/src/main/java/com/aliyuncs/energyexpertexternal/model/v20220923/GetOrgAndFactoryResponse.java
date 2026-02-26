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

package com.aliyuncs.energyexpertexternal.model.v20220923;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.energyexpertexternal.transform.v20220923.GetOrgAndFactoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrgAndFactoryResponse extends AcsResponse {

	private String requestId;

	private Integer httpCode;

	private String code;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String aliyunPk;

		private String organizationName;

		private List<Factory> factoryList;

		public String getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(String aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public String getOrganizationName() {
			return this.organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public List<Factory> getFactoryList() {
			return this.factoryList;
		}

		public void setFactoryList(List<Factory> factoryList) {
			this.factoryList = factoryList;
		}

		public static class Factory {

			private String factoryId;

			private String factoryName;

			public String getFactoryId() {
				return this.factoryId;
			}

			public void setFactoryId(String factoryId) {
				this.factoryId = factoryId;
			}

			public String getFactoryName() {
				return this.factoryName;
			}

			public void setFactoryName(String factoryName) {
				this.factoryName = factoryName;
			}
		}
	}

	@Override
	public GetOrgAndFactoryResponse getInstance(UnmarshallerContext context) {
		return	GetOrgAndFactoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
