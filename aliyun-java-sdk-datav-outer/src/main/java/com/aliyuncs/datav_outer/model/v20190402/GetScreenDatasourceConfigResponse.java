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

package com.aliyuncs.datav_outer.model.v20190402;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datav_outer.transform.v20190402.GetScreenDatasourceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetScreenDatasourceConfigResponse extends AcsResponse {

	private String requestId;

	private List<Datasource> datasources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Datasource> getDatasources() {
		return this.datasources;
	}

	public void setDatasources(List<Datasource> datasources) {
		this.datasources = datasources;
	}

	public static class Datasource {

		private String apiName;

		private String type;

		private String dataConfig;

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDataConfig() {
			return this.dataConfig;
		}

		public void setDataConfig(String dataConfig) {
			this.dataConfig = dataConfig;
		}
	}

	@Override
	public GetScreenDatasourceConfigResponse getInstance(UnmarshallerContext context) {
		return	GetScreenDatasourceConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
