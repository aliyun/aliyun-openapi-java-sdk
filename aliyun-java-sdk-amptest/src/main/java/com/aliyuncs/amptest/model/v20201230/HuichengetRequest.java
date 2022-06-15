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

package com.aliyuncs.amptest.model.v20201230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class HuichengetRequest extends RpcAcsRequest<HuichengetResponse> {
	   

	private String add;

	private String apple;

	private String tea;

	private String address;

	private String four;

	private String newName;

	private String two;

	private String three;
	public HuichengetRequest() {
		super("AmpTest", "2020-12-30", "Huichenget", "AmpTest");
		setMethod(MethodType.POST);
	}

	public String getAdd() {
		return this.add;
	}

	public void setAdd(String add) {
		this.add = add;
		if(add != null){
			putQueryParameter("Add", add);
		}
	}

	public String getApple() {
		return this.apple;
	}

	public void setApple(String apple) {
		this.apple = apple;
		if(apple != null){
			putQueryParameter("Apple", apple);
		}
	}

	public String getTea() {
		return this.tea;
	}

	public void setTea(String tea) {
		this.tea = tea;
		if(tea != null){
			putQueryParameter("Tea", tea);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getFour() {
		return this.four;
	}

	public void setFour(String four) {
		this.four = four;
		if(four != null){
			putQueryParameter("Four", four);
		}
	}

	public String getNewName() {
		return this.newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
		if(newName != null){
			putQueryParameter("NewName", newName);
		}
	}

	public String getTwo() {
		return this.two;
	}

	public void setTwo(String two) {
		this.two = two;
		if(two != null){
			putQueryParameter("Two", two);
		}
	}

	public String getThree() {
		return this.three;
	}

	public void setThree(String three) {
		this.three = three;
		if(three != null){
			putQueryParameter("Three", three);
		}
	}

	@Override
	public Class<HuichengetResponse> getResponseClass() {
		return HuichengetResponse.class;
	}

}
