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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDynamicTagRuleListRequest extends RpcAcsRequest<DescribeDynamicTagRuleListResponse> {
	   

	private String pageNumber;

	private String pageSize;

	private String tagKey;
	public DescribeDynamicTagRuleListRequest() {
		super("Cms", "2019-01-01", "DescribeDynamicTagRuleList", "cms");
		setMethod(MethodType.POST);
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

	public String getTagKey() {
		return this.tagKey;
	}

	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
		if(tagKey != null){
			putQueryParameter("TagKey", tagKey);
		}
	}

	@Override
	public Class<DescribeDynamicTagRuleListResponse> getResponseClass() {
		return DescribeDynamicTagRuleListResponse.class;
	}

}
