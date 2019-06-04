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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class AddCasterEpisodeGroupRequest extends RpcAcsRequest<AddCasterEpisodeGroupResponse> {
	
	public AddCasterEpisodeGroupRequest() {
		super("live", "2016-11-01", "AddCasterEpisodeGroup", "live");
	}

	private String sideOutputUrl;

	private List<Item> items;

	private String clientToken;

	private String domainName;

	private String startTime;

	private Integer repeatNum;

	private String callbackUrl;

	private Long ownerId;

	public String getSideOutputUrl() {
		return this.sideOutputUrl;
	}

	public void setSideOutputUrl(String sideOutputUrl) {
		this.sideOutputUrl = sideOutputUrl;
		if(sideOutputUrl != null){
			putQueryParameter("SideOutputUrl", sideOutputUrl);
		}
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;	
		if (items != null) {
			for (int depth1 = 0; depth1 < items.size(); depth1++) {
				putQueryParameter("Item." + (depth1 + 1) + ".VodUrl" , items.get(depth1).getVodUrl());
				putQueryParameter("Item." + (depth1 + 1) + ".ItemName" , items.get(depth1).getItemName());
			}
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getRepeatNum() {
		return this.repeatNum;
	}

	public void setRepeatNum(Integer repeatNum) {
		this.repeatNum = repeatNum;
		if(repeatNum != null){
			putQueryParameter("RepeatNum", repeatNum.toString());
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public static class Item {

		private String vodUrl;

		private String itemName;

		public String getVodUrl() {
			return this.vodUrl;
		}

		public void setVodUrl(String vodUrl) {
			this.vodUrl = vodUrl;
		}

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
	}

	@Override
	public Class<AddCasterEpisodeGroupResponse> getResponseClass() {
		return AddCasterEpisodeGroupResponse.class;
	}

}
