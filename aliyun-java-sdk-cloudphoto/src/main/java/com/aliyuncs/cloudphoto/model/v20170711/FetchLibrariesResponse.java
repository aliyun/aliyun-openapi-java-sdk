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

package com.aliyuncs.cloudphoto.model.v20170711;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.FetchLibrariesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FetchLibrariesResponse extends AcsResponse {

	private String code;

	private String message;

	private Integer totalCount;

	private String requestId;

	private String action;

	private List<Library> libraries;

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

	public String getBizAction() {
		return this.action;
	}

	public void setBizAction(String action) {
		this.action = action;
	}

	/**
	 * @deprecated use getBizAction instead of this.
	 */
	@Deprecated
	public String getAction() {
		return this.action;
	}

	/**
	 * @deprecated use setBizAction instead of this.
	 */
	@Deprecated
	public void setAction(String action) {
		this.action = action;
	}

	public List<Library> getLibraries() {
		return this.libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	public static class Library {

		private String libraryId;

		private Long ctime;

		public String getLibraryId() {
			return this.libraryId;
		}

		public void setLibraryId(String libraryId) {
			this.libraryId = libraryId;
		}

		public Long getCtime() {
			return this.ctime;
		}

		public void setCtime(Long ctime) {
			this.ctime = ctime;
		}
	}

	@Override
	public FetchLibrariesResponse getInstance(UnmarshallerContext context) {
		return	FetchLibrariesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
