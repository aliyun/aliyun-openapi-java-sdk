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
public class TestFeRequest extends RoaAcsRequest<TestFeResponse> {
	   

	private String add1;
	public TestFeRequest() {
		super("amp", "2020-07-08", "TestFe", "jeepproduct001");
		setUriPattern("/efe/333");
		setMethod(MethodType.POST);
	}

	public String getAdd1() {
		return this.add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
		if(add1 != null){
			putQueryParameter("Add1", add1);
		}
	}

	@Override
	public Class<TestFeResponse> getResponseClass() {
		return TestFeResponse.class;
	}

}
