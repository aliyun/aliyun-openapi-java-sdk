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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnSecFuncInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnSecFuncInfoResponse extends AcsResponse {

	private String requestId;

	private String description;

	private String retCode;

	private String httpStatus;

	private List<ContentItem> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRetCode() {
		return this.retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getHttpStatus() {
		return this.httpStatus;
	}

	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}

	public List<ContentItem> getContent() {
		return this.content;
	}

	public void setContent(List<ContentItem> content) {
		this.content = content;
	}

	public static class ContentItem {

		private String label;

		private String value;

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public DescribeDcdnSecFuncInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnSecFuncInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
