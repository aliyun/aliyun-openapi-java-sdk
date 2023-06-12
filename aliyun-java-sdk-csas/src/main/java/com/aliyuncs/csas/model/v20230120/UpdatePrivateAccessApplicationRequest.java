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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdatePrivateAccessApplicationRequest extends RpcAcsRequest<UpdatePrivateAccessApplicationResponse> {
	   

	@SerializedName("addresses")
	private List<String> addresses;

	private String description;

	private String protocol;

	private String applicationId;

	@SerializedName("tagIds")
	private List<String> tagIds;

	@SerializedName("portRanges")
	private List<PortRanges> portRanges;

	private String modifyType;

	private String status;
	public UpdatePrivateAccessApplicationRequest() {
		super("csas", "2023-01-20", "UpdatePrivateAccessApplication");
		setMethod(MethodType.POST);
	}

	public List<String> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;	
		if (addresses != null) {
			putBodyParameter("Addresses" , new Gson().toJson(addresses));
		}	
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putBodyParameter("Protocol", protocol);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putBodyParameter("ApplicationId", applicationId);
		}
	}

	public List<String> getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;	
		if (tagIds != null) {
			putBodyParameter("TagIds" , new Gson().toJson(tagIds));
		}	
	}

	public List<PortRanges> getPortRanges() {
		return this.portRanges;
	}

	public void setPortRanges(List<PortRanges> portRanges) {
		this.portRanges = portRanges;	
		if (portRanges != null) {
			putBodyParameter("PortRanges" , new Gson().toJson(portRanges));
		}	
	}

	public String getModifyType() {
		return this.modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
		if(modifyType != null){
			putBodyParameter("ModifyType", modifyType);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public static class PortRanges {

		@SerializedName("End")
		private Integer end;

		@SerializedName("Begin")
		private Integer begin;

		public Integer getEnd() {
			return this.end;
		}

		public void setEnd(Integer end) {
			this.end = end;
		}

		public Integer getBegin() {
			return this.begin;
		}

		public void setBegin(Integer begin) {
			this.begin = begin;
		}
	}

	@Override
	public Class<UpdatePrivateAccessApplicationResponse> getResponseClass() {
		return UpdatePrivateAccessApplicationResponse.class;
	}

}
