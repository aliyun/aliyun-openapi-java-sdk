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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CoreEngineCopyRequest extends RoaAcsRequest<CoreEngineCopyResponse> {
	   

	private String param5;

	@SerializedName("paramList")
	private List<String> paramList;

	private String param4;

	@SerializedName("param1")
	private List<Param1> param1;
	public CoreEngineCopyRequest() {
		super("amp", "2020-07-08", "CoreEngineCopy", "jeepproduct001");
		setUriPattern("/api/new/demo");
		setMethod(MethodType.POST);
	}

	public String getParam5() {
		return this.param5;
	}

	public void setParam5(String param5) {
		this.param5 = param5;
		if(param5 != null){
			putQueryParameter("param5", param5);
		}
	}

	public List<String> getParamList() {
		return this.paramList;
	}

	public void setParamList(List<String> paramList) {
		this.paramList = paramList;	
		if (paramList != null) {
			putQueryParameter("ParamList" , new Gson().toJson(paramList));
		}	
	}

	public String getParam4() {
		return this.param4;
	}

	public void setParam4(String param4) {
		this.param4 = param4;
		if(param4 != null){
			putQueryParameter("param4", param4);
		}
	}

	public List<Param1> getParam1() {
		return this.param1;
	}

	public void setParam1(List<Param1> param1) {
		this.param1 = param1;	
		if (param1 != null) {
			putBodyParameter("Param1" , new Gson().toJson(param1));
		}	
	}

	public static class Param1 {

		@SerializedName("Param3")
		private String param3;

		@SerializedName("Param1")
		private String param1;

		@SerializedName("Param2")
		private String param2;

		public String getParam3() {
			return this.param3;
		}

		public void setParam3(String param3) {
			this.param3 = param3;
		}

		public String getParam1() {
			return this.param1;
		}

		public void setParam1(String param1) {
			this.param1 = param1;
		}

		public String getParam2() {
			return this.param2;
		}

		public void setParam2(String param2) {
			this.param2 = param2;
		}
	}

	@Override
	public Class<CoreEngineCopyResponse> getResponseClass() {
		return CoreEngineCopyResponse.class;
	}

}
