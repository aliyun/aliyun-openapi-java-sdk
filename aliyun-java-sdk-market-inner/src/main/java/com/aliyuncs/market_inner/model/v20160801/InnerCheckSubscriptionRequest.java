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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class InnerCheckSubscriptionRequest extends RpcAcsRequest<InnerCheckSubscriptionResponse> {
	
	public InnerCheckSubscriptionRequest() {
		super("Market-Inner", "2016-08-01", "InnerCheckSubscription");
	}

	private List<String> imageIds;

	private String requestSource;

	private Long aliUid;

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public String getRequestSource() {
		return this.requestSource;
	}

	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
		if(requestSource != null){
			putQueryParameter("RequestSource", requestSource);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	@Override
	public Class<InnerCheckSubscriptionResponse> getResponseClass() {
		return InnerCheckSubscriptionResponse.class;
	}

}
