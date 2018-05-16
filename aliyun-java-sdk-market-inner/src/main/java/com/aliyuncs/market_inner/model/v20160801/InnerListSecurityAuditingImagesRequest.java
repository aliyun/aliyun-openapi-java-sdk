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

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerListSecurityAuditingImagesRequest extends RpcAcsRequest<InnerListSecurityAuditingImagesResponse> {
	
	public InnerListSecurityAuditingImagesRequest() {
		super("Market-Inner", "2016-08-01", "InnerListSecurityAuditingImages");
	}

	private Integer channel;

	private Integer pageIndex;

	public Integer getChannel() {
		return this.channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("channel", channel.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("pageIndex", pageIndex.toString());
		}
	}

	@Override
	public Class<InnerListSecurityAuditingImagesResponse> getResponseClass() {
		return InnerListSecurityAuditingImagesResponse.class;
	}

}
