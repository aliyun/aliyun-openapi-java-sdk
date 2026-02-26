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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTagInfoRequest extends RpcAcsRequest<ListTagInfoResponse> {
	   

	private String tagValue;

	private Long tagId;

	private String language;

	private String tagRegionInfo;

	private Integer pageNumber;

	private Integer pageSize;

	private String tagKey;
	public ListTagInfoRequest() {
		super("Advisor-Share", "2018-06-08", "ListTagInfo", "advisor");
		setMethod(MethodType.POST);
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
		if(tagValue != null){
			putQueryParameter("TagValue", tagValue);
		}
	}

	public Long getTagId() {
		return this.tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putQueryParameter("TagId", tagId.toString());
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getTagRegionInfo() {
		return this.tagRegionInfo;
	}

	public void setTagRegionInfo(String tagRegionInfo) {
		this.tagRegionInfo = tagRegionInfo;
		if(tagRegionInfo != null){
			putQueryParameter("TagRegionInfo", tagRegionInfo);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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
	public Class<ListTagInfoResponse> getResponseClass() {
		return ListTagInfoResponse.class;
	}

}
