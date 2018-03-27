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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyCasterVideoResourceRequest extends RpcAcsRequest<ModifyCasterVideoResourceResponse> {
	
	public ModifyCasterVideoResourceRequest() {
		super("live", "2016-11-01", "ModifyCasterVideoResource", "live");
	}

	private String resourceId;

	private Integer beginOffset;

	private String vodUrl;

	private String liveStreamUrl;

	private String casterId;

	private Integer endOffset;

	private String resourceName;

	private Integer repeatNum;

	private Long ownerId;

	private String materialId;

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public Integer getBeginOffset() {
		return this.beginOffset;
	}

	public void setBeginOffset(Integer beginOffset) {
		this.beginOffset = beginOffset;
		if(beginOffset != null){
			putQueryParameter("BeginOffset", beginOffset.toString());
		}
	}

	public String getVodUrl() {
		return this.vodUrl;
	}

	public void setVodUrl(String vodUrl) {
		this.vodUrl = vodUrl;
		if(vodUrl != null){
			putQueryParameter("VodUrl", vodUrl);
		}
	}

	public String getLiveStreamUrl() {
		return this.liveStreamUrl;
	}

	public void setLiveStreamUrl(String liveStreamUrl) {
		this.liveStreamUrl = liveStreamUrl;
		if(liveStreamUrl != null){
			putQueryParameter("LiveStreamUrl", liveStreamUrl);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
		}
	}

	public Integer getEndOffset() {
		return this.endOffset;
	}

	public void setEndOffset(Integer endOffset) {
		this.endOffset = endOffset;
		if(endOffset != null){
			putQueryParameter("EndOffset", endOffset.toString());
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putQueryParameter("ResourceName", resourceName);
		}
	}

	public Integer getRepeatNum() {
		return this.repeatNum;
	}

	public void setRepeatNum(Integer repeatNum) {
		this.repeatNum = repeatNum;
		if(repeatNum != null){
			putQueryParameter("RepeatNum", repeatNum.toString());
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

	public String getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putQueryParameter("MaterialId", materialId);
		}
	}

	@Override
	public Class<ModifyCasterVideoResourceResponse> getResponseClass() {
		return ModifyCasterVideoResourceResponse.class;
	}

}
