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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateSwimmingLaneRequest extends RpcAcsRequest<CreateOrUpdateSwimmingLaneResponse> {
	   

	private String source;

	private String gmtModified;

	private String userId;

	private String licenseKey;

	private String entryRule;

	private Boolean enable;

	private Long id;

	private String tag;

	private List<EntryRules> entryRuless;

	private Long groupId;

	private String gmtCreate;

	private Boolean enableRules;

	private String name;

	private String acceptLanguage;

	private Integer status;
	public CreateOrUpdateSwimmingLaneRequest() {
		super("mse", "2019-05-31", "CreateOrUpdateSwimmingLane", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putQueryParameter("GmtModified", gmtModified);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getLicenseKey() {
		return this.licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
		if(licenseKey != null){
			putQueryParameter("LicenseKey", licenseKey);
		}
	}

	public String getEntryRule() {
		return this.entryRule;
	}

	public void setEntryRule(String entryRule) {
		this.entryRule = entryRule;
		if(entryRule != null){
			putQueryParameter("EntryRule", entryRule);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public List<EntryRules> getEntryRuless() {
		return this.entryRuless;
	}

	public void setEntryRuless(List<EntryRules> entryRuless) {
		this.entryRuless = entryRuless;	
		if (entryRuless != null) {
			for (int depth1 = 0; depth1 < entryRuless.size(); depth1++) {
				if (entryRuless.get(depth1).getRestItemss() != null) {
					for (int depth2 = 0; depth2 < entryRuless.get(depth1).getRestItemss().size(); depth2++) {
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Datum" , entryRuless.get(depth1).getRestItemss().get(depth2).getDatum());
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Divisor" , entryRuless.get(depth1).getRestItemss().get(depth2).getDivisor());
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Rate" , entryRuless.get(depth1).getRestItemss().get(depth2).getRate());
						if (entryRuless.get(depth1).getRestItemss().get(depth2).getNameLists() != null) {
							for (int i = 0; i < entryRuless.get(depth1).getRestItemss().get(depth2).getNameLists().size(); i++) {
								putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".NameList." + (i + 1) , entryRuless.get(depth1).getRestItemss().get(depth2).getNameLists().get(i));
							}
						}
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Name" , entryRuless.get(depth1).getRestItemss().get(depth2).getName());
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Type" , entryRuless.get(depth1).getRestItemss().get(depth2).getType());
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Cond" , entryRuless.get(depth1).getRestItemss().get(depth2).getCond());
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Remainder" , entryRuless.get(depth1).getRestItemss().get(depth2).getRemainder());
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Value" , entryRuless.get(depth1).getRestItemss().get(depth2).getValue());
						putQueryParameter("EntryRules." + (depth1 + 1) + ".RestItems." + (depth2 + 1) + ".Operator" , entryRuless.get(depth1).getRestItemss().get(depth2).getOperator());
					}
				}
				putQueryParameter("EntryRules." + (depth1 + 1) + ".Path" , entryRuless.get(depth1).getPath());
				putQueryParameter("EntryRules." + (depth1 + 1) + ".Condition" , entryRuless.get(depth1).getCondition());
				putQueryParameter("EntryRules." + (depth1 + 1) + ".Enable" , entryRuless.get(depth1).getEnable());
				putQueryParameter("EntryRules." + (depth1 + 1) + ".Priority" , entryRuless.get(depth1).getPriority());
			}
		}	
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putQueryParameter("GmtCreate", gmtCreate);
		}
	}

	public Boolean getEnableRules() {
		return this.enableRules;
	}

	public void setEnableRules(Boolean enableRules) {
		this.enableRules = enableRules;
		if(enableRules != null){
			putQueryParameter("EnableRules", enableRules.toString());
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

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public static class EntryRules {

		private List<RestItems> restItemss;

		private String path;

		private String condition;

		private Boolean enable;

		private Integer priority;

		public List<RestItems> getRestItemss() {
			return this.restItemss;
		}

		public void setRestItemss(List<RestItems> restItemss) {
			this.restItemss = restItemss;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getCondition() {
			return this.condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public static class RestItems {

			private String datum;

			private Integer divisor;

			private Integer rate;

			private List<String> nameLists;

			private String name;

			private String type;

			private String cond;

			private Integer remainder;

			private String value;

			private String operator;

			public String getDatum() {
				return this.datum;
			}

			public void setDatum(String datum) {
				this.datum = datum;
			}

			public Integer getDivisor() {
				return this.divisor;
			}

			public void setDivisor(Integer divisor) {
				this.divisor = divisor;
			}

			public Integer getRate() {
				return this.rate;
			}

			public void setRate(Integer rate) {
				this.rate = rate;
			}

			public List<String> getNameLists() {
				return this.nameLists;
			}

			public void setNameLists(List<String> nameLists) {
				this.nameLists = nameLists;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCond() {
				return this.cond;
			}

			public void setCond(String cond) {
				this.cond = cond;
			}

			public Integer getRemainder() {
				return this.remainder;
			}

			public void setRemainder(Integer remainder) {
				this.remainder = remainder;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}
		}
	}

	@Override
	public Class<CreateOrUpdateSwimmingLaneResponse> getResponseClass() {
		return CreateOrUpdateSwimmingLaneResponse.class;
	}

}
