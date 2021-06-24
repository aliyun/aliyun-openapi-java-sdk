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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryFunctionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryFunctionsResponse extends AcsResponse {

	private String requestId;

	private List<FunctionGroup> functionGroupList;

	private List<Function> functionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FunctionGroup> getFunctionGroupList() {
		return this.functionGroupList;
	}

	public void setFunctionGroupList(List<FunctionGroup> functionGroupList) {
		this.functionGroupList = functionGroupList;
	}

	public List<Function> getFunctionList() {
		return this.functionList;
	}

	public void setFunctionList(List<Function> functionList) {
		this.functionList = functionList;
	}

	public static class FunctionGroup {

		private String parentGroupId;

		private String groupId;

		private String groupName;

		private Integer priority;

		private String groupCategory;

		private Long id;

		public String getParentGroupId() {
			return this.parentGroupId;
		}

		public void setParentGroupId(String parentGroupId) {
			this.parentGroupId = parentGroupId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getGroupCategory() {
			return this.groupCategory;
		}

		public void setGroupCategory(String groupCategory) {
			this.groupCategory = groupCategory;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	public static class Function {

		private String functionId;

		private String functionDescription;

		private String functionName;

		private String gmtCreate;

		private String functionViperFeature;

		private Integer priority;

		private Long id;

		private String productCode;

		private List<FunctionDoc> functionDocList;

		private List<String> functionGroupIdList;

		public String getFunctionId() {
			return this.functionId;
		}

		public void setFunctionId(String functionId) {
			this.functionId = functionId;
		}

		public String getFunctionDescription() {
			return this.functionDescription;
		}

		public void setFunctionDescription(String functionDescription) {
			this.functionDescription = functionDescription;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getFunctionViperFeature() {
			return this.functionViperFeature;
		}

		public void setFunctionViperFeature(String functionViperFeature) {
			this.functionViperFeature = functionViperFeature;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public List<FunctionDoc> getFunctionDocList() {
			return this.functionDocList;
		}

		public void setFunctionDocList(List<FunctionDoc> functionDocList) {
			this.functionDocList = functionDocList;
		}

		public List<String> getFunctionGroupIdList() {
			return this.functionGroupIdList;
		}

		public void setFunctionGroupIdList(List<String> functionGroupIdList) {
			this.functionGroupIdList = functionGroupIdList;
		}

		public static class FunctionDoc {

			private String docId;

			private String docType;

			private String docTitle;

			private Long id;

			public String getDocId() {
				return this.docId;
			}

			public void setDocId(String docId) {
				this.docId = docId;
			}

			public String getDocType() {
				return this.docType;
			}

			public void setDocType(String docType) {
				this.docType = docType;
			}

			public String getDocTitle() {
				return this.docTitle;
			}

			public void setDocTitle(String docTitle) {
				this.docTitle = docTitle;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public OpsQueryFunctionsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryFunctionsResponseUnmarshaller.unmarshall(this, context);
	}
}
