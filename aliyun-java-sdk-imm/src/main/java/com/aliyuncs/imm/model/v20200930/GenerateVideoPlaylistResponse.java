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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.GenerateVideoPlaylistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateVideoPlaylistResponse extends AcsResponse {

	private String requestId;

	private String token;

	private String uRI;

	private List<VideoPlaylistItem> videoPlaylist;

	private List<AudioPlaylistItem> audioPlaylist;

	private List<SubtitlePlaylistItem> subtitlePlaylist;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getURI() {
		return this.uRI;
	}

	public void setURI(String uRI) {
		this.uRI = uRI;
	}

	public List<VideoPlaylistItem> getVideoPlaylist() {
		return this.videoPlaylist;
	}

	public void setVideoPlaylist(List<VideoPlaylistItem> videoPlaylist) {
		this.videoPlaylist = videoPlaylist;
	}

	public List<AudioPlaylistItem> getAudioPlaylist() {
		return this.audioPlaylist;
	}

	public void setAudioPlaylist(List<AudioPlaylistItem> audioPlaylist) {
		this.audioPlaylist = audioPlaylist;
	}

	public List<SubtitlePlaylistItem> getSubtitlePlaylist() {
		return this.subtitlePlaylist;
	}

	public void setSubtitlePlaylist(List<SubtitlePlaylistItem> subtitlePlaylist) {
		this.subtitlePlaylist = subtitlePlaylist;
	}

	public static class VideoPlaylistItem {

		private String token;

		private String uRI;

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}
	}

	public static class AudioPlaylistItem {

		private String token;

		private String uRI;

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}
	}

	public static class SubtitlePlaylistItem {

		private String token;

		private String uRI;

		private String language;

		private Integer index;

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}
	}

	@Override
	public GenerateVideoPlaylistResponse getInstance(UnmarshallerContext context) {
		return	GenerateVideoPlaylistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
