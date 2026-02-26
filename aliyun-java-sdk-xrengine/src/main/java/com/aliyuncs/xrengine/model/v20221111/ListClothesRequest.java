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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListClothesRequest extends RpcAcsRequest<ListClothesResponse> {
	   

	private String type;

	private String clothSize;

	private Integer current;

	private Integer size;

	private String name;

	private String jwtToken;

	@SerializedName("categories")
	private List<Long> categories;
	public ListClothesRequest() {
		super("xrEngine", "2022-11-11", "ListClothes");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getClothSize() {
		return this.clothSize;
	}

	public void setClothSize(String clothSize) {
		this.clothSize = clothSize;
		if(clothSize != null){
			putQueryParameter("ClothSize", clothSize);
		}
	}

	public Integer getCurrent() {
		return this.current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
		if(current != null){
			putBodyParameter("Current", current.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putQueryParameter("JwtToken", jwtToken);
		}
	}

	public List<Long> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Long> categories) {
		this.categories = categories;	
		if (categories != null) {
			putQueryParameter("Categories" , new Gson().toJson(categories));
		}	
	}

	@Override
	public Class<ListClothesResponse> getResponseClass() {
		return ListClothesResponse.class;
	}

}
