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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListDNADBResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDNADBResponse extends AcsResponse {

	private String requestId;

	private List<DNADB> dNADBList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DNADB> getDNADBList() {
		return this.dNADBList;
	}

	public void setDNADBList(List<DNADB> dNADBList) {
		this.dNADBList = dNADBList;
	}

	public static class DNADB {

		private String dBId;

		private String status;

		private String dBDescription;

		private String dBType;

		private String dBName;

		private String dBRegion;

		public String getDBId() {
			return this.dBId;
		}

		public void setDBId(String dBId) {
			this.dBId = dBId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDBDescription() {
			return this.dBDescription;
		}

		public void setDBDescription(String dBDescription) {
			this.dBDescription = dBDescription;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getDBRegion() {
			return this.dBRegion;
		}

		public void setDBRegion(String dBRegion) {
			this.dBRegion = dBRegion;
		}
	}

	@Override
	public ListDNADBResponse getInstance(UnmarshallerContext context) {
		return	ListDNADBResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
