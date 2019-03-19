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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ShopGroupInfoRequest extends RpcAcsRequest<ShopGroupInfoResponse> {
	
	public ShopGroupInfoRequest() {
		super("cloudwf", "2017-03-28", "ShopGroupInfo", "cloudwf");
	}

	private Long gid;

	public Long getGid() {
		return this.gid;
	}

	public void setGid(Long gid) {
		this.gid = gid;
		if(gid != null){
			putQueryParameter("Gid", gid.toString());
		}
	}

	@Override
	public Class<ShopGroupInfoResponse> getResponseClass() {
		return ShopGroupInfoResponse.class;
	}

}
