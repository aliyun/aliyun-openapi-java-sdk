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

package com.aliyuncs.swas.model.v20170810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetFlowDatasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFlowDatasResponse extends AcsResponse {

	private String unitFlow;

	private Boolean isSuccess;

	private String requestId;

	private String code;

	private List<MonitorData> datas;

	public String getUnitFlow() {
		return this.unitFlow;
	}

	public void setUnitFlow(String unitFlow) {
		this.unitFlow = unitFlow;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<MonitorData> getDatas() {
		return this.datas;
	}

	public void setDatas(List<MonitorData> datas) {
		this.datas = datas;
	}

	public static class MonitorData {

		private String inValue;

		private String outValue;

		private String timestamp;

		public String getInValue() {
			return this.inValue;
		}

		public void setInValue(String inValue) {
			this.inValue = inValue;
		}

		public String getOutValue() {
			return this.outValue;
		}

		public void setOutValue(String outValue) {
			this.outValue = outValue;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public GetFlowDatasResponse getInstance(UnmarshallerContext context) {
		return	GetFlowDatasResponseUnmarshaller.unmarshall(this, context);
	}
}
