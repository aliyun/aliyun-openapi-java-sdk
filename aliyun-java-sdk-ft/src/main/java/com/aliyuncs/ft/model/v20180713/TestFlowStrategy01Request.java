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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TestFlowStrategy01Request extends RpcAcsRequest<TestFlowStrategy01Response> {
	   

	private List<Object> names;
	public TestFlowStrategy01Request() {
		super("Ft", "2018-07-13", "TestFlowStrategy01");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Object> getNames() {
		return this.names;
	}

	public void setNames(List<Object> names) {
		this.names = names;
		if(names != null){
			putBodyParameter("Names", new Gson().toJson(names));
		}
	}

	@Override
	public Class<TestFlowStrategy01Response> getResponseClass() {
		return TestFlowStrategy01Response.class;
	}

}
