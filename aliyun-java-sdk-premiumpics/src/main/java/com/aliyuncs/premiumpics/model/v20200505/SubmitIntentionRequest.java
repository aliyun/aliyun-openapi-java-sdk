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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitIntentionRequest extends RpcAcsRequest<SubmitIntentionResponse> {
	   

	private String area;

	private String extInfo;

	private String mobile;

	private String channel;

	private String description;

	private String vcode;

	private String token;

	private String contactName;

	private String bizType;

	private String commodityType;
	public SubmitIntentionRequest() {
		super("Premiumpics", "2020-05-05", "SubmitIntention");
		setMethod(MethodType.POST);
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
		if(area != null){
			putQueryParameter("Area", area);
		}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putQueryParameter("ExtInfo", extInfo);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
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

	public String getVcode() {
		return this.vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
		if(vcode != null){
			putQueryParameter("Vcode", vcode);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getCommodityType() {
		return this.commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
		if(commodityType != null){
			putQueryParameter("CommodityType", commodityType);
		}
	}

	@Override
	public Class<SubmitIntentionResponse> getResponseClass() {
		return SubmitIntentionResponse.class;
	}

}
