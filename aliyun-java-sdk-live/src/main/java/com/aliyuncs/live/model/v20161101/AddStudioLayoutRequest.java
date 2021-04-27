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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddStudioLayoutRequest extends RpcAcsRequest<AddStudioLayoutResponse> {
	   

	private String screenInputConfigList;

	private String layoutType;

	private String layoutName;

	private String layerOrderConfigList;

	private String mediaInputConfigList;

	private String casterId;

	private String bgImageConfig;

	private Long ownerId;

	private String commonConfig;
	public AddStudioLayoutRequest() {
		super("live", "2016-11-01", "AddStudioLayout", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScreenInputConfigList() {
		return this.screenInputConfigList;
	}

	public void setScreenInputConfigList(String screenInputConfigList) {
		this.screenInputConfigList = screenInputConfigList;
		if(screenInputConfigList != null){
			putQueryParameter("ScreenInputConfigList", screenInputConfigList);
		}
	}

	public String getLayoutType() {
		return this.layoutType;
	}

	public void setLayoutType(String layoutType) {
		this.layoutType = layoutType;
		if(layoutType != null){
			putQueryParameter("LayoutType", layoutType);
		}
	}

	public String getLayoutName() {
		return this.layoutName;
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
		if(layoutName != null){
			putQueryParameter("LayoutName", layoutName);
		}
	}

	public String getLayerOrderConfigList() {
		return this.layerOrderConfigList;
	}

	public void setLayerOrderConfigList(String layerOrderConfigList) {
		this.layerOrderConfigList = layerOrderConfigList;
		if(layerOrderConfigList != null){
			putQueryParameter("LayerOrderConfigList", layerOrderConfigList);
		}
	}

	public String getMediaInputConfigList() {
		return this.mediaInputConfigList;
	}

	public void setMediaInputConfigList(String mediaInputConfigList) {
		this.mediaInputConfigList = mediaInputConfigList;
		if(mediaInputConfigList != null){
			putQueryParameter("MediaInputConfigList", mediaInputConfigList);
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

	public String getBgImageConfig() {
		return this.bgImageConfig;
	}

	public void setBgImageConfig(String bgImageConfig) {
		this.bgImageConfig = bgImageConfig;
		if(bgImageConfig != null){
			putQueryParameter("BgImageConfig", bgImageConfig);
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

	public String getCommonConfig() {
		return this.commonConfig;
	}

	public void setCommonConfig(String commonConfig) {
		this.commonConfig = commonConfig;
		if(commonConfig != null){
			putQueryParameter("CommonConfig", commonConfig);
		}
	}

	@Override
	public Class<AddStudioLayoutResponse> getResponseClass() {
		return AddStudioLayoutResponse.class;
	}

}
