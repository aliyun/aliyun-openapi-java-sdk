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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.SearchDocIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchDocIndexResponse extends AcsResponse {

	private String requestId;

	private List<DocInfosItem> docInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DocInfosItem> getDocInfos() {
		return this.docInfos;
	}

	public void setDocInfos(List<DocInfosItem> docInfos) {
		this.docInfos = docInfos;
	}

	public static class DocInfosItem {

		private String uniqueId;

		private String srcUri;

		private String name;

		private String contentType;

		private String lastModified;

		private Integer size;

		private Integer pageNum;

		private String customKey1;

		private String customKey2;

		private String customKey3;

		private String customKey4;

		private String customKey5;

		private String customKey6;

		public String getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(String lastModified) {
			this.lastModified = lastModified;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public String getCustomKey1() {
			return this.customKey1;
		}

		public void setCustomKey1(String customKey1) {
			this.customKey1 = customKey1;
		}

		public String getCustomKey2() {
			return this.customKey2;
		}

		public void setCustomKey2(String customKey2) {
			this.customKey2 = customKey2;
		}

		public String getCustomKey3() {
			return this.customKey3;
		}

		public void setCustomKey3(String customKey3) {
			this.customKey3 = customKey3;
		}

		public String getCustomKey4() {
			return this.customKey4;
		}

		public void setCustomKey4(String customKey4) {
			this.customKey4 = customKey4;
		}

		public String getCustomKey5() {
			return this.customKey5;
		}

		public void setCustomKey5(String customKey5) {
			this.customKey5 = customKey5;
		}

		public String getCustomKey6() {
			return this.customKey6;
		}

		public void setCustomKey6(String customKey6) {
			this.customKey6 = customKey6;
		}
	}

	@Override
	public SearchDocIndexResponse getInstance(UnmarshallerContext context) {
		return	SearchDocIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
