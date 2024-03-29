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

package com.aliyuncs.ims.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.ListPredefinedScopesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPredefinedScopesResponse extends AcsResponse {

	private String requestId;

	private List<PredefinedScope> predefinedScopes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PredefinedScope> getPredefinedScopes() {
		return this.predefinedScopes;
	}

	public void setPredefinedScopes(List<PredefinedScope> predefinedScopes) {
		this.predefinedScopes = predefinedScopes;
	}

	public static class PredefinedScope {

		private String description;

		private String name;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public ListPredefinedScopesResponse getInstance(UnmarshallerContext context) {
		return	ListPredefinedScopesResponseUnmarshaller.unmarshall(this, context);
	}
}
