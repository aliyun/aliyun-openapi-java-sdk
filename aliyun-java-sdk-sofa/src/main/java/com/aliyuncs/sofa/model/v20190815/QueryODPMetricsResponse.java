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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryODPMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryODPMetricsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String metricsType;

		private String schema;

		private List<MertricsValuesItem> mertricsValues;

		public String getMetricsType() {
			return this.metricsType;
		}

		public void setMetricsType(String metricsType) {
			this.metricsType = metricsType;
		}

		public String getSchema() {
			return this.schema;
		}

		public void setSchema(String schema) {
			this.schema = schema;
		}

		public List<MertricsValuesItem> getMertricsValues() {
			return this.mertricsValues;
		}

		public void setMertricsValues(List<MertricsValuesItem> mertricsValues) {
			this.mertricsValues = mertricsValues;
		}

		public static class MertricsValuesItem {

			private Long t;

			private String v;

			public Long getT() {
				return this.t;
			}

			public void setT(Long t) {
				this.t = t;
			}

			public String getV() {
				return this.v;
			}

			public void setV(String v) {
				this.v = v;
			}
		}
	}

	@Override
	public QueryODPMetricsResponse getInstance(UnmarshallerContext context) {
		return	QueryODPMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
