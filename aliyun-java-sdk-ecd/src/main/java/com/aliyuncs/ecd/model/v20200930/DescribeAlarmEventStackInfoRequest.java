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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmEventStackInfoRequest extends RpcAcsRequest<DescribeAlarmEventStackInfoResponse> {
	   

	private String uniqueInfo;

	private String eventName;

	private String desktopId;

	private String lang;
	public DescribeAlarmEventStackInfoRequest() {
		super("ecd", "2020-09-30", "DescribeAlarmEventStackInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUniqueInfo() {
		return this.uniqueInfo;
	}

	public void setUniqueInfo(String uniqueInfo) {
		this.uniqueInfo = uniqueInfo;
		if(uniqueInfo != null){
			putQueryParameter("UniqueInfo", uniqueInfo);
		}
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
		if(eventName != null){
			putQueryParameter("EventName", eventName);
		}
	}

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
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

	@Override
	public Class<DescribeAlarmEventStackInfoResponse> getResponseClass() {
		return DescribeAlarmEventStackInfoResponse.class;
	}

}
