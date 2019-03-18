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

package com.aliyuncs.imagesearch.model.v20180120;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchItemRequest extends RoaAcsRequest<SearchItemResponse> {
	
	public SearchItemRequest() {
		super("ImageSearch", "2018-01-20", "SearchItem", "imagesearch");
		setUriPattern("/item/search");
		setMethod(MethodType.POST);
	}

	private String instanceName;

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("instanceName", instanceName);
		}
	}

	@Override
	public Class<SearchItemResponse> getResponseClass() {
		return SearchItemResponse.class;
	}

}
