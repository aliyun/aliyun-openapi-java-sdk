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

package com.aliyuncs.xingzhen.model.v20191121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAlertSubscriberRequest extends RpcAcsRequest<UpdateAlertSubscriberResponse> {
	   

	private Long cONFIGId;

	private String groupId;
	public UpdateAlertSubscriberRequest() {
		super("Xingzhen", "2019-11-21", "UpdateAlertSubscriber");
		setMethod(MethodType.POST);
	}

	public Long getCONFIGId() {
		return this.cONFIGId;
	}

	public void setCONFIGId(Long cONFIGId) {
		this.cONFIGId = cONFIGId;
		if(cONFIGId != null){
			putBodyParameter("CONFIGId", cONFIGId.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	@Override
	public Class<UpdateAlertSubscriberResponse> getResponseClass() {
		return UpdateAlertSubscriberResponse.class;
	}

}
