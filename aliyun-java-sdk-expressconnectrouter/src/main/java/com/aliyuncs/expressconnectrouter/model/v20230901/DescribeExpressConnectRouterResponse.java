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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.expressconnectrouter.transform.v20230901.DescribeExpressConnectRouterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectRouterResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<EcrListItem> ecrList;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<EcrListItem> getEcrList() {
		return this.ecrList;
	}

	public void setEcrList(List<EcrListItem> ecrList) {
		this.ecrList = ecrList;
	}

	public static class EcrListItem {

		private String ecrId;

		private Long ownerId;

		private String gmtCreate;

		private String gmtModified;

		private String status;

		private String bizStatus;

		private String resourceGroupId;

		private String name;

		private String description;

		private Long alibabaSideAsn;

		private List<Tag> tags;

		public String getEcrId() {
			return this.ecrId;
		}

		public void setEcrId(String ecrId) {
			this.ecrId = ecrId;
		}

		public Long getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(String bizStatus) {
			this.bizStatus = bizStatus;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getAlibabaSideAsn() {
			return this.alibabaSideAsn;
		}

		public void setAlibabaSideAsn(Long alibabaSideAsn) {
			this.alibabaSideAsn = alibabaSideAsn;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private Long id;

			private String resourceId;

			private String resuorceType;

			private String regionNo;

			private Long aliUid;

			private String tagKey;

			private String tagValue;

			private Integer scope;

			private Integer category;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResuorceType() {
				return this.resuorceType;
			}

			public void setResuorceType(String resuorceType) {
				this.resuorceType = resuorceType;
			}

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public Long getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(Long aliUid) {
				this.aliUid = aliUid;
			}

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

			public Integer getScope() {
				return this.scope;
			}

			public void setScope(Integer scope) {
				this.scope = scope;
			}

			public Integer getCategory() {
				return this.category;
			}

			public void setCategory(Integer category) {
				this.category = category;
			}
		}
	}

	@Override
	public DescribeExpressConnectRouterResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressConnectRouterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
