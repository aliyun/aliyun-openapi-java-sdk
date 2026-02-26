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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DetachEndUsersRequest extends RpcAcsRequest<DetachEndUsersResponse> {
	   

	private String endUserIds;

	private String serialNo;
	public DetachEndUsersRequest() {
		super("wyota", "2021-04-20", "DetachEndUsers");
		setMethod(MethodType.POST);
	}

	public String getEndUserIds() {
		return this.endUserIds;
	}

	public void setEndUserIds(String endUserIds) {
		this.endUserIds = endUserIds;
		if(endUserIds != null){
			putBodyParameter("EndUserIds", endUserIds);
		}
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	@Override
	public Class<DetachEndUsersResponse> getResponseClass() {
		return DetachEndUsersResponse.class;
	}

}
