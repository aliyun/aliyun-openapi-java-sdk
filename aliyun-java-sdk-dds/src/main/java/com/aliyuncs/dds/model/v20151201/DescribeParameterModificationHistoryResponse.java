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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeParameterModificationHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterModificationHistoryResponse extends AcsResponse {

	private String requestId;

	private List<HistoricalParameter> historicalParameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HistoricalParameter> getHistoricalParameters() {
		return this.historicalParameters;
	}

	public void setHistoricalParameters(List<HistoricalParameter> historicalParameters) {
		this.historicalParameters = historicalParameters;
	}

	public static class HistoricalParameter {

		private String parameterName;

		private String modifyTime;

		private String oldParameterValue;

		private String newParameterValue;

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getOldParameterValue() {
			return this.oldParameterValue;
		}

		public void setOldParameterValue(String oldParameterValue) {
			this.oldParameterValue = oldParameterValue;
		}

		public String getNewParameterValue() {
			return this.newParameterValue;
		}

		public void setNewParameterValue(String newParameterValue) {
			this.newParameterValue = newParameterValue;
		}
	}

	@Override
	public DescribeParameterModificationHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterModificationHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
