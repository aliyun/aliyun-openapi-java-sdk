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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPhoneBusinessProfileRequest extends RpcAcsRequest<ModifyPhoneBusinessProfileResponse> {
	   

	private String phoneNumber;

	private String about;

	private String description;

	private String vertical;

	private String email;

	private String address;

	private String profilePictureUrl;

	private String custSpaceId;

	@SerializedName("websites")
	private List<String> websites;
	public ModifyPhoneBusinessProfileRequest() {
		super("cams", "2020-06-06", "ModifyPhoneBusinessProfile", "cams");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getAbout() {
		return this.about;
	}

	public void setAbout(String about) {
		this.about = about;
		if(about != null){
			putQueryParameter("About", about);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getVertical() {
		return this.vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
		if(vertical != null){
			putQueryParameter("Vertical", vertical);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
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

	public String getProfilePictureUrl() {
		return this.profilePictureUrl;
	}

	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
		if(profilePictureUrl != null){
			putQueryParameter("ProfilePictureUrl", profilePictureUrl);
		}
	}

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putQueryParameter("CustSpaceId", custSpaceId);
		}
	}

	public List<String> getWebsites() {
		return this.websites;
	}

	public void setWebsites(List<String> websites) {
		this.websites = websites;	
		if (websites != null) {
			putQueryParameter("Websites" , new Gson().toJson(websites));
		}	
	}

	@Override
	public Class<ModifyPhoneBusinessProfileResponse> getResponseClass() {
		return ModifyPhoneBusinessProfileResponse.class;
	}

}
