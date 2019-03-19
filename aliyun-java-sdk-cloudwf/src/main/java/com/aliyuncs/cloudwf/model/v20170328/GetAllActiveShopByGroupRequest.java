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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class GetAllActiveShopByGroupRequest extends RpcAcsRequest<GetAllActiveShopByGroupResponse> {
	
	public GetAllActiveShopByGroupRequest() {
		super("cloudwf", "2017-03-28", "GetAllActiveShopByGroup", "cloudwf");
	}

	private List<Long> gidss;

	private Long bid;

	public List<Long> getGidss() {
		return this.gidss;
	}

	public void setGidss(List<Long> gidss) {
		this.gidss = gidss;	
		if (gidss != null) {
			for (int i = 0; i < gidss.size(); i++) {
				putQueryParameter("Gids." + (i + 1) , gidss.get(i));
			}
		}	
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid.toString());
		}
	}

	@Override
	public Class<GetAllActiveShopByGroupResponse> getResponseClass() {
		return GetAllActiveShopByGroupResponse.class;
	}

}
