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
import com.aliyuncs.ens.transform.v20171110.GetOssStorageAndAccByBucketsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOssStorageAndAccByBucketsResponse extends AcsResponse {

	private String requestId;

	private List<BucketListItem> bucketList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BucketListItem> getBucketList() {
		return this.bucketList;
	}

	public void setBucketList(List<BucketListItem> bucketList) {
		this.bucketList = bucketList;
	}

	public static class BucketListItem {

		private Long acc;

		private String bucket;

		private Long storageUsageByte;

		public Long getAcc() {
			return this.acc;
		}

		public void setAcc(Long acc) {
			this.acc = acc;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public Long getStorageUsageByte() {
			return this.storageUsageByte;
		}

		public void setStorageUsageByte(Long storageUsageByte) {
			this.storageUsageByte = storageUsageByte;
		}
	}

	@Override
	public GetOssStorageAndAccByBucketsResponse getInstance(UnmarshallerContext context) {
		return	GetOssStorageAndAccByBucketsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
