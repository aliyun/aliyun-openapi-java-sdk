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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LfDemoRequest extends RoaAcsRequest<LfDemoResponse> {
	   

	private String area;

	@SerializedName("address")
	private Address address;
	public LfDemoRequest() {
		super("LmzTest", "2010-01-01", "LfDemo");
		setUriPattern("/muliti/bean1");
		setMethod(MethodType.POST);
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
		if(area != null){
			putQueryParameter("area", area);
		}
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;	
		if (address != null) {
			putQueryParameter("address" , new Gson().toJson(address));
		}	
	}

	public static class Address {

		@SerializedName("code")
		private Long code;

		@SerializedName("white")
		private Boolean white;

		@SerializedName("size")
		private String size;

		@SerializedName("name")
		private String name;

		public Long getCode() {
			return this.code;
		}

		public void setCode(Long code) {
			this.code = code;
		}

		public Boolean getWhite() {
			return this.white;
		}

		public void setWhite(Boolean white) {
			this.white = white;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public Class<LfDemoResponse> getResponseClass() {
		return LfDemoResponse.class;
	}

}
