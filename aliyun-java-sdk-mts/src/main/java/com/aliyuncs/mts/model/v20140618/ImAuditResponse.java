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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ImAuditResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImAuditResponse extends AcsResponse {

	private String status;

	private String requestId;

	private Boolean imageQuotaExceed;

	private Boolean textQuotaExceed;

	private List<TextResult> textResults;

	private List<ImageResult> imageResults;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getImageQuotaExceed() {
		return this.imageQuotaExceed;
	}

	public void setImageQuotaExceed(Boolean imageQuotaExceed) {
		this.imageQuotaExceed = imageQuotaExceed;
	}

	public Boolean getTextQuotaExceed() {
		return this.textQuotaExceed;
	}

	public void setTextQuotaExceed(Boolean textQuotaExceed) {
		this.textQuotaExceed = textQuotaExceed;
	}

	public List<TextResult> getTextResults() {
		return this.textResults;
	}

	public void setTextResults(List<TextResult> textResults) {
		this.textResults = textResults;
	}

	public List<ImageResult> getImageResults() {
		return this.imageResults;
	}

	public void setImageResults(List<ImageResult> imageResults) {
		this.imageResults = imageResults;
	}

	public static class TextResult {

		private Map<Object,Object> result;

		public Map<Object,Object> getResult() {
			return this.result;
		}

		public void setResult(Map<Object,Object> result) {
			this.result = result;
		}
	}

	public static class ImageResult {

		private Map<Object,Object> result;

		public Map<Object,Object> getResult() {
			return this.result;
		}

		public void setResult(Map<Object,Object> result) {
			this.result = result;
		}
	}

	@Override
	public ImAuditResponse getInstance(UnmarshallerContext context) {
		return	ImAuditResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
