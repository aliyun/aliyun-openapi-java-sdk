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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PageQuerySpeechBroadcastHourRequest extends RpcAcsRequest<PageQuerySpeechBroadcastHourResponse> {
	   

	private String queryDateTimeHour;

	private String iotInstanceId;

	private Integer pageSize;

	private String pageToken;

	private String shareTaskCode;
	public PageQuerySpeechBroadcastHourRequest() {
		super("Iot", "2018-01-20", "PageQuerySpeechBroadcastHour");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueryDateTimeHour() {
		return this.queryDateTimeHour;
	}

	public void setQueryDateTimeHour(String queryDateTimeHour) {
		this.queryDateTimeHour = queryDateTimeHour;
		if(queryDateTimeHour != null){
			putQueryParameter("QueryDateTimeHour", queryDateTimeHour);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getPageToken() {
		return this.pageToken;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
		if(pageToken != null){
			putBodyParameter("PageToken", pageToken);
		}
	}

	public String getShareTaskCode() {
		return this.shareTaskCode;
	}

	public void setShareTaskCode(String shareTaskCode) {
		this.shareTaskCode = shareTaskCode;
		if(shareTaskCode != null){
			putBodyParameter("ShareTaskCode", shareTaskCode);
		}
	}

	@Override
	public Class<PageQuerySpeechBroadcastHourResponse> getResponseClass() {
		return PageQuerySpeechBroadcastHourResponse.class;
	}

}
