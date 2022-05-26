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

package com.aliyuncs.amp.model.v20200708;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DingAPITcYRequest extends RoaAcsRequest<DingAPITcYResponse> {
	   

	private String queryIds;
	public DingAPITcYRequest() {
		super("amp", "2020-07-08", "DingAPITcY", "jeepproduct001");
		setUriPattern("/ding/t2y");
		setMethod(MethodType.POST);
	}

	public String getQueryIds() {
		return this.queryIds;
	}

	public void setQueryIds(String queryIds) {
		this.queryIds = queryIds;
		if(queryIds != null){
			putQueryParameter("QueryIds", queryIds);
		}
	}

	@Override
	public Class<DingAPITcYResponse> getResponseClass() {
		return DingAPITcYResponse.class;
	}

}
