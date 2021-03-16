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
import com.aliyuncs.ens.transform.v20171110.DescribeKeyPairsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKeyPairsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<KeyPair> keyPairs;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<KeyPair> getKeyPairs() {
		return this.keyPairs;
	}

	public void setKeyPairs(List<KeyPair> keyPairs) {
		this.keyPairs = keyPairs;
	}

	public static class KeyPair {

		private String keyPairFingerPrint;

		private String keyPairName;

		private String creationTime;

		public String getKeyPairFingerPrint() {
			return this.keyPairFingerPrint;
		}

		public void setKeyPairFingerPrint(String keyPairFingerPrint) {
			this.keyPairFingerPrint = keyPairFingerPrint;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DescribeKeyPairsResponse getInstance(UnmarshallerContext context) {
		return	DescribeKeyPairsResponseUnmarshaller.unmarshall(this, context);
	}
}
