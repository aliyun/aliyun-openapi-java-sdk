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

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer total;

	private String pageNumber;

	private String pageSize;

	private List<TagGroup> tagGroupList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<TagGroup> getTagGroupList() {
		return this.tagGroupList;
	}

	public void setTagGroupList(List<TagGroup> tagGroupList) {
		this.tagGroupList = tagGroupList;
	}

	public static class TagGroup {

		private String dynamicTagRuleId;

		private String tagKey;

		private String regionId;

		private String matchExpressFilterRelation;

		private String status;

		private List<MatchExpressItem> matchExpress;

		private List<String> templateIdList;

		public String getDynamicTagRuleId() {
			return this.dynamicTagRuleId;
		}

		public void setDynamicTagRuleId(String dynamicTagRuleId) {
			this.dynamicTagRuleId = dynamicTagRuleId;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getMatchExpressFilterRelation() {
			return this.matchExpressFilterRelation;
		}

		public void setMatchExpressFilterRelation(String matchExpressFilterRelation) {
			this.matchExpressFilterRelation = matchExpressFilterRelation;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public static class MatchExpressItem {

			private String tagValueMatchFunction;

			private String tagValue;

			public String getTagValueMatchFunction() {
				return this.tagValueMatchFunction;
			}

			public void setTagValueMatchFunction(String tagValueMatchFunction) {
				this.tagValueMatchFunction = tagValueMatchFunction;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeDynamicTagRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDynamicTagRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
