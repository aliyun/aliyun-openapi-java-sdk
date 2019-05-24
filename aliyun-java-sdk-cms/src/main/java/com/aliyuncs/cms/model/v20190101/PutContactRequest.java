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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PutContactRequest extends RpcAcsRequest<PutContactResponse> {
	
	public PutContactRequest() {
		super("Cms", "2019-01-01", "PutContact", "cms");
	}

	private String contactName;

	private String channelsMail;

	private String channelsAliIM;

	private String channelsDingWebHook;

	private String describe;

	private String channelsSMS;

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getChannelsMail() {
		return this.channelsMail;
	}

	public void setChannelsMail(String channelsMail) {
		this.channelsMail = channelsMail;
		if(channelsMail != null){
			putQueryParameter("Channels.Mail", channelsMail);
		}
	}

	public String getChannelsAliIM() {
		return this.channelsAliIM;
	}

	public void setChannelsAliIM(String channelsAliIM) {
		this.channelsAliIM = channelsAliIM;
		if(channelsAliIM != null){
			putQueryParameter("Channels.AliIM", channelsAliIM);
		}
	}

	public String getChannelsDingWebHook() {
		return this.channelsDingWebHook;
	}

	public void setChannelsDingWebHook(String channelsDingWebHook) {
		this.channelsDingWebHook = channelsDingWebHook;
		if(channelsDingWebHook != null){
			putQueryParameter("Channels.DingWebHook", channelsDingWebHook);
		}
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
		if(describe != null){
			putQueryParameter("Describe", describe);
		}
	}

	public String getChannelsSMS() {
		return this.channelsSMS;
	}

	public void setChannelsSMS(String channelsSMS) {
		this.channelsSMS = channelsSMS;
		if(channelsSMS != null){
			putQueryParameter("Channels.SMS", channelsSMS);
		}
	}

	@Override
	public Class<PutContactResponse> getResponseClass() {
		return PutContactResponse.class;
	}

}
