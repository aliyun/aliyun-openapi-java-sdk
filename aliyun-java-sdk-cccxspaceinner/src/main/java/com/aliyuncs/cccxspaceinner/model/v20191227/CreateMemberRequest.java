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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateMemberRequest extends RpcAcsRequest<CreateMemberResponse> {
	   

	private Long buId;

	private String outerMemberId;

	private String outerMemberName;

	private String sourceId;
	public CreateMemberRequest() {
		super("CCCXSpaceInner", "2019-12-27", "CreateMember");
		setMethod(MethodType.POST);
	}

	public Long getBuId() {
		return this.buId;
	}

	public void setBuId(Long buId) {
		this.buId = buId;
		if(buId != null){
			putBodyParameter("BuId", buId.toString());
		}
	}

	public String getOuterMemberId() {
		return this.outerMemberId;
	}

	public void setOuterMemberId(String outerMemberId) {
		this.outerMemberId = outerMemberId;
		if(outerMemberId != null){
			putBodyParameter("OuterMemberId", outerMemberId);
		}
	}

	public String getOuterMemberName() {
		return this.outerMemberName;
	}

	public void setOuterMemberName(String outerMemberName) {
		this.outerMemberName = outerMemberName;
		if(outerMemberName != null){
			putBodyParameter("OuterMemberName", outerMemberName);
		}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putBodyParameter("SourceId", sourceId);
		}
	}

	@Override
	public Class<CreateMemberResponse> getResponseClass() {
		return CreateMemberResponse.class;
	}

}
