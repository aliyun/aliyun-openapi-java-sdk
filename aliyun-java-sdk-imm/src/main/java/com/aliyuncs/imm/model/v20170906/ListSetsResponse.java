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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.ListSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSetsResponse extends AcsResponse {

	private String requestId;

	private String nextMarker;

	private List<SetsItem> sets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public List<SetsItem> getSets() {
		return this.sets;
	}

	public void setSets(List<SetsItem> sets) {
		this.sets = sets;
	}

	public static class SetsItem {

		private String setId;

		private String setName;

		private String createTime;

		private String modifyTime;

		private Integer faceCount;

		private Integer imageCount;

		private Integer videoCount;

		private Integer videoLength;

		public String getSetId() {
			return this.setId;
		}

		public void setSetId(String setId) {
			this.setId = setId;
		}

		public String getSetName() {
			return this.setName;
		}

		public void setSetName(String setName) {
			this.setName = setName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Integer getFaceCount() {
			return this.faceCount;
		}

		public void setFaceCount(Integer faceCount) {
			this.faceCount = faceCount;
		}

		public Integer getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Integer imageCount) {
			this.imageCount = imageCount;
		}

		public Integer getVideoCount() {
			return this.videoCount;
		}

		public void setVideoCount(Integer videoCount) {
			this.videoCount = videoCount;
		}

		public Integer getVideoLength() {
			return this.videoLength;
		}

		public void setVideoLength(Integer videoLength) {
			this.videoLength = videoLength;
		}
	}

	@Override
	public ListSetsResponse getInstance(UnmarshallerContext context) {
		return	ListSetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
