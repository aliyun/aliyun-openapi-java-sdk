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

package com.aliyuncs.ft.model.v20160102;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TestGateWayByRoaRequest extends RoaAcsRequest<TestGateWayByRoaResponse> {
	   

	private String code;

	private String success;
	public TestGateWayByRoaRequest() {
		super("Ft", "2016-01-02", "TestGateWayByRoa");
		setUriPattern("/gateway");
		setMethod(MethodType.POST);
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putHeaderParameter("Code", code);
		}
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
		if(success != null){
			putQueryParameter("Success", success);
		}
	}

	@Override
	public Class<TestGateWayByRoaResponse> getResponseClass() {
		return TestGateWayByRoaResponse.class;
	}

}
