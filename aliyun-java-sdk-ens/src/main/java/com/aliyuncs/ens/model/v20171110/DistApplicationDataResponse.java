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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DistApplicationDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DistApplicationDataResponse extends AcsResponse {

	private String requestId;

	private Integer distInstanceTotalCount;

	private List<DistResult> distResults;

	private List<String> distInstanceIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDistInstanceTotalCount() {
		return this.distInstanceTotalCount;
	}

	public void setDistInstanceTotalCount(Integer distInstanceTotalCount) {
		this.distInstanceTotalCount = distInstanceTotalCount;
	}

	public List<DistResult> getDistResults() {
		return this.distResults;
	}

	public void setDistResults(List<DistResult> distResults) {
		this.distResults = distResults;
	}

	public List<String> getDistInstanceIds() {
		return this.distInstanceIds;
	}

	public void setDistInstanceIds(List<String> distInstanceIds) {
		this.distInstanceIds = distInstanceIds;
	}

	public static class DistResult {

		private String resultDescrip;

		private String version;

		private Integer resultCode;

		private String name;

		public String getResultDescrip() {
			return this.resultDescrip;
		}

		public void setResultDescrip(String resultDescrip) {
			this.resultDescrip = resultDescrip;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Integer getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(Integer resultCode) {
			this.resultCode = resultCode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DistApplicationDataResponse getInstance(UnmarshallerContext context) {
		return	DistApplicationDataResponseUnmarshaller.unmarshall(this, context);
	}
}
