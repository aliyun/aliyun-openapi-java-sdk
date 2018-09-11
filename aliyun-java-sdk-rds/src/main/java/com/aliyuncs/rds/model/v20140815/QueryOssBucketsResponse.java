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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.QueryOssBucketsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOssBucketsResponse extends AcsResponse {

	private String requestId;

	private List<BucketItem> bucket;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BucketItem> getBucket() {
		return this.bucket;
	}

	public void setBucket(List<BucketItem> bucket) {
		this.bucket = bucket;
	}

	public static class BucketItem {

		private String name;

		private String location;

		private String storageClass;

		private Long extranetEndpoint;

		private Long intranetEndpoint;

		private String creationDate;

		private Owner owner;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public Long getExtranetEndpoint() {
			return this.extranetEndpoint;
		}

		public void setExtranetEndpoint(Long extranetEndpoint) {
			this.extranetEndpoint = extranetEndpoint;
		}

		public Long getIntranetEndpoint() {
			return this.intranetEndpoint;
		}

		public void setIntranetEndpoint(Long intranetEndpoint) {
			this.intranetEndpoint = intranetEndpoint;
		}

		public String getCreationDate() {
			return this.creationDate;
		}

		public void setCreationDate(String creationDate) {
			this.creationDate = creationDate;
		}

		public Owner getOwner() {
			return this.owner;
		}

		public void setOwner(Owner owner) {
			this.owner = owner;
		}

		public static class Owner {

			private String displayName;

			private String id;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public QueryOssBucketsResponse getInstance(UnmarshallerContext context) {
		return	QueryOssBucketsResponseUnmarshaller.unmarshall(this, context);
	}
}
