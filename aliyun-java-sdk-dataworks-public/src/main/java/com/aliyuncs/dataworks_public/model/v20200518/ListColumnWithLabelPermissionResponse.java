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
import com.aliyuncs.dataworks_public.transform.v20200518.ListColumnWithLabelPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListColumnWithLabelPermissionResponse extends AcsResponse {

	private String requestId;

	private List<ColumnMetaItem> columnMeta;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ColumnMetaItem> getColumnMeta() {
		return this.columnMeta;
	}

	public void setColumnMeta(List<ColumnMetaItem> columnMeta) {
		this.columnMeta = columnMeta;
	}

	public static class ColumnMetaItem {

		private String guid;

		private String name;

		private String comment;

		private String securityLevel;

		private String deadline;

		private String grantedLabel;

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getSecurityLevel() {
			return this.securityLevel;
		}

		public void setSecurityLevel(String securityLevel) {
			this.securityLevel = securityLevel;
		}

		public String getDeadline() {
			return this.deadline;
		}

		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}

		public String getGrantedLabel() {
			return this.grantedLabel;
		}

		public void setGrantedLabel(String grantedLabel) {
			this.grantedLabel = grantedLabel;
		}
	}

	@Override
	public ListColumnWithLabelPermissionResponse getInstance(UnmarshallerContext context) {
		return	ListColumnWithLabelPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
