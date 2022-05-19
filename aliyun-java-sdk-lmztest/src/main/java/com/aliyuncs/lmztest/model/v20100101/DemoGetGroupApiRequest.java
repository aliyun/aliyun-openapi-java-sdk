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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DemoGetGroupApiRequest extends RoaAcsRequest<DemoGetGroupApiResponse> {
	   

	private List<String> codess;

	private String mapUser;

	private String user;

	private String mapStr;

	private List<Users> userss;

	@SerializedName("nums")
	private List<Integer> nums;
	public DemoGetGroupApiRequest() {
		super("LmzTest", "2010-01-01", "DemoGetGroupApi");
		setUriPattern("/get/v/id");
		setMethod(MethodType.GET);
	}

	public List<String> getCodess() {
		return this.codess;
	}

	public void setCodess(List<String> codess) {
		this.codess = codess;	
		if (codess != null) {
			for (int i = 0; i < codess.size(); i++) {
				putQueryParameter("Codes." + (i + 1) , codess.get(i));
			}
		}	
	}

	public String getMapUser() {
		return this.mapUser;
	}

	public void setMapUser(String mapUser) {
		this.mapUser = mapUser;
		if(mapUser != null){
			putQueryParameter("MapUser", mapUser);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	public String getMapStr() {
		return this.mapStr;
	}

	public void setMapStr(String mapStr) {
		this.mapStr = mapStr;
		if(mapStr != null){
			putQueryParameter("MapStr", mapStr);
		}
	}

	public List<Users> getUserss() {
		return this.userss;
	}

	public void setUserss(List<Users> userss) {
		this.userss = userss;	
		if (userss != null) {
			for (int depth1 = 0; depth1 < userss.size(); depth1++) {
				putQueryParameter("Users." + (depth1 + 1) + ".Name" , userss.get(depth1).getName());
				putQueryParameter("Users." + (depth1 + 1) + ".Id" , userss.get(depth1).getId());
			}
		}	
	}

	public List<Integer> getNums() {
		return this.nums;
	}

	public void setNums(List<Integer> nums) {
		this.nums = nums;	
		if (nums != null) {
			putQueryParameter("Nums" , new Gson().toJson(nums));
		}	
	}

	public static class Users {

		private String name;

		private String id;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<DemoGetGroupApiResponse> getResponseClass() {
		return DemoGetGroupApiResponse.class;
	}

}
