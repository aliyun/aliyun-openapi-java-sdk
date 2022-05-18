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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddSlotRequest extends RpcAcsRequest<AddSlotResponse> {
	   

	@SerializedName("similarEntryList")
	private List<SimilarEntryList> similarEntryList;

	private String alias;

	private String description;

	private Integer ownStatus;

	private Integer categoryId;

	private String robotCode;
	public AddSlotRequest() {
		super("RetailBot", "2021-02-24", "AddSlot");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<SimilarEntryList> getSimilarEntryList() {
		return this.similarEntryList;
	}

	public void setSimilarEntryList(List<SimilarEntryList> similarEntryList) {
		this.similarEntryList = similarEntryList;	
		if (similarEntryList != null) {
			putBodyParameter("SimilarEntryList" , new Gson().toJson(similarEntryList));
		}	
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putBodyParameter("Alias", alias);
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

	public Integer getOwnStatus() {
		return this.ownStatus;
	}

	public void setOwnStatus(Integer ownStatus) {
		this.ownStatus = ownStatus;
		if(ownStatus != null){
			putBodyParameter("OwnStatus", ownStatus.toString());
		}
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putBodyParameter("CategoryId", categoryId.toString());
		}
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public static class SimilarEntryList {

		@SerializedName("CoreValue")
		private String coreValue;

		@SerializedName("SimilarValues")
		private List<String> similarValues;

		public String getCoreValue() {
			return this.coreValue;
		}

		public void setCoreValue(String coreValue) {
			this.coreValue = coreValue;
		}

		public List<String> getSimilarValues() {
			return this.similarValues;
		}

		public void setSimilarValues(List<String> similarValues) {
			this.similarValues = similarValues;
		}
	}

	@Override
	public Class<AddSlotResponse> getResponseClass() {
		return AddSlotResponse.class;
	}

}
