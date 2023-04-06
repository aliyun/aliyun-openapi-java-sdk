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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateApiDestinationRequest extends RpcAcsRequest<UpdateApiDestinationResponse> {
	   

	private String description;

	private String apiDestinationName;

	private String connectionName;

	@SerializedName("httpApiParameters")
	private HttpApiParameters httpApiParameters;
	public UpdateApiDestinationRequest() {
		super("eventbridge", "2020-04-01", "UpdateApiDestination");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getApiDestinationName() {
		return this.apiDestinationName;
	}

	public void setApiDestinationName(String apiDestinationName) {
		this.apiDestinationName = apiDestinationName;
		if(apiDestinationName != null){
			putQueryParameter("ApiDestinationName", apiDestinationName);
		}
	}

	public String getConnectionName() {
		return this.connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
		if(connectionName != null){
			putQueryParameter("ConnectionName", connectionName);
		}
	}

	public HttpApiParameters getHttpApiParameters() {
		return this.httpApiParameters;
	}

	public void setHttpApiParameters(HttpApiParameters httpApiParameters) {
		this.httpApiParameters = httpApiParameters;	
		if (httpApiParameters != null) {
			putQueryParameter("HttpApiParameters" , new Gson().toJson(httpApiParameters));
		}	
	}

	public static class HttpApiParameters {

		@SerializedName("Endpoint")
		private String endpoint;

		@SerializedName("Method")
		private String method;

		@SerializedName("ApiParameters")
		private List<ApiParametersItem> apiParameters;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public List<ApiParametersItem> getApiParameters() {
			return this.apiParameters;
		}

		public void setApiParameters(List<ApiParametersItem> apiParameters) {
			this.apiParameters = apiParameters;
		}

		public static class ApiParametersItem {

			@SerializedName("In")
			private String in;

			@SerializedName("Name")
			private String name;

			@SerializedName("Description")
			private String description;

			@SerializedName("DefaultValue")
			private String defaultValue;

			@SerializedName("Type")
			private String type;

			public String getIn() {
				return this.in;
			}

			public void setIn(String in) {
				this.in = in;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public Class<UpdateApiDestinationResponse> getResponseClass() {
		return UpdateApiDestinationResponse.class;
	}

}
