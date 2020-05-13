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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListClientSdksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClientSdksResponse extends AcsResponse {

	private String requestId;

	private List<Result> clientSdks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Result> getClientSdks() {
		return this.clientSdks;
	}

	public void setClientSdks(List<Result> clientSdks) {
		this.clientSdks = clientSdks;
	}

	public static class Result {

		private Long id;

		private Long gmtCreate;

		private Long gmtModified;

		private String name;

		private String pkgName;

		private Integer pkgType;

		private Integer osType;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPkgName() {
			return this.pkgName;
		}

		public void setPkgName(String pkgName) {
			this.pkgName = pkgName;
		}

		public Integer getPkgType() {
			return this.pkgType;
		}

		public void setPkgType(Integer pkgType) {
			this.pkgType = pkgType;
		}

		public Integer getOsType() {
			return this.osType;
		}

		public void setOsType(Integer osType) {
			this.osType = osType;
		}
	}

	@Override
	public ListClientSdksResponse getInstance(UnmarshallerContext context) {
		return	ListClientSdksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
