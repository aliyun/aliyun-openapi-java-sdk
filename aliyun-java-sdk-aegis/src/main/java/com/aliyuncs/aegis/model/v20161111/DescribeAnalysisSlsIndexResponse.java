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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAnalysisSlsIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnalysisSlsIndexResponse extends AcsResponse {

	private String requestId;

	private SlsIndex slsIndex;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SlsIndex getSlsIndex() {
		return this.slsIndex;
	}

	public void setSlsIndex(SlsIndex slsIndex) {
		this.slsIndex = slsIndex;
	}

	public static class SlsIndex {

		private String index;

		public String getIndex() {
			return this.index;
		}

		public void setIndex(String index) {
			this.index = index;
		}
	}

	@Override
	public DescribeAnalysisSlsIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnalysisSlsIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
