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

package com.aliyuncs.industry_brain.model.v20180712;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.industry_brain.transform.v20180712.GetIndustryInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIndustryInfoResponse extends AcsResponse {

	private String requestId;

	private IndustryInfo industryInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public IndustryInfo getIndustryInfo() {
		return this.industryInfo;
	}

	public void setIndustryInfo(IndustryInfo industryInfo) {
		this.industryInfo = industryInfo;
	}

	public static class IndustryInfo {

		private String id;

		private String code;

		private String name;

		private Integer level;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}
	}

	@Override
	public GetIndustryInfoResponse getInstance(UnmarshallerContext context) {
		return	GetIndustryInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
