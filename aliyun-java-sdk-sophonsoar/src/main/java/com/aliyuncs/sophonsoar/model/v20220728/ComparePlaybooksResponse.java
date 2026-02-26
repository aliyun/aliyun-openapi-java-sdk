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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.ComparePlaybooksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ComparePlaybooksResponse extends AcsResponse {

	private String requestId;

	private CompareResult compareResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CompareResult getCompareResult() {
		return this.compareResult;
	}

	public void setCompareResult(CompareResult compareResult) {
		this.compareResult = compareResult;
	}

	public static class CompareResult {

		private Boolean same;

		private Boolean _new;

		private String description;

		public Boolean getSame() {
			return this.same;
		}

		public void setSame(Boolean same) {
			this.same = same;
		}

		public Boolean get_New() {
			return this._new;
		}

		public void set_New(Boolean _new) {
			this._new = _new;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ComparePlaybooksResponse getInstance(UnmarshallerContext context) {
		return	ComparePlaybooksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
