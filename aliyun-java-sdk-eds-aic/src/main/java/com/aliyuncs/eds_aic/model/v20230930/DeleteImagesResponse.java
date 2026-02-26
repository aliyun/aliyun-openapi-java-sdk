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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DeleteImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteImagesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<String> successDeleteImageIds;

		private List<String> failDeleteImageIds;

		public List<String> getSuccessDeleteImageIds() {
			return this.successDeleteImageIds;
		}

		public void setSuccessDeleteImageIds(List<String> successDeleteImageIds) {
			this.successDeleteImageIds = successDeleteImageIds;
		}

		public List<String> getFailDeleteImageIds() {
			return this.failDeleteImageIds;
		}

		public void setFailDeleteImageIds(List<String> failDeleteImageIds) {
			this.failDeleteImageIds = failDeleteImageIds;
		}
	}

	@Override
	public DeleteImagesResponse getInstance(UnmarshallerContext context) {
		return	DeleteImagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
