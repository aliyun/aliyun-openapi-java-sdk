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

package com.aliyuncs.amp.model.v20200708;

import com.aliyuncs.RoaAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RoaDuheYsTestRequest extends RoaAcsRequest<RoaDuheYsTestResponse> {
	   

	@SerializedName("body")
	private Body body;
	public RoaDuheYsTestRequest() {
		super("amp", "2020-07-08", "RoaDuheYsTest", "jeepproduct001");
		setUriPattern("/roa/duhe/test");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("GatewayInfomation")
		private Map<String,String> gatewayInfomation;

		@SerializedName("BizSystemParameters")
		private Map<String,String> bizSystemParameters;

		@SerializedName("Data")
		private String data;

		@SerializedName("BizGenericParameters")
		private Map<String,BizGenericParametersItem> bizGenericParameters;

		@SerializedName("BizContext")
		private Map<String,BizContextItem> bizContext;

		@SerializedName("InvokeInfomation")
		private Map<String,String> invokeInfomation;

		public Map<String,String> getGatewayInfomation() {
			return this.gatewayInfomation;
		}

		public void setGatewayInfomation(Map<String,String> gatewayInfomation) {
			this.gatewayInfomation = gatewayInfomation;
		}

		public Map<String,String> getBizSystemParameters() {
			return this.bizSystemParameters;
		}

		public void setBizSystemParameters(Map<String,String> bizSystemParameters) {
			this.bizSystemParameters = bizSystemParameters;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Map<String,BizGenericParametersItem> getBizGenericParameters() {
			return this.bizGenericParameters;
		}

		public void setBizGenericParameters(Map<String,BizGenericParametersItem> bizGenericParameters) {
			this.bizGenericParameters = bizGenericParameters;
		}

		public Map<String,BizContextItem> getBizContext() {
			return this.bizContext;
		}

		public void setBizContext(Map<String,BizContextItem> bizContext) {
			this.bizContext = bizContext;
		}

		public Map<String,String> getInvokeInfomation() {
			return this.invokeInfomation;
		}

		public void setInvokeInfomation(Map<String,String> invokeInfomation) {
			this.invokeInfomation = invokeInfomation;
		}

		public static class BizGenericParametersItem {

			@SerializedName("Param")
			private String param;

			public String getParam() {
				return this.param;
			}

			public void setParam(String param) {
				this.param = param;
			}
		}

		public static class BizContextItem {

			@SerializedName("Param")
			private String param;

			public String getParam() {
				return this.param;
			}

			public void setParam(String param) {
				this.param = param;
			}
		}
	}

	@Override
	public Class<RoaDuheYsTestResponse> getResponseClass() {
		return RoaDuheYsTestResponse.class;
	}

}
