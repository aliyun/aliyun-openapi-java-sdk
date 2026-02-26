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
import com.aliyuncs.expressconnectrouter.transform.v20230901.DescribeInstanceGrantedToExpressConnectRouterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceGrantedToExpressConnectRouterResponse extends AcsResponse {

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

	private List<EcrGrantedInstanceListItem> ecrGrantedInstanceList;

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

	public List<EcrGrantedInstanceListItem> getEcrGrantedInstanceList() {
		return this.ecrGrantedInstanceList;
	}

	public void setEcrGrantedInstanceList(List<EcrGrantedInstanceListItem> ecrGrantedInstanceList) {
		this.ecrGrantedInstanceList = ecrGrantedInstanceList;
	}

	public static class EcrGrantedInstanceListItem {

		private String grantId;

		private String status;

		private String gmtCreate;

		private String gmtModified;

		private String ecrId;

		private String nodeId;

		private String nodeType;

		private String nodeRegionId;

		private Long nodeOwnerUid;

		private String nodeOwnerBid;

		public String getGrantId() {
			return this.grantId;
		}

		public void setGrantId(String grantId) {
			this.grantId = grantId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getEcrId() {
			return this.ecrId;
		}

		public void setEcrId(String ecrId) {
			this.ecrId = ecrId;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getNodeRegionId() {
			return this.nodeRegionId;
		}

		public void setNodeRegionId(String nodeRegionId) {
			this.nodeRegionId = nodeRegionId;
		}

		public Long getNodeOwnerUid() {
			return this.nodeOwnerUid;
		}

		public void setNodeOwnerUid(Long nodeOwnerUid) {
			this.nodeOwnerUid = nodeOwnerUid;
		}

		public String getNodeOwnerBid() {
			return this.nodeOwnerBid;
		}

		public void setNodeOwnerBid(String nodeOwnerBid) {
			this.nodeOwnerBid = nodeOwnerBid;
		}
	}

	@Override
	public DescribeInstanceGrantedToExpressConnectRouterResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceGrantedToExpressConnectRouterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
