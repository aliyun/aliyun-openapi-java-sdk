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

package com.aliyuncs.ivpd.model.v20190625;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivpd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListUserBucketsRequest extends RpcAcsRequest<ListUserBucketsResponse> {
	   

	private List<Data> datas;
	public ListUserBucketsRequest() {
		super("ivpd", "2019-06-25", "ListUserBuckets");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Data> getDatas() {
		return this.datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;	
		if (datas != null) {
			for (int depth1 = 0; depth1 < datas.size(); depth1++) {
				putBodyParameter("Data." + (depth1 + 1) + ".RegionId" , datas.get(depth1).getRegionId());
			}
		}	
	}

	public static class Data {

		private String regionId;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public Class<ListUserBucketsResponse> getResponseClass() {
		return ListUserBucketsResponse.class;
	}

}
