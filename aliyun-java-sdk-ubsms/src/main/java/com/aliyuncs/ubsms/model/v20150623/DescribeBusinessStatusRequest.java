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

package com.aliyuncs.ubsms.model.v20150623;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeBusinessStatusRequest extends RpcAcsRequest<DescribeBusinessStatusResponse> {
	
	public DescribeBusinessStatusRequest() {
		super("Ubsms", "2015-06-23", "DescribeBusinessStatus", "ubsms");
	}

	private String password;

	private String callerBid;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(String callerBid) {
		this.callerBid = callerBid;
		if(callerBid != null){
			putQueryParameter("callerBid", callerBid);
		}
	}

	@Override
	public Class<DescribeBusinessStatusResponse> getResponseClass() {
		return DescribeBusinessStatusResponse.class;
	}

}
