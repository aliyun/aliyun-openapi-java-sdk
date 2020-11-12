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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTagValuesRequest extends RpcAcsRequest<ListTagValuesResponse> {
	   

	private String tagKey;
	public ListTagValuesRequest() {
		super("DBFS", "2020-04-18", "ListTagValues");
		setMethod(MethodType.POST);
	}

	public String getTagKey() {
		return this.tagKey;
	}

	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
		if(tagKey != null){
			putQueryParameter("TagKey", tagKey);
		}
	}

	@Override
	public Class<ListTagValuesResponse> getResponseClass() {
		return ListTagValuesResponse.class;
	}

}
