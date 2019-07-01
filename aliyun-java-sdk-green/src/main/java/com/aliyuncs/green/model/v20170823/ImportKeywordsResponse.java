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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.ImportKeywordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImportKeywordsResponse extends AcsResponse {

	private String requestId;

	private Integer successCount;

	private List<String> invalidKeywordList;

	private List<String> validKeywordList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getSuccessCount() {
		return this.successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public List<String> getInvalidKeywordList() {
		return this.invalidKeywordList;
	}

	public void setInvalidKeywordList(List<String> invalidKeywordList) {
		this.invalidKeywordList = invalidKeywordList;
	}

	public List<String> getValidKeywordList() {
		return this.validKeywordList;
	}

	public void setValidKeywordList(List<String> validKeywordList) {
		this.validKeywordList = validKeywordList;
	}

	@Override
	public ImportKeywordsResponse getInstance(UnmarshallerContext context) {
		return	ImportKeywordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
