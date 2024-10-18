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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryDSRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDSRecordResponse extends AcsResponse {

	private String requestId;

	private List<DSRecord> dSRecordList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DSRecord> getDSRecordList() {
		return this.dSRecordList;
	}

	public void setDSRecordList(List<DSRecord> dSRecordList) {
		this.dSRecordList = dSRecordList;
	}

	public static class DSRecord {

		private Integer digestType;

		private String digest;

		private Integer algorithm;

		private Integer keyTag;

		public Integer getDigestType() {
			return this.digestType;
		}

		public void setDigestType(Integer digestType) {
			this.digestType = digestType;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public Integer getAlgorithm() {
			return this.algorithm;
		}

		public void setAlgorithm(Integer algorithm) {
			this.algorithm = algorithm;
		}

		public Integer getKeyTag() {
			return this.keyTag;
		}

		public void setKeyTag(Integer keyTag) {
			this.keyTag = keyTag;
		}
	}

	@Override
	public QueryDSRecordResponse getInstance(UnmarshallerContext context) {
		return	QueryDSRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
