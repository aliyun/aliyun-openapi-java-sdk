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

package com.aliyuncs.multimediaai.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.multimediaai.transform.v20190810.ListFacePersonsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFacePersonsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<FacePerson> facePersons;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<FacePerson> getFacePersons() {
		return this.facePersons;
	}

	public void setFacePersons(List<FacePerson> facePersons) {
		this.facePersons = facePersons;
	}

	public static class FacePerson {

		private Long facePersonId;

		private String facePersonName;

		private String imageUrl;

		private Long imageCount;

		public Long getFacePersonId() {
			return this.facePersonId;
		}

		public void setFacePersonId(Long facePersonId) {
			this.facePersonId = facePersonId;
		}

		public String getFacePersonName() {
			return this.facePersonName;
		}

		public void setFacePersonName(String facePersonName) {
			this.facePersonName = facePersonName;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Long getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Long imageCount) {
			this.imageCount = imageCount;
		}
	}

	@Override
	public ListFacePersonsResponse getInstance(UnmarshallerContext context) {
		return	ListFacePersonsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
