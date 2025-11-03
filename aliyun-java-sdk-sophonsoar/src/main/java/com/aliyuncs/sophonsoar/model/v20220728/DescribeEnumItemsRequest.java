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
public class DescribeEnumItemsRequest extends RpcAcsRequest<DescribeEnumItemsResponse> {
	   

	private String enumType;

	private String lang;
	public DescribeEnumItemsRequest() {
		super("sophonsoar", "2022-07-28", "DescribeEnumItems");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getEnumType() {
		return this.enumType;
	}

	public void setEnumType(String enumType) {
		this.enumType = enumType;
		if(enumType != null){
			putQueryParameter("EnumType", enumType);
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
	public Class<DescribeEnumItemsResponse> getResponseClass() {
		return DescribeEnumItemsResponse.class;
	}

}
