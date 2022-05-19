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
public class HttpForBeanParamRequest extends RoaAcsRequest<HttpForBeanParamResponse> {
	   

	private String person;

	private String name;

	private String content;

	private Long age;
	public HttpForBeanParamRequest() {
		super("LmzTest", "2010-01-01", "HttpForBeanParam");
		setUriPattern("/hello/bean");
		setMethod(MethodType.POST);
	}

	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
		if(person != null){
			putBodyParameter("person", person);
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("content", content);
		}
	}

	public Long getAge() {
		return this.age;
	}

	public void setAge(Long age) {
		this.age = age;
		if(age != null){
			putQueryParameter("age", age.toString());
		}
	}

	@Override
	public Class<HttpForBeanParamResponse> getResponseClass() {
		return HttpForBeanParamResponse.class;
	}

}
