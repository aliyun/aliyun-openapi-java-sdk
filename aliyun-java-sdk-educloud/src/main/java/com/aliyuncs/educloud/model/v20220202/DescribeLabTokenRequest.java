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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeLabTokenRequest extends RpcAcsRequest<DescribeLabTokenResponse> {
	   

	private String ramUid;

	private String orderId;
	public DescribeLabTokenRequest() {
		super("EduCloud", "2022-02-02", "DescribeLabToken");
		setMethod(MethodType.GET);
	}

	public String getRamUid() {
		return this.ramUid;
	}

	public void setRamUid(String ramUid) {
		this.ramUid = ramUid;
		if(ramUid != null){
			putQueryParameter("RamUid", ramUid);
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
		}
	}

	@Override
	public Class<DescribeLabTokenResponse> getResponseClass() {
		return DescribeLabTokenResponse.class;
	}

}
