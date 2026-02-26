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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeFieldRequest extends RpcAcsRequest<DescribeFieldResponse> {
	   

	private String queryKey;

	private String lang;
	public DescribeFieldRequest() {
		super("sophonsoar", "2022-07-28", "DescribeField");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getQueryKey() {
		return this.queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
		if(queryKey != null){
			putQueryParameter("QueryKey", queryKey);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DescribeFieldResponse> getResponseClass() {
		return DescribeFieldResponse.class;
	}

}
