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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ROAHTTPtestwfRequest extends RoaAcsRequest<ROAHTTPtestwfResponse> {
	   

	private String codes;

	private String number;

	private String name;

	private String id;
	public ROAHTTPtestwfRequest() {
		super("LmzTest", "2010-01-01", "ROAHTTPtestwf");
		setUriPattern("/test/v1/demo10");
		setMethod(MethodType.POST);
	}

	public String getCodes() {
		return this.codes;
	}

	public void setCodes(String codes) {
		this.codes = codes;
		if(codes != null){
			putQueryParameter("codes", codes);
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("number", number);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("id", id);
		}
	}

	@Override
	public Class<ROAHTTPtestwfResponse> getResponseClass() {
		return ROAHTTPtestwfResponse.class;
	}

}
