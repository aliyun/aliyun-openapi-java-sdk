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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetMediaAuditAudioResultDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaAuditAudioResultDetailResponse extends AcsResponse {

	private String requestId;

	private MediaAuditAudioResultDetail mediaAuditAudioResultDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaAuditAudioResultDetail getMediaAuditAudioResultDetail() {
		return this.mediaAuditAudioResultDetail;
	}

	public void setMediaAuditAudioResultDetail(MediaAuditAudioResultDetail mediaAuditAudioResultDetail) {
		this.mediaAuditAudioResultDetail = mediaAuditAudioResultDetail;
	}

	public static class MediaAuditAudioResultDetail {

		private Integer total;

		private Integer pageTotal;

		private List<ListItem> list;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageTotal() {
			return this.pageTotal;
		}

		public void setPageTotal(Integer pageTotal) {
			this.pageTotal = pageTotal;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long startTime;

			private Long endTime;

			private String text;

			private String label;

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}
		}
	}

	@Override
	public GetMediaAuditAudioResultDetailResponse getInstance(UnmarshallerContext context) {
		return	GetMediaAuditAudioResultDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
