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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryAllMsDrmLdcCellsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAllMsDrmLdcCellsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean isLdc;

	private List<NewCellsItem> newCells;

	private List<String> oldCells;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Boolean getIsLdc() {
		return this.isLdc;
	}

	public void setIsLdc(Boolean isLdc) {
		this.isLdc = isLdc;
	}

	public List<NewCellsItem> getNewCells() {
		return this.newCells;
	}

	public void setNewCells(List<NewCellsItem> newCells) {
		this.newCells = newCells;
	}

	public List<String> getOldCells() {
		return this.oldCells;
	}

	public void setOldCells(List<String> oldCells) {
		this.oldCells = oldCells;
	}

	public static class NewCellsItem {

		private String name;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public QueryAllMsDrmLdcCellsResponse getInstance(UnmarshallerContext context) {
		return	QueryAllMsDrmLdcCellsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
