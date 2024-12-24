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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetConsistentDemandListRequest extends RpcAcsRequest<GetConsistentDemandListResponse> {
	   

	@SerializedName("param0")
	private List<Long> param0;
	public GetConsistentDemandListRequest() {
		super("brinekingdom", "2019-06-27", "GetConsistentDemandList");
		setMethod(MethodType.POST);
	}

	public List<Long> getParam0() {
		return this.param0;
	}

	public void setParam0(List<Long> param0) {
		this.param0 = param0;	
		if (param0 != null) {
			putQueryParameter("Param0" , new Gson().toJson(param0));
		}	
	}

	@Override
	public Class<GetConsistentDemandListResponse> getResponseClass() {
		return GetConsistentDemandListResponse.class;
	}

}
