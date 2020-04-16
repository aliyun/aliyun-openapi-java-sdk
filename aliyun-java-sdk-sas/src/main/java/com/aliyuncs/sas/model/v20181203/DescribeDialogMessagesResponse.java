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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeDialogMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDialogMessagesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<AegisDynamicDialogDTO> dialogList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AegisDynamicDialogDTO> getDialogList() {
		return this.dialogList;
	}

	public void setDialogList(List<AegisDynamicDialogDTO> dialogList) {
		this.dialogList = dialogList;
	}

	public static class AegisDynamicDialogDTO {

		private Long iD;

		private String dialogKey;

		private String params;

		public Long getID() {
			return this.iD;
		}

		public void setID(Long iD) {
			this.iD = iD;
		}

		public String getDialogKey() {
			return this.dialogKey;
		}

		public void setDialogKey(String dialogKey) {
			this.dialogKey = dialogKey;
		}

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}
	}

	@Override
	public DescribeDialogMessagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDialogMessagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
