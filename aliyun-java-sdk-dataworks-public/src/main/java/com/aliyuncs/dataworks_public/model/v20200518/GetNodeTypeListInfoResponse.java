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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetNodeTypeListInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeTypeListInfoResponse extends AcsResponse {

	private String requestId;

	private NodeTypeInfoList nodeTypeInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public NodeTypeInfoList getNodeTypeInfoList() {
		return this.nodeTypeInfoList;
	}

	public void setNodeTypeInfoList(NodeTypeInfoList nodeTypeInfoList) {
		this.nodeTypeInfoList = nodeTypeInfoList;
	}

	public static class NodeTypeInfoList {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<NodeTypeInfoItem> nodeTypeInfo;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<NodeTypeInfoItem> getNodeTypeInfo() {
			return this.nodeTypeInfo;
		}

		public void setNodeTypeInfo(List<NodeTypeInfoItem> nodeTypeInfo) {
			this.nodeTypeInfo = nodeTypeInfo;
		}

		public static class NodeTypeInfoItem {

			private Integer nodeType;

			private String nodeTypeName;

			public Integer getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(Integer nodeType) {
				this.nodeType = nodeType;
			}

			public String getNodeTypeName() {
				return this.nodeTypeName;
			}

			public void setNodeTypeName(String nodeTypeName) {
				this.nodeTypeName = nodeTypeName;
			}
		}
	}

	@Override
	public GetNodeTypeListInfoResponse getInstance(UnmarshallerContext context) {
		return	GetNodeTypeListInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
