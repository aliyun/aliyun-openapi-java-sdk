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

package com.aliyuncs.marketplaceintl.model.v20221230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class NoticeInstanceUserRequest extends RpcAcsRequest<NoticeInstanceUserResponse> {
	   

	private String noticeParam;

	private Long instanceId;

	private Long noticeType;
	public NoticeInstanceUserRequest() {
		super("marketplaceIntl", "2022-12-30", "NoticeInstanceUser");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNoticeParam() {
		return this.noticeParam;
	}

	public void setNoticeParam(String noticeParam) {
		this.noticeParam = noticeParam;
		if(noticeParam != null){
			putBodyParameter("NoticeParam", noticeParam);
		}
	}

	public Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId.toString());
		}
	}

	public Long getNoticeType() {
		return this.noticeType;
	}

	public void setNoticeType(Long noticeType) {
		this.noticeType = noticeType;
		if(noticeType != null){
			putBodyParameter("NoticeType", noticeType.toString());
		}
	}

	@Override
	public Class<NoticeInstanceUserResponse> getResponseClass() {
		return NoticeInstanceUserResponse.class;
	}

}
