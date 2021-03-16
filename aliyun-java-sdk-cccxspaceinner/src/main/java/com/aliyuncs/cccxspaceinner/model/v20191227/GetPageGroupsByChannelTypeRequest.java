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
public class GetPageGroupsByChannelTypeRequest extends RpcAcsRequest<GetPageGroupsByChannelTypeResponse> {
	   

	private Long buId;

	private Integer channelType;

	private Long afterSortKey;

	private Integer pageSize;
	public GetPageGroupsByChannelTypeRequest() {
		super("CCCXSpaceInner", "2019-12-27", "GetPageGroupsByChannelType");
		setMethod(MethodType.GET);
	}

	public Long getBuId() {
		return this.buId;
	}

	public void setBuId(Long buId) {
		this.buId = buId;
		if(buId != null){
			putQueryParameter("BuId", buId.toString());
		}
	}

	public Integer getChannelType() {
		return this.channelType;
	}

	public void setChannelType(Integer channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putQueryParameter("ChannelType", channelType.toString());
		}
	}

	public Long getAfterSortKey() {
		return this.afterSortKey;
	}

	public void setAfterSortKey(Long afterSortKey) {
		this.afterSortKey = afterSortKey;
		if(afterSortKey != null){
			putQueryParameter("AfterSortKey", afterSortKey.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<GetPageGroupsByChannelTypeResponse> getResponseClass() {
		return GetPageGroupsByChannelTypeResponse.class;
	}

}
