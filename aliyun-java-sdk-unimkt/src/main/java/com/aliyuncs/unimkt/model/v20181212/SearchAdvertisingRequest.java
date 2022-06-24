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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchAdvertisingRequest extends RpcAcsRequest<SearchAdvertisingResponse> {
	   

	@SerializedName("app")
	private App app;

	@SerializedName("ext")
	private Map<String,String> ext;

	private Integer test;

	private String id;

	@SerializedName("imp")
	private List<Imp> imp;

	@SerializedName("user")
	private User user;
	public SearchAdvertisingRequest() {
		super("UniMkt", "2018-12-12", "SearchAdvertising", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public App getApp() {
		return this.app;
	}

	public void setApp(App app) {
		this.app = app;	
		if (app != null) {
			putQueryParameter("App" , new Gson().toJson(app));
		}	
	}

	public Map<String,String> getExt() {
		return this.ext;
	}

	public void setExt(Map<String,String> ext) {
		this.ext = ext;	
		if (ext != null) {
			putQueryParameter("Ext" , new Gson().toJson(ext));
		}	
	}

	public Integer getTest() {
		return this.test;
	}

	public void setTest(Integer test) {
		this.test = test;
		if(test != null){
			putQueryParameter("Test", test.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public List<Imp> getImp() {
		return this.imp;
	}

	public void setImp(List<Imp> imp) {
		this.imp = imp;	
		if (imp != null) {
			putQueryParameter("Imp" , new Gson().toJson(imp));
		}	
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;	
		if (user != null) {
			putQueryParameter("User" , new Gson().toJson(user));
		}	
	}

	public static class App {

		@SerializedName("Ext")
		private Map<String,String> ext;

		@SerializedName("Sn")
		private String sn;

		@SerializedName("Mediaid")
		private String mediaid;

		public Map<String,String> getExt() {
			return this.ext;
		}

		public void setExt(Map<String,String> ext) {
			this.ext = ext;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}

		public String getMediaid() {
			return this.mediaid;
		}

		public void setMediaid(String mediaid) {
			this.mediaid = mediaid;
		}
	}

	public static class Imp {

		@SerializedName("Tagid")
		private String tagid;

		@SerializedName("Id")
		private String id;

		public String getTagid() {
			return this.tagid;
		}

		public void setTagid(String tagid) {
			this.tagid = tagid;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class User {

		@SerializedName("Uid")
		private String uid;

		@SerializedName("Uidtype")
		private String uidtype;

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getUidtype() {
			return this.uidtype;
		}

		public void setUidtype(String uidtype) {
			this.uidtype = uidtype;
		}
	}

	@Override
	public Class<SearchAdvertisingResponse> getResponseClass() {
		return SearchAdvertisingResponse.class;
	}

}
