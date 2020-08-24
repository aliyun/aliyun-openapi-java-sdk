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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.GetAIActionConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAIActionConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String algoAction;

		private String des;

		private Boolean needDevice;

		private String sync;

		private String algoConfigItems;

		private List<InParamListItem> inParamList;

		private List<OutParamListItem> outParamList;

		public String getAlgoAction() {
			return this.algoAction;
		}

		public void setAlgoAction(String algoAction) {
			this.algoAction = algoAction;
		}

		public String getDes() {
			return this.des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public Boolean getNeedDevice() {
			return this.needDevice;
		}

		public void setNeedDevice(Boolean needDevice) {
			this.needDevice = needDevice;
		}

		public String getSync() {
			return this.sync;
		}

		public void setSync(String sync) {
			this.sync = sync;
		}

		public String getAlgoConfigItems() {
			return this.algoConfigItems;
		}

		public void setAlgoConfigItems(String algoConfigItems) {
			this.algoConfigItems = algoConfigItems;
		}

		public List<InParamListItem> getInParamList() {
			return this.inParamList;
		}

		public void setInParamList(List<InParamListItem> inParamList) {
			this.inParamList = inParamList;
		}

		public List<OutParamListItem> getOutParamList() {
			return this.outParamList;
		}

		public void setOutParamList(List<OutParamListItem> outParamList) {
			this.outParamList = outParamList;
		}

		public static class InParamListItem {

			private String dataType;

			private Boolean needConfig;

			private List<String> configItems;

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public Boolean getNeedConfig() {
				return this.needConfig;
			}

			public void setNeedConfig(Boolean needConfig) {
				this.needConfig = needConfig;
			}

			public List<String> getConfigItems() {
				return this.configItems;
			}

			public void setConfigItems(List<String> configItems) {
				this.configItems = configItems;
			}
		}

		public static class OutParamListItem {

			private String dataType;

			private Boolean needConfig;

			private List<String> configItems1;

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public Boolean getNeedConfig() {
				return this.needConfig;
			}

			public void setNeedConfig(Boolean needConfig) {
				this.needConfig = needConfig;
			}

			public List<String> getConfigItems1() {
				return this.configItems1;
			}

			public void setConfigItems1(List<String> configItems1) {
				this.configItems1 = configItems1;
			}
		}
	}

	@Override
	public GetAIActionConfigResponse getInstance(UnmarshallerContext context) {
		return	GetAIActionConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
