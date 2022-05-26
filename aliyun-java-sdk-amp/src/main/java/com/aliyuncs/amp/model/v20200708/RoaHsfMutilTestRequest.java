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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RoaHsfMutilTestRequest extends RoaAcsRequest<RoaHsfMutilTestResponse> {
	   

	@SerializedName("user")
	private User user;

	private String id;
	public RoaHsfMutilTestRequest() {
		super("amp", "2020-07-08", "RoaHsfMutilTest", "jeepproduct001");
		setUriPattern("/roefe/efe");
		setMethod(MethodType.POST);
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;	
		if (user != null) {
			putBodyParameter("User" , new Gson().toJson(user));
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public static class User {

		@SerializedName("Name")
		private String name;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public Class<RoaHsfMutilTestResponse> getResponseClass() {
		return RoaHsfMutilTestResponse.class;
	}

}
