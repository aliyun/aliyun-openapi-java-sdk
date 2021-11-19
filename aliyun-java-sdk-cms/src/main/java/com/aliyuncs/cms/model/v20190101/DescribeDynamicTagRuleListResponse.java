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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeDynamicTagRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDynamicTagRuleListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String pageSize;

	private String pageNumber;

	private Integer total;

	private List<TagGroup> tagGroupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<TagGroup> getTagGroupList() {
		return this.tagGroupList;
	}

	public void setTagGroupList(List<TagGroup> tagGroupList) {
		this.tagGroupList = tagGroupList;
	}

	public static class TagGroup {

		private String status;

		private String matchExpressFilterRelation;

		private String regionId;

		private String tagKey;

		private String dynamicTagRuleId;

		private List<MatchExpressItem> matchExpress;

		private List<String> templateIdList;

		private List<String> contactGroupList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMatchExpressFilterRelation() {
			return this.matchExpressFilterRelation;
		}

		public void setMatchExpressFilterRelation(String matchExpressFilterRelation) {
			this.matchExpressFilterRelation = matchExpressFilterRelation;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getDynamicTagRuleId() {
			return this.dynamicTagRuleId;
		}

		public void setDynamicTagRuleId(String dynamicTagRuleId) {
			this.dynamicTagRuleId = dynamicTagRuleId;
		}

		public List<MatchExpressItem> getMatchExpress() {
			return this.matchExpress;
		}

		public void setMatchExpress(List<MatchExpressItem> matchExpress) {
			this.matchExpress = matchExpress;
		}

		public List<String> getTemplateIdList() {
			return this.templateIdList;
		}

		public void setTemplateIdList(List<String> templateIdList) {
			this.templateIdList = templateIdList;
		}

		public List<String> getContactGroupList() {
			return this.contactGroupList;
		}

		public void setContactGroupList(List<String> contactGroupList) {
			this.contactGroupList = contactGroupList;
		}

		public static class MatchExpressItem {

			private String tagValue;

			private String tagValueMatchFunction;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagValueMatchFunction() {
				return this.tagValueMatchFunction;
			}

			public void setTagValueMatchFunction(String tagValueMatchFunction) {
				this.tagValueMatchFunction = tagValueMatchFunction;
			}
		}
	}

	@Override
	public DescribeDynamicTagRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDynamicTagRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
