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

package com.aliyuncs.companyreg.model.v20201022;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.PhotoInvoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PhotoInvoiceResponse extends AcsResponse {

	private String requestId;

	private List<ItemItem> item;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ItemItem> getItem() {
		return this.item;
	}

	public void setItem(List<ItemItem> item) {
		this.item = item;
	}

	public static class ItemItem {

		private String noteRecognizedStatus;

		private String targetBoName;

		private Long targetVoucherId;

		public String getNoteRecognizedStatus() {
			return this.noteRecognizedStatus;
		}

		public void setNoteRecognizedStatus(String noteRecognizedStatus) {
			this.noteRecognizedStatus = noteRecognizedStatus;
		}

		public String getTargetBoName() {
			return this.targetBoName;
		}

		public void setTargetBoName(String targetBoName) {
			this.targetBoName = targetBoName;
		}

		public Long getTargetVoucherId() {
			return this.targetVoucherId;
		}

		public void setTargetVoucherId(Long targetVoucherId) {
			this.targetVoucherId = targetVoucherId;
		}
	}

	@Override
	public PhotoInvoiceResponse getInstance(UnmarshallerContext context) {
		return	PhotoInvoiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
