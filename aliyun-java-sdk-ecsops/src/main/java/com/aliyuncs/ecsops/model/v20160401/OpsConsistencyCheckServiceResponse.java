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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsConsistencyCheckServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsConsistencyCheckServiceResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Boolean consist;

		private String checkCode;

		private List<String> abnormalAttrs;

		private List<String> dataFeatures;

		public Boolean getConsist() {
			return this.consist;
		}

		public void setConsist(Boolean consist) {
			this.consist = consist;
		}

		public String getCheckCode() {
			return this.checkCode;
		}

		public void setCheckCode(String checkCode) {
			this.checkCode = checkCode;
		}

		public List<String> getAbnormalAttrs() {
			return this.abnormalAttrs;
		}

		public void setAbnormalAttrs(List<String> abnormalAttrs) {
			this.abnormalAttrs = abnormalAttrs;
		}

		public List<String> getDataFeatures() {
			return this.dataFeatures;
		}

		public void setDataFeatures(List<String> dataFeatures) {
			this.dataFeatures = dataFeatures;
		}
	}

	@Override
	public OpsConsistencyCheckServiceResponse getInstance(UnmarshallerContext context) {
		return	OpsConsistencyCheckServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
