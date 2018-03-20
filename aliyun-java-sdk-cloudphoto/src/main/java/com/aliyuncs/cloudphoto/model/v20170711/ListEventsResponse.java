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
import com.aliyuncs.cloudphoto.transform.v20170711.ListEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventsResponse extends AcsResponse {

	private String code;

	private String message;

	private String nextCursor;

	private Integer totalCount;

	private String requestId;

	private String action;

	private List<Event> events;

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

	public String getNextCursor() {
		return this.nextCursor;
	}

	public void setNextCursor(String nextCursor) {
		this.nextCursor = nextCursor;
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

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public static class Event {

		private Long id;

		private String idStr;

		private String title;

		private String bannerPhotoId;

		private String identity;

		private String splashPhotoId;

		private String state;

		private String weixinTitle;

		private String watermarkPhotoId;

		private Long startAt;

		private Long endAt;

		private Long ctime;

		private Long mtime;

		private Long viewsCount;

		private String libraryId;

		private String idStr1;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIdStr() {
			return this.idStr;
		}

		public void setIdStr(String idStr) {
			this.idStr = idStr;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getBannerPhotoId() {
			return this.bannerPhotoId;
		}

		public void setBannerPhotoId(String bannerPhotoId) {
			this.bannerPhotoId = bannerPhotoId;
		}

		public String getIdentity() {
			return this.identity;
		}

		public void setIdentity(String identity) {
			this.identity = identity;
		}

		public String getSplashPhotoId() {
			return this.splashPhotoId;
		}

		public void setSplashPhotoId(String splashPhotoId) {
			this.splashPhotoId = splashPhotoId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getWeixinTitle() {
			return this.weixinTitle;
		}

		public void setWeixinTitle(String weixinTitle) {
			this.weixinTitle = weixinTitle;
		}

		public String getWatermarkPhotoId() {
			return this.watermarkPhotoId;
		}

		public void setWatermarkPhotoId(String watermarkPhotoId) {
			this.watermarkPhotoId = watermarkPhotoId;
		}

		public Long getStartAt() {
			return this.startAt;
		}

		public void setStartAt(Long startAt) {
			this.startAt = startAt;
		}

		public Long getEndAt() {
			return this.endAt;
		}

		public void setEndAt(Long endAt) {
			this.endAt = endAt;
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

		public Long getViewsCount() {
			return this.viewsCount;
		}

		public void setViewsCount(Long viewsCount) {
			this.viewsCount = viewsCount;
		}

		public String getLibraryId() {
			return this.libraryId;
		}

		public void setLibraryId(String libraryId) {
			this.libraryId = libraryId;
		}

		public String getIdStr1() {
			return this.idStr1;
		}

		public void setIdStr1(String idStr1) {
			this.idStr1 = idStr1;
		}
	}

	@Override
	public ListEventsResponse getInstance(UnmarshallerContext context) {
		return	ListEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
