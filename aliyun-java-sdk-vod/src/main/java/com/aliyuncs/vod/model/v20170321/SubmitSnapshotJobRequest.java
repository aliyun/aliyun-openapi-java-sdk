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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SubmitSnapshotJobRequest extends RpcAcsRequest<SubmitSnapshotJobResponse> {
	
	public SubmitSnapshotJobRequest() {
		super("vod", "2017-03-21", "SubmitSnapshotJob", "vod");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Long count;

	private String videoId;

	private Long ownerId;

	private Long specifiedOffsetTime;

	private String width;

	private Long interval;

	private String spriteSnapshotConfig;

	private String snapshotTemplateId;

	private String height;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
		if(count != null){
			putQueryParameter("Count", count.toString());
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getSpecifiedOffsetTime() {
		return this.specifiedOffsetTime;
	}

	public void setSpecifiedOffsetTime(Long specifiedOffsetTime) {
		this.specifiedOffsetTime = specifiedOffsetTime;
		if(specifiedOffsetTime != null){
			putQueryParameter("SpecifiedOffsetTime", specifiedOffsetTime.toString());
		}
	}

	public String getWidth() {
		return this.width;
	}

	public void setWidth(String width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width);
		}
	}

	public Long getInterval() {
		return this.interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	public String getSpriteSnapshotConfig() {
		return this.spriteSnapshotConfig;
	}

	public void setSpriteSnapshotConfig(String spriteSnapshotConfig) {
		this.spriteSnapshotConfig = spriteSnapshotConfig;
		if(spriteSnapshotConfig != null){
			putQueryParameter("SpriteSnapshotConfig", spriteSnapshotConfig);
		}
	}

	public String getSnapshotTemplateId() {
		return this.snapshotTemplateId;
	}

	public void setSnapshotTemplateId(String snapshotTemplateId) {
		this.snapshotTemplateId = snapshotTemplateId;
		if(snapshotTemplateId != null){
			putQueryParameter("SnapshotTemplateId", snapshotTemplateId);
		}
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height);
		}
	}

	@Override
	public Class<SubmitSnapshotJobResponse> getResponseClass() {
		return SubmitSnapshotJobResponse.class;
	}

}
