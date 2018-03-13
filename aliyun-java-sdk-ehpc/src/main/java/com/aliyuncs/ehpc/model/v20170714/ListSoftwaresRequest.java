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
package com.aliyuncs.ehpc.model.v20170714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListSoftwaresRequest extends RpcAcsRequest<ListSoftwaresResponse> {
	
	public ListSoftwaresRequest() {
		super("EHPC", "2017-07-14", "ListSoftwares", "ehs");
	}

	private String ehpcVersion;

	public String getEhpcVersion() {
		return this.ehpcVersion;
	}

	public void setEhpcVersion(String ehpcVersion) {
		this.ehpcVersion = ehpcVersion;
		if(ehpcVersion != null){
			putQueryParameter("EhpcVersion", ehpcVersion);
		}
	}

	@Override
	public Class<ListSoftwaresResponse> getResponseClass() {
		return ListSoftwaresResponse.class;
	}

}
