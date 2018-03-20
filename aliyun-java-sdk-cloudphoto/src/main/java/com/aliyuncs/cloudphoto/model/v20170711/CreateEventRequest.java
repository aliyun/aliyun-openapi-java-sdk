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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CreateEventRequest extends RpcAcsRequest<CreateEventResponse> {
	
	public CreateEventRequest() {
		super("CloudPhoto", "2017-07-11", "CreateEvent", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String bannerPhotoId;

	private String watermarkPhotoId;

	private String identity;

	private String splashPhotoId;

	private String libraryId;

	private String weixinTitle;

	private String storeName;

	private String remark;

	private String title;

	private Long endAt;

	private Long startAt;

	public String getBannerPhotoId() {
		return this.bannerPhotoId;
	}

	public void setBannerPhotoId(String bannerPhotoId) {
		this.bannerPhotoId = bannerPhotoId;
		if(bannerPhotoId != null){
			putQueryParameter("BannerPhotoId", bannerPhotoId);
		}
	}

	public String getWatermarkPhotoId() {
		return this.watermarkPhotoId;
	}

	public void setWatermarkPhotoId(String watermarkPhotoId) {
		this.watermarkPhotoId = watermarkPhotoId;
		if(watermarkPhotoId != null){
			putQueryParameter("WatermarkPhotoId", watermarkPhotoId);
		}
	}

	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
		if(identity != null){
			putQueryParameter("Identity", identity);
		}
	}

	public String getSplashPhotoId() {
		return this.splashPhotoId;
	}

	public void setSplashPhotoId(String splashPhotoId) {
		this.splashPhotoId = splashPhotoId;
		if(splashPhotoId != null){
			putQueryParameter("SplashPhotoId", splashPhotoId);
		}
	}

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public String getWeixinTitle() {
		return this.weixinTitle;
	}

	public void setWeixinTitle(String weixinTitle) {
		this.weixinTitle = weixinTitle;
		if(weixinTitle != null){
			putQueryParameter("WeixinTitle", weixinTitle);
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public Long getEndAt() {
		return this.endAt;
	}

	public void setEndAt(Long endAt) {
		this.endAt = endAt;
		if(endAt != null){
			putQueryParameter("EndAt", endAt.toString());
		}
	}

	public Long getStartAt() {
		return this.startAt;
	}

	public void setStartAt(Long startAt) {
		this.startAt = startAt;
		if(startAt != null){
			putQueryParameter("StartAt", startAt.toString());
		}
	}

	@Override
	public Class<CreateEventResponse> getResponseClass() {
		return CreateEventResponse.class;
	}

}
