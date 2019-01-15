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

/**
 * @author auto create
 * @version 
 */
public class DescribeUserVvTopByDayRequest extends RpcAcsRequest<DescribeUserVvTopByDayResponse> {
	
	public DescribeUserVvTopByDayRequest() {
		super("vod", "2017-03-21", "DescribeUserVvTopByDay", "vod");
	}

	private String videoType;

	private String bizdate;

	private String securityToken;

	private Long ownerId;

	public String getVideoType() {
		return this.videoType;
	}

	public void setVideoType(String videoType) {
		this.videoType = videoType;
		if(videoType != null){
			putQueryParameter("VideoType", videoType);
		}
	}

	public String getBizdate() {
		return this.bizdate;
	}

	public void setBizdate(String bizdate) {
		this.bizdate = bizdate;
		if(bizdate != null){
			putQueryParameter("Bizdate", bizdate);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	@Override
	public Class<DescribeUserVvTopByDayResponse> getResponseClass() {
		return DescribeUserVvTopByDayResponse.class;
	}

}
