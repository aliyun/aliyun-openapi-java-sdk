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

package com.aliyuncs.wfts.model.v20220212;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetLjxAccountInfoRequest extends RoaAcsRequest<GetLjxAccountInfoResponse> {
	   

	private String ljxAccountInfoId;
	public GetLjxAccountInfoRequest() {
		super("Wfts", "2022-02-12", "GetLjxAccountInfo");
		setUriPattern("/get/ljx/acc");
		setMethod(MethodType.GET);
	}

	public String getLjxAccountInfoId() {
		return this.ljxAccountInfoId;
	}

	public void setLjxAccountInfoId(String ljxAccountInfoId) {
		this.ljxAccountInfoId = ljxAccountInfoId;
		if(ljxAccountInfoId != null){
			putQueryParameter("LjxAccountInfoId", ljxAccountInfoId);
		}
	}

	@Override
	public Class<GetLjxAccountInfoResponse> getResponseClass() {
		return GetLjxAccountInfoResponse.class;
	}

}
