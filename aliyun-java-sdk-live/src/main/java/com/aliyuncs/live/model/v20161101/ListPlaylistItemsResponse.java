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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListPlaylistItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPlaylistItemsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<ProgramItem> programItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ProgramItem> getProgramItems() {
		return this.programItems;
	}

	public void setProgramItems(List<ProgramItem> programItems) {
		this.programItems = programItems;
	}

	public static class ProgramItem {

		private String programId;

		private String programItemId;

		private String programItemName;

		private String resourceType;

		private String resourceValue;

		private Integer index;

		public String getProgramId() {
			return this.programId;
		}

		public void setProgramId(String programId) {
			this.programId = programId;
		}

		public String getProgramItemId() {
			return this.programItemId;
		}

		public void setProgramItemId(String programItemId) {
			this.programItemId = programItemId;
		}

		public String getProgramItemName() {
			return this.programItemName;
		}

		public void setProgramItemName(String programItemName) {
			this.programItemName = programItemName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceValue() {
			return this.resourceValue;
		}

		public void setResourceValue(String resourceValue) {
			this.resourceValue = resourceValue;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}
	}

	@Override
	public ListPlaylistItemsResponse getInstance(UnmarshallerContext context) {
		return	ListPlaylistItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
