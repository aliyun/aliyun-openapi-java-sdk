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
public class UpdateUserBucketConfigRequest extends RpcAcsRequest<UpdateUserBucketConfigResponse> {
	   

	private List<Data> datas;
	public UpdateUserBucketConfigRequest() {
		super("ivpd", "2019-06-25", "UpdateUserBucketConfig");
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
				putBodyParameter("Data." + (depth1 + 1) + ".Bucket" , datas.get(depth1).getBucket());
				putBodyParameter("Data." + (depth1 + 1) + ".Region" , datas.get(depth1).getRegion());
			}
		}	
	}

	public static class Data {

		private String bucket;

		private String region;

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	@Override
	public Class<UpdateUserBucketConfigResponse> getResponseClass() {
		return UpdateUserBucketConfigResponse.class;
	}

}
