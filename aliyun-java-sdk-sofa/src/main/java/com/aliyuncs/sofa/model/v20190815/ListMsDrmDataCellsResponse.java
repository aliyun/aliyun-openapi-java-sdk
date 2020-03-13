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
import com.aliyuncs.sofa.transform.v20190815.ListMsDrmDataCellsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMsDrmDataCellsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private DrmDataCellInfo drmDataCellInfo;

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

	public DrmDataCellInfo getDrmDataCellInfo() {
		return this.drmDataCellInfo;
	}

	public void setDrmDataCellInfo(DrmDataCellInfo drmDataCellInfo) {
		this.drmDataCellInfo = drmDataCellInfo;
	}

	public static class DrmDataCellInfo {

		private Boolean hasSpecialCell;

		private List<CellInfosItem> cellInfos;

		public Boolean getHasSpecialCell() {
			return this.hasSpecialCell;
		}

		public void setHasSpecialCell(Boolean hasSpecialCell) {
			this.hasSpecialCell = hasSpecialCell;
		}

		public List<CellInfosItem> getCellInfos() {
			return this.cellInfos;
		}

		public void setCellInfos(List<CellInfosItem> cellInfos) {
			this.cellInfos = cellInfos;
		}

		public static class CellInfosItem {

			private String cell;

			private Boolean specialPush;

			private String value;

			public String getCell() {
				return this.cell;
			}

			public void setCell(String cell) {
				this.cell = cell;
			}

			public Boolean getSpecialPush() {
				return this.specialPush;
			}

			public void setSpecialPush(Boolean specialPush) {
				this.specialPush = specialPush;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListMsDrmDataCellsResponse getInstance(UnmarshallerContext context) {
		return	ListMsDrmDataCellsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
