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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListMeteringMessageDetailRequest extends RpcAcsRequest<ListMeteringMessageDetailResponse> {
	   

	private Long offset;

	private Long start;

	private String gwEui;

	private String joinPermissionId;

	private String devEui;

	private Long limit;

	private Long end;

	private String direction;
	public ListMeteringMessageDetailRequest() {
		super("LinkWAN", "2019-03-01", "ListMeteringMessageDetail", "linkwan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public Long getStart() {
		return this.start;
	}

	public void setStart(Long start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start.toString());
		}
	}

	public String getGwEui() {
		return this.gwEui;
	}

	public void setGwEui(String gwEui) {
		this.gwEui = gwEui;
		if(gwEui != null){
			putQueryParameter("GwEui", gwEui);
		}
	}

	public String getJoinPermissionId() {
		return this.joinPermissionId;
	}

	public void setJoinPermissionId(String joinPermissionId) {
		this.joinPermissionId = joinPermissionId;
		if(joinPermissionId != null){
			putQueryParameter("JoinPermissionId", joinPermissionId);
		}
	}

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putQueryParameter("DevEui", devEui);
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putQueryParameter("End", end.toString());
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	@Override
	public Class<ListMeteringMessageDetailResponse> getResponseClass() {
		return ListMeteringMessageDetailResponse.class;
	}

}
