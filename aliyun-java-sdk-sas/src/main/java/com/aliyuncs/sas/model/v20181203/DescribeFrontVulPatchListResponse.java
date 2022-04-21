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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeFrontVulPatchListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFrontVulPatchListResponse extends AcsResponse {

	private String requestId;

	private List<FrontPatch> frontPatchList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FrontPatch> getFrontPatchList() {
		return this.frontPatchList;
	}

	public void setFrontPatchList(List<FrontPatch> frontPatchList) {
		this.frontPatchList = frontPatchList;
	}

	public static class FrontPatch {

		private String uuid;

		private List<Patch> patchList;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public List<Patch> getPatchList() {
			return this.patchList;
		}

		public void setPatchList(List<Patch> patchList) {
			this.patchList = patchList;
		}

		public static class Patch {

			private String name;

			private String aliasName;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAliasName() {
				return this.aliasName;
			}

			public void setAliasName(String aliasName) {
				this.aliasName = aliasName;
			}
		}
	}

	@Override
	public DescribeFrontVulPatchListResponse getInstance(UnmarshallerContext context) {
		return	DescribeFrontVulPatchListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
