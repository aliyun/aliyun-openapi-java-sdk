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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeNodeParamTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodeParamTagsResponse extends AcsResponse {

	private String requestId;

	private List<Data> paramReferredPaths;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getParamReferredPaths() {
		return this.paramReferredPaths;
	}

	public void setParamReferredPaths(List<Data> paramReferredPaths) {
		this.paramReferredPaths = paramReferredPaths;
	}

	public static class Data {

		private String paramName;

		private List<String> referredPath;

		public String getParamName() {
			return this.paramName;
		}

		public void setParamName(String paramName) {
			this.paramName = paramName;
		}

		public List<String> getReferredPath() {
			return this.referredPath;
		}

		public void setReferredPath(List<String> referredPath) {
			this.referredPath = referredPath;
		}
	}

	@Override
	public DescribeNodeParamTagsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNodeParamTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
