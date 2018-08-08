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

package com.aliyuncs.ots.model.v20160620;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceRequest extends RpcAcsRequest<ListInstanceResponse> {
	
	public ListInstanceRequest() {
		super("Ots", "2016-06-20", "ListInstance", "ots");
	}

	private String access_key_id;

	private Long resourceOwnerId;

	private Long pageSize;

	private Long pageNum;

	private List<TagInfo> tagInfos;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public List<TagInfo> getTagInfos() {
		return this.tagInfos;
	}

	public void setTagInfos(List<TagInfo> tagInfos) {
		this.tagInfos = tagInfos;	
		if (tagInfos != null) {
			for (int depth1 = 0; depth1 < tagInfos.size(); depth1++) {
				putQueryParameter("TagInfo." + (depth1 + 1) + ".TagKey" , tagInfos.get(depth1).getTagKey());
				putQueryParameter("TagInfo." + (depth1 + 1) + ".TagValue" , tagInfos.get(depth1).getTagValue());
			}
		}	
	}

	public static class TagInfo {

		private String tagKey;

		private String tagValue;

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}
	}

	@Override
	public Class<ListInstanceResponse> getResponseClass() {
		return ListInstanceResponse.class;
	}

}
