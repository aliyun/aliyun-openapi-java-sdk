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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeCrossCloudLevelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCrossCloudLevelsResponse extends AcsResponse {

	private String requestId;

	private List<CrossCloudLevelListItem> crossCloudLevelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CrossCloudLevelListItem> getCrossCloudLevelList() {
		return this.crossCloudLevelList;
	}

	public void setCrossCloudLevelList(List<CrossCloudLevelListItem> crossCloudLevelList) {
		this.crossCloudLevelList = crossCloudLevelList;
	}

	public static class CrossCloudLevelListItem {

		private String dBType;

		private String levelName;

		private String levelCode;

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getLevelName() {
			return this.levelName;
		}

		public void setLevelName(String levelName) {
			this.levelName = levelName;
		}

		public String getLevelCode() {
			return this.levelCode;
		}

		public void setLevelCode(String levelCode) {
			this.levelCode = levelCode;
		}
	}

	@Override
	public DescribeCrossCloudLevelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCrossCloudLevelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
