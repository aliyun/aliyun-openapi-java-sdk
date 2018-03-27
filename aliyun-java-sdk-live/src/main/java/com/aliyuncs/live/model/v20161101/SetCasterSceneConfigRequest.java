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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SetCasterSceneConfigRequest extends RpcAcsRequest<SetCasterSceneConfigResponse> {
	
	public SetCasterSceneConfigRequest() {
		super("live", "2016-11-01", "SetCasterSceneConfig", "live");
	}

	private List<String> componentIds;

	private String casterId;

	private String sceneId;

	private Long ownerId;

	private String layoutId;

	public List<String> getComponentIds() {
		return this.componentIds;
	}

	public void setComponentIds(List<String> componentIds) {
		this.componentIds = componentIds;	
		if (componentIds != null) {
			for (int i = 0; i < componentIds.size(); i++) {
				putQueryParameter("ComponentId." + (i + 1) , componentIds.get(i));
			}
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

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
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

	public String getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
		if(layoutId != null){
			putQueryParameter("LayoutId", layoutId);
		}
	}

	@Override
	public Class<SetCasterSceneConfigResponse> getResponseClass() {
		return SetCasterSceneConfigResponse.class;
	}

}
