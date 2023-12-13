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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeDataSourceInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSourceInstanceResponse extends AcsResponse {

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

		private String dataSourceInstanceId;

		private String accountId;

		private String cloudCode;

		private List<DataSourceInstanceParam> dataSourceInstanceParams;

		public String getDataSourceInstanceId() {
			return this.dataSourceInstanceId;
		}

		public void setDataSourceInstanceId(String dataSourceInstanceId) {
			this.dataSourceInstanceId = dataSourceInstanceId;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}

		public List<DataSourceInstanceParam> getDataSourceInstanceParams() {
			return this.dataSourceInstanceParams;
		}

		public void setDataSourceInstanceParams(List<DataSourceInstanceParam> dataSourceInstanceParams) {
			this.dataSourceInstanceParams = dataSourceInstanceParams;
		}

		public static class DataSourceInstanceParam {

			private String paraCode;

			private String paraValue;

			public String getParaCode() {
				return this.paraCode;
			}

			public void setParaCode(String paraCode) {
				this.paraCode = paraCode;
			}

			public String getParaValue() {
				return this.paraValue;
			}

			public void setParaValue(String paraValue) {
				this.paraValue = paraValue;
			}
		}
	}

	@Override
	public DescribeDataSourceInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSourceInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
