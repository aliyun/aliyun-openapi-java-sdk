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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDailyPlayRegionStatisRequest extends RpcAcsRequest<GetDailyPlayRegionStatisResponse> {
	   

	private String date;

	private String mediaRegion;
	public GetDailyPlayRegionStatisRequest() {
		super("vod", "2017-03-21", "GetDailyPlayRegionStatis", "vod");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
		if(date != null){
			putQueryParameter("Date", date);
		}
	}

	public String getMediaRegion() {
		return this.mediaRegion;
	}

	public void setMediaRegion(String mediaRegion) {
		this.mediaRegion = mediaRegion;
		if(mediaRegion != null){
			putQueryParameter("MediaRegion", mediaRegion);
		}
	}

	@Override
	public Class<GetDailyPlayRegionStatisResponse> getResponseClass() {
		return GetDailyPlayRegionStatisResponse.class;
	}

}
