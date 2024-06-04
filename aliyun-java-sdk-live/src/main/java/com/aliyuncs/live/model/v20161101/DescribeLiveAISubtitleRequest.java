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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAISubtitleRequest extends RpcAcsRequest<DescribeLiveAISubtitleResponse> {
	   

	private String subtitleName;

	private String pageNumber;

	private String pageSize;

	private Long ownerId;

	private String subtitleId;
	public DescribeLiveAISubtitleRequest() {
		super("live", "2016-11-01", "DescribeLiveAISubtitle", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubtitleName() {
		return this.subtitleName;
	}

	public void setSubtitleName(String subtitleName) {
		this.subtitleName = subtitleName;
		if(subtitleName != null){
			putQueryParameter("SubtitleName", subtitleName);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSubtitleId() {
		return this.subtitleId;
	}

	public void setSubtitleId(String subtitleId) {
		this.subtitleId = subtitleId;
		if(subtitleId != null){
			putQueryParameter("SubtitleId", subtitleId);
		}
	}

	@Override
	public Class<DescribeLiveAISubtitleResponse> getResponseClass() {
		return DescribeLiveAISubtitleResponse.class;
	}

}
