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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeUuidsByVulNamesRequest extends RpcAcsRequest<DescribeUuidsByVulNamesResponse> {
	   

	private String targetType;

	private String type;

	private String vpcInstanceIds;

	private List<String> vulNamess;

	private String tag;

	private String lang;

	private String level;

	private Long groupId;

	private String dealed;

	private String fieldValue;

	private String fieldName;

	private String searchTags;

	private String necessity;

	private String status;
	public DescribeUuidsByVulNamesRequest() {
		super("Sas", "2018-12-03", "DescribeUuidsByVulNames", "sas");
		setMethod(MethodType.POST);
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
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

	public String getVpcInstanceIds() {
		return this.vpcInstanceIds;
	}

	public void setVpcInstanceIds(String vpcInstanceIds) {
		this.vpcInstanceIds = vpcInstanceIds;
		if(vpcInstanceIds != null){
			putQueryParameter("VpcInstanceIds", vpcInstanceIds);
		}
	}

	public List<String> getVulNamess() {
		return this.vulNamess;
	}

	public void setVulNamess(List<String> vulNamess) {
		this.vulNamess = vulNamess;	
		if (vulNamess != null) {
			for (int i = 0; i < vulNamess.size(); i++) {
				putQueryParameter("VulNames." + (i + 1) , vulNamess.get(i));
			}
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
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

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public String getFieldValue() {
		return this.fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
		if(fieldValue != null){
			putQueryParameter("FieldValue", fieldValue);
		}
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
		if(fieldName != null){
			putQueryParameter("FieldName", fieldName);
		}
	}

	public String getSearchTags() {
		return this.searchTags;
	}

	public void setSearchTags(String searchTags) {
		this.searchTags = searchTags;
		if(searchTags != null){
			putQueryParameter("SearchTags", searchTags);
		}
	}

	public String getNecessity() {
		return this.necessity;
	}

	public void setNecessity(String necessity) {
		this.necessity = necessity;
		if(necessity != null){
			putQueryParameter("Necessity", necessity);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeUuidsByVulNamesResponse> getResponseClass() {
		return DescribeUuidsByVulNamesResponse.class;
	}

}
