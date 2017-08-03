/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudphoto.model.v20170711;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.GetPhotoStoreResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPhotoStoreResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private PhotoStore photoStore;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public PhotoStore getPhotoStore() {
		return this.photoStore;
	}

	public void setPhotoStore(PhotoStore photoStore) {
		this.photoStore = photoStore;
	}

	public static class PhotoStore {

		private Long id;

		private String name;

		private String remark;

		private Long defaultQuota;

		private Long ctime;

		private Long mtime;

		private List<Bucket> buckets;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Long getDefaultQuota() {
			return this.defaultQuota;
		}

		public void setDefaultQuota(Long defaultQuota) {
			this.defaultQuota = defaultQuota;
		}

		public Long getCtime() {
			return this.ctime;
		}

		public void setCtime(Long ctime) {
			this.ctime = ctime;
		}

		public Long getMtime() {
			return this.mtime;
		}

		public void setMtime(Long mtime) {
			this.mtime = mtime;
		}

		public List<Bucket> getBuckets() {
			return this.buckets;
		}

		public void setBuckets(List<Bucket> buckets) {
			this.buckets = buckets;
		}

		public static class Bucket {

			private String name;

			private String region;

			private String state;

			private String acl;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAcl() {
				return this.acl;
			}

			public void setAcl(String acl) {
				this.acl = acl;
			}
		}
	}

	@Override
	public GetPhotoStoreResponse getInstance(UnmarshallerContext context) {
		return	GetPhotoStoreResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
