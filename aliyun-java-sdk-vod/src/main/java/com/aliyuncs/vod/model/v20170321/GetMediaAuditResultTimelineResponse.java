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
import com.aliyuncs.vod.transform.v20170321.GetMediaAuditResultTimelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaAuditResultTimelineResponse extends AcsResponse {

	private String requestId;

	private MediaAuditResultTimeline mediaAuditResultTimeline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaAuditResultTimeline getMediaAuditResultTimeline() {
		return this.mediaAuditResultTimeline;
	}

	public void setMediaAuditResultTimeline(MediaAuditResultTimeline mediaAuditResultTimeline) {
		this.mediaAuditResultTimeline = mediaAuditResultTimeline;
	}

	public static class MediaAuditResultTimeline {

		private List<PornItem> porn;

		private List<TerrorismItem> terrorism;

		private List<LogoItem> logo;

		private List<LiveItem> live;

		private List<AdItem> ad;

		public List<PornItem> getPorn() {
			return this.porn;
		}

		public void setPorn(List<PornItem> porn) {
			this.porn = porn;
		}

		public List<TerrorismItem> getTerrorism() {
			return this.terrorism;
		}

		public void setTerrorism(List<TerrorismItem> terrorism) {
			this.terrorism = terrorism;
		}

		public List<LogoItem> getLogo() {
			return this.logo;
		}

		public void setLogo(List<LogoItem> logo) {
			this.logo = logo;
		}

		public List<LiveItem> getLive() {
			return this.live;
		}

		public void setLive(List<LiveItem> live) {
			this.live = live;
		}

		public List<AdItem> getAd() {
			return this.ad;
		}

		public void setAd(List<AdItem> ad) {
			this.ad = ad;
		}

		public static class PornItem {

			private String label;

			private String score;

			private String timestamp;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}

		public static class TerrorismItem {

			private String label;

			private String score;

			private String timestamp;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}

		public static class LogoItem {

			private String label;

			private String score;

			private String timestamp;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}

		public static class LiveItem {

			private String label;

			private String score;

			private String timestamp;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}

		public static class AdItem {

			private String label;

			private String score;

			private String timestamp;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}
	}

	@Override
	public GetMediaAuditResultTimelineResponse getInstance(UnmarshallerContext context) {
		return	GetMediaAuditResultTimelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
