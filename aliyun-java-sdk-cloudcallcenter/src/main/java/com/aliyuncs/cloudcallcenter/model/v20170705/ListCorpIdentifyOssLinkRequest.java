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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListCorpIdentifyOssLinkRequest extends RpcAcsRequest<ListCorpIdentifyOssLinkResponse> {
	
	public ListCorpIdentifyOssLinkRequest() {
		super("CloudCallCenter", "2017-07-05", "ListCorpIdentifyOssLink", "CloudCallCenter", "innerAPI");
	}

	private String pics;

	public String getPics() {
		return this.pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
		if(pics != null){
			putQueryParameter("Pics", pics);
		}
	}

	@Override
	public Class<ListCorpIdentifyOssLinkResponse> getResponseClass() {
		return ListCorpIdentifyOssLinkResponse.class;
	}

}
