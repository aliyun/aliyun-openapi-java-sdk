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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TestParamRequest extends RoaAcsRequest<TestParamResponse> {
	   

	private String param;
	public TestParamRequest() {
		super("amp", "2020-07-08", "TestParam", "jeepproduct001");
		setUriPattern("/test/param");
		setMethod(MethodType.POST);
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
		if(param != null){
			putQueryParameter("Param", param);
		}
	}

	@Override
	public Class<TestParamResponse> getResponseClass() {
		return TestParamResponse.class;
	}

}
