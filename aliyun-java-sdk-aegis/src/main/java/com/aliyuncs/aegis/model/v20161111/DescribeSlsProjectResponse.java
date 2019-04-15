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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeSlsProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlsProjectResponse extends AcsResponse {

	private String requestId;

	private List<SlsProjectDataItem> slsProjectData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SlsProjectDataItem> getSlsProjectData() {
		return this.slsProjectData;
	}

	public void setSlsProjectData(List<SlsProjectDataItem> slsProjectData) {
		this.slsProjectData = slsProjectData;
	}

	public static class SlsProjectDataItem {

		private String project;

		private List<String> logStore;

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public List<String> getLogStore() {
			return this.logStore;
		}

		public void setLogStore(List<String> logStore) {
			this.logStore = logStore;
		}
	}

	@Override
	public DescribeSlsProjectResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlsProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
